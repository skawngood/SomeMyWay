<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

</head>
<body>
<table class = "table table-bordered" border="1">
	<tr>
		<th>seq</th>
		<th>id</th>
		<th>title</th>
		<th>content</th>
		<th>regdate</th>
		<th>viewcnt</th>
		
	</tr>
	<c:forEach items="${list}" var = "boardVO">
		<tr>
		<td>${boardVO.seq}</td>
		<td><a href ='/board/read?bno=${boardVO.seq}'>${boardVO.title}</td>
		<td>${boardVO.id}</td>
		<td>${boardVO.content}</td>
		<td>${boardVO.regdate}</td>
		<td>${boardVO.viewcnt}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>