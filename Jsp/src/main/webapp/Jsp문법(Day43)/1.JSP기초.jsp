<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>Jsp ( java sever pages ) : �ڹ� ���� ������</p>
	<ul>
		<li>1. HTML + JAVA �ڵ带 ������ �� �ִ� ������</li>
		<li>2. �������� ��ȯ</li>
		<li>3. java -> �����α׷��� [���� : java, html ���� ] -> jsp [ java + html ]</li>
		<li>4. jsp���� �� java + html + css + js �ۼ� ����</li>
		<li>5. jsp �������� �� -> ���� [java] �� ��ȯ !!! �ڡڡ�</li>
	</ul>

	<h1>��ũ��Ʈ ��</h1>
	<!-- html ���� -->

	<!-- jsp ���� (���� �±� : 1.��������o[��������], 2. �޼ҵ�� ����o // 2.���x ) -->
	<%!String ���ڿ� = "jsp ����";%>
	<%!public String �޼ҵ�() {
	return "jsp �޼ҵ� ����";
}%>

	<!-- jsp ���� (��ũ��Ʈ �±� : 1.��������o[��������] 2. �޼ҵ� ����x  // 2.���o ) -->
	<%
	String ��ũ��Ʈ = "jsp ������Ʈ";
	String ���� = "jsp �Դϴ�.";
	System.out.print("�ֿܼ� ����ϴ� �޼ҵ�1"); // �ܼ� ���
	out.print("Html ����ϴ� �޼ҵ�"); // out : ��ũ��Ʈ �±� ������ -> html
	%>

	<!-- html ���� -->
	<br /> ���� ��� :
	<%=���ڿ�%>
	<!-- ǥ���� �±� : ����, �޼ҵ� ȣ�� -->
	<br /> �޼ҵ� ��� :
	<%=�޼ҵ�()%>
	<br /> ��ũ��Ʈ ��� :
	<%=��ũ��Ʈ%>
	
	<!-- �ּ� -->
	<br />html : <!-- HTML �ּ� -->
	<br />css : /* css�ּ� */
	<br />jsp : <%-- jsp �ּ� --%>  
	<br />jsp : <% /* ������ �ּ� */	//�����ּ� %>
</body>
</html>