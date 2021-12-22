
<%@page import="dao.ProductDao"%>
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
	<%@include file="./부트스트랩스크립트.jsp"%>
	
	<!-- jquery[ ajax 필수 ] -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<!-- 다음 주소 api js 호출 -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<!-- 결제API [ 아임포트 ] 가져오기  -->
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	<!--  chart Api  -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
	<!--  kakao 지도 api -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=2734a971dc33346252b0b3c9205dd59e"></script>
	<!-- 본인 js 호출 -->
	<script src="../../js/main.js" type="text/javascript"></script>
	<script src="../../js/signupcheck.js" type="text/javascript"></script>
	<script src="../../js/memberdelete.js" type="text/javascript"></script>
	<script src="../../js/memberinfo.js" type="text/javascript"></script>
	<script src="../../js/productinfo.js" type="text/javascript"></script>
	<script src="../../js/productchange.js" type="text/javascript"></script>
	<script src="../../js/productcartchange.js" type="text/javascript"></script>
	<script src="../../js/payment.js" type="text/javascript"></script>
	<script src="../../js/membercheck.js" type="text/javascript"></script>
	<script src="../../js/scroll.js" type="text/javascript"></script>
	<script src="../../js/json.js" type="text/javascript"></script>
	<script src="../../js/maps.js" type="text/javascript"></script>
	<% 
		// 재고가 0일경우 제품의 상태를 품절로 변경
		ProductDao.getProductDao().stockupdate(); 
	%>
	<%
		Login login = (Login)session.getAttribute("login");
		String loginid = null; 
		// 세션이 있을경우
		if( login != null ) {	loginid = login.getM_id();	}
	%>
	<!-- 헤더 start -->
	<div class="fixed-top bg-white">
		<!-- 상단 고정 , 배경 흰색 -->
		<div class="container">
			<!-- 박스권 -->
			<header class="py-3">
				<!-- p : 안쪽여백  // m : 바깥여백	// y : 위아래 , x : 왼쪽오른쪽 -->
				<div class="row">
					<!-- 가로배치 -->
					<div class="col-md-4 offset-4 text-center">
						<!-- 로고[웹사이트명] -->
						<a href="/jsp_website/website(Day45)/view/main.jsp" class="header_logo">SUPER CAR SHOP </a>
					</div>
					<div class="col-md-4 d-flex justify-content-end">
						<!-- 상단 메뉴 -->
						<ul class="nav">
							<%
									if( loginid != null ){	// 로그인이 되어 있는경우 
										if( loginid.equals("admin") ){ // 로그인 되어 있으면서 관리자 이면
								%>
							<li><a href="/jsp_website/website(Day45)/view/admin/dashboard.jsp" class="header_menu"> 관리자 </a></li>
							<%			
										} 
								%>
							<li><span class="header_menu">
									<%=loginid %>님
								</span></li>
							<li><a href="/jsp_website/website(Day45)/view/member/memberinfo.jsp" class="header_menu"> 회원정보 </a></li>
							<li><a href="/jsp_website/website(Day45)/controller/logoutcontroller.jsp" class="header_menu"> 로그아웃 </a></li>
							<%
									}else{	// 로그이 안되어 있는 경우
								%>
							<li><a href="/jsp_website/website(Day45)/view/member/login.jsp" class="header_menu"> 로그인 </a></li>
							<li><a href="/jsp_website/website(Day45)/view/member/signup.jsp" class="header_menu"> 회원가입 </a></li>
							<% 	
									}
								%>
						</ul>
					</div>
				</div>
			</header>
							<!-- 메인 메뉴  -->
				<nav class="navbar navbar-expand-lg navbar-light bg-white">
					<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_manu">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse" id="main_manu">
						<ul class="navbar-nav col-md-12 justify-content-between">
							<li class="nav-item"> <a href="#" class="nav-link">신차</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">베스트</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">브랜드별</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">국산차</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">수입차</a> </li>
							<li class="nav-item"> <a href="/jsp_website/website(Day45)/view/member/chatting.jsp" class="nav-link">실시간채팅</a> </li>
							<li class="nav-item"> <a href="#" class="nav-link">구매후기</a> </li>
							<li class="nav-item"> <a href="/jsp_website/website(Day45)/view/board/boardlist.jsp" class="nav-link">고객센터</a> </li>	
							<li class="nav-item"> <a href="/jsp_website/website(Day45)/view/product/productcart.jsp" class="nav-link">장바구니</a> </li>				
						</ul>
					</div>
				</nav>
			</div>
		</div>
	<!-- 헤더 end -->
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
</body>
</html>