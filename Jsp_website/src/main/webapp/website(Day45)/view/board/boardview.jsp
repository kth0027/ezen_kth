<%@page import="dao.BoardDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp"%>
	<!-- 헤더 페이지 -->

	<%
	int b_num = Integer.parseInt(request.getParameter("b_num")); // 전 페이지에서 클릭한 게시물번호	
	// 해당 게시물번호의 게시물 가져오기
	Board board = BoardDao.getboarddao().getboard(b_num);
	%>

	<!-- 게시물 상세 페이지 -->
	<div class="container border">

		<div class="row col-md12 mt-2 border">
			<table class="offset-1 col-md-10 table-striped">
				<tr class="">
					<td class="col-md-2">제목</td>
					<td class="col-md-8"><%=board.getB_title()%></td>
				</tr>
				<tr class="">
					<td class="col-md-2">내용</td>
					<td class="col-md-8"><%=board.getB_contents()%></td>
				</tr>
				<tr class="">
					<td class="col-md-2">첨부파일1</td>
					<td class="col-md-8"><a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"><%=board.getB_file()%></a></td>
				</tr>

				<tr class="">
					<td class="col-md-2">첨부파일2</td>
					<td class="col-md-8"><a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file2()%>"><%=board.getB_file2()%>></a></td>
				</tr>
			</table>
		</div>

	</div>
</body>
</html>