<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../header.jsp"%>
	<!-- 결제API [ 아임포트 ] 가져오기  -->
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	<%
	String sname = "cart" + loginid;
	ArrayList<Cart> carts = (ArrayList<Cart>) session.getAttribute(sname);

	// 총 제품 금액 
	int totalprice = 0;

	for (Cart cart : carts) {
		Product product = ProductDao.getProductDao().getproduct(cart.getP_num());
		totalprice += cart.getP_count() * product.getP_price();
	}
	%>
	<div class="my-5 text-center col-2 offset-5">
		<span>총 결제금액 : </span><input class="" id="totalprice" value="<%=totalprice%>">
	</div>
	<div class="container">
		<button class="mt-10 btn btn-primary col-2 offset-5" onclick="payment();">카드결제</button>
	</div>
	
	
	<!-- 	결제 API 아임포트 -->
	<script type="text/javascript">
		function payment() {

			var IMP = window.IMP;
			IMP.init("imp57335471"); // [본인]관리자 식별코드 

			IMP.request_pay({ // param
				pg : "html5_inicis",
				pay_method : "card",
				merchant_uid : "ORD20180131-0000011",
				name : "나만의 쇼핑몰", // 결제창에 나오는 결제이름
				amount : document.getElementById("totalprice").value * 1, // 결제금액
				buyer_email : "gildong@gmail.com",
				buyer_name : "홍길동",
				buyer_tel : "010-4242-4242",
				buyer_addr : "서울특별시 강남구 신사동",
				buyer_postcode : "01181"

			}, function(rsp) { // callback
				if (rsp.success) {
					// 결제 성공했을때 -> 주문 완료 페이지로 이동 

				} else {
					// 결제 실패 했을때 
				}
			});

		}
	</script>
	<!-- 결제 API 아임포트 END 페이먼트 종료 -->
</body>
</html>