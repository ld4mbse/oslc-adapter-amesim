package edu.gatech.mbse.oslc4jamesim.serviceproviders;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.PrefixDefinition;
import org.eclipse.lyo.oslc4j.core.model.Publisher;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderFactory;

import edu.gatech.mbse.oslc4jamesim.application.OSLC4JAMESimApplication;
import edu.gatech.mbse.oslc4jamesim.services.AMESimCircuitService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimComponentService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimGlobalParameterService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimLineService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimParameterService;
import edu.gatech.mbse.oslc4jamesim.services.AMESimPortService;



public class AMESimServiceProviderFactory {
	private static Class<?>[] RESOURCE_CLASSES = {
		AMESimCircuitService.class,
		AMESimComponentService.class, AMESimLineService.class,
		AMESimPortService.class, 
		AMESimParameterService.class,
		AMESimGlobalParameterService.class
			};

	private AMESimServiceProviderFactory() {
		super();
	}

	/**
	 * Create a new AMESim OSLC service provider.
	 * 
	 * @param baseURI
	 * @param product
	 * @param parameterValueMap
	 *            - a map containing the path replacement value for {productId}.
	 *            See ServiceProviderCatalogSingleton.
	 *            initServiceProvidersFromProducts()
	 * @return
	 * @throws OslcCoreApplicationException
	 * @throws URISyntaxException
	 */
	public static ServiceProvider createServiceProvider(final String baseURI,
			final String product, final Map<String, Object> parameterValueMap)
			throws OslcCoreApplicationException, URISyntaxException {
		final ServiceProvider serviceProvider = ServiceProviderFactory
				.createServiceProvider(baseURI, "http://" + OSLC4JAMESimApplication.hostName + ":" + OSLC4JAMESimApplication.portNumber + "/" + "OSLC4JUI", product,
						"Service provider for AMESim circuit: " + product,
						new Publisher("Georgia Institute of Technology OSLC Project",
								"urn:oslc:ServiceProvider"), RESOURCE_CLASSES,
						parameterValueMap);
		URI detailsURIs[] = { new URI(baseURI + "/details") };
		serviceProvider.setDetails(detailsURIs);

		final PrefixDefinition[] prefixDefinitions = {
				new PrefixDefinition(OslcConstants.DCTERMS_NAMESPACE_PREFIX,
						new URI(OslcConstants.DCTERMS_NAMESPACE)),
				new PrefixDefinition(OslcConstants.OSLC_CORE_NAMESPACE_PREFIX,
						new URI(OslcConstants.OSLC_CORE_NAMESPACE)),
				new PrefixDefinition(OslcConstants.OSLC_DATA_NAMESPACE_PREFIX,
						new URI(OslcConstants.OSLC_DATA_NAMESPACE)),
				new PrefixDefinition(OslcConstants.RDF_NAMESPACE_PREFIX,
						new URI(OslcConstants.RDF_NAMESPACE)),
				new PrefixDefinition(OslcConstants.RDFS_NAMESPACE_PREFIX,
						new URI(OslcConstants.RDFS_NAMESPACE))
//				,
//				new PrefixDefinition(
//						Constants.CHANGE_MANAGEMENT_NAMESPACE_PREFIX, new URI(
//								Constants.CHANGE_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(Constants.BUGZILLA_NAMESPACE_PREFIX,
//						new URI(Constants.BUGZILLA_NAMESPACE)),
//				new PrefixDefinition(Constants.FOAF_NAMESPACE_PREFIX, new URI(
//						Constants.FOAF_NAMESPACE)),
//				new PrefixDefinition(Constants.QUALITY_MANAGEMENT_PREFIX,
//						new URI(Constants.QUALITY_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(Constants.REQUIREMENTS_MANAGEMENT_PREFIX,
//						new URI(Constants.REQUIREMENTS_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(
//						Constants.SOFTWARE_CONFIGURATION_MANAGEMENT_PREFIX,
//						new URI(
//								Constants.SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(Constants.SIMULINK_PREFIX, new URI(
//						Constants.SIMULINK_NAMESPACE)) 
				};

		serviceProvider.setPrefixDefinitions(prefixDefinitions);

		return serviceProvider;
	}
}
