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
package com.jwebmp.angularnyabootstrapselector;

import com.jwebmp.base.angular.AngularAttributes;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.base.html.List;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.forms.BSFormChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormSetChildren;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

/**
 * An implementation of
 * <p>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Nya Select",
		description = "An Bootstrap dropdown component and replacement of vanilla select element, designed for AngularJS ",
		url = "http://nya.io/nya-bootstrap-select/#!/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BSNyaSelect/wiki")
public class NyaSelect
		extends List<NyaSelectChildren, NyaSelectAttributes, NyaSelectEvents, NyaSelect>
		implements BSFormChildren, BSFormGroupChildren, BSFormSetChildren
{

	private static final long serialVersionUID = 1L;

	private static final String SelectedTextAttributeText = "selected-text-format";

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
		JQueryPageConfigurator.setRequired(true);

		AngularPageConfigurator.setRequired(true);
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
			addAttribute("multiple", null);
		}
		else
		{
			getAttributes().remove("multiple");
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
			getAttributes().remove("live-search");
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
			getAttributes().remove("required");
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
			getAttributes().remove("disabled");
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
			getAttributes().remove("size");
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
			getAttributes().remove("title");
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
			getAttributes().remove("actions-box");
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
			addAttribute(SelectedTextAttributeText, "value");
		}
		else
		{
			getAttributes().remove(SelectedTextAttributeText);
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
			addAttribute(SelectedTextAttributeText, "count");
		}
		else
		{
			getAttributes().remove(SelectedTextAttributeText);
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
	 * if sets to count greater than x, the dropdown-toggle button will show the number of user selected options when the number of options greater than x. otherwise, show the
	 * content.
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
			addAttribute(SelectedTextAttributeText, "count>" + countThan);
		}
		else
		{
			getAttributes().remove(SelectedTextAttributeText);
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
		hash = 79 * hash + (getID().hashCode());
		return hash;
	}

}
