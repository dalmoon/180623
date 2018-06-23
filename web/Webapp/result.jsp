<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	결과 페이지
	<br>
	<%
		ArrayList<String> list = (ArrayList<String>) request.getAttribute("LVL_LIST");
		for (int i = 0; i < list.size(); i++) {
			out.println(list.get(i) + "<br>");
		}
	%>
</body>
</html>