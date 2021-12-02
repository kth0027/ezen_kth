<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>자바 스크립트 위치 : html -> body // css -> head </h3>
<script type="text/javascript">
var 메세지 = "자바스크립트";
// var : 변수선언 자료형
for ( var i = 0; i<5; i++) {
	// 내장객체
	document.writeln(메세지 + "<br>");
};
// 스크립트 한줄 주석처리 [ 자바 동일 ]
/* 여러줄  */
</script>
</body>
</html>