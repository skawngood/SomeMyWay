<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="register" method = "post">
<div>
		
		<div>
		<label>제목</label>
			<input type = "text" name = "title" class = "form-control" placeholder="문자">
		</div>
		
		<div>
		<label>id</label>
			<input type = "text" name = "id" class = "form-control" placeholder="문자">
		</div>
		
		<div>
		<label>내용</label>
			<textarea name = "content" row="3" class = "form-control" placeholder="내용">
			</textarea>
		</div>
		
		
	</div>
	
	<div>
	<button type = "submit" class = "btn btn-register">Submit</button>
	</div>
</form>
</body>
</html>