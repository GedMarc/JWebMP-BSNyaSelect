/* 
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.angularnyabootstrapselector;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;

/**
 *
 * @author GedMarc
 * @since 22 Feb 2017
 *
 */
@PluginInformation(pluginName = "Nya Bootstrap Select",
                   pluginUniqueName = "bootstrap-nya-select",
                   pluginDescription = "nya-bootstrap-select helps you build select element or dropdown with Bootstrap style and an angular way. Generate options with collection, get user select value with model. Define various styles of the select options as you wish. ",
                   pluginVersion = "BS3.3.7 / 4a6",
                   pluginDependancyUniqueIDs = "jquery,bootstrap,angular",
                   pluginCategories = "bootstrap,web ui,ui,framework,select",
                   pluginSubtitle = "An Bootstrap dropdown component and replacement of vanilla select element, designed for AngularJS",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect",
                   pluginSourceUrl = "https://github.com/lordfriend/nya-bootstrap-select",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect/wiki",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BSNyaSelect.jar/download",
                   pluginIconUrl = "bower_components/nya-bootstrap-select/logo.png",
                   pluginIconImageUrl = "bower_components/nya-bootstrap-select/logo.png",
                   pluginLastUpdatedDate = "2017/03/04",
                   pluginOriginalHomepage = "http://nya.io/nya-bootstrap-select/#!/"
)
public class NysSelectBootstrapConfigurator extends PageConfigurator
{

    public final String NyaSelectEnabled = "nyaselect-enabled";

    private static final long serialVersionUID = 1L;

    public NysSelectBootstrapConfigurator()
    {
        setSortOrder(160);
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            page.getAngular().getAngularModules().add(new NyaSelectAngularModule(page.getBody()));

            if (BootstrapPageConfigurator.isBootstrap4())
            {
                page.getBody().getJavascriptReferences().add(NyaSelectReferencePool.Nya4Reference.getJavaScriptReference());
                page.getBody().getCssReferences().add(NyaSelectReferencePool.Nya4Reference.getCssReference());
            }
            else
            {
                page.getBody().getJavascriptReferences().add(NyaSelectReferencePool.NyaReference.getJavaScriptReference());
                page.getBody().getCssReferences().add(NyaSelectReferencePool.NyaReference.getCssReference());
            }
        }

        return page;
    }
}
