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


	<!-- �޴��� ���� ���� -->
	<%-- 	<%@ %> 	: css���ϵ� �ε��Ŵ� ������ ��!! --%>
	<%@ include file="12.�޴���.jsp"%>

	<h3>��ǰ</h3>

	<div class="productbox">
		<div class="productimg">
			<img src="��ǰ1.JPG" alt="" />
		</div>

		<div class="producttxt">
			<h1>�����̾� ���ξ��� �񱸴ϼ�Ʈ ...</h1>

			<p class="price">25,000��</p>

			<div class="content">
				�Ǹ��ڰ� ����Ű�� ���ξ����Դϴ�. ������, �����, ������, ���� �� Ư���� ���� ��ŭ�� ���ξ��ð� �Բ�...
				</p>
			</div>

			<div class="review">
				<p>
					���� <span>130</span>
				</p>
				<p>
					���� <span>4.9/5</span>
				</p>
			</div>
		</div>
	</div>







</body>
</html>