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
package org.citydb.gui.modules.importer.preferences;

import org.citydb.config.Config;
import org.citydb.gui.modules.common.AbstractPreferences;
import org.citydb.gui.modules.common.DefaultPreferencesEntry;
import org.citydb.gui.modules.common.XSLTransformationPanel;

public class CityGMLImportPreferences extends AbstractPreferences {
	
	public CityGMLImportPreferences(Config config) {
		super(new CityGMLImportEntry());
		
		root.addChildEntry(new DefaultPreferencesEntry(new ContinuationPanel(config)));
		root.addChildEntry(new DefaultPreferencesEntry(new ResourceIdPanel(config)));
		root.addChildEntry(new DefaultPreferencesEntry(new AppearancePanel(config)));
		root.addChildEntry(new DefaultPreferencesEntry(new GeometryPanel(config)));

		DefaultPreferencesEntry cityGMLOptions = new CityGMLOptionsPanel();
		root.addChildEntry(cityGMLOptions);
		cityGMLOptions.addChildEntry(new DefaultPreferencesEntry(new AddressPanel(config)));
		cityGMLOptions.addChildEntry(new DefaultPreferencesEntry(new XMLValidationPanel(config)));
		cityGMLOptions.addChildEntry(new DefaultPreferencesEntry(new XSLTransformationPanel(false, config)));

		root.addChildEntry(new DefaultPreferencesEntry(new CityJSONOptionsPanel(config)));
		root.addChildEntry(new DefaultPreferencesEntry(new IndexPanel(config)));
		root.addChildEntry(new DefaultPreferencesEntry(new ImportLogPanel(config)));
		root.addChildEntry(new DefaultPreferencesEntry(new ResourcesPanel(config)));
	}

}