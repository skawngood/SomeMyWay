<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-2.1.1.js"></script>

<script type="text/javascript">
	$(function() {
		$('.zip').click(
				function() {
					//opener :호출한 부모창
					$('#user_zipcode', opener.document).val(
							$(this).find('.zipcode').html());

					$('#user_address', opener.document).val(
							$(this).find('.address').html());

					self.close();
				});
	});
</script>
</head>
<body>
	<form method="post" action="zipcode_page" name="zipcode_page">
		<table>
			<caption>우편번호 검색</caption>
			<tr>
				<td>동: <input type="text" name="dong" >
				 		<input type="submit" value="검색">
				</td>
			</tr>
			<c:forEach items="${list}" var="vo">
				<tr>
					<td>
						<div class="zip">
							<span class="zipcode">${vo.zipcode}</span>
							<span class="address">${vo.address1}</span>
						</div>

					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>