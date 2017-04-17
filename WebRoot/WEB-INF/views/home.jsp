<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<title>home</title>
	<style type="text/css">
		#content{
			min-height:77%;
			width:100%
		}
	</style>
</head>
<body>
<div id="content">
  <s:url value="/index" var="indexUrl"></s:url> 
  <h1><s:message code="msg.welcome"/></h1>
  <a href="${indexUrl}"><s:message code="index"/></a>
 </div>
 </body>
</html>