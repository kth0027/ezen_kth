<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="../header.jsp"%>

	<div class="container">
		<div class="row">

			<!-- 글쓰기페이지 -->
			<form class="col-md-12 border text-center" action="../../controller/boardwritecontroller.jsp" method="post" enctype="multipart/form-data">
				<!-- form 전송데이터 기본타입 : text(String) : enctype="application/x-www-form-urlencoded" -->
				<!-- form 파일데이터 타입 : multipart/form-data -->
				<div class="col-md-8 offset-2 mt-5">
					제목 : <input class="col-md-8" type="text" name="title">
				</div>
				<br />
				<div class="col-md-8 offset-2 mt-1">
					내용 :
					<textarea class="col-md-8" rows="10" cols="20" name="contents"></textarea>
				</div>
				<br />


				<div class="">
					첨부파일1 : <input type="file" name="file1">
				</div>
				
	
	
				<div class="span4 my-2">
					<input type="submit" value="등 록">
				</div>





			</form>
		</div>


	</div>
</body>
</html>
