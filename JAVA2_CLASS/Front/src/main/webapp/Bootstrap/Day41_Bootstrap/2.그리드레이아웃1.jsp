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

	<!-- ��Ʈ��Ʈ�� css, js �ε� -->
	<%@include file="1.��Ʈ��Ʈ������.jsp"%>

	<div class="container">
		<!--  1300px �ڽ��� -->
		<header>
			<h2>�׸��� ���̾ƿ�</h2>
		</header>
		<div class="row">

			<!--  ������ ���̵�� 2ĭ -->
			<div class="col-md-2">
				<ul>
					<!--  nav : inline-->
					<li>�޴�</li>
					<li>�޴�2</li>
					<li>�޴�3</li>
					<li>�޴�4</li>
					<li>�޴�5</li>
				</ul>
			</div>

			<!--  ������ ���̵�� 8ĭ -->
			<div class="col-md-8">
				<div class="row">
					<div class="col-md-6">
						<p>��(����: Dog)�� ���� �������� ���� �θ� �����ϸ� ��ü ���� ���� ���� ���� ���� �� �ϳ��̸�,
							�и��� Canis lupus familiaris�̴�.[1][2][3][4][5] ���� �η��� ���ʷ� �������� ����
							������ �˷��� ������[6], ���������� �ֿϰ�, ��ɰ����μ� �淯 �Դ�.</p>
					</div>
					<div class="col-md-6">
						<p>��(����: Dog)�� ���� �������� ���� �θ� �����ϸ� ��ü ���� ���� ���� ���� ���� �� �ϳ��̸�,
							�и��� Canis lupus familiaris�̴�.[1][2][3][4][5] ���� �η��� ���ʷ� �������� ����
							������ �˷��� ������[6], ���������� �ֿϰ�, ��ɰ����μ� �淯 �Դ�.</p>
					</div>
				</div>
			</div>

			<!--  ������ ���̵�� 2ĭ -->
			<div class="col-md-2">
				<ul>
					<!--  nav : inline-->
					<li>�޴�</li>
					<li>�޴�2</li>
					<li>�޴�3</li>
					<li>�޴�4</li>
					<li>�޴�5</li>
				</ul>
			</div>
		</div>
		<footer> ����� Ǫ�� </footer>
	</div>


</body>
</html>

