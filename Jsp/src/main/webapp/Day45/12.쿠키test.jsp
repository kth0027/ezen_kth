<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie[] cookies = request.getCookies();
	System.out.print(Arrays.toString(cookies));
	if (cookies != null) {

		for (int i = 0; i < cookies.length; i++) {
			System.out.print(cookies[i].getName());
			if (cookies[i].getName().equals("mycookie")) {
	%>
	내 쿠키 이름 :
	<%=cookies[i].getName()%>
	내 쿠키 값 :
	<%=cookies[i].getValue()%>

	<%
	}
	}
	}
	%>
</body>
</html>