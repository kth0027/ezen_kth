<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
* {
	border: 1px solid red;
	box-sizing: border-box;
	padding: 10px;
}

.container {
	background-color: #BEF5BE;
}

.row {
	margin-bottom: 4px;
	border-top: 4px;
	background-color: #FFD9E4;
}

[class*="col-md-"] {
	background-color: #FAFABE;
}

</style>

</head>
<body>

	<!-- 부트스트랩 css, js -->
	<%@include file="1.부트스트랩시작.jsp"%>

	<h1>박스 모델 : container</h1>

	<h1>그리드</h1>
	<ul>
		<li>768px 이하 : .col-ss-</li>
		<li>768px 이상 : .col-sm-</li>
		<li>992px 이상 : .col-md-</li>
		<li>1200px 이상 : .col-lg-</li>
	</ul>

	<!-- 부트스트랩에 의한 미리 만들어진 컨테이너 모델 : 박스모델 클래스 -->
	<div class="container">
		<div class="row">
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
		</div>

		<div class="row">
			<!-- 8 : 4 -->
			<div class="col-md-8"></div>
			<div class="col-md-4"></div>
		</div>

		<div class="row">
			<!-- 4 : 4 : 4 -->
			<div class="col-md-4"></div>
			<div class="col-md-4"></div>
			<div class="col-md-4"></div>
		</div>

		<div class="row">
			<!-- 6 : 6  -->
			<div class="col-md-6"></div>
			<div class="col-md-6"></div>
		</div>

	</div>

	<br />
	<br />

	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-4" style="background: #333">내부 12 그리드 중 4개</div>
					<div class="col-md-8" style="background: #444">내부 12 그리드 중 8개</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="row">
					<div class="col-md-6" style="background: #555">내부 12 그리드 중 6개</div>
					<div class="col-md-6" style="background: #666">내부 12 그리드 중 6개</div>
				</div>
			</div>
		</div>
	</div>

	<br />
	<br />

	<h3>offset 위치 잡기</h3>
	<div class="container">
		<div class="row">
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-5 offset-2">col-md-5, col-md-offset-2</div>
		</div>

		<div class="row">
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7 offset-1">col-md-7, col-md-offset-2</div>
		</div>
	</div>


	<br />
	<br />

	<h3>그리드 부족하거나 넘었을 때</h3>
	<div class="container">
		<div class="row">
			<!-- 12그리드 초과 아래로 내려감 -->
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-8">col-md-8</div>
		</div>
		<div class="row">
			<!-- 12그리드 미만 -->
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7">col-md-7</div>
		</div>
	</div>

</body>
</html>