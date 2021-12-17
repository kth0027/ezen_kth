<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
* {
	text-align: center;
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

header {
	height: 100px;
	background-color: #87F5F5;
	padding: 10px;
	margin: 10px;
	border-radius: 10px;
}


ul {
	padding: 10px;
	background-color: #FFD2D7;
}

footer {
	border-top: 2px dotted #999;
}
</style>

</head>
<body>

	<!-- 부트스트랩 css, js 로드 -->
	<%@include file="1.부트스트랩시작.jsp"%>

	<div class="container">
		<!--  1300px 박스권 -->
		<header>
			<h2>그리드 레이아웃</h2>
		</header>
		<div class="row">

			<!--  본문의 사이드바 2칸 -->
			<div class="col-md-2">
				<ul>
					<!--  nav : inline-->
					<li>메뉴</li>
					<li>메뉴2</li>
					<li>메뉴3</li>
					<li>메뉴4</li>
					<li>메뉴5</li>
				</ul>
			</div>

			<!--  본문의 사이드바 8칸 -->
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-6">
						<p>개(영어: Dog)는 중형 동물이자 가장 널리 분포하며 개체 수가 가장 많은 지상 동물 중 하나이며,
							학명은 Canis lupus familiaris이다.[1][2][3][4][5] 개는 인류가 최초로 가축으로 삼은
							동물로 알려져 있으며[6], 역사적으로 애완견, 사냥견으로서 길러 왔다.</p>
					</div>
					<div class="col-md-6">
						<p>개(영어: Dog)는 중형 동물이자 가장 널리 분포하며 개체 수가 가장 많은 지상 동물 중 하나이며,
							학명은 Canis lupus familiaris이다.[1][2][3][4][5] 개는 인류가 최초로 가축으로 삼은
							동물로 알려져 있으며[6], 역사적으로 애완견, 사냥견으로서 길러 왔다.</p>
					</div>
				</div>
			</div>

			<!--  본문의 사이드바 2칸 -->
			<div class="col-md-2">
				<ul>
					<!--  nav : inline-->
					<li>메뉴</li>
					<li>메뉴2</li>
					<li>메뉴3</li>
					<li>메뉴4</li>
					<li>메뉴5</li>
				</ul>
			</div>
		</div>
		<footer> 여기는 푸터 </footer>
	</div>


</body>
</html>

