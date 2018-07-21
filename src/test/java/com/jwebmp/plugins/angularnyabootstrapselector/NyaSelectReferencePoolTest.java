package com.jwebmp.plugins.angularnyabootstrapselector;

import com.jwebmp.core.Page;
import org.junit.jupiter.api.Test;

/**
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
		nya.add(new NyaSelectItem().setText("Item 1")
		                           .setValue("value1")
		                           .setIconClass("fa-shopping")
		                           .setCheckClass("checking"));

		System.out.println(nya.toString(true));
	}

	@Test
	public void testPage()
	{
		Page p = new Page();
		p.getOptions()
		 .setDynamicRender(false);
		NyaSelect nya = new NyaSelect("test.me");

		p.getBody()
		 .add(nya);

		System.out.println(p.toString(true));
	}

}
