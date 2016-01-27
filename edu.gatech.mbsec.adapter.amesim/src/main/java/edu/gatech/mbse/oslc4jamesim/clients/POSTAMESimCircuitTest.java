package edu.gatech.mbse.oslc4jamesim.clients;



import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response;

import org.apache.wink.client.handlers.BasicAuthSecurityHandler;
//import org.eclipse.lyo.oslc4j.client.OslcRestClient;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;










import edu.gatech.mbse.oslc4jamesim.resources.AMESimComponent;
import edu.gatech.mbse.oslc4jamesim.resources.AMESimElementsToCreate;
import edu.gatech.mbse.oslc4jamesim.resources.AMESimLine;
import edu.gatech.mbse.oslc4jamesim.resources.AMESimParameter;
import edu.gatech.mbse.oslc.wink.clients.OslcRestClient;

public class POSTAMESimCircuitTest {

	private static String portNumber = "8282";	
	static String projectId = "FlatTwin3";
	private static String baseHTTPURI = "http://localhost:" + portNumber + "/oslc4jamesim";
	
	private static final Set<Class<?>> PROVIDERS = new HashSet<Class<?>>();
	static {
		PROVIDERS.addAll(JenaProvidersRegistry.getProviders());
		// PROVIDERS.addAll(Json4JProvidersRegistry.getProviders());
	}

	public static void main(String[] args) {
		// components to create
		AMESimComponent mass_friction1portComponent = createNewAMESimComponent(
				"mass_friction1port", "mass_friction1port", "40", "99",
				"MAS003", "r'$AME\\libmec\\submodels'", 0, false);

		AMESimComponent springdamper01Component = createNewAMESimComponent(
				"springdamper01", "springdamper01", "89", "99", "SD0000A",
				"r'$AME\\libmec\\submodels'", 1, false);

		AMESimComponent simple_crankComponent = createNewAMESimComponent(
				"simple_crank", "simple_crank", "138", "103", "CRANK0",
				"r'$AME\\libmec\\submodels'", 1, true);

		AMESimComponent rconnectorComponent = createNewAMESimComponent(
				"rconnector", "rconnector", "176", "149", "RCON00",
				"r'$AME\\libmec\\submodels'", 2, false);

		AMESimComponent simple_crank_2Component = createNewAMESimComponent(
				"simple_crank", "simple_crank_2", "229", "103", "CRANK0",
				"r'$AME\\libmec\\submodels'", 1, false);

		AMESimComponent springdamper01_2Component = createNewAMESimComponent(
				"springdamper01", "springdamper01_2", "287", "99", "SD0000A",
				"r'$AME\\libmec\\submodels'", 1, false);

		AMESimComponent rload01Component = createNewAMESimComponent("rload01",
				"rload01", "187", "174", "RL00", "r'$AME\\libmec\\submodels'",
				1, false);

		AMESimComponent mass_friction1port_2Component = createNewAMESimComponent(
				"mass_friction1port", "mass_friction1port_2", "336", "99",
				"MAS003", "r'$AME\\libmec\\submodels'", 2, false);

		// lines to create
		AMESimLine mass_friction1portLine = createNewAMESimLine(
				"mass_friction1port", 0, "springdamper01", 0, false);
		
		AMESimLine springdamper01Line = createNewAMESimLine(
				"springdamper01", 1, "simple_crank", 1, false);
		
		AMESimLine simple_crankLine = createNewAMESimLine(
				"simple_crank", 0, "rconnector", 1, false);
		
		AMESimLine rconnectorLine = createNewAMESimLine(
				"rconnector", 0, "simple_crank_2", 0, false);
		
		AMESimLine rconnector2Line = createNewAMESimLine(
				"rconnector", 2, "rload01", 0, false);
		
		AMESimLine simple_crank_2Line = createNewAMESimLine(
				"simple_crank_2", 1, "springdamper01_2", 0, false);
		
		AMESimLine springdamper01_2Line = createNewAMESimLine(
				"springdamper01_2", 1, "mass_friction1port_2", 0, false);
		
		// parameters to set
		AMESimParameter mass_mass_friction1portParameter = createNewAMESimParameter(
				"mass@mass_friction1port", "100");
		AMESimParameter srate_springdamper01Parameter = createNewAMESimParameter(
				"srate@springdamper01", "1.00000000000000e+05");
		AMESimParameter cdamp_springdamper01Parameter = createNewAMESimParameter(
				"cdamp@springdamper01", "1.00000000000000e+03");
		
		
		// ****************************************************
		// *** Invoking the OSLC adapter creation factories ***

		List<AMESimComponent> componentsToCreate = new ArrayList<AMESimComponent>();
		List<AMESimLine> linesToCreate = new ArrayList<AMESimLine>();
		List<AMESimParameter> parametersToCreate = new ArrayList<AMESimParameter>();

		componentsToCreate.add(mass_friction1portComponent);
		componentsToCreate.add(springdamper01Component);
		componentsToCreate.add(simple_crankComponent);
		componentsToCreate.add(rconnectorComponent);
		componentsToCreate.add(simple_crank_2Component);
		componentsToCreate.add(springdamper01_2Component);
		componentsToCreate.add(rload01Component);
		componentsToCreate.add(mass_friction1port_2Component);

		linesToCreate.add(mass_friction1portLine);
		linesToCreate.add(springdamper01Line);
		linesToCreate.add(simple_crankLine);
		linesToCreate.add(rconnectorLine);
		linesToCreate.add(rconnector2Line);
		linesToCreate.add(simple_crank_2Line);
		linesToCreate.add(springdamper01_2Line);
		
		parametersToCreate.add(mass_mass_friction1portParameter);
		parametersToCreate.add(srate_springdamper01Parameter);
		parametersToCreate.add(cdamp_springdamper01Parameter);
		
		AMESimElementsToCreate newElements = new AMESimElementsToCreate(
				componentsToCreate, linesToCreate, parametersToCreate);
		newElements
				.setAbout(URI
						.create("http://localhost:" + portNumber + "/oslc4jamesim/services/" + projectId + "/circuit/elementstocreate"));
		
		// perform a POST
		System.out.println("\r\nPerforming HTTP POST on resource "
				+ newElements.getAbout());
		
		
//		Response clientPOSTResponse = getOslcRestClient(
//				newElements.getAbout().toString())
//				.addOslcResourceReturnClientResponse(newElements);
//		int postStatusCode = clientPOSTResponse.getStatus();
		
		OslcRestClient winkClient = getOslcRestClient(
				newElements.getAbout().toString());
		winkClient.addOslcResource(newElements);
		System.out.println("AMESim model created.");
//
//		if (postStatusCode == HttpServletResponse.SC_CREATED) {
//			System.out.println("Creation of model elements " 
//					+ " was successful ");
//		} else {
//			System.out.println("Creation of resource " 
//					+ " was NOT successful ");
//			System.out.println("postStatusCode " + postStatusCode);
//		}
	}

