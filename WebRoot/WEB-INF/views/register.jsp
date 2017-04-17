<%@ page language="java" import="java.util.*"  contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>My JSP 'register.jsp' starting page</title>
    <style type="text/css">
		#content{
			min-height:77%;
			width:100%
		}
		.error{
			color:red;
		}
	</style>
	<script type="text/javascript" src="resource/js_libiary/jquery-2.0.2.min.js"></script>
	<script type="text/javascript" src="http://www.jeasyui.net/Public/js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$('#ff').form({
				success:function(data){
					//$.messager.alert('Info', data, 'info');
		}
	});
		});
	</script>
  </head>
  <body>
  <div id="content">
    <h1>Register</h1>
    <sf:form id="ff" method="post" modelAttribute="person" enctype="multipart/form-data">
    	<sf:errors class="easyui-validatebox" path="*" element="div" cssClass="errors"/>
    	
    	<sf:label path="id" cssErrorClass="error" >id</sf:label>:
    		<sf:input class="easyui-validatebox" path="id" cssErrorClass="error" required="true"/><br>
    		
    	<sf:label path="name" cssErrorClass="error" >name</sf:label>:
    		<sf:input class="easyui-validatebox" path="name" cssErrorClass="error" required="true"/><br>
    		
    	<sf:label path="age" cssErrorClass="error" >age</sf:label>:
    		<sf:input class="easyui-validatebox" path="age" cssErrorClass="error" required="true" /><br>
    		
    	<sf:label path="gender" cssErrorClass="error" >gender</sf:label>:
    		<sf:input class="easyui-validatebox" path="gender" cssErrorClass="error" required="true"/><br>
    		
    		
 		<label>Profile Picture</label>
 		<input type="file" name="profilePicture"/><br>
 		<input type="submit" value="Register"/>
    </sf:form>
    </div>
  </body>
</html>
