<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.ArrayList, com.biz.board.BoardVO, com.biz.board.BoardReplyVO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/bform.do">글쓰기</a><br>
<table border="1" width=500>
<tr>
	<td>번호</td>
	<td>제목</td>
	<td>글쓴이</td>
	<td>날짜</td>
	<td>댓글</td>
</tr>
<%
ArrayList<BoardVO> list = (ArrayList)request.getAttribute("BLIST");
ArrayList<BoardReplyVO> rlist = new ArrayList(); 
for(int i=0; i<list.size(); i++) { %>
<tr>
	<td><%=list.get(i).getBseq()%></td>
	<td><%=list.get(i).getBtitle()%></td>
	<td><%=list.get(i).getId()%></td>
	<td><%=list.get(i).getRegdate()%></td>
	<td>
		<%
		rlist = list.get(i).getBoardReplyVOList(); 
		for(int r=0; r<rlist.size(); r++ ) {
			out.println(rlist.get(r).getReply()+"<br>");
		}
		%>
	</td>
</tr>
<%} %>
</table>


<form action="/rinsert.do" method="post">
글번호: <input type="text" name="bseq" value="1"><br>
댓글 : <input type="text" name="reply" value="댓글1"><br>
<input type="submit" name="전송">
</form> 

<hr>
<form action="/binsert.do" method="post">
제목: <input type="text" name="btitle" value="이건제목"><br>
글쓴이 : <input type="text" name="id" value="lkh"><br>
<input type="submit" name="전송">
</form> 
</body>
</html>