<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
footer {
	background-color: rgb(5, 53, 78);
	display: flex;
	justify-content: center;
}

.footerbox {
	width: 1000px;
}

.foottop {
	width: 1000px;
	padding: 0 50px;
	color: white;
	font-weight: bold;
	padding: 30px 0;
}

.foottop span {
	margin: 0 20px;
}

.footbot {
	width: 1000px;
	padding: 0 50px;
	display: flex;
	flex-direction: row;
	justify-content: center;
}

.footbox {
	width: 33%;
	padding: 10px 0px;
}

.footbox .title {
	color: rgb(90, 165, 160);
	font-weight: bold;
	font-size: 20px;
	margin-top: 20px;
}

.footbox div {
	color: white;
	font-weight: bold;
}
</style>
</head>
<body>
	<footer>
		<div class="footerbox">
			<div class="foottop">
				<span>The베이킹 소개</span> <span>개인정보처리방침</span> <span>저작권 정보</span> <span>이용안내</span>
			</div>
			<div class="footbot">
				<div class="footbox">
					<p class="title">문의전화</p>
					<div>
						<p>123-1234</p>
						<p>10:00 ~ 18:00 (Launch 12:00 - 13:00)</p>
					</div>

				</div>
				<div class="footbox">
					<p class="title">The 베이킹</p>
					<div>
						<p>주소 : 경기도 용인시 기흥구 동백대로 123</p>
						<p>전화 : 031-123-1234</p>
						<p>팩스 : 031-123-1234</p>
						<p>이메일 : 123-12-12345</p>
					</div>
				</div>
				<div class="footbox">
					<p class="title">입금 정보</p>
					<div>
						<p>농협 123-123-123456</p>
						<p>The 베이킹</p>
					</div>
				</div>
			</div>
		</div>

	</footer>
</body>
</html>