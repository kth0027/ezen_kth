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
}

.contents {
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	justify-content: center;
	border: 1px solid #000000;
	width: 500px;
	height: 700px;
	display: flex;
	background-image: url(���Ϲ��1.JPG);
	background-size: cover;
	background-repeat: no-repeat;
}

.contents h1 {
	text-align: center;
	font-size: 50px;
	color: gold;
	text-shadow: 5px 5px 5px black;
	
}

.contents span {
	font-size: 20px;
	display: block;
	margin-top: -2px;
}

.text1 {
	text-align: center;
	color: white;
	padding: 0 30px;
}

.specialimg img {
	display: block;
	margin: 0 auto;
}

.textul {
	margin: 0 auto;
	margin-top: 30px;
	color: gold;
}

.text2 {
	margin: 0 auto;
}

.text2 p {
	text-align: center;
	font-size: 30px;
	background-color: gold;
	width: 350px;
	height: 80px;
	line-height: 80px;
}
</style>
</head>

<body>

	<!-- �޴��� ���� ���� -->
	<%-- 	<%@ %> 	: css���ϵ� �ε��Ŵ� ������ ��!! --%>
	<%@ include file="12.�޴���.jsp"%>

	<h3>����� �巹�� ��</h3>

	<div class="contents">
		<h1>
			����� �巹�� ��<br /> <span>Special Dress Shop</span>
		</h1>

		<p class="text1">����, ��ȥ�����, ���� ����� �� Ư���� ���� ����� �巹���� �԰� ���������� ����
			�߾��� ������ ���ܺ�����.</p>

		<div class="specialimg">
			<img src="������̹���1.JPG" alt="" />
		</div>

		<ul class="textul">
			<li>�Ⱓ : ���� ��/�Ͽ��� <br />13:00 ~ �����ð� ������
			</li>
			<li>��� : ���ǰ �Ǹ��� �� ����� �巹�� <br /> �� Ű��, Ŀ�� �巹���� �԰� �Ǿ����!
			</li>
		</ul>

		<div class="text2">
			<p>�̿��� �� �̿���</p>
		</div>

	</div>








</body>
</html>