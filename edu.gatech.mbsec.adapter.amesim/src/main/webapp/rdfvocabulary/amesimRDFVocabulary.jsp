<!DOCTYPE html>
<%--
/*********************************************************************************************
 * Copyright (c) 2014 Model-Based Systems Engineering Center, Georgia Institute of Technology.
 *                         http://www.mbse.gatech.edu/
 *                  http://www.mbsec.gatech.edu/research/oslc
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *
 *  Contributors:
 *
 *	   Axel Reichwein, Koneksys (axel.reichwein@koneksys.com)		
 *******************************************************************************************/
--%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ page
	import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog"%>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider"%>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Link"%>
<%@ page import="java.net.URI"%>

<%
String requestURL = (String)request.getAttribute("requestURL");
%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>AMESim OSLC Adapter: AMESim RDF Vocabulary</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/simple.css">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700'
	rel='stylesheet' type='text/css'>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/100px_white-oslc-favicon.ico">


</head>
<body onload="">

	<!-- header -->
	<p id="title">AMESim OSLC Adapter: RDF Vocabulary</p>

	<!-- main content -->
	<div id="main-body">
		
		<!-- oslc logo and adapter details -->
		<a id="oslclogo" href="http://open-services.net/" target="_blank"><img
			src="<%=request.getContextPath()%>/images/oslcLg.png"></a>
		<div id="adapter-details">
			<p class="word-break">
				This document: <a href="<%= requestURL %>"> <%= requestURL %>
				</a><br> Adapter Publisher: <a class="notfancy"
					href="http://www.mbsec.gatech.edu/research/oslc" target="_blank">Georgia
					Institute of Technology OSLC Tools Project</a><br> Adapter
				Identity: edu.gatech.mbsec.adapter.amesim
			</p>
		</div>
		<br>

		<!-- resource type and name -->
		<h1><span id="metainfo">AMESim RDF Vocabulary </span></h1>
		<br>

		<div> 
		
		
		
		<xmp style="padding-left: 25px;">
<?xml version="1.0" encoding="UTF-8"?>
<rdf:RDF
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
	xmlns:dcterms="http://purl.org/dc/terms/"
	xmlns:amesim="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#">
	<rdfs:Class rdf:about="amesim:WorkingDirectory">
		<rdfs:label xml:lang="en-GB">WorkingDirectory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:WorkingDirectory_circuit">
		<rdfs:label xml:lang="en-GB">circuit</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="amesim:Circuit">
		<rdfs:label xml:lang="en-GB">Circuit</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
		<rdfs:subClassOf rdf:resource="http://eclipse.org/MBSE/Model"/>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:Circuit_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Circuit_component">
		<rdfs:label xml:lang="en-GB">component</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Circuit_line">
		<rdfs:label xml:lang="en-GB">line</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Circuit_globalParameter">
		<rdfs:label xml:lang="en-GB">globalParameter</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="amesim:Component">
		<rdfs:label xml:lang="en-GB">Component</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
		<rdfs:subClassOf rdf:resource="http://eclipse.org/MBSE/Block"/>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:Component_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_subModelName">
		<rdfs:label xml:lang="en-GB">subModelName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_subModelInstanceNumber">
		<rdfs:label xml:lang="en-GB">subModelInstanceNumber</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_subModelDirectory">
		<rdfs:label xml:lang="en-GB">subModelDirectory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_categoryName">
		<rdfs:label xml:lang="en-GB">categoryName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_xCoordinate">
		<rdfs:label xml:lang="en-GB">xCoordinate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_yCoordinate">
		<rdfs:label xml:lang="en-GB">yCoordinate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_iconName">
		<rdfs:label xml:lang="en-GB">iconName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_numberOfRotations">
		<rdfs:label xml:lang="en-GB">numberOfRotations</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_isFlipped">
		<rdfs:label xml:lang="en-GB">isFlipped</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_parameter">
		<rdfs:label xml:lang="en-GB">parameter</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_port">
		<rdfs:label xml:lang="en-GB">port</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_nestedComponent">
		<rdfs:label xml:lang="en-GB">nestedComponent</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Component_nestedLine">
		<rdfs:label xml:lang="en-GB">nestedLine</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="amesim:Line">
		<rdfs:label xml:lang="en-GB">Line</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
		<rdfs:subClassOf rdf:resource="http://eclipse.org/MBSE/Connection"/>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:Line_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_subModelName">
		<rdfs:label xml:lang="en-GB">subModelName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_subModelInstanceNumber">
		<rdfs:label xml:lang="en-GB">subModelInstanceNumber</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_subModelDirectory">
		<rdfs:label xml:lang="en-GB">subModelDirectory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_sourceComponentName">
		<rdfs:label xml:lang="en-GB">sourceComponentName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_targetComponentName">
		<rdfs:label xml:lang="en-GB">targetComponentName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_sourcePortIndex">
		<rdfs:label xml:lang="en-GB">sourcePortIndex</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Line_targetPortIndex">
		<rdfs:label xml:lang="en-GB">targetPortIndex</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="amesim:Port">
		<rdfs:label xml:lang="en-GB">Port</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
		<rdfs:subClassOf rdf:resource="http://eclipse.org/MBSE/Port"/>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:Port_id">
		<rdfs:label xml:lang="en-GB">id</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Port_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="amesim:Parameter">
		<rdfs:label xml:lang="en-GB">Parameter</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
		<rdfs:subClassOf rdf:resource="http://eclipse.org/MBSE/Parameter"/>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:Parameter_value">
		<rdfs:label xml:lang="en-GB">value</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Parameter_dataPath">
		<rdfs:label xml:lang="en-GB">dataPath</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Parameter_title">
		<rdfs:label xml:lang="en-GB">title</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:Parameter_unit">
		<rdfs:label xml:lang="en-GB">unit</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="amesim:GlobalParameter">
		<rdfs:label xml:lang="en-GB">GlobalParameter</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="amesim:GlobalParameter_uniqueName">
		<rdfs:label xml:lang="en-GB">uniqueName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_title">
		<rdfs:label xml:lang="en-GB">title</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_value">
		<rdfs:label xml:lang="en-GB">value</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_defaultValue">
		<rdfs:label xml:lang="en-GB">defaultValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_minimalValue">
		<rdfs:label xml:lang="en-GB">minimalValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_maximalValue">
		<rdfs:label xml:lang="en-GB">maximalValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="amesim:GlobalParameter_unit">
		<rdfs:label xml:lang="en-GB">unit</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8282/oslc4jamesim/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
</rdf:RDF>
</xmp>
		
		
	</div>


	<!-- footer -->
	<p id="footer">OSLC AMESim Adapter 1.1</p>
	 
</body>
</html>







