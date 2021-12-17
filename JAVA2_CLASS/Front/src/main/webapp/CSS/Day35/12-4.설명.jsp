<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
h3 {
	text-align: center;
}

.contents {
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	border: 1px solid #000000;
	width: 500px;
	height: 700px;
	display: flex;
	background-image: url(패턴배경1.JPG);
	background-size: cover;
	background-repeat: no-repeat;
}

.contents h1 {
	text-align: center;
	font-size: 50px;
	color: gold;
	text-shadow: 5px 5px 5px black;
	
}

.contents span {
	font-size: 20px;
	display: block;
	margin-top: -2px;
}

.text1 {
	text-align: center;
	color: white;
	padding: 0 30px;
}

.specialimg img {
	display: block;
	margin: 0 auto;
}

.textul {
	margin: 0 auto;
	margin-top: 30px;
	color: gold;
}

.text2 {
	margin: 0 auto;
}

.text2 p {
	text-align: center;
	font-size: 30px;
	background-color: gold;
	width: 350px;
	height: 80px;
	line-height: 80px;
}
</style>
</head>

<body>

	<!-- 메뉴바 파일 포함 -->
	<%-- 	<%@ %> 	: css파일도 로딩돼니 주의할 것!! --%>
	<%@ include file="12.메뉴바.jsp"%>

	<h3>스페셜 드레스 샵</h3>

	<div class="contents">
		<h1>
			스페셜 드레스 샵<br /> <span>Special Dress Shop</span>
		</h1>

		<p class="text1">생일, 결혼기념일, 만난 기념일 등 특별한 날에 스페셜 드레스를 입고 포토존에서 멋진
			추억의 사진을 남겨보세요.</p>

		<div class="specialimg">
			<img src="스페셜이미지1.JPG" alt="" />
		</div>

		<ul class="textul">
			<li>기간 : 매주 토/일요일 <br />13:00 ~ 마감시간 전까지
			</li>
			<li>장소 : 기념품 판매점 옆 스페셜 드레스 <br /> ※ 키즈, 커플 드레스도 입고 되었어요!
			</li>
		</ul>

		<div class="text2">
			<p>이용요금 및 이용방법</p>
		</div>

	</div>








</body>
</html>