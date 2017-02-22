/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.angularnyabootstrapselector;

import org.junit.Test;

/**
 *
 * @author GedMarc
 */
public class NyaSelectTest
{

    public NyaSelectTest()
    {
    }

    @Test
    public void testSetMultiple()
    {
        NyaSelect ns = new NyaSelect("asdf.asdf").add(new NyaSelectItem("asdf", "asdf", "asdf", "", ""));
        System.out.println(ns.toString(true));
    }

}
