<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/smm/resources/css/smmstyle.css">
<script type="text/javascript">
	function zipSearch() {
		
			var dong = document.regist.zipcode.value;
		
			window.open("zipcode_page?dong="+dong,"zipcode","width=550,height=500");
		
	}
	
	function idCheck(){
		if(document.regist.id.value == "")
		{
			alert("id를 입력하세요.");
		}else{
		document.regist.action="idcheck";
		document.regist.submit();
		}
	}
	
<%
	String check = (String)request.getAttribute("msg");
	if(check != null) {
%>
		alert("<%=check%>");
<%
	}
%>
</script>
</head>
<body>
<form:form commandName="memberVO" action="regist" name="regist" method="post">
	<div id="wrapper">
	
		<div id="logo_page">
		logo
		</div>
		
		<div id="regist_page">
			<table>
		<caption>회원가입</caption>
		<tr>
			<td>아이디</td>
			<td>
				<input type="text" name="id" value="${memberVO.id}" >
				<input type="button" onclick="idCheck()" value="중복확인">
			</td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pass" value="${memberVO.pass}" >
				</td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="password" name="pass_confirm" value="${memberVO.pass}"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${memberVO.name}">
				</td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<input type="checkbox" name="gender" value="1">남
				<input type="checkbox" name="gender" value="2">여
			</td>
		</tr>
		<tr>
			<td>전화</td>
			<td><input type="text" name="phone" value="${memberVO.phone}">
			</td>	
		</tr>
		<tr>
			<td>우편번호</td>
			<td>
				<input type="text" name="zipcode" id="user_zipcode" value="${memberVO.zipcode}">
				<input type="button" onclick="zipSearch()" value="검색">
			</td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="address1" id="user_address" value="${memberVO.address1}">
				</td>
		</tr>
		<tr>
			<td>상세주소</td>
			<td><input type="text" name="address2" value="${memberVO.address2}">
				</td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="text" name="birthdate" value="${memberVO.birthdate}">
				</td>
		</tr>
		<tr>
			<td>직업</td>
			<td><input type="text" name="job" value="${memberVO.job}">
				</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="text" name="email" value="${memberVO.email}">
				</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="가입완료">
				<input type="reset" value="다시작성">
			</td>
		</tr>
	</table>
		</div>
	</div>
</form:form>
</body>
</html>
