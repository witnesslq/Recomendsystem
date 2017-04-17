<%@ page language="java" import="java.util.*"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t" %>
<%@ page session="false" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   		<title>胡晓雨的博客</title>

  </head>
  <body>
  <div id="main">
  	<t:insertAttribute name="header"/>
  	<t:insertAttribute name="body"/>
  	<t:insertAttribute name="footer"/>
  </div>
  </body>
</html>
