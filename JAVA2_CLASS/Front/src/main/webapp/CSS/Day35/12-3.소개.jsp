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

form {
	width: 500px;
	margin: 0 auto;
	border-top: solid 2px #000000; /* �ڽ��� �Ʒ� �׵θ� */
}

table tr td input, textarea {
	width: 320px;
}

table {
	margin: 0 auto;
}

table tr td:first-child {
	width: 80px;
	text-align: center;
}

table tr {
	border-bottom: solid 1px #111111;
}

table td {
	padding: 15px;
}

.btn {
	display: flex;
	justify-content: flex-end;
}

button {
	margin: 0 10px;
}

</style>
</head>

<body>


	<!-- �޴��� ���� ���� -->
	<%-- 	<%@ %> 	: css���ϵ� �ε��Ŵ� ������ ��!! --%>
	<%@ include file="12.�޴���.jsp"%>

	<h3>�Խ��� �۾���</h3>

	<form>
		<table>
			<tr>
				<td>�̸�</td>
				<td><input type="text" value="ȫ�浿"></td>
			</tr>

			<tr>
				<td>����</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>�� ����</td>
				<td><textarea rows="10" cols="10"></textarea></td>
			</tr>

			<tr>
				<td>����</td>
				<td><input type="file"></td>
			</tr>
		</table>

		<div class="btn">
			<button>�����ϱ�</button>
			<button>��Ϻ���</button>
		</div>

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