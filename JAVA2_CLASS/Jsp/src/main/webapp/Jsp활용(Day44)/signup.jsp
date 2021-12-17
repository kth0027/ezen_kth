<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더 페이지 포함 -->
	<%@include file="header.jsp" %>	<!-- 헤더페이지 포함 -->

	<!-- 회원페이지 구역 -->
	<!--  -->
	<form action="signupcontroller.jsp" method="post">
		<input type="text" name="id" placeholder="Enter ID" />
		<br />
		<input type="text" name="password" placeholder="Enter Password" />
		<br />
		<input type="text" name="name" placeholder="Enter Name" />
		<br />
		<!-- submit 클릭 시 form 전송 -->
		<input type="submit" value="회원가입" />
	</form>
</body>
</html>