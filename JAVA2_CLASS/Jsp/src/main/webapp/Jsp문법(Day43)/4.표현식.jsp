<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>ǥ����</h3>
	<%!String[] �̸� = { "���缮", "��ȣ��", "�ŵ���" };%>

	<!-- html start -->
	<table border="1" width="200">
		<%
		// java start
		for (int i = 0; i < �̸�.length; i++) {
			// java end
		%>

		<!-- html start -->
		<tr>
			<td><%=i%></td>
			<td><%=�̸�[i]%></td>
		</tr>
		<!-- html end -->

		<%
		// java start 
		}
		// java end
		%>
	</table>
	<!-- html end -->
</body>
</html>