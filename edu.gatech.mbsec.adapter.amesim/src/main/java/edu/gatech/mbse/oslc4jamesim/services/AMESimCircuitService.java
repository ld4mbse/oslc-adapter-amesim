package edu.gatech.mbse.oslc4jamesim.services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;






//import com.sun.jersey.api.view.Viewable;

import edu.gatech.mbse.oslc4jamesim.application.AMESimManager;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimCircuit;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimElementsToCreate;
import edu.gatech.mbsec.adapter.amesim.resources.Constants;
import edu.gatech.mbse.oslc4jamesim.serviceproviders.ServiceProviderCatalogSingleton;


@OslcService(Constants.AMESIM_CIRCUIT_DOMAIN)
@Path("{modelName}/circuit")
public class AMESimCircuitService {
	
	@Context
	private HttpServletRequest httpServletRequest;
	@Context
	private HttpServletResponse httpServletResponse;
	@Context
	private UriInfo uriInfo;
	
	@OslcQueryCapability(title = "AMESim Circuit Query Capability", label = "AMESim Circuit Catalog Query", resourceShape = OslcConstants.PATH_RESOURCE_SHAPES
			+ "/" + Constants.PATH_AMESIM_CIRCUIT, resourceTypes = { Constants.TYPE_AMESIM_CIRCUIT }, usages = { OslcConstants.OSLC_USAGE_DEFAULT })
	@GET
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public AMESimCircuit getCircuit(
			@PathParam("modelName") final String modelName,
			@QueryParam("oslc.where") final String where,
			@QueryParam("oslc.select") final String select,
			@QueryParam("oslc.prefix") final String prefix,
			@QueryParam("page") final String pageString,
			@QueryParam("oslc.orderBy") final String orderBy,
			@QueryParam("oslc.searchTerms") final String searchTerms,
			@QueryParam("oslc.paging") final String paging,
			@QueryParam("oslc.pageSize") final String pageSize)
			throws IOException, ServletException {
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimCircuit AMESimCircuit = AMESimManager
				.getCircuitByName(modelName);
		return AMESimCircuit;
	}
	

	@GET
    @Produces(MediaType.TEXT_HTML)
    public void getHtmlCircuit(@PathParam("modelName") final String modelName)
    {
		ServiceProviderCatalog catalog = ServiceProviderCatalogSingleton.getServiceProviderCatalog(httpServletRequest);
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimCircuit AMESimCircuit = AMESimManager
				.getCircuitByName(modelName);
		
		String requestURL = httpServletRequest.getRequestURL().toString();

    	if (AMESimCircuit !=null )
    	{
	        httpServletRequest.setAttribute("bugzillaUri", "https://landfill.bugzilla.org/bugzilla-4.2-branch/");
	        httpServletRequest.setAttribute("element", AMESimCircuit);
	        httpServletRequest.setAttribute("catalog",catalog);
	        httpServletRequest.setAttribute("requestURL",requestURL);
//    		return new Viewable("/amesim/circuit_html.jsp");
    		RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/amesim/circuit_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
    	}
//    	return null;
    }
	
	
	@POST
	@Path("elementstocreate")
	@Consumes({ OslcMediaType.APPLICATION_RDF_XML,
		OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
		OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Response addModelElements(@PathParam("modelName") final String modelName,
			final AMESimElementsToCreate newElements) throws IOException, ServletException {
		AMESimManager.createAMESimElements(newElements, modelName);		
		URI about = newElements.getAbout();
		return Response.created(about).entity(newElements).build();
	}
}
