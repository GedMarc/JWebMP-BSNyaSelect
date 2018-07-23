import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularnyabootstrapselector.NyaSelectAngularModule;

module com.jwebmp.plugins.angularnyabootstrapselector {
	exports com.jwebmp.plugins.angularnyabootstrapselector;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires com.jwebmp.plugins.bootstrap;

	provides IPageConfigurator with com.jwebmp.plugins.angularnyabootstrapselector.NysSelectBootstrapConfigurator;
	provides IAngularModule with NyaSelectAngularModule;

}
