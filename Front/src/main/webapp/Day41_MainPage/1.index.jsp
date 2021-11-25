<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- 부트스트랩의 css 가져오기   -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style: none;
}

a {
	text-decoration: none;
	color: #000;
}

#wrap {
	width: 100%;
	height: auto;
}

nav {
	position: relative;
}

.carousel-control-prev, .carousel-control-next {
	position: absolute;
}

.carousel-indicators {
	position: absolute;
	cursor: pointer;
}

/* 데스크탑 CSS */
@media only screen and (min-width: 1200px) {
	#wrap {
		background-color: red;
	}
	header {
		width: 75rem; /* 1200px */
		height: auto;
		margin: 0 auto;
		/* border: solid 1px #000; */
	}
	.login {
		width: inherit;
		height: 30px;
		/* border: solid 1px #000; */
	}
	.login ul {
		float: right;
		margin-right: 2rem;
	}
	.login li {
		display: inline-block;
		margin: 0 0.5rem;
	}
	.headmid {
		width: inherit;
		height: 50px;
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: center;
		background: gold;
	}
	.headmid .logo {
		width: 18.75rem;
	}
	.logo img {
		display: block;
		margin: 0 auto;
		height: 40px;
		margin-top: 5px;
	}
	.headmid .search {
		width: 37.5rem;
		background: yellow;
		position: relative;
	}
	.search input {
		width: 70%;
		height: 30px;
		position: absolute;
		transform: translate(-50%, -50%);
		top: 50%;
		left: 50%;
		/* background: red; */
		top: 50%;
		left: 50%;
	}
	.search button {
		float: right;
		position: absolute;
		transform: translate(-50%, -50%);
		top: 50%;
		right: 3%;
		padding: 1px;
	}
	.headmid .myinfo {
		width: 18.75rem;
	}
	.myinfo img {
		display: block;
		margin: 0 auto;
		height: 30px;
		margin-top: 10px;
	}
	.menu {
		
	}
	nav {
		width: 75rem;
		height: 400px;
		margin: 0 auto;
		/* border: solid 1px #000; */
		overflow: hidden;
	}
	nav img {
		width: 100%;
		height: 400px;
	}
	.item1txt {
		background: rgba(0, 0, 0, 0.5);
		width: 20rem;
		height: 6rem;
		border-radius: 10px;
	}
	article {
		
	}
	#contents1 {
		width: 75rem;
		height: auto;
		margin: 0 auto;
	}
	#contents1 h3 {
		text-align: center;
		padding: 2rem 0;
		background-color: #969696;
	}
	#contents1 ul {
		width: 100%;
		height: auto;
		line-height: 30px;
		margin: 0 auto;
		margin-bottom: 1rem;
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: space-between;
		padding: 0 1rem;
		display: flex;
	}
	#contents1 ul li {
		border: 1px dotted #000;
		border-radius: 0.5rem;
		padding: 1rem;
		text-align: center;
		padding: 1rem;
	}
	.contents1box {
		display: grid;
		background: #C8FAC8;
		grid-template-columns: 1fr 1fr 1fr 1fr;
		grid-template-rows: 1fr 1fr;
		justify-content: center;
		align-content: center;
		text-align: center;
		grid-gap: 2rem;
	}
	.contents1box img {
		width: 90%;
	}
	.product1 {
		grid-column: 1/3;
	}
	#contents2 {
		width: 75rem;
		margin: 0 auto;
	}
	#contents2 h3 {
		text-align: center;
		padding: 2rem 0;
		background-color: #969696;
	}
	.contents2box {
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: space-around;
		background: #FFD2FF;
	}
	.contents2box>div {
		/* background: red; */
		
	}
	.ptxt {
		line-height: 1rem;
		padding: 1rem;
	}
	footer {
		width: 100%;
		background: #999;
	}
	.foot1 {
		/* background: yellow; */
		width: 75rem;
		margin: 0 auto;
		margin-top: 1rem;
		padding-top: 1rem;
	}
	footer .foot1 ul {
		display: flex;
		flex-direction: row;
		justify-content: center;
	}
	footer .foot1 ul li {
		margin: 0 1rem;
	}
	.foot2 {
		width: 75rem;
		margin: 0 auto;
		padding: 2rem;
	}
	.foot2 span {
		margin-right: 2rem;
	}
}

