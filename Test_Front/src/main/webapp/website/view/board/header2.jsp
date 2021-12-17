<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- css 로드 -->
<link rel="stylesheet" href="../css/main.css?v=3">
<link rel="stylesheet" href="../../css/main.css?v=3">

<!-- 부트스트랩 css 로드 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<!-- 아이콘 사용 -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>

	<!-- header start -->
	<header class="container headerpage d-flex justify-content-center align-items-center py-3">
		<div class="logo col-md-2">
		<a href="#main.jsp"><img src="" alt="" />로고</a>
		</div>
		
		<ul class="nav nav-pills col-md-10 justify-content-end">
			<li class="nav-item"><a href="../main.jsp" class="nav-link active" aria-current="page">Home</a>
			<a href="./main.jsp" class="nav-link active" aria-current="page" style="display: none;">Home</a>
			</li>
			<li class="nav-item myinfo"><a href="#" class="nav-link">My info</a></li>
			<li class="nav-item board"><a href="#" class="nav-link">Board</a></li>
			<li class="nav-item"><a href="../member/signup.jsp" class="nav-link">Sign Up</a></li>
			<li class="nav-item"><a href="../member/signup.jsp" class="nav-link">Sign In</a></li>
			<li class="nav-item logout"><a href="#" class="nav-link">Logout</a></li>
		</ul>
	</header>
	<!-- header end -->

	<!-- js로드 -->

	<!-- 쿼리 및 부트스트랩 스크립트 로드 -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>