<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
request.setCharacterEncoding("utf-8"); // 한글 인코딩
String id = request.getParameter("id");
String password = request.getParameter("password");


//객체화

// 유효성 검사

// 존재 여부 확인


/* boolean result = MemberDao.getMemberDao().memberlogin(member); */
/* boolean logincheck = false;
boolean memberlogin(Member member){
	
} */
	
%>
</body>
</html>