/* 테블릿 CSS */
@media only screen and (min-width: 770px) and (max-width: 1199px) {
	#wrap {
		background-color: green;
	}
	header {
		width: 48.125rem; /* 770px */
		height: auto;
		margin: 0 auto;
		/* border: solid 1px #000; */
	}
	.login {
		width: inherit;
		height: 30px;
		/* border: solid 1px #000; */
	}
	.login ul {
		float: right;
		margin-right: 2rem;
	}
	.login li {
		display: inline-block;
		margin: 0 0.5rem;
	}
	.headmid {
		width: inherit;
		height: 50px;
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: center;
		background: gold;
	}
	.headmid .logo {
		width: 18.75rem;
	}
	.logo img {
		display: block;
		margin: 0 auto;
		height: 40px;
		margin-top: 5px;
	}
	.headmid .search {
		width: 24rem;
		background: yellow;
		position: relative;
	}
	.search input {
		width: 70%;
		height: 30px;
		position: absolute;
		transform: translate(-50%, -50%);
		top: 50%;
		left: 50%;
		/* background: red; */
		top: 50%;
		left: 50%;
	}
	.search button {
		float: right;
		position: absolute;
		transform: translate(-50%, -50%);
		top: 50%;
		right: 3%;
		padding: 1px;
	}
	.headmid .myinfo {
		width: 18.75rem;
	}
	.myinfo img {
		display: block;
		margin: 0 auto;
		height: 30px;
		margin-top: 10px;
	}
	.menu {
		
	}
	nav {
		width: 48.125rem;
		height: 400px;
		margin: 0 auto;
		/* border: solid 1px #000; */
		overflow: hidden;
	}
	nav img {
		width: 100%;
		height: 400px;
	}
	.item1txt {
		background: rgba(0, 0, 0, 0.5);
		width: 20rem;
		height: 6rem;
		border-radius: 10px;
	}
	article {
		
	}
	#contents1 {
		width: 48.125rem;
		height: auto;
		margin: 0 auto;
	}
	#contents1 h3 {
		text-align: center;
		padding: 2rem 0;
		background-color: #969696;
	}
	#contents1 ul {
		width: 100%;
		height: auto;
		line-height: 30px;
		margin: 0 auto;
		margin-bottom: 1rem;
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: space-between;
		padding: 0 1rem;
		display: flex;
	}
	#contents1 ul li {
		border: 1px dotted #000;
		border-radius: 0.5rem;
		padding: 1rem;
		text-align: center;
		padding: 1rem;
	}
	.contents1box {
		display: grid;
		background: #C8FAC8;
		grid-template-columns: 1fr 1fr 1fr 1fr;
		grid-template-rows: 1fr 1fr;
		justify-content: center;
		align-content: center;
		text-align: center;
		grid-gap: 2rem;
	}
	.contents1box img {
		width: 90%;
	}
	.product1 {
		grid-column: 1/3;
	}
	#contents2 {
		width: 48.125rem;
		margin: 0 auto;
	}
	#contents2 h3 {
		text-align: center;
		padding: 2rem 0;
		background-color: #969696;
	}
	.contents2box {
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: space-around;
		background: #FFD2FF;
	}
	.contents2box>div {
		/* background: red; */
		
	}
	.ptxt {
		line-height: 1rem;
		padding: 1rem;
	}
	footer {
		width: 100%;
		background: #999;
	}
	.foot1 {
		/* background: yellow; */
		width: 48.125rem;
		margin: 0 auto;
		margin-top: 1rem;
		padding-top: 1rem;
	}
	footer .foot1 ul {
		display: flex;
		flex-direction: row;
		justify-content: center;
	}
	footer .foot1 ul li {
		margin: 0 1rem;
	}
	.foot2 {
		width: 48.125rem;
		margin: 0 auto;
		padding: 2rem;
	}
	.foot2 span {
		margin-right: 2rem;
	}
}

