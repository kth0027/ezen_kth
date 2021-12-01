<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	String cookiename = "mycookie";
	// 1. 쿠키 클래스를 이용한 쿠키 객체 만들기 ()
	Cookie cookie = new Cookie(cookiename, "아이맥");
	// 2. 쿠키 생명주기
	cookie.setMaxAge(60); // 쿠키 생명주기 [ 1분 ]
			
	// 3. 쿠키 내용 변경
	cookie.setValue("애플"); // 생략하면 아이맥 값을 따로 줘서 애플로 표기
	
	// 4. 클라이언트 [브라우저] 에게 쿠키 전달 (해당 브라우저 쿠키 저장)
	response.addCookie(cookie);
	%>
	<p>쿠키 만들기</p>
	<p>
		쿠키 내용<a href="12.쿠키test.jsp">확인</a>
	</p>


</body>



</html>