package org.citydb.query.geometry.config;

import java.util.ArrayList;
import java.util.List;

import org.citydb.config.geometry.AbstractGeometry;
import org.citydb.config.geometry.BoundingBox;
import org.citydb.config.geometry.GeometryObject;
import org.citydb.config.geometry.LineString;
import org.citydb.config.geometry.MultiLineString;
import org.citydb.config.geometry.MultiPoint;
import org.citydb.config.geometry.MultiPolygon;
import org.citydb.config.geometry.Point;
import org.citydb.config.geometry.Polygon;
import org.citydb.config.geometry.PositionList;
import org.citydb.config.project.database.DatabaseSrs;
import org.citydb.database.adapter.AbstractDatabaseAdapter;
import org.citydb.query.geometry.GeometryParseException;

public class SpatialOperandParser {
	private final AbstractDatabaseAdapter databaseAdapter;
	
	public SpatialOperandParser(AbstractDatabaseAdapter databaseAdapter) {
		this.databaseAdapter = databaseAdapter;
	}

	public GeometryObject parseOperand(AbstractGeometry operand) throws GeometryParseException {
		if (!operand.isValid())
			throw new GeometryParseException("The spatial " + operand.getGeometryType() + " operand is invalid.");
		
		GeometryObject geometryObject = null;
		DatabaseSrs referenceSystem = operand.isSetSrs() ? operand.getSrs() : databaseAdapter.getConnectionMetaData().getReferenceSystem();
		
		switch (operand.getGeometryType()) {
		case ENVELOPE:
			geometryObject = parseEnvelope((BoundingBox)operand, referenceSystem);
			break;
		case POINT:
			geometryObject = parsePoint((Point)operand, referenceSystem);
			break;
		case MULTI_POINT:
			geometryObject = parseMultiPoint((MultiPoint)operand, referenceSystem);
			break;
		case LINE_STRING:
			geometryObject = parseLineString((LineString)operand, referenceSystem);
			break;
		case MULTI_LINE_STRING:
			geometryObject = parseMultiLineString((MultiLineString)operand, referenceSystem);
			break;
		case POLYGON:
			geometryObject = parsePolygon((Polygon)operand, referenceSystem);
			break;
		case MULTI_POLYGON:
			geometryObject = parseMultiPolygon((MultiPolygon)operand, referenceSystem);
			break;
		case SOLID:
		case COMPOSITE_SOLID:
			// nothing to do
		}
		
		return geometryObject;
	}
	
	private GeometryObject parseEnvelope(BoundingBox envelope, DatabaseSrs referenceSystem) throws GeometryParseException {
		return GeometryObject.createEnvelope(new double[]{
				envelope.getLowerCorner().getX(),
				envelope.getLowerCorner().getY(),
				envelope.getUpperCorner().getX(),
				envelope.getUpperCorner().getY()
		}, 2, referenceSystem.getSrid());
	}
		
	private GeometryObject parsePoint(Point point, DatabaseSrs referenceSystem) throws GeometryParseException {
		return GeometryObject.createPoint(new double[]{point.getPos().getX(), point.getPos().getY()}, 2, referenceSystem.getSrid());
	}
	
	private GeometryObject parseMultiPoint(MultiPoint multiPoint, DatabaseSrs referenceSystem) throws GeometryParseException {
		double[][] pointArray = new double[multiPoint.getPoints().size()][];
		for (int i = 0; i < multiPoint.getPoints().size(); i++) {
			Point point = multiPoint.getPoints().get(i);
			pointArray[i] = new double[]{point.getPos().getX(), point.getPos().getY()};
		}
		
		return GeometryObject.createMultiPoint(pointArray, 2, referenceSystem.getSrid());
	}
	
	private GeometryObject parseLineString(LineString lineString, DatabaseSrs referenceSystem)throws GeometryParseException {
		return GeometryObject.createCurve(convertPrimitive(lineString.getPosList().getCoords()), 2, referenceSystem.getSrid());
	}

	private GeometryObject parseMultiLineString(MultiLineString multiLineString, DatabaseSrs referenceSystem)throws GeometryParseException {
		List<List<Double>> pointList = new ArrayList<List<Double>>();
		for (LineString lineString : multiLineString.getLineStrings())
			pointList.add(lineString.getPosList().getCoords());		
		
		return GeometryObject.createMultiCurve(convertAggregate(pointList, false), 2, referenceSystem.getSrid());
	}

	private GeometryObject parsePolygon(Polygon polygon, DatabaseSrs referenceSystem) throws GeometryParseException {
		List<List<Double>> pointList = new ArrayList<List<Double>>();
		pointList.add(polygon.getExterior().getCoords());
		
		if (polygon.isSetInterior()) {
			for (PositionList interior : polygon.getInterior())
				pointList.add(interior.getCoords());				
		}
		
		return GeometryObject.createPolygon(convertAggregate(pointList, true), 2, referenceSystem.getSrid());
	}
	
	private GeometryObject parseMultiPolygon(MultiPolygon multiPolygon, DatabaseSrs referenceSystem) throws GeometryParseException {
		List<List<Double>> pointList = new ArrayList<List<Double>>();
		List<Integer> exteriorRings = new ArrayList<Integer>();
		int exteriorRing = 0;
		
		for (Polygon polygon : multiPolygon.getPolygons()) {
			pointList.add(polygon.getExterior().getCoords());
			if (polygon.isSetInterior()) {
				exteriorRing += polygon.getInterior().size();
				for (PositionList interior : polygon.getInterior())
					pointList.add(interior.getCoords());
			}
			
			exteriorRings.add(++exteriorRing);
		}
		
		int[] tmp = new int[exteriorRings.size()];
		for (int i = 0; i < exteriorRings.size(); i++)
			tmp[i] = exteriorRings.get(i);
		
		return GeometryObject.createMultiPolygon(convertAggregate(pointList, true), tmp, 2, referenceSystem.getSrid());
	}
	
	private void validateRing(List<Double> coords) throws GeometryParseException {
		if (coords == null || coords.isEmpty()) {
			throw new GeometryParseException("Linear ring contains less than 4 coordinates.");
		}

		// check closedness
		Double x = coords.get(0);
		Double y = coords.get(1);

		int nrOfPoints = coords.size();

		if (!x.equals(coords.get(nrOfPoints - 2)) ||
				!y.equals(coords.get(nrOfPoints - 1))) {

			// repair unclosed ring...
			coords.add(x);
			coords.add(y);
		}

		// check for minimum number of coordinates
		if (coords.size() / 2 < 4)
			throw new GeometryParseException("Linear ring contains less than 4 coordinates.");
	}
	
	private double[] convertPrimitive(List<Double> pointList) {
		double[] result = new double[pointList.size()];
		
		for (int i = 0; i < pointList.size(); i++)
			result[i] = pointList.get(i);
		
		return result;
	}
	
	private double[][] convertAggregate(List<List<Double>> pointList, boolean validate) throws GeometryParseException {
		double[][] result = new double[pointList.size()][];

		int i = 0;
		for (List<Double> points : pointList) {
			if (validate)
				validateRing(points);
				
			result[i++] = convertPrimitive(points);			
		}

		return result;
	}
	
}