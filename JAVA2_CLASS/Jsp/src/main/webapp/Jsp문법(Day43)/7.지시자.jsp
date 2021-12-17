
<%@page import="java.util.Date"%>
<!-- 페이지 지시자 -->
<!-- 현재 jsp 페이지내 속성 정의 -->
<!-- page import = "패키지/클래스" -->

<!-- jsp 기본 : language : "사용할 언어" contentType="" pageEncoding="인코딩타입": 문자타입 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- page 파일 정보(내용) -->
<%@ page info="jsp시작"%>

<!-- 스크립트문에 사용할 언어 -->
<%@ page language="java"%>

<!-- 페이지 출력할 형식/문자타입 -->
<%@ page contentType="text/html; charset=UTF-8"%>

<!-- 클래스 가져오기 -->
<%@ page import="java.util.ArrayList"%>

<!-- 페이지에서 세션 사용여부 -->
<%@ page session="true"%>

<!-- 페이지 출력 크기 [ 기본 : 8kb ] none:버퍼없이 브라우저 바로 전송 -->
<%@ page buffer="none"%>

<!-- jsp 페이지가 동시에 여러 브라우저가 요청[ 기본 : true ] -->
<%@ page isThreadSafe="true"%>

<%@ page errorPage="7.에러.jsp"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Date date = new Date();
	int one = 1;
	int zero = 0;
	%>
	<h3>지시자</h3>
	<br />
	jsp 버전 :
	<%=this.getServletInfo()%>
	<br />
	현재 날짜/시간 :
	<%=date%>

	<%@include file="6.제어문2.jsp"%>
	<br />
	예외발생 :
	<%=one / zero%>
	<!-- 예외발생!!! -->
</body>
</html>