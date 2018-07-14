<%@page import="com.biz.log.LoginfoVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
로그목록
<form action="/loglist.do" method="post">
	<select name="seachGubun">
		<option value="id">아이디 검색</option>
		<option value="regdate">날짜 검색</option>
	</select>
	<input type="text" name="searchStr">
	<input type="submit" value="검색">
</form>
	<c:forEach var="vo" items="${MAP_KEY_LOGLIST}">
		<p>${vo.lseq}&nbsp;${vo.id}&nbsp;${vo.regdate}</p>
	</c:forEach>

<hr>
<%-- 
<%
List<LoginfoVO> list = (List<LoginfoVO>)request.getAttribute("MAP_KEY_LOGLIST");
out.print(list.size() + "건 로그 <br>");

for(int i= 0; i<list.size(); i++){
	out.print(list.get(i).getLseq()+"  ");
	out.print(list.get(i).getId()+"  ");
	out.print(list.get(i).getRegdate()+"<br>");
}

%> 
--%>
</body>
</html>