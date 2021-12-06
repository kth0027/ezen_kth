
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<!-- css 로드 -->
<%-- <link href="${pageContext.request.contextPath}/website(Day45)/css/main.css" rel="stylesheet" type="text/css"> --%>

<link rel="stylesheet" href="../css/main.css?v=3">

<link rel="stylesheet" href="../../css/main.css?v=3">





</head>

<body>
	<%@include file="부트스트랩스크립트.jsp"%>

	<%
	Login login = (Login) session.getAttribute("login");
	String loginid = null;
	// 세션이 있을경우
	if (login != null) {
		loginid = login.getM_id();
	}
	%>

	<!-- 헤더 스타트 -->
	<header>

		<div class="bg-white border">
			<!-- 상단 고정 , 배경 흰색 -->
			<div class="container border">
				<!-- 박스권 -->
				<div class="py-3 border ">
					<!-- 안쪽 여백 -->
					<div class="row border">
						<!-- 가로배치 -->
						<div class="col-md-4 offset-4 text-center border col-sm-4">
							<a class="header_logo" href="/jsp_website/website(Day45)/view/main.jsp">BMW MOTORS</a>
						</div>

						<div class="col-md-4 d-flex justify-content-end border">
							<!-- 상단 메뉴 -->
							<ul class="nav">
								<%
								if (loginid != null) { // 로그인이 되어있는 경우
									if (loginid.equals("adimn")) { // 로그인 + 관리자
								%>
								<li><a class="header_menu" href="/jsp_website/website(Day45)/view/member/adimin.jsp">관리자</a></li>
								<%
								}
								%>
								<li><span class="header_menu"><span>welcome </span><%=loginid%>님</span></li>
								<li class="myinfo"><a class="header_menu" href="/jsp_website/website(Day45)/view/member/memberinfo.jsp">회원정보</a></li>
								<li class="logout"><a class="header_menu" href="/jsp_website/website(Day45)/controller/logoutcontroller.jsp">로그아웃</a></li>
								<%
								} else { // 로그인이 안되어 있는 경우
								%>
								<li><a class="header_menu" href="/jsp_website/website(Day45)/view/member/signup.jsp">회원가입</a></li>
								<li><a class="header_menu" href="/jsp_website/website(Day45)/view/member/login.jsp">로그인</a></li>
								<%
								}
								%>
							</ul>
						</div>
					</div>
				</div>

				<!-- 메인 메뉴  -->
				<nav class="navbar navbar-expand-lg navbar-light bg-white">
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_manu">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="main_manu">
						<ul class="navbar-nav col-md-12 justify-content-between">
							<li class="nav-item"><a href="#" class="nav-link">신차</a></li>
							<li class="nav-item"><a href="#" class="nav-link">베스트</a></li>
							<li class="nav-item"><a href="#" class="nav-link">브랜드별</a></li>
							<li class="nav-item"><a href="#" class="nav-link">국산차</a></li>
							<li class="nav-item"><a href="#" class="nav-link">수입차</a></li>
							<li class="nav-item"><a href="#" class="nav-link">이벤트</a></li>
							<li class="nav-item"><a href="#" class="nav-link">구매후기</a></li>
							<li class="nav-item"><a href="/jsp_website/website(Day45)/view/board/boardlist.jsp" class="nav-link">고객센터</a></li>
						</ul>
					</div>
				</nav>

			</div>
		</div>

	</header>

	<!-- 헤더 종료 -->






	<!-- 본인 js 호출 -->
	<script src="../../js/main.js" type="text/javascript"></script>
	<script src="../../js/signupcheck.js" type="text/javascript"></script>
	<script src="../../js/memberdelete.js" type="text/javascript"></script>
	<script src="../../js/memberinfo.js" type="text/javascript"></script>


	<!-- 다음 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>


</body>
</html>