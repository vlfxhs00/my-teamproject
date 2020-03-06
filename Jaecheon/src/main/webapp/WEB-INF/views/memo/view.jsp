<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="../include/header.jsp" %>
<script type="text/javascript">
$(function(){
	$("#btnUpdate").click(function(){
		document.form1.action="${path}/memo/update/${dto.idx}";
		document.form1.submit();
	});
	$("#btnDelete").click(function(){
		if(confirm("삭제하시겠습니까?")){
			document.form1.action="${path}/memo/delete/${dto.idx}";
			document.form1.submit();
		}
	});
});
</script>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
<h2>메모 보기</h2>
<form name="form1" method="post">
<table border="1" width="500px">
	<tr>
		<td>번호</td>
		<td>${dto.idx}</td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input name="writer" value="${dto.writer}"></td>
	</tr>
	<tr>
		<td>메모</td>
		<td><input name="memo" value="${dto.memo}" size="50"></td>
	</tr>
	<tr align="center">
		<td colspan="2">
			<input type="hidden" name="idx" value="${dto.idx}">
			<input type="button" value="수정" id="btnUpdate">
			<input type="button" value="삭제" id="btnDelete">
		</td>
	</tr>
</table>
</form>
</body>
</html>
