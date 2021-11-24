<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
a {
	color: black;
	text-decoration: none;
}
/* 헤더 */
header {
	width: 100%;
	height : auto;
	background: #999999;
}

.box1 {
	width: 62.5rem;
	margin: 0 auto;
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
	justify-content: center;
	height: 100px;
	border: 1px solid #000000;
	align-items: center;
	display: flex;
	height: 100px;
}

.logo {
	width: 20%;
	padding-left: 1rem;
}

.menubar {
	width: 80%;
}

.menubar ul {
	height: 100px;
	display: flex;
	flex-direction: row;
	justify-content: flex-end;
	align-items: center;
}

.menubar ul li {
	margin: 0 20px;
}
</style>
</head>
<body>
	<header>
		<div class="box box1">
			<div class="logo">
				<a href=""><img src="img/logo.JPG" alt="로고" /></a>

			</div>
			<div class="menubar">
				<ul>
					<li><a href="#">스튜디오 소개</a></li>
					<li><a href="#">스튜디오 예약</a></li>
					<li><a href="#">블로그</a></li>
					<li><a href="#">포토 갤러리</a></li>
					<li><a href="#">오시는 길</a></li>
				</ul>
			</div>
		</div>
	</header>
</body>
</html>