/* 핸드폰 CSS */
@media only screen and (min-width: 425px) and (max-width: 769px) {

#wrap {
		background-color: blue;
	}
	
	header {
		width: 26.5rem; /* 425px */
		height: auto;
		margin: 0 auto;
		/* border: solid 1px #000; */
	}
	.login {
		width: inherit;
		height: 30px;
		/* border: solid 1px #000; */
	}
	.login ul {
		float: right;
		margin-right: 2rem;
	}
	.login li {
		display: inline-block;
		margin: 0 0.5rem;
	}
	.headmid {
		width: inherit;
		height: 50px;
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: center;
		background: gold;
	}
	.headmid .logo {
		width: 18.75rem;
	}
	.logo img {
		display: block;
		margin: 0 auto;
		height: 40px;
		margin-top: 5px;
	}
	.headmid .search {
		width: 37.5rem;
		background: yellow;
		position: relative;
	}
	.search input {
		width: 70%;
		height: 30px;
		position: absolute;
		transform: translate(-50%, -50%);
		top: 50%;
		left: 50%;
		/* background: red; */
		top: 50%;
		left: 50%;
	}
	.search button {
		float: right;
		position: absolute;
		transform: translate(-50%, -50%);
		top: 50%;
		right: 3%;
		padding: 1px;
	}
	.headmid .myinfo {
		width: 18.75rem;
	}
	.myinfo img {
		display: block;
		margin: 0 auto;
		height: 30px;
		margin-top: 10px;
	}
	.menu {
		
	}
	nav {
		width: 26.5rem;
		height: 400px;
		margin: 0 auto;
		/* border: solid 1px #000; */
		overflow: hidden;
	}
	nav img {
		width: 100%;
		height: 400px;
	}
	.item1txt {
		background: rgba(0, 0, 0, 0.5);
		width: 20rem;
		height: 6rem;
		border-radius: 10px;
	}
	article {
		
	}
	#contents1 {
		width: 26.5rem;
		height: auto;
		margin: 0 auto;
	}
	#contents1 h3 {
		text-align: center;
		padding: 2rem 0;
		background-color: #969696;
	}
	#contents1 ul {
		width: 100%;
		height: auto;
		line-height: 30px;
		margin: 0 auto;
		margin-bottom: 1rem;
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: space-between;
		padding: 0 1rem;
		display: flex;
	}
	#contents1 ul li {
		border: 1px dotted #000;
		border-radius: 0.5rem;
		padding: 1rem;
		text-align: center;
		padding: 1rem;
	}
	.contents1box {
		display: grid;
		background: #C8FAC8;
		grid-template-columns: 1fr 1fr 1fr 1fr;
		grid-template-rows: 1fr 1fr;
		justify-content: center;
		align-content: center;
		text-align: center;
		grid-gap: 2rem;
	}
	.contents1box img {
		width: 90%;
	}
	.product1 {
		grid-column: 1/3;
	}
	#contents2 {
		width: 26.5rem;
		margin: 0 auto;
	}
	#contents2 h3 {
		text-align: center;
		padding: 2rem 0;
		background-color: #969696;
	}
	.contents2box {
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		justify-content: space-around;
		background: #FFD2FF;
	}
	.contents2box>div {
		/* background: red; */
		
	}
	.ptxt {
		line-height: 1rem;
		padding: 1rem;
	}
	footer {
		width: 100%;
		background: #999;
	}
	.foot1 {
		/* background: yellow; */
		width: 26.5rem;
		margin: 0 auto;
		margin-top: 1rem;
		padding-top: 1rem;
	}
	footer .foot1 ul {
		display: flex;
		flex-direction: row;
		justify-content: center;
	}
	footer .foot1 ul li {
		margin: 0 1rem;
	}
	.foot2 {
		width: 26.5rem;
		margin: 0 auto;
		padding: 2rem;
	}
	.foot2 span {
		margin-right: 2rem;
	}
}
</style>
</head>
<body>
	<div id="wrap">
		<header>
			<div class="login">
				<ul>
					<li>로그인</li>
					<li>|</li>
					<li>회원가입</li>
					<li>|</li>
					<li>고객센터</li>
				</ul>
			</div>
			<div class="headmid">
				<div class="logo">
					<img src="img/1.logo.JPG" alt="" />
				</div>
				<div class="search">
					<button type="submit">검색</button>
					<input type="text" placeholder="검색">
				</div>
				<div class="myinfo">
					<span> <a href="#"> <img src="img/2.myinfo.JPG" alt="" />
					</a>
					</span>
				</div>
			</div>
			<div class="menu"></div>
		</header>
		<nav class="container">
			<div id="carouselcontents" class="carousel slide" data-ride="carousel" data-interval="3500">
				<!-- carousel slide : 이미지슬라이드 data-intercal : 1000/1초 -->
				<div class="carousel-item active item1">
					<img src="img/bn1.jpg" alt="첫번째 슬라이드" />
					<!--  이미지 레이블ㄴ-->
					<div class="carousel-caption item1txt">
						<h3>신세계몰</h3>
						<p>특가상품을 놓치지 마세요!.</p>
					</div>
				</div>
				<div class="carousel-item item2">
					<img src="img/bn2.jpg" alt="두번째 슬라이드" />
				</div>
				<div class="carousel-item item3">
					<img src="img/bn3.jpg" alt="세번째ㅣ 슬라이드" />
				</div>
			</div>
			<!-- 버튼 -->
			<div class="btn">
				<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev"> <span class="carousel-control-prev-icon"></span>
				</a> <a class="carousel-control-next" href="#carouselcontents" data-slide="next"> <span class="carousel-control-next-icon"></span>
				</a>
			</div>
			<!-- 슬라이드버튼 -->
			<ol class="carousel-indicators">
				<li class="active" data-target="#carouselcontents" data-slide-to="0"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="1"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="2"></li>
			</ol>
		</nav>
		<article>
			<section id="contents1">
				<h3>인기상품 카테고리별 만나요</h3>
				<div class="list">
					<ul>
						<li>패션</li>
						<li>잡화</li>
						<li>뷰티</li>
						<li>스포츠</li>
						<li>생활/주방</li>
						<li>가구/인테리어</li>
						<li>유아동</li>
						<li>디지털</li>
						<li>도서/e쿠폰/취미</li>
						<li>신선식품</li>
						<li>가공/건강식품</li>
					</ul>
				</div>
				<div class="contents1box">
					<div class="product1">
						<p>
							<img src="img/product1.png" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
						</div>
					</div>
					<div class="product2">
						<p>
							<img src="img/product2.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product3">
						<p>
							<img src="img/product3.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product4">
						<p>
							<img src="img/product4.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product5">
						<p>
							<img src="img/product5.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product6">
						<p>
							<img src="img/product6.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product7">
						<p>
							<img src="img/product8.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
				</div>
			</section>
			<section id="contents2">
				<h3>SSG 유아동 상품관</h3>
				<div class="contents2box">
					<div class="product8">
						<p>
							<img src="img/product9.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product9">
						<p>
							<img src="img/product10.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product10">
						<p>
							<img src="img/product11.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
					<div class="product11">
						<p>
							<img src="img/product12.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#기획전</p>
							<p>H&M Happy Week 최대 40% OFF</p>
							<p>15,800원</p>
							<p>★★★★☆</p>
						</div>
					</div>
				</div>
			</section>
		</article>
		<footer>
			<div class="foot1">
				<ul>
					<li>회사소개</li> |
					<li>개인정보처리방침</li> |
					<li>이용약관</li> |
					<li>전자금융거래용약관</li> |
					<li>청소년 보호방침</li> |
					<li>지식재산권센터</li> |
					<li>입점상담</li> |
					<li>광고신청</li>
				</ul>
			</div>
			<div class="foot2">
				<div class="service">
					<span>(주)에스에스지닷컴</span> <span>전화문의 전 클릭</span> <span>1:1 고객센터 톡</span> <span>고객센터/전자금융거래분쟁처리</span>
				</div>
				<div class="company">
					<span>대표자:강희석</span> <span>서울특별시 종로구 우정국로 26</span> <span>사업자등록번호: 870-88-01143 </span> <span>통신판매업 신고번호: 제2020-서울종로-1154호 </span> <br /> <span>개인정보보호책임자: 김우진</span> <span>Fax: 02-2068-7118</span> <span>ssg@ssg.com</span>
				</div>
			</div>
			<div class="foot3"></div>
		</footer>
	</div>
	<!-- 쿼리 / 부트스트랩의 script 가져오기   -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
