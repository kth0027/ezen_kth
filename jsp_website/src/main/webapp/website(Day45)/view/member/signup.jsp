<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<!-- 헤더 페이지 -->
	<%@ include file="../header.jsp"%>


	<div class="container">
		<!-- 가로박스 -->
		<div class="row">
			<div class="col-md-6 border bg-info position-relative">
				<img class="position-absolute top-50 start-50 translate-middle" src="../../img/logo.jpg" style="width: 100%" alt="로고" />
			</div>

			<div class="col-md-6 border bg-success">
				<form action="../../controller/signupcontroller.jsp">
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>아이디</label> </div>
						<div class="col-md-8 my-2"> <input type="text" name="id" class="form-control" maxlength="15" placeholder="아이디 5~15 사이로 입력"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>비밀번호</label> </div>
						<div class="col-md-8"> <input type="password" name="password" class="form-control" maxlength="15" placeholder="비밀번호 5~15 사이로 입력"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>비밀번호확인</label> </div>
						<div class="col-md-8"> <input type="password" name="passwordconfirm" class="form-control" maxlength="15" placeholder="비밀번호 확인"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>이름</label> </div>
						<div class="col-md-8"> <input type="text" name="name" class="form-control" maxlength="15" placeholder="이름입력"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>생년월일</label> </div>
						<div class="col-md-8"> <input type="date" name="birth" class="form-control"> </div>
					</div>
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>성별</label> </div>
						<div class="col-md-8 text-center"> 
						
							<input type="radio" name="sex" value="man"> 남
							<input type="radio" name="sex" value="woman"> 여
							
						</div>
					</div>
					
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>연락처</label> </div>
						<div class="col-md-8">
							<input type="text" name="phone" class="form-control" placeholder=" -제외 한 11자리 " maxlength="11">
						</div>
					</div>
					
					<div class="row">	<!-- 3:8 -->
						<div class="col-md-3 m-2"> <label>주소</label> </div>
						<div class="col-md-8"> 
							<div class="row">
								<div class="col-md-6"> <input type="text" name="address1" id="sample4_postcode" placeholder="우편번호" class="form-control"> </div>
								<div class="col-md-6"> <input type="button"  onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br> </div>
							</div>
							<div class="row">
								<div class="col-md-6"> <input type="text" name="address2" id="sample4_roadAddress" placeholder="도로명주소" class="form-control"> </div>
								<div class="col-md-6"> <input type="text" name="address3" id="sample4_jibunAddress" placeholder="지번주소" class="form-control"> </div>
							</div>
							<input type="text" id="sample4_detailAddress" name="address4" placeholder="상세주소" class="form-control mt-2">
						</div>
					</div>
					<div>
						<input type="submit" value="가입 하기" class="form-control my-3 ">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>