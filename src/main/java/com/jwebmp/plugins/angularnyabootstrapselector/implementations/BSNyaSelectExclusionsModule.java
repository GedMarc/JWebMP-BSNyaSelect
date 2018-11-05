package com.jwebmp.plugins.angularnyabootstrapselector.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BSNyaSelectExclusionsModule
		implements IGuiceScanModuleExclusions<BSNyaSelectExclusionsModule>,
				           IGuiceScanJarExclusions<BSNyaSelectExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-bootstrap-nya-select-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularnyabootstrapselector");
		return strings;
	}
}
