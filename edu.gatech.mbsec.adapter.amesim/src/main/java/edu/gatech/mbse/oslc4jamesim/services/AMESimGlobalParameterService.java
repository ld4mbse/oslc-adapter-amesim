package edu.gatech.mbse.oslc4jamesim.services;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.eclipse.lyo.oslc4j.core.annotation.OslcCreationFactory;
import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

//import com.sun.jersey.api.view.Viewable;

import edu.gatech.mbse.oslc4jamesim.application.AMESimManager;
import edu.gatech.mbse.oslc4jamesim.application.OSLC4JAMESimApplication;
import edu.gatech.mbsec.adapter.amesim.resources.AMESimGlobalParameter;
import edu.gatech.mbsec.adapter.amesim.resources.Constants;

@OslcService(Constants.AMESIM_GLOBALPARAMETER_DOMAIN)
@Path("{modelName}/globalparameters")
public class AMESimGlobalParameterService {

	@Context
	private HttpServletRequest httpServletRequest;
	@Context
	private HttpServletResponse httpServletResponse;
	@Context
	private UriInfo uriInfo;

	static String baseHTTPURI = "http://" + OSLC4JAMESimApplication.hostName + ":" + OSLC4JAMESimApplication.portNumber + "/" + OSLC4JAMESimApplication.contextPath;

	@OslcQueryCapability(title = "AMESim GlobalParameter Query Capability", label = "AMESim GlobalParameter Catalog Query", resourceShape = OslcConstants.PATH_RESOURCE_SHAPES
			+ "/" + Constants.PATH_AMESIM_GLOBALPARAMETER, resourceTypes = { Constants.TYPE_AMESIM_GLOBALPARAMETER }, usages = { OslcConstants.OSLC_USAGE_DEFAULT })
	@GET
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public List<AMESimGlobalParameter> getGlobalParameters(
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
		List<AMESimGlobalParameter> amesimElements = AMESimManager
				.getGlobalParametersInModel(modelName);
		return amesimElements;
	}

