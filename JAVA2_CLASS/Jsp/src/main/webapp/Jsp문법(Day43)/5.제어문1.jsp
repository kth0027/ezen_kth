<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="5.제어문1결과.jsp"> <!-- form action 속성 : submit 실행되면 이동되는 페이지 -->
		이름 : <input type="text" name="name"> <br /> 좋아하는 색상 :
		<select name="color">
			<option value="blue">파란색</option>
			<option value="red">레드</option>
			<option value="orange">오렌지</option>
			<option value="etc">기타</option>
		</select>
		<br /> <input type="submit" value="전송">
	</form>
</body>
</html>