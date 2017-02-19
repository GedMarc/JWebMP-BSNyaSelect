package za.co.mmagon.jwebswing.angularnyabootstrapselector;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 *
 * @author GedMarc
 * @since 27 Jan 2017
 *
 */
public class NyaSelectAngularModule extends AngularModuleBase
{

    private static final long serialVersionUID = 1L;

    public NyaSelectAngularModule(ComponentHierarchyBase page)
    {
        super("nya.bootstrap.select");
        page.getJavascriptReferences().add(NyaSelectReferencePool.NyaReference.getJavaScriptReference());
        page.getCssReferences().add(NyaSelectReferencePool.NyaReference.getCssReference());
    }

    @Override
    public String renderFunction()
    {
        return "";
    }
}
