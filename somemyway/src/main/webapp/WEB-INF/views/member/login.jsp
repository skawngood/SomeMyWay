<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/smm/resources/css/smmstyle.css">
</head>
<body>
<form id="login" method="post" action="login">
	<div id="wrapper">
	
		<div id="logo_page">
		logo
		</div>
		
		<div id="login_page">
			<label>User ID</label> 
			<input name="id" type="text"> 
			<label>Password</label> 
			<input name="pass" type="password" >
			<input type="submit" value="로그인" >
			<input type="button" value="회원가입" onclick="location='regist'">
		</div>
	</div>
</form>
</html>