<%@page import="java.io.FileInputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Revise.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String[] 도서목록 = { "java시작하기", "부트스트랩배우기", "재테크하기" };
	%>

	<%
	ArrayList<Book> books = new ArrayList<>();	
	
/* 	FileInputStream fileInputStream = new FileInputStream ("C:/Users/505/git/ezen_kth/Jsp/src/main/java/Revise/booklist.txt");
	
	byte [] bytes = new byte [1000];
	
	fileInputStream.read(bytes); */
	
	%>

	<h3>도서 검색 프로그램</h3>

	<table>
		<tr>
			<th>번호</th>
			<th>도서명</th>
			<th>가격</th>
		</tr>

		<%
		for (int i = 0; i < books.size(); i++) {
			
		}
		%>

		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>

	</table>

</body>
</html>