<!DOCTYPE html>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Link" %>
<%@ page import="edu.gatech.mbsec.adapter.amesim.resources.AMESimCircuit" %>
<%@ page import="edu.gatech.mbsec.adapter.amesim.resources.AMESimComponent" %>
<%@ page import="edu.gatech.mbsec.adapter.amesim.resources.AMESimLine" %>
<%
String bugzillaUri = (String) request.getAttribute("bugzillaUri");
AMESimCircuit element = (AMESimCircuit)request.getAttribute("element");
String requestURL = (String)request.getAttribute("requestURL");
%>
<html>
	<head>

		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<title>AMESim OSLC Adapter: AMESim Circuit</title>
		<link href="<%= bugzillaUri %>/skins/standard/global.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/index.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/global.css" rel="alternate stylesheet" title="Classic" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/index.css" rel="alternate stylesheet" title="Classic" type="text/css">
		<link href="<%= bugzillaUri %>/skins/contrib/Dusk/global.css" rel="stylesheet" title="Dusk" type="text/css">
		<link href="<%= bugzillaUri %>/skins/contrib/Dusk/index.css" rel="stylesheet" title="Dusk" type="text/css">
		<link href="<%= bugzillaUri %>/skins/custom/global.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/custom/index.css" rel="stylesheet" type="text/css">
		<!-- <link rel="shortcut icon" href="<%= bugzillaUri %>/images/favicon.ico"> -->
		
	</head>
	<body onload="">
	
		<div id="header">
			<div id="banner"></div>
			<table border="0" cellspacing="10" cellpadding="0" id="titles">
				<tr>
					<td id="title">
						<p>
							AMESim OSLC Adapter: AMESim Circuit
						</p>
					</td>
					<td id="information">
						<p class="header_addl_info">
							Version 0.1
						</p>
					</td>
				</tr>
			</table>
		</div>
		
		<div id="bugzilla-body">
			<div id="page-index">
			
			
			
			<img src=    "<%=request.getContextPath()%>/images/oslcLg.png" alt="icon"  />
			
			
			
				
			<!-- <img src="../../images/resources/OMG-SysML-logo" alt="icon" width="80" height="80"/> -->
			
			
			<h1><small>AMESim Circuit</small> <%= element.getName() %></h1>
			
			

            <table>
	            <tr>
		            <td><b>This document</b>:</td>
		            <td><a href="<%= requestURL %>">
                            <%= requestURL %>
                        </a></td>
	            </tr>
	            <!--
	            <tr>
		            <td><b>Bugzilla</b>:</td>
		            <td><a href="<%= bugzillaUri %>"><%= bugzillaUri %></a></td>
	            </tr>
	            -->
	            <tr>
		            <td><b>Adapter Publisher</b>:</td>
		            <td>Georgia Institute of Technology OSLC Tools Project</td>
	            </tr>
	            <tr>
		            <td><b>Adapter Identity</b>:</td>
		            <td>edu.gatech.mbsec.adapter.amesim</td>
	            </tr>
            </table>
			
			<!--
			<h2><small>Name: <%= element.getName() %></small></h2>
			-->
			
			<h2>Components</h2>
			
			<% for (Link link : element.getComponents()) { %>			
			<p><a href="<%= link.getValue() %>">
                    <%= link.getValue() %></a></p>
			<% } %>		
			
			<h2>Lines</h2>
			<% if (element.getLines().length > 0) { %>
			<% for (Link link : element.getLines()) { %>			
			<p><a href="<%= link.getValue() %>">
                    <%= link.getValue() %></a></p>
			<% } %>	
			<% } %>	
			
			
			</div>
		</div>
		
		<!-- footer -->
	<p id="footer">OSLC AMESim Adapter 1.1</p>
	
	</body>
</html>
