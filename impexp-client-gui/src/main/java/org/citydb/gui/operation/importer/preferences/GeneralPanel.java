/*
 * 3D City Database - The Open Source CityGML Database
 * https://www.3dcitydb.org/
 *
 * Copyright 2013 - 2024
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

package org.citydb.gui.operation.importer.preferences;

import org.citydb.config.Config;
import org.citydb.config.i18n.Language;
import org.citydb.config.project.importer.GeneralOptions;
import org.citydb.gui.components.TitledPanel;
import org.citydb.gui.plugin.internal.InternalPreferencesComponent;
import org.citydb.gui.util.GuiUtil;

import javax.swing.*;
import java.awt.*;
import java.util.Locale;

public class GeneralPanel extends InternalPreferencesComponent {
    private TitledPanel generalPanel;
    private JCheckBox failFastOnErrors;

    public GeneralPanel(Config config) {
        super(config);
        initGui();
    }

    @Override
    public boolean isModified() {
        GeneralOptions generalOptions = config.getImportConfig().getGeneralOptions();

        if (failFastOnErrors.isSelected() != generalOptions.isFailFastOnErrors()) return true;

        return false;
    }

    private void initGui() {
        failFastOnErrors = new JCheckBox();

        setLayout(new GridBagLayout());
        {
            JPanel content = new JPanel();
            content.setLayout(new GridBagLayout());
            {
                content.add(failFastOnErrors, GuiUtil.setConstraints(0, 0, 1, 0, GridBagConstraints.BOTH, 0, 0, 0, 0));
            }

            generalPanel = new TitledPanel().build(content);
        }

        add(generalPanel, GuiUtil.setConstraints(0, 0, 1, 0, GridBagConstraints.BOTH, 0, 0, 0, 0));
    }

    @Override
    public void setSettings() {
        GeneralOptions generalOptions = config.getImportConfig().getGeneralOptions();
        generalOptions.setFailFastOnErrors(failFastOnErrors.isSelected());
    }

    @Override
    public void loadSettings() {
        GeneralOptions generalOptions = config.getImportConfig().getGeneralOptions();
        failFastOnErrors.setSelected(generalOptions.isFailFastOnErrors());
    }

    @Override
    public void switchLocale(Locale locale) {
        generalPanel.setTitle(Language.I18N.getString("pref.import.general.border.general"));
        failFastOnErrors.setText(Language.I18N.getString("pref.import.general.failFastOnError"));
    }

    @Override
    public String getLocalizedTitle() {
        return Language.I18N.getString("pref.tree.import.general");
    }
}
