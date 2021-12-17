<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더페이지 포함 -->
	<%@include file="header.jsp"%>

	<h3>로그인 페이지</h3>
	<form action="logincontroller.jsp" method="post">
		아이디 : <input type="text" name="id" placeholder="Enter ID" /> 비밀번호 : <input type="text" name="password" placeholder="Enter Password" />
		<!-- submit 클릭 시 form 전송 -->
		<input type="submit" value="로그인" />
	</form>
	<%
	if (request.getParameter("result") != null && request.getParameter("result").equals("fail")) {
	%>
	<h4>로그인 실패</h4>
	<%
	}
	%>
</body>
</html>