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
	<!-- ��Ʈ��Ʈ�� css, js -->
	<%@include file="1.��Ʈ��Ʈ���ҽ�.jsp"%>

	<h3>�̹��� �����̵� [ĳ����]</h3>

	<div class="container">
		<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="3500">
			<!-- data-interval="1000" -->


			<ol class="carousel-indicators">
				<li class="active" data-target="#carouselcontents" data-slide-to="0"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="1"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="2"></li>
			</ol>

			<!-- carousel slide : �̹��������̵� data-intercal : 1000/1�� -->
			<div class="carousel-item active">
				<img src="�������̹���_1.jpg" alt="ù��° �����̵�" />
				<!--  �̹��� ���̺�-->
				<div class="carousel-caption b">
					<h3>������</h3>
					<p>�ȳ��ϼ��� �����ڱ� �̹����Դϴ�.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="�������̹���_1.jpg" alt="�ι�° �����̵�" />
			</div>
			<div class="carousel-item">
				<img src="�������̹���_1.jpg" alt="����°�� �����̵�" />
			</div>

			<!-- ��ư -->
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