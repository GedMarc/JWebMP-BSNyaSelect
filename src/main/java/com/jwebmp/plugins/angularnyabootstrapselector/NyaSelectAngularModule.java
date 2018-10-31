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
package com.jwebmp.plugins.angularnyabootstrapselector;

import com.jwebmp.core.base.angular.modules.AngularModuleBase;
import com.jwebmp.core.base.angular.services.IAngularModule;

/**
 * @author GedMarc
 * @since 27 Jan 2017
 */
public class NyaSelectAngularModule
		extends AngularModuleBase
		implements IAngularModule<NyaSelectAngularModule>
{


	public NyaSelectAngularModule()
	{
		super("nya.bootstrap.select");

	}

	@Override
	public String renderFunction()
	{
		return "";
	}
}
