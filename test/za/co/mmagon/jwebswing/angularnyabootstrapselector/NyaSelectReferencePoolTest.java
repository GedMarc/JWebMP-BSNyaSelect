package za.co.mmagon.jwebswing.angularnyabootstrapselector;

import org.junit.Test;
import za.co.mmagon.jwebswing.Page;

/**
 *
 * @author GedMarc
 */
public class NyaSelectReferencePoolTest
{

    public NyaSelectReferencePoolTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        NyaSelect nya = new NyaSelect("test.me");
        nya.add(new NyaSelectItem().setText("Item 1").setValue("value1").setIconClass("fa-shopping").setCheckClass("checking"));

        System.out.println(nya.toString(true));
    }

    @Test
    public void testPage()
    {
        Page p = new Page();
        p.getOptions().setDynamicRender(false);
        NyaSelect nya = new NyaSelect("test.me");

        p.getBody().add(nya);

        System.out.println(p.toString(true));
    }

}