	@GET
	@Path("{uri}")
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_JSON })
	public Response getGlobalParameter(
			@PathParam("modelName") final String modelName,
			@PathParam("uri") final String qualifiedName,
			@Context Request request) throws URISyntaxException {
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimGlobalParameter amesimGlobalParameter = AMESimManager
				.getGlobalParameterByURI(modelName + "/globalparameters/" + qualifiedName);
		if(amesimGlobalParameter == null){
			return Response.status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).build();
		}
		EntityTag eTag = new EntityTag(md5Java(amesimGlobalParameter));
		String requestETag = httpServletRequest.getHeader("If-None-Match");
		if(requestETag != null){
			// Conditional GET
			ResponseBuilder builder = request.evaluatePreconditions(eTag);
			
			// If rb is null then either it is first time request; or resource is
			// modified
			// Get the updated representation and return with Etag attached to it
			if (builder == null) {
				builder = Response.ok(amesimGlobalParameter);
				builder.tag(eTag);
			} 
			return builder.build();
		}
		else{
			// Regular GET
			return Response.ok(amesimGlobalParameter).tag(eTag).build();
		}

	}

	@GET
	@Path("{uri}")
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlGlobalParameter(
			@PathParam("modelName") final String modelName,
			@PathParam("uri") final String qualifiedName,
			@QueryParam("oslc.properties") final String propertiesString,
			@QueryParam("oslc.prefix") final String prefix)
			throws URISyntaxException, IOException {
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimGlobalParameter simulinkElement = AMESimManager
				.getGlobalParameterByURI(modelName + "/globalparameters/" + qualifiedName);		
		String requestURL = httpServletRequest.getRequestURL().toString();
		if (simulinkElement != null) {
			httpServletRequest.setAttribute("bugzillaUri",
					"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("element", simulinkElement);
			httpServletRequest.setAttribute("requestURL", requestURL);			
//			return new Viewable("/amesim/globalparameter_html.jsp");
			RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/amesim/globalparameter_html.jsp");
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
	public void getHtmlGlobalParameters(@PathParam("modelName") final String modelName) {
		AMESimManager.loadAMESimWorkingDirectory();
		List<AMESimGlobalParameter> simulinkElements = AMESimManager
				.getGlobalParametersInModel(modelName);
		String requestURL = httpServletRequest.getRequestURL().toString();
		if (simulinkElements != null) {
			httpServletRequest.setAttribute("bugzillaUri",
					"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("elements", simulinkElements);
			httpServletRequest.setAttribute("requestURL", requestURL);
			httpServletRequest.setAttribute("modelName", modelName);
//			return new Viewable("/amesim/globalparameters_html.jsp");
			RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/amesim/globalparameters_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}
//		return null;
	}

	@OslcCreationFactory(title = "AMESim GlobalParameter Creation Factory", label = "AMESim GlobalParameter Creation", resourceShapes = { OslcConstants.PATH_RESOURCE_SHAPES
			+ "/" + Constants.PATH_AMESIM_GLOBALPARAMETER }, resourceTypes = { Constants.TYPE_AMESIM_GLOBALPARAMETER }, usages = { OslcConstants.OSLC_USAGE_DEFAULT })
	@POST
	@Consumes({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	@Produces({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Response createGlobalParameter(
			@PathParam("modelName") final String modelName,
			final AMESimGlobalParameter amesimGlobalParameter) throws IOException,
			ServletException {
		// String ifMatchHeader = httpServletRequest.getHeader("If-Match");
		AMESimManager.createAMESimGlobalParameter(amesimGlobalParameter, modelName);
		URI about = amesimGlobalParameter.getAbout();
		return Response.created(about).entity(amesimGlobalParameter).build();
	}

	@PUT
	@Path("{uri}")
	@Consumes({ OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Response updateGlobalParameter(
			@PathParam("modelName") final String modelName,
			final AMESimGlobalParameter amesimGlobalParameter, @Context Request request)
			throws IOException, ServletException {
		String incomingGlobalParameterURI = amesimGlobalParameter.getAbout().toString();
		incomingGlobalParameterURI = incomingGlobalParameterURI.replace(baseHTTPURI
				+ "/services/", "");
		AMESimGlobalParameter amesimElementToUpdate = AMESimManager
				.getGlobalParameterByURI(incomingGlobalParameterURI);
		EntityTag eTag = new EntityTag(md5Java(amesimElementToUpdate));		
		// just for debug/checking purposes
		String requestETag = httpServletRequest.getHeader("If-Match");		
		ResponseBuilder builder = request.evaluatePreconditions(eTag);
		// client is not up to date (send back 412, Precondition failed)
		if (builder != null) {
			return builder.build();		
		}
		// update simulinkGlobalParameter
		amesimElementToUpdate.setValue(amesimGlobalParameter.getValue());
		AMESimManager.createAMESimGlobalParameter(amesimElementToUpdate, modelName);
		builder = Response.ok();
		EntityTag updatedETag = new EntityTag(md5Java(amesimElementToUpdate));
		return builder.tag(updatedETag).build();
	}

	@HEAD
	@Path("{uri}")
	public Response headGlobalParameter(
			@PathParam("modelName") final String modelName,
			@PathParam("uri") final String qualifiedName,
			@Context Request request) throws URISyntaxException {
		AMESimManager.loadAMESimWorkingDirectory();
		AMESimGlobalParameter amesimGlobalParameter = AMESimManager
				.getGlobalParameterByURI(modelName + "/globalparameters/" + qualifiedName);
		if(amesimGlobalParameter == null){
			return Response.status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).build();
		}
		EntityTag eTag = new EntityTag(md5Java(amesimGlobalParameter));		
		String requestETag = httpServletRequest.getHeader("If-None-Match");
		if(requestETag != null){			
			ResponseBuilder builder = request.evaluatePreconditions(eTag);
			// If rb is null then either it is first time request; or resource is
			// modified, return status 200 with Etag attached to it
			// else, just return status 304, not modified with Etag
			if (builder == null) {
				builder = Response.ok();
			} else {
				builder = Response.status(HttpServletResponse.SC_NOT_MODIFIED);
			}
			return builder.tag(eTag).build();
		}
		else{
			// Regular HEAD
			return Response.ok().tag(eTag).build();
		}
	}

	public static String md5Java(AMESimGlobalParameter amesimGlobalParameter) {
		String digest = null;
		String message = amesimGlobalParameter.getAbout().toASCIIString() + amesimGlobalParameter.getTitle() + amesimGlobalParameter.getValue();
		try {			
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] hash = md.digest(message.getBytes("UTF-8"));
			 //converting byte array to Hexadecimal String
			StringBuilder sb = new StringBuilder(2*hash.length);
			for (byte b : hash) {
				sb.append(String.format("%02x", b & 0xff));
			}
			digest = sb.toString();
		} catch (UnsupportedEncodingException ex) {
		} catch (NoSuchAlgorithmException ex) {
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return digest;
	}

}
