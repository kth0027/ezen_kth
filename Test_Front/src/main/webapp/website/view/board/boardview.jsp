<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더 로드 -->
		<%@include file="../header.jsp"%>
	<%-- <%@include file="./header2.jsp"%> --%>

	<div class="container boardviewpage">
		<div class="row offset-9 col-3">
			<ul class="d-flex p-2">
				<a href="./boardlist.jsp"><li class="btn btn-info">목록</li></a>
				<li>|</li>
				<a href=""><li class="btn btn-info">수정</li></a>
				<li>|</li>
				<a href=""><li class="btn btn-dark">삭제</li></a>
			</ul>
		</div>

		<div class="row justify-content-center border">
			<form action="" class="" style="width: 90%">
				<table class="table table-striped">
					<tr>
						<td>작성자</td>
						<td>작성일</td>
						<td>조회수</td>
					</tr>
					<tr>
						<td>제목</td>
						<td colspan="2"></td>
					</tr>
					<tr>
						<td style="height: 300px;">내용</td>
						<td colspan="2"></td>
					</tr>
					<tr>
						<td>
							첨부파일 : <br> 다운로드 <br> <a href=""> </a>
						</td>

					</tr>

				</table>
			</form>
		</div>
	</div>

	<!-- 푸터 로드 -->
	<%@include file="../footer.jsp"%>
</body>
</html>