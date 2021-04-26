/*
 * 3D City Database - The Open Source CityGML Database
 * https://www.3dcitydb.org/
 *
 * Copyright 2013 - 2021
 * Chair of Geoinformatics
 * Technical University of Munich, Germany
 * https://www.lrg.tum.de/gis/
 *
 * The 3D City Database is jointly developed with the following
 * cooperation partners:
 *
 * Virtual City Systems, Berlin <https://vc.systems/>
 * M.O.S.S. Computer Grafik Systeme GmbH, Taufkirchen <http://www.moss.de/>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.citydb.database.schema.path;

import org.citydb.database.schema.mapping.AbstractPathElement;
import org.citydb.database.schema.mapping.ObjectProperty;
import org.citydb.database.schema.mapping.ObjectType;
import org.citydb.database.schema.mapping.PathElementType;

public final class ObjectPropertyNode extends AbstractNode<ObjectProperty> {

	protected ObjectPropertyNode(ObjectProperty objectProperty) {
		super(objectProperty);
	}
	
	protected ObjectPropertyNode(ObjectPropertyNode other) {
		super(other);
	}
	
	@Override
	protected boolean isValidChild(AbstractPathElement candidate) {
		if (candidate.getElementType() == PathElementType.OBJECT_TYPE) {
			ObjectType type = (ObjectType)candidate;
			
			while (type != null) {
				if (pathElement.getType() == type)
					return true;
				
				type = type.isSetExtension() ? type.getExtension().getBase() : null;
			}
		}

		return false;
	}

	@Override
	protected boolean isValidPredicate(AbstractNodePredicate candidate) {
		return false;
	}

	@Override
	protected ObjectPropertyNode copy() {
		return new ObjectPropertyNode(this);
	}

}
