package edu.gatech.mbsec.adapter.amesim.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRdfCollectionType;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Occurs;

@OslcNamespace(Constants.AMESIM_NAMESPACE)
@OslcName("AMESimElementsToCreate")
@OslcResourceShape(title = "AMESimElementsToCreate Resource Shape", describes = Constants.TYPE_AMESIM_ELEMENTSTOCREATE)
public class AMESimElementsToCreate extends AbstractResource{
	
	public AMESimElementsToCreate() throws URISyntaxException {
		super();
	}
	public AMESimElementsToCreate(URI about) throws URISyntaxException {
		super(about);
	}
	
	List<AMESimComponent> componentsToCreate = new ArrayList<AMESimComponent>();
	List<AMESimLine> linesToCreate = new ArrayList<AMESimLine>();
	List<AMESimParameter> parametersToCreate = new ArrayList<AMESimParameter>();
	
	public AMESimElementsToCreate(List<AMESimComponent> blocksToCreate,
			List<AMESimLine> linesToCreate,
			List<AMESimParameter> parametersToCreate) {
		super();
		this.componentsToCreate = blocksToCreate;
		this.linesToCreate = linesToCreate;
		this.parametersToCreate = parametersToCreate;
	}

	@OslcDescription("Description of ElementsToCreate::componentsToCreate")
	@OslcName("componentsToCreate")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://mathworks.com/simulink/rdf#Elementstocreate/componentsToCreate")
	@OslcTitle("componentsToCreate")
	@OslcReadOnly(false)
	@OslcRdfCollectionType(collectionType = "List")
	public List<AMESimComponent> getComponentsToCreate() {
		return componentsToCreate;
	}

	public void setComponentsToCreate(List<AMESimComponent> blocksToCreate) {
		this.componentsToCreate = blocksToCreate;
	}

	@OslcDescription("Description of ElementsToCreate::linesToCreate")
	@OslcName("linesToCreate")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://mathworks.com/simulink/rdf#Elementstocreate/linesToCreate")
	@OslcTitle("linesToCreate")
	@OslcReadOnly(false)
	@OslcRdfCollectionType(collectionType = "List")
	public List<AMESimLine> getLinesToCreate() {
		return linesToCreate;
	}

	public void setLinesToCreate(List<AMESimLine> linesToCreate) {
		this.linesToCreate = linesToCreate;
	}

	@OslcDescription("Description of ElementsToCreate::parametersToCreate")
	@OslcName("parametersToCreate")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://mathworks.com/simulink/rdf#Elementstocreate/parametersToCreate")
	@OslcTitle("parametersToCreate")
	@OslcReadOnly(false)
	@OslcRdfCollectionType(collectionType = "List")
	public List<AMESimParameter> getParametersToCreate() {
		return parametersToCreate;
	}

	public void setParametersToCreate(List<AMESimParameter> parametersToCreate) {
		this.parametersToCreate = parametersToCreate;
	}
	

}
