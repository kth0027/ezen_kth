<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!-- ��Ʈ��Ʈ���� css ��������   -->
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

/* ����ũž CSS */
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

/* �׺� CSS */
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

/* �ڵ��� CSS */
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
					<li>�α���</li>
					<li>|</li>
					<li>ȸ������</li>
					<li>|</li>
					<li>������</li>
				</ul>
			</div>
			<div class="headmid">
				<div class="logo">
					<img src="img/1.logo.JPG" alt="" />
				</div>
				<div class="search">
					<button type="submit">�˻�</button>
					<input type="text" placeholder="�˻�">
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
				<!-- carousel slide : �̹��������̵� data-intercal : 1000/1�� -->
				<div class="carousel-item active item1">
					<img src="img/bn1.jpg" alt="ù��° �����̵�" />
					<!--  �̹��� ���̺�-->
					<div class="carousel-caption item1txt">
						<h3>�ż����</h3>
						<p>Ư����ǰ�� ��ġ�� ������!.</p>
					</div>
				</div>
				<div class="carousel-item item2">
					<img src="img/bn2.jpg" alt="�ι�° �����̵�" />
				</div>
				<div class="carousel-item item3">
					<img src="img/bn3.jpg" alt="����°�� �����̵�" />
				</div>
			</div>
			<!-- ��ư -->
			<div class="btn">
				<a class="carousel-control-prev" href="#carouselcontents" data-slide="prev"> <span class="carousel-control-prev-icon"></span>
				</a> <a class="carousel-control-next" href="#carouselcontents" data-slide="next"> <span class="carousel-control-next-icon"></span>
				</a>
			</div>
			<!-- �����̵��ư -->
			<ol class="carousel-indicators">
				<li class="active" data-target="#carouselcontents" data-slide-to="0"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="1"></li>
				<li class="active" data-target="#carouselcontents" data-slide-to="2"></li>
			</ol>
		</nav>
		<article>
			<section id="contents1">
				<h3>�α��ǰ ī�װ��� ������</h3>
				<div class="list">
					<ul>
						<li>�м�</li>
						<li>��ȭ</li>
						<li>��Ƽ</li>
						<li>������</li>
						<li>��Ȱ/�ֹ�</li>
						<li>����/���׸���</li>
						<li>���Ƶ�</li>
						<li>������</li>
						<li>����/e����/���</li>
						<li>�ż���ǰ</li>
						<li>����/�ǰ���ǰ</li>
					</ul>
				</div>
				<div class="contents1box">
					<div class="product1">
						<p>
							<img src="img/product1.png" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
						</div>
					</div>
					<div class="product2">
						<p>
							<img src="img/product2.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product3">
						<p>
							<img src="img/product3.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product4">
						<p>
							<img src="img/product4.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product5">
						<p>
							<img src="img/product5.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product6">
						<p>
							<img src="img/product6.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product7">
						<p>
							<img src="img/product8.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
				</div>
			</section>
			<section id="contents2">
				<h3>SSG ���Ƶ� ��ǰ��</h3>
				<div class="contents2box">
					<div class="product8">
						<p>
							<img src="img/product9.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product9">
						<p>
							<img src="img/product10.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product10">
						<p>
							<img src="img/product11.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
					<div class="product11">
						<p>
							<img src="img/product12.jpg" alt="" />
						</p>
						<div class="ptxt">
							<p>#��ȹ��</p>
							<p>H&M Happy Week �ִ� 40% OFF</p>
							<p>15,800��</p>
							<p>�ڡڡڡڡ�</p>
						</div>
					</div>
				</div>
			</section>
		</article>
		<footer>
			<div class="foot1">
				<ul>
					<li>ȸ��Ұ�</li> |
					<li>��������ó����ħ</li> |
					<li>�̿���</li> |
					<li>���ڱ����ŷ�����</li> |
					<li>û�ҳ� ��ȣ��ħ</li> |
					<li>�������Ǽ���</li> |
					<li>�������</li> |
					<li>�����û</li>
				</ul>
			</div>
			<div class="foot2">
				<div class="service">
					<span>(��)��������������</span> <span>��ȭ���� �� Ŭ��</span> <span>1:1 ������ ��</span> <span>������/���ڱ����ŷ�����ó��</span>
				</div>
				<div class="company">
					<span>��ǥ��:����</span> <span>����Ư���� ���α� �������� 26</span> <span>����ڵ�Ϲ�ȣ: 870-88-01143 </span> <span>����Ǹž� �Ű��ȣ: ��2020-��������-1154ȣ </span> <br /> <span>����������ȣå����: �����</span> <span>Fax: 02-2068-7118</span> <span>ssg@ssg.com</span>
				</div>
			</div>
			<div class="foot3"></div>
		</footer>
	</div>
	<!-- ���� / ��Ʈ��Ʈ���� script ��������   -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
