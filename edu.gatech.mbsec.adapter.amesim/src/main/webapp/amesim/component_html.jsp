<!DOCTYPE html>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Link" %>
<%@ page import="edu.gatech.mbsec.adapter.amesim.resources.AMESimComponent" %>
<%
String bugzillaUri = (String) request.getAttribute("bugzillaUri");
AMESimComponent block = (AMESimComponent)request.getAttribute("component");
String requestURL = (String)request.getAttribute("requestURL");
%>
<html>
	<head>

		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<title>AMESim OSLC Adapter: AMESim Component</title>
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
							AMESim OSLC Adapter: AMESim Component
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
			
			
			<h1><small>AMESim Component</small> <%= block.getName() %></h1>
			
			

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
			
			<h2><small>SubModelName: <%= block.getSubModelName() %></small></h2>
			<h2><small>SubModelInstanceNumber: <%= block.getSubModelInstanceNumber() %></small></h2>
			<h2><small>SubModelDirectory: <%= block.getSubModelDirectory() %></small></h2>
			
			<h2><small>Parameters</small></h2>
			
			<% for (Link link : block.getParameters()) { %>			
			<p><a href="<%= link.getValue() %>">
                    <%= link.getValue() %></a></p>
			<% } %>			
			
			<h2><small>Ports</small></h2>
			
			<% for (Link link : block.getPorts()) { %>			
			<p><a href="<%= link.getValue() %>">
                    <%= link.getValue() %></a></p>
			<% } %>
			
			<h2><small>Nested Components</small></h2>
			
			<% for (Link link : block.getNestedComponents()) { %>			
			<p><a href="<%= link.getValue() %>">
                    <%= link.getValue() %></a></p>
			<% } %>
			
			<h2><small>Nested Lines</small></h2>
			
			<% for (Link link : block.getNestedLines()) { %>			
			<p><a href="<%= link.getValue() %>">
                    <%= link.getValue() %></a></p>
			<% } %>
			
			</div>
		</div>
		
		<!-- footer -->
	<p id="footer">OSLC AMESim Adapter 1.1</p>
	
	</body>
</html>
