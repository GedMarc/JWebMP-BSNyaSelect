import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularnyabootstrapselector.NyaSelectAngularModule;
import com.jwebmp.plugins.angularnyabootstrapselector.implementations.BSNyaSelectExclusionsModule;

module com.jwebmp.plugins.angularnyabootstrapselector {
	exports com.jwebmp.plugins.angularnyabootstrapselector;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with com.jwebmp.plugins.angularnyabootstrapselector.NysSelectBootstrapConfigurator;
	provides IAngularModule with NyaSelectAngularModule;

	provides IGuiceScanJarExclusions with BSNyaSelectExclusionsModule;
	provides IGuiceScanModuleExclusions with BSNyaSelectExclusionsModule;

	opens com.jwebmp.plugins.angularnyabootstrapselector to com.fasterxml.jackson.databind, com.jwebmp.core;
}
