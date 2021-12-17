<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
h3 {
	text-align: center;
	margin-top: 50px;
}

form {
	width: 500px;
	margin: 0 auto;
	border-top: solid 2px #000000; /* 박스모델 아래 테두리 */
}

table tr td input, textarea {
	width: 320px;
}

table {
	margin: 0 auto;
}

table tr td:first-child {
	width: 80px;
	text-align: center;
}

table tr {
	border-bottom: solid 1px #111111;
}

table td {
	padding: 15px;
}

.btn {
	display: flex;
	justify-content: flex-end;
}

button {
	margin: 0 10px;
}

</style>
</head>

<body>


	<!-- 메뉴바 파일 포함 -->
	<%-- 	<%@ %> 	: css파일도 로딩돼니 주의할 것!! --%>
	<%@ include file="12.메뉴바.jsp"%>

	<h3>게시판 글쓰기</h3>

	<form>
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" value="홍길동"></td>
			</tr>

			<tr>
				<td>제목</td>
				<td><input type="text"></td>
			</tr>

			<tr>
				<td>글 내용</td>
				<td><textarea rows="10" cols="10"></textarea></td>
			</tr>

			<tr>
				<td>파일</td>
				<td><input type="file"></td>
			</tr>
		</table>

		<div class="btn">
			<button>저장하기</button>
			<button>목록보기</button>
		</div>

	</form>

	<!-- GRID 적용
 	<div class="loginbox">
		<ul class="login">
			<li>아이디 <input type="text" />
			</li>
			<li>비밀번호 <input type="text" />
			</li>


		</ul>
		<div class="btn">
			<button type="submit">로그인</button>
		</div>
	</div> 
	-->




</body>
</html>