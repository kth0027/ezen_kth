<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
header {
	display: flex;
	flex-direction: column;
	/* 	justify-content: center;
	align-items: center; */
}

.headerbox {
	width: 1000px;
	align-self: center;
}

.login {
	height: 30px;
}

.login ul {
	display: flex;
	flex-direction: row;
	justify-content: flex-end;
	align-content: center;
}

.login li {
	list-style: none;
	margin: 0 30px;
}

.headermid {
	display: flex;
	flex-direction: row;
	height: 70px;
}

.logo {
	width: 20%;
	align-content: flex-end;
}

.logo img {
	margin: 0 auto;
	display: block;
	width: 100px;
	height: 70px;
}

.menu {
	width: 80%;
	height: 70px;
}

.menu ul {
	display: flex;
	justify-content: flex-end;
	align-items: center;
	margin-right: 50px;
	height: 70px;
	margin-right: 50px;
	margin-right: 50px;
}

.menu li {
	margin-left: 50px;
	list-style: none;
}
</style>

</head>
<body>
	<header>
		<div class="headerbox">
			<div class="login">
				<ul>
					<li>김지영(jykim)님</li> |
					<li>로그아웃</li> |
					<li>정보수정</li>
				</ul>
			</div>
			<div class="headermid">
				<div class="logo">
					<img alt="" src="img/1.logo.JPG">
				</div>
				<div class="menu">
					<ul>
						<li>Home</li>
						<li>출석부</li>
						<li>작품개럴리</li>
						<li>게시판</li>
					</ul>

				</div>
			</div>
		</div>


	</header>
</body>
</html>