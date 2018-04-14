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

import com.jwebmp.base.html.*;
import com.jwebmp.plugins.bootstrap.dropdown.BSComponentDropDownOptions;

/**
 * @author GedMarc
 * @since 04 Feb 2017
 */
public class NyaSelectItem
		extends ListItem
		implements NyaSelectChildren
{

	private static final long serialVersionUID = 1L;

	private String label;
	private String text;
	private String iconClass;
	private String value;
	private String checkClass;
	private String subText;

	public NyaSelectItem()
	{
	}

	public NyaSelectItem(String text, String iconClass, String value, String checkClass, String subText)
	{
		this.text = text;
		this.iconClass = iconClass;
		this.value = value;
		this.checkClass = checkClass;
		this.subText = subText;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass("nya-bs-option");
			addClass(BSComponentDropDownOptions.Dropdown_Item);

			Link link = new Link();
			add(link);

			Span labelSpan = new Span();

			if (getIconClass() != null && !getIconClass().isEmpty())
			{
				Span iconSpan = new Span();
				iconSpan.addClass(getIconClass());
				labelSpan.add(iconSpan);
			}
			labelSpan.add(new Paragraph(getText()).setTextOnly(true));

			link.add(labelSpan);

			if (getSubText() != null && !getSubText().isEmpty())
			{
				labelSpan.add(new SmallText(getSubText()));
			}

			if (getValue() != null && !getValue().isEmpty())
			{
				addAttribute("data-value", getValue());
			}

			if (getCheckClass() != null && !getCheckClass().isEmpty())
			{
				Span iconSpan = new Span();
				iconSpan.addClass(getCheckClass());
				iconSpan.addClass("check-mark");
				link.add(iconSpan);
			}
		}
		super.preConfigure();
	}

	public String getIconClass()
	{
		return iconClass;
	}

	public NyaSelectItem setIconClass(String iconClass)
	{
		this.iconClass = iconClass;
		return this;
	}

	public String getSubText()
	{
		return subText;
	}

	public void setSubText(String subText)
	{
		this.subText = subText;
	}

	public String getValue()
	{
		return value;
	}

	public NyaSelectItem setValue(String value)
	{
		this.value = value;
		return this;
	}

	public String getCheckClass()
	{
		return checkClass;
	}

	public NyaSelectItem setCheckClass(String checkClass)
	{
		this.checkClass = checkClass;
		return this;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof NyaSelectItem))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		NyaSelectItem that = (NyaSelectItem) o;

		if (getLabel() != null ? !getLabel().equals(that.getLabel()) : that.getLabel() != null)
		{
			return false;
		}
		if (getText() != null ? !getText().equals(that.getText()) : that.getText() != null)
		{
			return false;
		}
		if (getIconClass() != null ? !getIconClass().equals(that.getIconClass()) : that.getIconClass() != null)
		{
			return false;
		}
		if (getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null)
		{
			return false;
		}
		if (getCheckClass() != null ? !getCheckClass().equals(that.getCheckClass()) : that.getCheckClass() != null)
		{
			return false;
		}
		return getSubText() != null ? getSubText().equals(that.getSubText()) : that.getSubText() == null;
	}

	@Override
	public int hashCode()
	{
		int result = super.hashCode();
		result = 31 * result + (getLabel() != null ? getLabel().hashCode() : 0);
		result = 31 * result + (getText() != null ? getText().hashCode() : 0);
		result = 31 * result + (getIconClass() != null ? getIconClass().hashCode() : 0);
		result = 31 * result + (getValue() != null ? getValue().hashCode() : 0);
		result = 31 * result + (getCheckClass() != null ? getCheckClass().hashCode() : 0);
		result = 31 * result + (getSubText() != null ? getSubText().hashCode() : 0);
		return result;
	}

	public String getLabel()
	{
		return label;
	}

	public NyaSelectItem setLabel(String label)
	{
		this.label = label;
		return this;
	}

	@Override
	public String getText()
	{
		return text;
	}


	@Override
	public NyaSelectItem setText(String text)
	{
		this.text = text;
		return this;
	}


}
