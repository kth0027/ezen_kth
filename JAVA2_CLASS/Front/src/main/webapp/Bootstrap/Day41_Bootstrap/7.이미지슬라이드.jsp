<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<style>
.carousel-item {
	width: 1110px;
	height: 580px;
}

.container .carousel-item img {
	width: 100%;
	border: 1px solid #000000;
}
</style>

<body>
	<!-- 부트스트랩 css, js -->
	<%@include file="1.부트스트랩소스.jsp"%>

	<h3>이미지 슬라이드 [캐러셀]</h3>

	<div class="container">
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="3500">
			<!-- data-interval="1000" -->


			<ol class="carousel-indicators">
				<li class="active" data-target="#carouselcontents" data-slide-to="0"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="1"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="2"></li>
			</ol>

			<!-- carousel slide : 이미지슬라이드 data-intercal : 1000/1초 -->
			<div class="carousel-item active">
				<img src="강아지이미지_1.jpg" alt="첫번째 슬라이드" />
				<!--  이미지 레이블ㄴ-->
				<div class="carousel-caption b">
					<h3>강아지</h3>
					<p>안녕하세요 웰시코기 이미지입니다.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="강아지이미지_1.jpg" alt="두번째 슬라이드" />
			</div>
			<div class="carousel-item">
				<img src="강아지이미지_1.jpg" alt="세번째ㅣ 슬라이드" />
			</div>

			<!-- 버튼 -->
			<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev">
				<span class="carousel-control-prev-icon"></span>
			</a>
			<a class="carousel-control-next" href="#carouselcontents" data-slide="next">
				<span class="carousel-control-next-icon"></span>
			</a>



		</div>


	</div>

</body>
</html>