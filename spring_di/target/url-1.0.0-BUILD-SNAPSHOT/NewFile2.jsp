<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
http://127.0.0.1/web/NewFile.jsp<br>
http://127.0.0.1/NewFile.jsp<br>
hello world~!!! 
<% 
for(int i=0; i<10; i++) {
	out.println(i);
}

%>
<a href="/aa/bb/cc">get</a>
<br>
<form action="/aa/bb/cc" method="post">
<input type="submit" value="post">
</form>






</body>
</html>