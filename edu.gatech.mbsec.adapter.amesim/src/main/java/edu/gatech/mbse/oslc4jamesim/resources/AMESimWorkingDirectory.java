package edu.gatech.mbse.oslc4jamesim.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.Link;

@OslcNamespace(Constants.AMESIM_NAMESPACE)
@OslcName("WorkingDirectory")
@OslcResourceShape(title = "WorkingDirectory Resource Shape", describes = Constants.TYPE_AMESIM_WORKINGDIRECTORY)
public class AMESimWorkingDirectory extends AbstractResource{

	public AMESimWorkingDirectory() throws URISyntaxException {
		super();
	}
	public AMESimWorkingDirectory(URI about) throws URISyntaxException {
		super(about);
	}

	// ********* circuit *********
	private final Set<Link> circuits = new HashSet<Link>();

	public void setCircuits(final Link[] circuits) {
		this.circuits.clear();
		if (circuits != null)
		{
			this.circuits.addAll(Arrays.asList(circuits));
		}
	}

	@OslcDescription("Description of WorkingDirectory::circuit TBD")
	@OslcName("circuit")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8282/oslc4jamesim/services/rdfvocabulary#WorkingDirectory_circuit")
	@OslcTitle("circuit")
	@OslcReadOnly(false)
	public Link[]  getCircuits() {
		 return circuits.toArray(new Link[circuits.size()]);
	}

	private URI      serviceProvider;

	public void setServiceProvider(final URI serviceProvider)
	{		this.serviceProvider = serviceProvider;
	}

	@OslcDescription("The scope of a resource is a URI for the resource's OSLC Service Provider.")
	@OslcPropertyDefinition(OslcConstants.OSLC_CORE_NAMESPACE + "serviceProvider")
	@OslcRange(OslcConstants.TYPE_SERVICE_PROVIDER)
	@OslcTitle("Service Provider")	
	public URI getServiceProvider()
	{
		return serviceProvider;
	}

}