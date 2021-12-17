<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
/* 푸터 */
footer {
	width: 100%;
	height: auto;
	border: 1px solid #fff;
}

.box4 {
	width: 62.5rem;
	margin: 0 auto;
	background-color: rgb(41, 44, 50);
	padding: 5px;
}

.box4 ul {
	display: flex;
	flex-direction: row;
	justify-content: center;
	flex-wrap: wrap;
	height: 100px;
}

.box4 li {
	color: #fff;
	display: inline-block;
	align-self: center;
	text-align: center;
	line-height: 50px;
	/* border: 1px solid #fff; */
}

.box4 li:nth-child(1) {
	width: 30%;
	line-height: 40px;
}

.box4 li:nth-child(1) .service {
	font-size: 25px;
}

.box4 li:nth-child(2) {
	width: 40%;
	line-height: 20px;
}

.box4 li:nth-child(2) span {
	font-size: 10px;
}

.box4 li:nth-child(3) {
	width: 30%;
}

.box4 li img {
	vertical-align: middle;
	margin: 0 15px;
}
</style>


</head>
<body>
	<footer>
		<div class="box box4">
			<ul>
				<li>
					<p class="service">고객센터</p>
					<p>Tel : 1588 - 1588</p>
				</li>
				<li>
					<p>
						<span>회사소개 | 개인정처리방침 | 이용약관 | 제휴안내</span>
					</p>
					<p>
						<span>주소 : 경기도 용인시 수지구 정평고 123</span><br> <span>emain
							: photo@korea.com</span> <br /> <span>COPYRIGHTⓒ2021 The
							스튜디오.ALL RIGHTS RESERVED.</span>
					</p>
				</li>
				<li><img src="img/facebook.png" alt="" /> <img
					src="img/blog.png" alt="" /> <img src="img/instagram.png" alt="" />

				</li>
			</ul>
		</div>
	</footer>
</body>
</html>