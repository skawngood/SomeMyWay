<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">
<%-- <%
String id = (String)request.getAttribute("msg1");
String pass = (String)request.getAttribute("msg2");
if(id == null) {
%>
	alert("<%=id%>");
<%
}else if(pass == null){
%>
	alert("<%=pass%>");
<%
}else
%> --%>
alert("로그인 실패!");
history.go(-1);
</script>