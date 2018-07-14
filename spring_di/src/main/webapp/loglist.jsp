<%@page import="com.biz.log.LoginfoVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	로그목록..... ${MAP_KEY_LOGLIST}
	<%
		ArrayList<LoginfoVO> list = (ArrayList<LoginfoVO>) request.getAttribute("MAP_KEY_LOGLIST");
		out.print(list.size() + "건 로그");
		out.print(list.get(0).getLseq() + ":로그번호");
	%>
</body>
</html>