<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	list-style: none;
}

a {
	color: #000;
	text-decoration: none;
}

#wrap {
	width: 100%;
	height: auto;
	display: grid;
	grid-template-columns: repeat(12, 1fr);
	grid-template-rows: repeat(4, 1fr);
	justify-content: center;
	border: 1px solid #000;
}

header {
	grid-area: 1/1/2/13;
	background: red;
	border: 1px solid #000;
	width: 100%;
	margin: 0 auto;
	
}

.headerbox {
	display: grid;
	grid-template-columns: 1fr 1fr;
	width: 62.5rem;
	
}

.logo {
	grid-area: span 1;
	width: 20%;
	border: 1px solid #000;
	line-height: 5rem;
}

.logo img {
	width: 5rem;
	display: block;
	margin: 0 auto;
	vertical-align: middle;
	
	
}

.menu {
	grid-area: span 1;
	width: 80%;
	border: 1px solid #000;
}

.menu ul {
	
}

.menu li {
	float: left;
}

nav {
	grid-area: 2/1/3/13;
	background: green;
	border: 1px solid #000;
}

main {
	grid-area: 3/1/4/13;
	display: grid;
	grid-template-columns: 1fr 1fr;
	grid-template-rows: 1fr;
	background: blue;
	border: 1px solid #000;
}

#section1 {
	border: 1px solid #000;
}

#section2 {
	border: 1px solid #000;
}

footer {
	grid-area: 4/1/5/13;
	background: gray;
	border: 1px solid #000;
}
</style>

</head>
<body>
	<div id="wrap">
		<header>
			<div class="headerbox">
				<div class="logo">
					<img src="img/logo.JPG" alt="" />
				</div>
				<div class="menu">
					<ul>
						<li>��Ʃ��� �Ұ�</li>
						<li>��Ʃ��� ����</li>
						<li>��α�</li>
						<li>���� ������</li>
						<li>���ô� ��</li>
					</ul>
				</div>
			</div>
		</header>
		<nav>�׺�</nav>
		<main>
			<section id="section1">����1</section>
			<section id="section2">����2</section>
		</main>
		<footer>Ǫ��</footer>
	</div>
</body>
</html>
