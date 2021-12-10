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

	<!-- 회원가입페이지 스타트 -->
	<main class="container signuppage">

		<div class="row signbox">
			<div class="col-5 offset-1 border">
				<h6 class=text-center>sign in</h6>
				<form action="">
					<p>
						<span>아이디</span> <input type="text" placeholder="아이디는 소문자+숫자 조합 5~15자리
				
				" />
					</p>
					<p>
						<span>비밀번호</span> <input type="text" placeholder="아이디는 소문자+숫자 조합 5~15자리
                
                " />
					</p>
					<button value="Sign In" class="text-center btn btn-info offset-4 col-4">Sign In</button>
				</form>
			</div>

			<div class="col-5 offset-1 border">
				<h6 class=text-center>sign up</h6>
				<form action="">
					<p>
						<span>아이디</span> <input type="text" placeholder="아이디는 소문자+숫자 조합 5~15자리
                
                " />
					</p>
					<p>
						<span>비밀번호</span> <input type="password" placeholder="대소문자 조합 5~15자리

                
                " />
					</p>
					<p>
						<span>비밀번호확인</span> <input type="password" placeholder="
                
                " />
					</p>
					<p>
						<span>HP</span> <input type="number" " placeholder="000-0000-0000
                
                " />
					</p>
					<button value="Sign In" class="text-center btn btn-info offset-4 col-4">Sign Up</button>
				</form>
			</div>
		</div>

	</main>
	<!-- 회원가입페이지 엔드 -->

</body>
</html>