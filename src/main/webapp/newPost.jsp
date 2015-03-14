<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Struts2 webapp</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href='/resources/css/foundation/fundation.css' />
<link href='/resources/css/foundation/normalize.css' />
<link href="resources/css/style.css" rel="stylesheet" />

</head>
<body>
  <div class="saludo">
    <h1>Struts2 action</h1>
    <s:form action="posts">
      <s:textfield name="blogPost.user" label="Nombre"></s:textfield>
      <s:textarea name="blogPost.post" label="Post"></s:textarea>
      <s:submit value="Aceptar"></s:submit>
    </s:form>
  </div>
  
  <script src="resources/js/jquery.js" type="text/javascript"></script>
  <script src="resources/js/fastclick.js" type="text/javascript"></script>
  <script src="resources/js/foundation/foundation.min.js" type="text/javascript"></script>
</body>
</html>