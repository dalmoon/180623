<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<%
String str = (String)request.getAttribute("AAAA");
out.println(str+"<br>");

%>

<P>  The time on the server is ${AAAA}. </P>
</body>
</html>
