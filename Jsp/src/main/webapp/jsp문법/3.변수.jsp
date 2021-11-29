<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>스크립트 문</h3>
	
	<!-- 메소드 결과 -->
	<%-- <br />one 와 two 합은? :
	<%=plus()%> --%>
	
	<%! int one; String msg; %>
	<% int two=31; String msg="서블릿 스크립트"; %>
	
	<br /> one : <%=one %> <!-- 스크립트 -->
	<br />msg : <%=msg %> <!-- 스크립트 -->
	<br />선언문 one : <%=this.one %> <!-- 선언문 -->
	<br />선언문 msg : <%=this.msg %> <!-- 선언문 -->
	<br />서블릿 경로 : <%=application.getRealPath("/") %>
	
</body>
</html>