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

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.BSFormChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap.forms.groups.sets.BSFormSetChildren;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * An implementation of
 * <p>
 * @author Marc Magon
 * @since 17 Jan 2017
 * @version 1.0
 */
@ComponentInformation(name = "Bootstrap Nya Select", description = "An Bootstrap dropdown component and replacement of vanilla select element, designed for AngularJS ",
                      url = "http://nya.io/nya-bootstrap-select/#!/", wikiUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect/wiki")
public class NyaSelect extends List<NyaSelectChildren, NyaSelectAttributes, NyaSelectEvents, NyaSelect> implements BSFormChildren, BSFormGroupChildren, BSFormSetChildren
{

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new instance
     * <p>
     */
    public NyaSelect()
    {
        this("data.nya");
    }

    /**
     * Constructs a new instance
     *
     * @param bindingVariableName
     */
    public NyaSelect(String bindingVariableName)
    {
        super(true);
        addClass("nya-bs-select");
        addAttribute(AngularAttributes.ngModel, bindingVariableName);
        JQueryPageConfigurator.setRequired(this, true);
        BootstrapPageConfigurator.setBootstrapRequired(this, true);
        AngularPageConfigurator.setRequired(this, true);
    }

    /**
     * Sets this select option as multiple Binds as an array, make the dto object a List
     *
     * @param multiple
     *
     * @return
     */
    public NyaSelect setMultiple(boolean multiple)
    {
        if (multiple)
        {
            addAttribute("multiple", (String) null);
        }
        else
        {
            getAttributesCustom().remove("multiple");
        }
        return this;
    }

    /**
     * Provide a input box to search through all option content only if live-search="true"
     *
     * @param liveSearch
     *
     * @return
     */
    public NyaSelect setLiveSearch(boolean liveSearch)
    {
        if (liveSearch)
        {
            addAttribute("live-search", Boolean.TRUE.toString());
        }
        else
        {
            getAttributesCustom().remove("live-search");
        }
        return this;
    }

    /**
     * The control is considered valid if ngModel value is defined or not an empty array(for multiple)
     *
     * @param required
     *
     * @return
     */
    public NyaSelect setRequired(boolean required)
    {
        if (required)
        {
            addAttribute("required", Boolean.TRUE.toString());
        }
        else
        {
            getAttributesCustom().remove("required");
        }
        return this;
    }

    /**
     * if the expression is truthy, then the whole control will be disabled.
     *
     * @param expression
     *
     * @return
     */
    public NyaSelect setDisabled(String expression)
    {
        if (expression != null && !expression.isEmpty())
        {
            addAttribute("disabled", expression);
        }
        else
        {
            getAttributesCustom().remove("disabled");
        }
        return this;
    }

    /**
     * Sets max number which the dropdown-menu can show. if the number of options exceed the limit. an scrollbar will be shown.
     *
     * @param displaysize
     *
     * @return
     */
    public NyaSelect setDisplaySize(Integer displaysize)
    {
        if (displaysize != null && displaysize != 0)
        {
            addAttribute("size", displaysize.toString());
        }
        else
        {
            getAttributesCustom().remove("size");
        }
        return this;
    }

    /**
     * provide a replacement for default text when nothing is selected.
     *
     * @param title
     *
     * @return
     */
    public NyaSelect setTitle(String title)
    {
        if (title != null && !title.isEmpty())
        {
            addAttribute("title", title);
        }
        else
        {
            getAttributesCustom().remove("title");
        }
        return this;
    }

    /**
     * Sets this select option as multiple Binds as an array, make the dto object a List
     *
     * @param actionsBox
     *
     * @return
     */
    public NyaSelect setActionsBox(boolean actionsBox)
    {
        if (actionsBox)
        {
            addAttribute("actions-box", "true");
        }
        else
        {
            getAttributesCustom().remove("actions-box");
        }
        return this;
    }

    /**
     * if sets to value, the dropdown-toggle button will show content user has selected, this is default value.
     *
     * @param selectedTextAsValue
     *
     * @return
     */
    public NyaSelect setSelectedTextValue(boolean selectedTextAsValue)
    {
        if (selectedTextAsValue)
        {
            addAttribute("selected-text-format", "value");
        }
        else
        {
            getAttributesCustom().remove("selected-text-format");
        }
        return this;
    }

    /**
     * if sets to count, the dropdown-toggle button will show the number of options user has selected.
     *
     * @param selectedTextAsCount
     *
     * @return
     */
    public NyaSelect setSelectedTextCount(boolean selectedTextAsCount)
    {
        if (selectedTextAsCount)
        {
            addAttribute("selected-text-format", "count");
        }
        else
        {
            getAttributesCustom().remove("selected-text-format");
        }
        return this;
    }

    /**
     * Show Menu Arrow
     * <p>
     * To enable an menu arrow on dropdown menu. just add a class show-menu-arrow on nya-bs-select element.
     *
     * @param showMenuIcon
     *
     * @return
     */
    public NyaSelect setShowMenuIcon(boolean showMenuIcon)
    {
        if (showMenuIcon)
        {
            addClass("show-menu-arrow");
        }
        else
        {
            removeClass("show-menu-arrow");
        }
        return this;
    }

    /**
     * if sets to count>x, the dropdown-toggle button will show the number of user selected options when the number of options greater than x. otherwise, show the content.
     *
     * @param selectedTextAsCount
     * @param countThan
     *
     * @return
     */
    public NyaSelect setSelectedTextCountGreaterThan(boolean selectedTextAsCount, int countThan)
    {
        if (selectedTextAsCount)
        {
            addAttribute("selected-text-format", "count>" + countThan);
        }
        else
        {
            getAttributesCustom().remove("selected-text-format");
        }
        return this;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 79 * hash + (this.getID().hashCode());
        return hash;
    }

}
