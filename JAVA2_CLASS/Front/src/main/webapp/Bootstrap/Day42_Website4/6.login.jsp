<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

</head>
<body>
	<%@include file="0.부트스트랩스크립트.jsp"%>
	<div class="container">
		<div class="card signcard">
			<div class="row justify-content-center mt-1">
				<h1>
					<span><a href="2.main.jsp"><i class="fas fa-tshirt mr-2"></i></a></span>안산남자쇼핑몰
				</h1>
				<div class="col-md-12 text-center mb-2">
					<p class="mt-3">간편하게 로그인하기</p>
					<br /> <span>귀찮은 입력없이</span><br /> <span>카카오로 쉽고 빠르게 회원가입하세요.</span>
				</div>

				<div class="row mb-3">
					<div class="col-md-3 justify-content-between">
						<button class="btn btn-warning">카카오 3초 로그인/회원가입</button>
					</div>
				</div>

				<div class="container">
					<div class="row ">
						<form class="col-md-12 text-center" action="">
							<button class="btn m-1" type="button">일반회원 로그인</button>
							<button class="btn m-1" type="button">비회원 배송조회</button>
							<div class="col-md-12 my-3">
								<span>아이디 : </span> <input type="text" placeholder="아이디">
							</div>

							<div class="col-md-12 my-3">
								<span>비밀번호 : </span> <input type="password" placeholder=비밀번호">
							</div>

							<div class="col-md-12 mb-1">
								<a href=""><button class="btn btn-warning" type="button">로그인</button></a>
							</div>

							<div class="row">
								<div class="col-md-1"></div>
								<div class="col-md-4 offset-1">
									<a href=""><button class="btn btn-warning mx-1" type="button">아이디/비밀번호찾기</button></a>
								</div>
								<div class="col-md-3">
									<a href="5.sign.jsp"><button class="btn btn-warning mx-1" type="button">회원가입</button></a>
								</div>
								<div class="col-md-1"></div>
							</div>



						</form>
					</div>
				</div>

				<div class="container mt-1 text-center mb-2 card-body">
					<div class="row my-2 mb-3">
						<div class="col-md-2"></div>
						<div class="col-md-4">
							<a href="#"> <i class="fab fa-facebook fa-2x"></i>
							</a> 페이스북으로 로그인
						</div>
						<div class="col-md-4">
							<a href="#"> <i class="fab fa-apple fa-2x"></i>
							</a> 애플로 로그인
						</div>
						<div class="col-md-2"></div>
					</div>

					<div class="row my-2">
						<div class="col-md-2"></div>
						<div class="col-md-4">
							<a href="#" class="btn"> <i class="fab fa-instagram fa-2x"></i>
							</a> 인스타그램으로 로그인
						</div>
						<div class="col-md-4"></div>
						<div class="col-md-2"></div>
					</div>
				</div>






			</div>
		</div>



	</div>

	<canvas>
	</canvas>

</body>
</html>