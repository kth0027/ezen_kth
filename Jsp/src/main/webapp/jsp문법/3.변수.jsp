<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>��ũ��Ʈ ��</h3>
	
	<!-- �޼ҵ� ��� -->
	<%-- <br />one �� two ����? :
	<%=plus()%> --%>
	
	<%! int one; String msg; %>
	<% int two=31; String msg="���� ��ũ��Ʈ"; %>
	
	<br /> one : <%=one %> <!-- ��ũ��Ʈ -->
	<br />msg : <%=msg %> <!-- ��ũ��Ʈ -->
	<br />���� one : <%=this.one %> <!-- ���� -->
	<br />���� msg : <%=this.msg %> <!-- ���� -->
	<br />���� ��� : <%=application.getRealPath("/") %>
	
</body>
</html>