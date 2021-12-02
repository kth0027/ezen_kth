
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- css 로드 -->
<%-- <link href="${pageContext.request.contextPath}/website(Day45)/css/main.css" rel="stylesheet" type="text/css"> --%>
<link rel="stylesheet" href="../css/main.css">
<link rel="stylesheet" href="../../css/main.css">




</head>
<body>
	<%@include file="부트스트랩스크립트.jsp"%>
	<h3>헤더부분</h3>

	<div>
		<a href="/jsp_website/website(Day45)/view/main.jsp">로고</a>
	</div>

	<ul>
		<li><a href="/jsp_website/website(Day45)/view/member/signup.jsp">회원가입</a></li>
		<li><a href="/jsp_website/website(Day45)/view/member/login.jsp">로그인</a></li>
	</ul>

	<!-- 본인 js 호출 -->
	<script src="../../js/main.js" type="text/javascript"></script>
	<script src="../../js/signupcheck.js" type="text/javascript"></script>


	<!-- 다음 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>


</body>
</html>