<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/smm/resources/css/smmstyle.css">
<script type="text/javascript">
	alert("${msg}");
</script>
</head>
<jsp:include page="../header.jsp" />
<body>
	<div class="content_page">
		<div id="mypage_page">
			<div id="mypage_profile">
			</div>
			<div id="mypage_id">
				<label id="id_guide">사용자 ID</label> 
				<label id="id_user">tempId</label>
			</div>
		</div>
	</div>
</body>
</html>