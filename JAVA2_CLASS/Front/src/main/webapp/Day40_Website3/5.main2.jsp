<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
/* 메인2 */
.box3 {
	width: 62.5rem;
	height: auto;
	margin: 0 auto;
	display: flex;
	flex-wrap : wrap;
	flex-direction: row;
	justify-content: center;
	display: flex;
	border: 1px solid #000;
}

.box3-1, .box3-2, .box3-3, .box3-4 {
	width: 24%;
	padding: 5px;
	margin-top: 10px;
	margin-bottom: 10px;
	/* background: yellow; */
}

.box3content img {
	width: 12.5rem;
	display: block;
	margin: 0 auto;
}

.box3content {
	margin: 5px;
	line-height: 30px;
}

.box3content p:nth-of-type(2) {
	width: 90%;
	line-height: 20px;
}
</style>
</head>
<body>
	<section class="items">
		<div class="box box3">
			<div class="box3-1">
				<div class="box3content">
					<p>
						<img src="img/image1.jpg" alt="" />
					</p>
					<h4>촬영 스튜디오</h4>
					<p>카메라, 조명 등 촬영 장비 완비</p>
				</div>
			</div>
			<div class="box3-2">
				<div class="box3content">
					<p>
						<img src="img/image2.jpg" alt="" />
					</p>
					<h4>촬영 스튜디오</h4>
					<p>카메라, 조명 등 촬영 장비 완비</p>
				</div>
			</div>
			<div class="box3-3">
				<div class="box3content">
					<p>
						<img src="img/image3.jpg" alt="" />
					</p>
					<h4>촬영 스튜디오</h4>
					<p>카메라, 조명 등 촬영 장비 완비</p>
				</div>
			</div>
			<div class="box3-4">
				<div class="box3content">
					<p>
						<img src="img/image4.jpg" alt="" />
					</p>
					<h4>촬영 스튜디오</h4>
					<p>카메라, 조명 등 촬영 장비 완비</p>
				</div>
			</div>
		</div>
	</section>
</body>
</html>