	private static AMESimParameter createNewAMESimParameter(String dataPath,
			String value) {
		String amesimParameterURIString = baseHTTPURI + "/services/"
				+ projectId + "/parameters/" + dataPath;

		// create new component resource
		AMESimParameter amesimParameter = null;
		try {
			amesimParameter = new AMESimParameter();
			amesimParameter.setDataPath(dataPath);;
			amesimParameter.setValue(value);					
			URI amesimParameterURI = URI.create(amesimParameterURIString);
			amesimParameter.setAbout(amesimParameterURI);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amesimParameter;
	}

	private static AMESimLine createNewAMESimLine(String sourceComponentName,
			int sourcePortIndex, String targetComponentName, int targetPortIndex, boolean isVisible) {
		String amesimLineURIString = baseHTTPURI + "/services/"
				+ projectId + "/lines/" + sourceComponentName + sourcePortIndex + targetComponentName + targetPortIndex;

		// create new component resource
		AMESimLine amesimLine = null;

		try {
			amesimLine = new AMESimLine();
			amesimLine.setSourceComponentName(sourceComponentName);
			amesimLine.setSourcePortIndex(sourcePortIndex);
			amesimLine.setTargetComponentName(targetComponentName);
			amesimLine.setTargetPortIndex(targetPortIndex);
			
			URI amesimLineURI = URI.create(amesimLineURIString);
			amesimLine.setAbout(amesimLineURI);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amesimLine;
	}

	private static AMESimComponent createNewAMESimComponent(String iconName,
			String name, String xCoordinate, String yCoordinate,
			String subModelName, String subModelDirectory,
			int numberOfRotations, boolean isFlipped) {
		String amesimComponentURIString = baseHTTPURI + "/services/"
				+ projectId + "/components/" + name;

		// create new component resource
		AMESimComponent amesimComponent = null;

		try {
			amesimComponent = new AMESimComponent();
			amesimComponent.setIconName(iconName);
			amesimComponent.setName(name);
			amesimComponent.setXCoordinate(xCoordinate);
			amesimComponent.setYCoordinate(yCoordinate);
			amesimComponent.setSubModelName(subModelName);
			amesimComponent.setSubModelDirectory(subModelDirectory);
			amesimComponent.setNumberOfRotations(numberOfRotations);
			amesimComponent.setIsFlipped(isFlipped);
			URI amesimComponentURI = URI.create(amesimComponentURIString);
			amesimComponent.setAbout(amesimComponentURI);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amesimComponent;
	}

	public static OslcRestClient getOslcRestClient(String resourceURI) {
		
		
				
				// expected mediatype
				String mediaType = "application/rdf+xml";
				// readTimeout specifies how long the RestClient object waits (in
				// milliseconds) for a response before timing out
				int readTimeout = 2400000;
				// set up the credentials for the basic authentication
				BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
				final OslcRestClient oslcWinkClient = new OslcRestClient(
						PROVIDERS, resourceURI, mediaType, readTimeout,
						basicAuthHandler);
				return oslcWinkClient;
//		
//		return new OslcRestClientEE7(PROVIDERS, resourceURI,
//				"application/rdf+xml", 240000);
	}

	
}
