<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
request.setCharacterEncoding("UTF-8"); //
String name = request.getParameter("name");
// �� �������κ��� ������ ��û
// request : jsp ���尴ü
// .getParameter("������") : �ش� ������ ��û

String color = request.getParameter("color");
%>

<%=name%>
</head>
<body bgcolor=<%=color%>>

	�̸� :
	<%=name%>


</body>
</html>