module com.jwebmp.plugins.angularnyabootstrapselector {
	exports com.jwebmp.plugins.angularnyabootstrapselector;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularnyabootstrapselector.NyaSelectPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularnyabootstrapselector.NyaSelectAngularModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularnyabootstrapselector.implementations.BSNyaSelectExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularnyabootstrapselector.implementations.BSNyaSelectExclusionsModule;

	opens com.jwebmp.plugins.angularnyabootstrapselector to com.fasterxml.jackson.databind, com.jwebmp.core;
}
