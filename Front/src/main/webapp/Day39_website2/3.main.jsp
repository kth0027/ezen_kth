<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
main {
	display: flex;
	justify-content: center;
}

main li {
	list-style: none;
}

.maincontents {
	width: 1000px;
	display: flex;
	flex-direction: row;
	justify-content: center;
	align-content: center;
	align-self: center;
	/* 	background-color: orange; */
}

.leftconentsbox {
	display: flex;
	flex-direction: column;
	justify-content: center;
	border: 1px solid #000000;
	width: 200px;
	padding: 10px;
}

.leftconentsbox li {
line-height: 30px;
}

.title1 {
	font-weight: bold;
	padding-left: 10px;
}

.leftcontent1, .leftcontent2, .leftcontent3 {
	border: 1px solid #000000;
	margin-bottom: 10px;
}

.leftcontent1 {
padding-bottom: 10px;
}

.leftcontent1 .title1 {
background-color: rgb(12, 169, 163);
color: #fff;
}

.leftcontent2 .title1 {border-bottom: 1px solid gray;}



.leftcontent1>div>p {
	padding: 10px;
}

.leftcontent1 form {
	display: flex;
	flex-direction: row;
	padding: 0 10px;
}

.leftcontent1 form input {
	margin: 0 5px;
}

.leftcontent1 form input:nth-child(1) {
	width: 80%;
}

.rightconentsbox {
	display: flex;
	flex-direction: row;
	width: 800px;
	border: 1px solid #000000;
}

.rightconentsbox .title2 {
	font-size: 20px;
}

.rightconentsbox .board {
	margin-top: 50px;
}

.righrtcontent1, .righrtcontent2 {
	border: 1px solid #000000;
	width: 400px;
	padding: 10px;
}

.righrtcontent1 li {
	line-height: 30px;
}

.class {
	padding: 10px;
}

.breadbox {
	display: grid;
	grid-template-row: 1fr 1fr;
	grid-template-columns: 1fr 1fr;
	justify-content: center;
	align-content: center;
	margin-top: 10px;
}

.breadbox>div {
	width: 90%;
	border: 1px solid #000000;
}

.breadbox>div img {
	width: 150px;
	display: block;
	margin: 0 auto;
}

.breadbox p {
	padding: 5px;
}

.title2 {
	border-bottom: 3px solid #000000;
	font-weight: bold;
}

.notice span, .board span {
	padding-left: 100px;
}
</style>
</head>
<body>
	<main>
		<div class="maincontents">
			<div class="leftconentsbox">
				<div class="leftcontent1">
					<p class="title1">The 베이킹</p>
					<div>
						<p>안녕하세요 쿠키와 빵 만들기 정보를 공유하고 소통하는 공간입니다.</p>
						<form action="">
							<input type="text" value=""> <input type="button"
								value="검색">
						</form>
					</div>
				</div>
				
				<div class="leftcontent2">
					<p class="title1">베이킹/요리</p>
					<ul>
						<li>쿠키 만들기</li>
						<li>빵 만들기</li>
						<li>마카롱 만들기</li>
					</ul>
				</div>
				<div class="leftcontent3">
					<p class="title1">최근 댓글</p>
					<ul>
						<li>안녕하세요</li>
						<li>안녕하세요</li>
						<li>안녕하세요</li>
					</ul>
				</div>
			</div>

			<div class="rightconentsbox">
				<div class="righrtcontent1">
					<div class="notice">
						<p class="title2">알림</p>
						<ul>
							<li>쿠킹 클래스 연기합니다. <span>09.30</span></li>
							<li>쿠킹 클래스 연기합니다. <span>09.30</span></li>
							<li>쿠킹 클래스 연기합니다. <span>09.30</span></li>
							<li>쿠킹 클래스 연기합니다. <span>09.30</span></li>

						</ul>
					</div>
					<div class="board">
						<p class="title2">게시판</p>
						<ul>
							<li>안녕하세요 반갑습니다. <span>09.30</span></li>
							<li>안녕하세요 반갑습니다. <span>09.30</span></li>
							<li>안녕하세요 반갑습니다. <span>09.30</span></li>
							<li>안녕하세요 반갑습니다. <span>09.30</span></li>
							<li>안녕하세요 반갑습니다. <span>09.30</span></li>
						</ul>

					</div>
				</div>


				<div class="righrtcontent2">
					<div class="class">
						<p class="title2">제빵 클래스</p>
						<div class="breadbox">
							<div class="bread1">
								<img src="img/bread1.png" alt="" />
								<p>도너츠 만들기[3]</p>
								<p>21.09.30</p>
							</div>
							<div class="bread2">
								<img src="img/bread2.png" alt="" />
								<p>도너츠 만들기[3]</p>
								<p>21.09.30</p>
							</div>
							<div class="bread3">
								<img src="img/bread3.png" alt="" />
								<p>도너츠 만들기[3]</p>
								<p>21.09.30</p>
							</div>
							<div class="bread4">
								<img src="img/bread4.png" alt="" />
								<p>도너츠 만들기[3]</p>
								<p>21.09.30</p>
							</div>


						</div>
					</div>
				</div>
			</div>




		</div>
	</main>
</body>
</html>