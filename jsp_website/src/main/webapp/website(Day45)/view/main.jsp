
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹사이트</title>


</head>
<body>

	<%@ include file="header.jsp"%>

	<%-- 	<%
		MemberDao.getmemberDao();
	%> --%>
	<!-- 캐러셀 start -->
	<div id="carouselcontent" class="carousel slide" data-ride="carousel" data-interval="5000">
		<!-- 캐러셀 하단버튼  -->
		<ol class="carousel-indicators" style="cursor: pointer;">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1"></li>
			<li data-target="#carouselcontent" data-slide-to="2"></li>
		</ol>

		<!-- 슬라이드 이미지 -->
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="../img/slide1.jpg">
			</div>
			<div class="carousel-item">
				<img src="../img/slide2.jpg">
			</div>
			<div class="carousel-item">
				<img src="../img/slide3.jpg">
			</div>
		</div>

		<!-- 케러셀 이미지 이동 버튼 -->
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev" style="transform: scale(2);">
			<span class="carousel-control-prev-icon" ></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next" style="transform: scale(2);">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>
	<!-- 캐러셀 end -->

	<!-- 제품 목록 -->

	<!-- 제품 목록 end -->
	<%@ include file="footer.jsp"%>
</body>
</html>