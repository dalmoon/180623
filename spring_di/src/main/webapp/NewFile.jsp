<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	hello world~!!!
	<a href="/HelloServlet">서블릿호출get spring</a>
	<br>
	<form action="/HelloServlet" method="post">
		<input type="submit" value="서블릿호출post">
	</form>
</body>
</html>