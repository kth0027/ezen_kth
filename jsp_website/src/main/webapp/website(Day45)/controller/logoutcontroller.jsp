<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String logout = request.getParameter("logout");

session.setAttribute("loginid", null); // 특정 세션 초기화

// 페이지 전환
response.sendRedirect("../view/main.jsp");
%>
</body>
</html>