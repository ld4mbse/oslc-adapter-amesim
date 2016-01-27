<!DOCTYPE html>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<%@ page import="java.net.URI" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Service" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Dialog" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.CreationFactory" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ResourceShape" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.QueryCapability" %>


<%
String bugzillaUri = (String) request.getAttribute("bugzillaUri");
ServiceProvider serviceProvider = (ServiceProvider)request.getAttribute("serviceProvider");




%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<title>AMESim OSLC Adapter: Service Provider for <%= serviceProvider.getTitle() + "(" + serviceProvider.getIdentifier() + ")" %></title>
		<link href="<%= bugzillaUri %>/skins/standard/global.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/index.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/global.css" rel="alternate stylesheet" title="Classic" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/index.css" rel="alternate stylesheet" title="Classic" type="text/css">
		<link href="<%= bugzillaUri %>/skins/contrib/Dusk/global.css" rel="stylesheet" title="Dusk" type="text/css">
		<link href="<%= bugzillaUri %>/skins/contrib/Dusk/index.css" rel="stylesheet" title="Dusk" type="text/css">
		<link href="<%= bugzillaUri %>/skins/custom/global.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/custom/index.css" rel="stylesheet" type="text/css">
		<link rel="shortcut icon" href="<%= bugzillaUri %>/images/favicon.ico">
	</head>
	<body onload="">
	
		<div id="header">
			<div id="banner"></div>
			<table border="0" cellspacing="0" cellpadding="0" id="titles">
				<tr>
					<td id="title">
						<p>
							AMESim OSLC Adapter: Service Provider
						</p>
					</td>
					<td id="information">
						<p class="header_addl_info">
							version 0.1
						</p>
					</td>
				</tr>
			</table>
		</div>
		
		<div id="bugzilla-body">
			<div id="page-index">
			
				<img src=    "<%=request.getContextPath()%>/images/oslcLg.png" alt="icon"  />
				
	
				<h1>Service Provider for <%= serviceProvider.getTitle() %></h1>
				
				<p>Enables navigation to Query Capabilities and Creation Factories of OSLC Services</p>

	            <table>
		            <tr>
			            <td><b>This document</b>:</td>
			            <td><a href="<%= serviceProvider.getAbout() %>">
			            <%= serviceProvider.getAbout() %></a></td>
		            </tr>
		           
		            <tr>
			            <td><b>Adapter Publisher</b>:</td>
			            <td>Georgia Institute of Technology OSLC Tools Project</td>
		            </tr>
		            <tr>
			            <td><b>Adapter Identity</b>:</td>
			            <td>edu.gatech.mbsec.adapter.amesim</td>
		            </tr>
	            </table>
												
				<h2>Query Capabilities of OSLC Services</h2>
				
				
				<% for (Service service : serviceProvider.getServices()) { %>				
			<h3><%= service.getQueryCapabilities()[0].getTitle() %> </h3>
			<p><a href="<%= service.getAbout() %>">
                    <%= service.getAbout() %></a></p>
			<% } %>	
				
				 
				<h2>Creation Factories of OSLC Services</h2>
				<% for (Service service : serviceProvider.getServices()) { %>	
					<% if(service.getCreationFactories().length > 0){
					  { %>							
			<h3><%= service.getCreationFactories()[0].getTitle() %> </h3>
			<p><a href="<%= service.getAbout()  %>">
                    <%= service.getAbout()%></a></p>
					<% }%>	
				<% }%>	
				<% }%>
				
				<!-- 
				<h2>HTML Forms for Creating AMESim Elements</h2>
				<% for (Service service : serviceProvider.getServices()) { %>	
					<% if(service.getCreationFactories().length > 0){
					  { %>							
			
			<p><a href="<%= service.getAbout() + "/creator" %>">
                    <%= service.getAbout() + "/creator"%></a></p>
					<% }%>	
				<% }%>	
				<% }%>
				-->
			</div>
		</div>
		
		<!-- footer -->
		<p id="footer">OSLC AMESim Adapter 1.1</p>
	</body>
</html>