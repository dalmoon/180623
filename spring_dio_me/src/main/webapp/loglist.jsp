<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList,com.biz.log.LoginfoVO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
로그목록....<br>
<br>
<form action="/loglist.do" method="post">
<select name="searchgubun">
	<option value="id">아이디검색</option>
	<option value="regdate">날짜검색</option>
</select>
<input type="text" name="searchstr">
<input type="submit" value="검색">
</form>
<c:forEach items="${MAP_KEY_LOGLIST}" var="vo">
	${vo.lseq} ${vo.id} ${vo.regdate}<br>
</c:forEach>

<%
/*
ArrayList<LoginfoVO> list = (ArrayList<LoginfoVO>)request.getAttribute("MAP_KEY_LOGLIST");
out.print(list.size() + "건 로그<hr>");

for(int i=0; i<list.size(); i++) {
	out.print(list.get(i).getLseq()+" ");
	out.print(list.get(i).getId()+" ");
	out.print(list.get(i).getRegdate()+"<br>");
}
*/
%>




</body>
</html>