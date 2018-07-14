<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="frmList" name="frmList" action="<c:url value='/board/blist.do'/>" method="post">
		<table border="1" style="border-collapse: collapse;">
			<tr>
				<th>게시글 번호</th>
				<th>아이디</th>
				<th>제목</th>
				<th>등록일</th>
				<th>댓글번호</th>
				<th>댓글</th>
			</tr>
			<c:if test="${empty BLIST }">
				<td colspan="6" align="center">해당 게시물이 없습니다</td>
			</c:if>
			<c:if test="${!empty BLIST }">
				<c:forEach var="boardMap" items="${BLIST }">
					<tr>
						<td>${boardMap.bseq }</td>
						<td>${boardMap.id }</td>
						<td>${boardMap.btitle }</td>
						<td>${boardMap.regdate}</td>
						<td>${boardMap.rseq }</td>
						<td>${boardMap.reply }</td>						
					</tr>					
				</c:forEach>
			</c:if>
		</table>
	</form>
</body>
</html>