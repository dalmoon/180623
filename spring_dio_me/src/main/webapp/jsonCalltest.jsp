<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script>
	$(document).ready(function() {
		$("#searchbtn").click(function() {
			
		var gubun = $("searchgubun").val();
		var str = $("searchstr").val();
		var dataStr = {
				"searchgubun":gubun,
				"searchstr":str
			};
		console.log(dataStr);
		console.log(JSON.stringify(dataStr));		
		$.ajax({
			type : "POST",
			url : "/jsonlist.do",
			/* headers : {
				"Content-Type":"application/json"
			}, */
			ContentType:"application/json",
			dataType : "json",
			data : dataStr,
			success:function(list){
				console.log(list);
			}
		});
		});
	});
</script>
</head>
<body>
	json call test..
	<br>
	<form action="/jsonlist.do" method="post">
		<select name="searchgubun" id="searchgubun">
			<option value="id">아이디검색</option>
			<option value="regdate">날짜검색</option>
		</select> <input type="text" name="searchstr" id="searchstr"> <input
			type="button" value="검색" id="searchbtn">
	</form>
</body>
</html>