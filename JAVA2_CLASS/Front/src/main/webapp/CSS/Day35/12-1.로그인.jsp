<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<!-- �׸��� ����
<style>
.loginbox {
	display: grid;
	grid-template-columns: 1fr 1fr;
}

.login {
	list-style: none;
}

.btn button {
height: 60px;
padding-top: 3px;
padding-bottom: 3px;
margin-left: -750px;
margin-top: 10px;
}
</style> -->

<style type="text/css">
form {
	width: 400px;
	margin: 0 auto;
	
}

h3 {
	text-align: center;
	margin-top: 50px;
}

input {
	width: 150px;
	height: 25px;
}

button {
	padding: 25px 25px;
}
</style>
</head>

<body>


	<!-- �޴��� ���� ���� -->
	<%-- 	<%@ %> 	: css���ϵ� �ε��Ŵ� ������ ��!! --%>
	<%@ include file="12.�޴���.jsp"%>

	<h3>�α���</h3>

	<form>
		<table>
			<tr>
				<td>���̵�</td>
				<td><input type="text"></td>
				<td rowspan="2">
					<button>�α���</button>
			</tr>
			<tr>
				<td>��й�ȣ</td>
				<td><input type="password"></td>
			</tr>
		</table>
	</form>

	<!-- GRID ����
 	<div class="loginbox">
		<ul class="login">
			<li>���̵� <input type="text" />
			</li>
			<li>��й�ȣ <input type="text" />
			</li>


		</ul>
		<div class="btn">
			<button type="submit">�α���</button>
		</div>
	</div> 
	-->




</body>
</html>