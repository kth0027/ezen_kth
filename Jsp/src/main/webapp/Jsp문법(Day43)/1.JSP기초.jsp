<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<p>Jsp ( java sever pages ) : 자바 서버 페이지</p>
	<ul>
		<li>1. HTML + JAVA 코드를 삽입할 수 있는 페이지</li>
		<li>2. 서블릿으로 변환</li>
		<li>3. java -> 웹프로그래밍 [서블릿 : java, html 별도 ] -> jsp [ java + html ]</li>
		<li>4. jsp파일 내 java + html + css + js 작성 가능</li>
		<li>5. jsp 실행했을 때 -> 서블릿 [java] 로 변환 !!! ★★★</li>
	</ul>

	<h1>스크립트 예</h1>
	<!-- html 구역 -->

	<!-- jsp 구역 (선언문 태그 : 1.변수선언o[전역변수], 2. 메소드메 선언o // 2.출력x ) -->
	<%!String 문자열 = "jsp 선언문";%>
	<%!public String 메소드() {
	return "jsp 메소드 선언";
}%>

	<!-- jsp 구역 (스크립트 태그 : 1.변수선언o[지역변수] 2. 메소드 선언x  // 2.출력o ) -->
	<%
	String 스크립트 = "jsp 프로젝트";
	String 내용 = "jsp 입니다.";
	System.out.print("콘솔에 출력하는 메소드1"); // 콘솔 출력
	out.print("Html 출력하는 메소드"); // out : 스크립트 태그 나가기 -> html
	%>

	<!-- html 구역 -->
	<br /> 선언문 출력 :
	<%=문자열%>
	<!-- 표현식 태그 : 변수, 메소드 호출 -->
	<br /> 메소드 출력 :
	<%=메소드()%>
	<br /> 스크립트 출력 :
	<%=스크립트%>
	
	<!-- 주석 -->
	<br />html : <!-- HTML 주석 -->
	<br />css : /* css주석 */
	<br />jsp : <%-- jsp 주석 --%>  
	<br />jsp : <% /* 여러줄 주석 */	//한줄주석 %>
</body>
</html>