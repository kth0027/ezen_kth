<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 헤더 로드 -->
	<%@include file="./header2.jsp"%>
	<div class="container boardwritepage border">
		<div class="row d-flex justify-content-center align-items-center">
			<form class="formbox b" action="">
				<div class="col-12">
					제목 :
					<input class="col-md-8" type="text" name="title">
				</div>
				<br />
				<div class="col-12">
					내용 :
					<textarea class="col-md-8" rows="10" cols="20" name="contents"></textarea>
				</div>
				<br />
				<div class="">
					첨부파일1 :
					<input type="file" name="file">
				</div>
				<button value="등록" type="submit" class="text-center btn btn-info offset-4 col-4 mt-3">등록</button>
				
				<span>
								<button value="back" class="text-center btn btn-dark offset-4 col-4 mt-3"><a href="./boardlist.jsp">뒤로가기</a></button>
				</span>
			</form>
		</div>
	</div>
	<!-- 푸터 로드 -->
	<%@include file="../footer.jsp"%>
</body>
</html>