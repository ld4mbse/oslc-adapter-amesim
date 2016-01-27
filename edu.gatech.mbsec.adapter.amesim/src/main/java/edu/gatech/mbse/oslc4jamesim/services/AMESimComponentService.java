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
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;

import org.eclipse.lyo.oslc4j.core.annotation.OslcCreationFactory;
import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

//import com.sun.jersey.api.view.Viewable;

import edu.gatech.mbse.oslc4jamesim.application.AMESimManager;
import edu.gatech.mbse.oslc4jamesim.resources.AMESimCircuit;
import edu.gatech.mbse.oslc4jamesim.resources.AMESimComponent;
import edu.gatech.mbse.oslc4jamesim.resources.Constants;






@OslcService(Constants.AMESIM_COMPONENT_DOMAIN)
@Path("{modelName}/components")
public class AMESimComponentService {
	
	@Context
	private HttpServletRequest httpServletRequest;
	@Context
	private HttpServletResponse httpServletResponse;
	@Context
	private UriInfo uriInfo;
	
	@OslcQueryCapability(title = "AMESIM Block Query Capability", label = "AMESIM Block Catalog Query", resourceShape = OslcConstants.PATH_RESOURCE_SHAPES
			+ "/" + Constants.PATH_AMESIM_CIRCUIT, resourceTypes = { Constants.TYPE_AMESIM_CIRCUIT }, usages = { OslcConstants.OSLC_USAGE_DEFAULT })	
	@GET
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public List<AMESimComponent> getBlocks(
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
		List<AMESimComponent> AMESimComponents = AMESimManager.getComponentsInModel(modelName);
		return AMESimComponents;
	}
	
	@GET	
	@Path("{uri}")
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_JSON })		
	public Response getBlock(
//			@PathParam("uri") final String uri)
			@PathParam("modelName") final String modelName, @PathParam("uri") final String qualifiedName, @Context Request request)
	
			throws URISyntaxException {
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimComponent AMESimComponent = AMESimManager
				.getComponentByURI(modelName + "/components/" + qualifiedName);
//		return AMESimComponent;
		EntityTag eTag = new EntityTag(String.valueOf(AMESimComponent.hashCode()));
		ResponseBuilder builder = request.evaluatePreconditions(eTag);
		
		//If rb is null then either it is first time request; or resource is modified
        //Get the updated representation and return with Etag attached to it
		if (builder == null) {
		    builder = Response.ok(AMESimComponent);
		}

		return builder.tag(eTag).build();
		
//		return Response.created(AMESimComponent.getAbout()).entity(AMESimComponent).build();
	}

	@GET
	@Path("{uri}")
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlBlock(@PathParam("modelName") final String modelName,
			@PathParam("uri") final String qualifiedName,
			@QueryParam("oslc.properties") final String propertiesString,
			@QueryParam("oslc.prefix") final String prefix)
			throws URISyntaxException, IOException {
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimComponent AMESimComponent = AMESimManager
				.getComponentByURI(modelName + "/components/" + qualifiedName);
		String requestURL = httpServletRequest.getRequestURL().toString();
		if (AMESimComponent != null) {
			httpServletRequest.setAttribute("bugzillaUri",
					"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("component", AMESimComponent);
			httpServletRequest.setAttribute("requestURL", requestURL);
//			return new Viewable("/amesim/component_html.jsp");
			RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/amesim/component_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}
//		return null;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlBlocks(@PathParam("modelName") final String modelName) {
		AMESimManager.loadAMESimWorkingDirectory();
		List<AMESimComponent> AMESimComponents = AMESimManager.getComponentsInModel(modelName);
		String requestURL = httpServletRequest.getRequestURL().toString();
		if (AMESimComponents != null) {
			httpServletRequest.setAttribute("bugzillaUri",
					"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("components", AMESimComponents);
			httpServletRequest.setAttribute("requestURL", requestURL);
			httpServletRequest.setAttribute("modelName", modelName);			
//			return new Viewable("/amesim/components_html.jsp");
			RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/amesim/components_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}
//		return null;
	}
	
	@OslcCreationFactory(title = "AMESIM Component Creation Factory", label = "AMESIM Component Creation", resourceShapes = { OslcConstants.PATH_RESOURCE_SHAPES
			+ "/" + Constants.PATH_AMESIM_COMPONENT }, resourceTypes = { Constants.TYPE_AMESIM_COMPONENT }, usages = { OslcConstants.OSLC_USAGE_DEFAULT })
	@POST
	@Consumes({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Response addBlock(@PathParam("modelName") final String modelName,
			final AMESimComponent AMESimComponent) throws IOException, ServletException {
		System.out.println(AMESimComponent.getName());		
		AMESimManager.createAMESimComponent(AMESimComponent, modelName);
		URI about = AMESimComponent.getAbout();
		return Response.created(about).entity(AMESimComponent).build();
	}
}
