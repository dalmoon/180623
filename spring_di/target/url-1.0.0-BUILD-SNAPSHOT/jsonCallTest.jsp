<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsonCallTest</title>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#searchbtn').click(function(){
			var gubun = $('#searchGubun').val();
			var str = $('#searchStr').val();
			var dataStr = {"searchGubun": gubun, "searchStr":str};
			console.log(dataStr);
		});
		
		alert(gubun);
		alert(str);
		$.ajax({
			  type:"post",
			  url:"<c:url value='/jsonlist.do'/>",
			  /* headers:{
				  "Content-Type" : "application/json"
			  }, */
			  contentType: "application/json; charset=UTF-8",
			  dataType : "json",
			  data: dataStr,
			  success:function(list){
				  console.log(list);
			  },error:function(){}
			});
	});
</script>
</head>
<body>
json call test<br>
<form action="/jsonlist.do" method="post">
	<select name="searchGubun" id="searchGubun">
		<option value="id">아이디 검색</option>
		<option value="regdate">날짜 검색</option>
	</select>
	<input type="text" name="searchStr" id="searchStr">
	<input type="button" value="jsonCall" id="searchbtn">
</form>
</body>
</html>