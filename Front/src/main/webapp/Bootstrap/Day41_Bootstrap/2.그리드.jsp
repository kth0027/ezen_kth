<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
* {
	border: 1px solid red;
	box-sizing: border-box;
	padding: 10px;
}

.container {
	background-color: #BEF5BE;
}

.row {
	margin-bottom: 4px;
	border-top: 4px;
	background-color: #FFD9E4;
}

[class*="col-md-"] {
	background-color: #FAFABE;
}

</style>

</head>
<body>

	<!-- ��Ʈ��Ʈ�� css, js -->
	<%@include file="1.��Ʈ��Ʈ������.jsp"%>

	<h1>�ڽ� �� : container</h1>

	<h1>�׸���</h1>
	<ul>
		<li>768px ���� : .col-ss-</li>
		<li>768px �̻� : .col-sm-</li>
		<li>992px �̻� : .col-md-</li>
		<li>1200px �̻� : .col-lg-</li>
	</ul>

	<!-- ��Ʈ��Ʈ���� ���� �̸� ������� �����̳� �� : �ڽ��� Ŭ���� -->
	<div class="container">
		<div class="row">
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
			<div class="col-md-1">.col-md-1</div>
		</div>

		<div class="row">
			<!-- 8 : 4 -->
			<div class="col-md-8"></div>
			<div class="col-md-4"></div>
		</div>

		<div class="row">
			<!-- 4 : 4 : 4 -->
			<div class="col-md-4"></div>
			<div class="col-md-4"></div>
			<div class="col-md-4"></div>
		</div>

		<div class="row">
			<!-- 6 : 6  -->
			<div class="col-md-6"></div>
			<div class="col-md-6"></div>
		</div>

	</div>

	<br />
	<br />

	<div class="container">
		<div class="row">
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-4" style="background: #333">���� 12 �׸��� �� 4��</div>
					<div class="col-md-8" style="background: #444">���� 12 �׸��� �� 8��</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="row">
					<div class="col-md-6" style="background: #555">���� 12 �׸��� �� 6��</div>
					<div class="col-md-6" style="background: #666">���� 12 �׸��� �� 6��</div>
				</div>
			</div>
		</div>
	</div>

	<br />
	<br />

	<h3>offset ��ġ ���</h3>
	<div class="container">
		<div class="row">
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-5 offset-2">col-md-5, col-md-offset-2</div>
		</div>

		<div class="row">
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7 offset-1">col-md-7, col-md-offset-2</div>
		</div>
	</div>


	<br />
	<br />

	<h3>�׸��� �����ϰų� �Ѿ��� ��</h3>
	<div class="container">
		<div class="row">
			<!-- 12�׸��� �ʰ� �Ʒ��� ������ -->
			<div class="col-md-5">col-md-5</div>
			<div class="col-md-8">col-md-8</div>
		</div>
		<div class="row">
			<!-- 12�׸��� �̸� -->
			<div class="col-md-4">col-md-4</div>
			<div class="col-md-7">col-md-7</div>
		</div>
	</div>

</body>
</html>