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

form input {
	width: 15rem;
}
</style>

</head>
<body>
	<!-- 헤더 로드 -->
	<%@include file="../header.jsp"%>
	<%-- <%
		// 로그인[세션]이 되어 있는경우
		if( loginid != null ){
			out.print("<script>alert('로그인이 되어있습니다.');</script>");
			out.println("<script>location.href='../main.jsp';</script>");
		}
	%> --%>
	<!-- 회원가입페이지 스타트 -->
	<main class="container signuppage">
		<div class="row signbox">
			<div class="col-6 offset-3 border">
				<h6 class="text-center mt-3">sign up</h6>
				<form id="signupform" action="../../controller/membercontroller/signupcontroller.jsp" class="d-flex flex-column justify-content-start" method="post" onsubmit="return signupcheck()">
					<div class="form-group">
						<span>아이디</span>
						<input type="text" placeholder="아이디는 소문자+숫자 조합 최디 10자리" id="id" name="id" onchange="signupcheck();" />
						<p id="idresult"></p>
					</div>
					<div class="form-group">
						<span>비밀번호</span>
						<input type="password" placeholder="대소문자 조합 최대10자리" id="passwrod" name="passwrod" onchange="signupcheck();" />
						<p id="pweresult"></p>
					</div>
					<div class="form-group">
						<span>비밀번호확인</span>
						<input type="password" placeholder="" id="passwrodconfirm" name="passwrodconfirm" onchange="signupcheck();" />
					</div>
					<div class="form-group">
						<span>이름</span>
						<input type="text" placeholder="이름은 최대 10자리" id="name" name="name" onchange="signupcheck();" />
						<p id="nameresult"></p>
					</div>
					<div class="form-group d-flex">
						<span>이메일</span>
						<input type="email" class="form-control email" id="email" name="email" aria-describedby="emailHelp" placeholder="-@- 이메일형식으로" style="width: 15rem;" onchange="signupcheck();" />
					</div>
					<div class="row form-group">
						<div class="col-md-2 text-right">
							<label>주소</label>
						</div>
						<div class="col-md-9">
							<div class="row">
								<div class="col-md-6">
									<input type="text" name="address1" id="sample4_postcode" placeholder="우편번호" class="form-control">
								</div>
								<div class="col-md-6">
									<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control">
									<br>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<input type="text" name="address2" id="sample4_roadAddress" placeholder="도로명주소" class="form-control">
								</div>
								<div class="col-md-6">
									<input type="text" name="address3" id="sample4_jibunAddress" placeholder="지번주소" class="form-control">
								</div>
							</div>
							<input class="my-2" type="text" id="sample4_detailAddress" name="address4" placeholder="상세주소" class="form-control">
						</div>
					</div>
					<div class="form-group">
						<span>연락처</span>
						<input type="text" placeholder="000-0000-0000" id="phone" name="phone" onchange="signupcheck();" />
						<p id="phoneresult"></p>
					</div>
					<button value="Sign In" class="text-center btn btn-info col-4 my-2" style="display: block; margin: 0 auto;">Sign Up</button>
					<div class="text-center">
						<span class="" style="width: 10rem; font-size: 0.8rem">아이디가 있으십니까?</span>
						<span>
							<a href="./login.jsp">로그인하기</a>
						</span>
					</div>
				</form>
			</div>
		</div>
	</main>
	<!-- 회원가입페이지 엔드 -->
	<!-- 카카오api -->
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../../js/addresapi.js"></script>
	
	<!-- 유효성 검사 -->
	<script type="text/javascript">
	function signupcheck(){
		
		// 1. 폼 가져오기 [ 폼에 id 존재 ]	//
		//document.getElementById("signupform")
		// 2. 폼내 아이디 입력 input 가져오기
		var id = document.getElementById("signupform").id.value;
		var password = document.getElementById("signupform").password.value;
		var passwordconfirm = document.getElementById("signupform").passwordconfirm.value;
		var name = document.getElementById("signupform").name.value;
		var email = document.getElementById("signupform").email.value;
		var phone = document.getElementById("signupform").phone.value;
		

		// 3. 유효성검사 [ 정규표현식 : 텍스트 패턴 검사 ] 
		var idj = /^[a-z0-9]{5,15}$/;		// 아이디 정규표현식	[ 소문자 숫자 5~15]
		var pwj = /^[A-Za-z0-9]{5,15}$/;	// 비밀번호 정규표현식[ 대,소문자 숫자 5~15]
		var phonej = /^01([0|1|6|7|8|9]?)-?([0-9]{3,4})-?([0-9]{4})$/; // 연락처
		var namej = /^[A-Za-z0-9가-힣]{1,15}$/;	// 이름 정규표현식
		
		// 아이디 
		if( !idj.test( id ) ){
			document.getElementById("idresult").innerHTML="아이디는 소문자와 숫자 조합 5~15 사이만 가능 합니다";
			document.getElementById("idresult").style.color = "red";
			return false;// form submit 불가
		}else{
			document.getElementById("idresult").innerHTML="사용가능한 아이디 입니다."
			document.getElementById("idresult").style.color = "green";
		}
		
		// 패스워드 [ 두 패스워드 동일한지 검사 ]
		
		if( !pwj.test(password) || !pwj.test(passwordconfirm) ){
			document.getElementById("pwresult").innerHTML="대소문자 조합 5~15 사이만 가능합니다."; return false;
		}else if( password != passwordconfirm){
			document.getElementById("pwresult").innerHTML="패스워드가 동일하지 않습니다.";	return false;
		}else{
			document.getElementById("pwresult").innerHTML="사용가능한 패스워드 입니다.";
		}
		// 이름
		if( !namej.test(name) ){
			document.getElementById("nameresult").innerHTML="이름을 입력해주세요.[특수문자는 제외]"; return false;
		}else{
			document.getElementById("nameresult").innerHTML="";
		}


		// 전화번호 
		if( !phonej.test( phone ) ){
			document.getElementById("phoneresult").innerHTML="전화번호 형식으로 입력해주세요."; return false;
		}else{
			document.getElementById("phoneresult").innerHTML="";
		}
	}
	</script>
	
</body>
</html>