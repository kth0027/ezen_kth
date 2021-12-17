<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
h3 {
	text-align: center;
	margin-top: 50px;
}

.productbox {
	margin: 0 auto;
	border: solid 1px #999999;
	width: 500px;
	height: 600px;
	display: flex;
	flex-direction: column;
	justify-content: center;
}

.productimg {
	width: 90%;
	border-bottom: 1px solid #BDBDBD;
	margin: 0 auto;
}

.productimg img {
display: block;
margin: 0 auto; }

.producttxt {
	padding: 10px;
	width: 90%;
	margin: 0 auto;
}

.price {
	font-weight: bold;
	font-size: 20px;
}

.review p {
	display: inline-block;
	margin-right: 5px;
}

.review span {
	color: orange;
	font-weight: bold;
}
</style>
</head>

<body>


	<!-- 메뉴바 파일 포함 -->
	<%-- 	<%@ %> 	: css파일도 로딩돼니 주의할 것!! --%>
	<%@ include file="12.메뉴바.jsp"%>

	<h3>상품</h3>

	<div class="productbox">
		<div class="productimg">
			<img src="상품1.JPG" alt="" />
		</div>

		<div class="producttxt">
			<h1>프리미엄 파인애플 비구니세트 ...</h1>

			<p class="price">25,000원</p>

			<div class="content">
				판매자가 직접키운 파인애플입니다. 집들이, 기념일, 병문안, 생일 등 특별한 날에 상큼한 파인애플과 함께...
				</p>
			</div>

			<div class="review">
				<p>
					리뷰 <span>130</span>
				</p>
				<p>
					평점 <span>4.9/5</span>
				</p>
			</div>
		</div>
	</div>







</body>
</html>