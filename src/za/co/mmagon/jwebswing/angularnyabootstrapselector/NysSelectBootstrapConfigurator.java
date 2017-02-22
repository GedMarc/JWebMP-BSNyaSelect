/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
@PluginInformation(pluginName = "Nya Bootstrap Select", pluginUniqueName = "bootstrap-nya-select",
        pluginDescription = "nya-bootstrap-select helps you build select element or dropdown with Bootstrap style and an angular way. Generate options with collection, get user select value with model. Define various styles of the select options as you wish. ",
        pluginVersion = "Bootstrap version 3 or 4",
        pluginDependancyUniqueIDs = "jquery,bootstrap,angular", pluginCategories = "bootstrap,web ui,ui,framework,select", pluginSubtitle = "An Bootstrap dropdown component and replacement of vanilla select element, designed for AngularJS",
        pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect", pluginSourceUrl = "http://nya.io/nya-bootstrap-select/#!/",
        pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect/wiki")
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
