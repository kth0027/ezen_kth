<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<%
request.setCharacterEncoding("UTF-8"); //
String name = request.getParameter("name");
// 전 페이지로부터 변수를 요청
// request : jsp 내장객체
// .getParameter("변수명") : 해당 변수명 요청

String color = request.getParameter("color");
%>

<%=name%>
</head>
<body bgcolor=<%=color%>>

	이름 :
	<%=name%>


</body>
</html>