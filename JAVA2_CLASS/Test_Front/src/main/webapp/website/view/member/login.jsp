<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.myinfo, .logout {
	display: none;
}
</style>

</head>
<body>
	<!-- 헤더 로드 -->
	<%@include file="../header.jsp"%>
	<%-- <%@include file="./header1.jsp"%> --%>

	<!-- 회원가입페이지 스타트 -->
	<main class="container signuppage">

		<div class="row signbox">
			<div class="col-6 offset-3 border">
				<h6 class="text-center mt-3">sign in</h6>
				<form action="" class="text-center">
					<p>
						<span>아이디</span> <input type="text" placeholder="아이디는 소문자+숫자 조합 최디 10자리
				
				" />
					</p>
					<p>
						<span>비밀번호</span> <input type="text" placeholder="대소문자 조합 최대10자리
                
                " />
					</p>
					<button value="Sign In" class="text-center btn btn-info col-4 my-2">Sign In</button>
							<div class="text-center">
						<span class="" style="width: 10rem; font-size: 0.8rem">아이디가 없으십니까?</span>
						<span>
							<a href="./signup.jsp">회원가입하기</a>
						</span>
					</div>
				</form>
			</div>
		</div>

	</main>
	<!-- 회원가입페이지 엔드 -->

</body>
</html>