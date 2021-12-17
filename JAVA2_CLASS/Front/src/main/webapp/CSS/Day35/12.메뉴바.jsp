<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#menuul {
	text-align: center;		/*  텍스트가운데정렬	*/
	background: skyblue;	/*  배경색	*/
	color: white;			/*  글색	*/
	padding: 15px;			/*  안쪽 여백	*/
}

.menuli {
	display: inline;		/*  inline(줄포함) block(한줄)	*/
	margin-left: 20px;		/*  왼쪽 바깥여백 */
}

a {
	color: white;			/* 링크 색상 */
	text-decoration: none;	/* 링크(기본 밑줄 제거) */
}

a:hover {
	color: orange;			/* 마우스 오버시 글자색 변경 */
}

</style>
</head>

<body>
	<!-- ul(unorder list) : 순서없는 목록 -->
	<ul id="menuul">
		<li class="menuli"><a href="12-3.소개.jsp">소개</a> </li>
		<li class="menuli"><a href="12-2.게시판.jsp">고객 센터</a> </li>
		<li class="menuli"><a href="12-1.로그인.jsp">로그인</a> </li>
		<li class="menuli"><a href="#">회원가입</a> </li>
		<li class="menuli"><a href="12-4.설명.jsp">찾아 오시는 길</a> </li>

	</ul>
</body>
</html>