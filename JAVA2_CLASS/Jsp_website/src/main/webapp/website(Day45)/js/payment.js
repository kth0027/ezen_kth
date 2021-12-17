/* 결제 API 아임포트 */

/*IMP.init("imp57335471"); // [본인]관리자 식별코드*/

/*imp57335471*/

/* 결제 방식 선택  */
function paymentselect(payselect) {
	document.getElementById("payselect").innerHTML = payselect;
}


/* 결제 API 아임포트 */
function payment() {
	if (document.getElementById("payselect").innerHTML == "") {
		alert("결제방식을 선택해주세요"); return;
	}
	var IMP = window.IMP;
	IMP.init("imp57335471"); // [본인]관리자 식별코드 [ 관리자 계정마다 다름] 
	IMP.request_pay({ // 결제 요청변수 
		pg: "html5_inicis",	// pg사 [ 아임포트 관리자페이지에서 선택한 pg사 ]
		pay_method: document.getElementById("payselect").innerHTML,	// 결제방식
		merchant_uid: "ORD20180131-0000011", // 주문번호[별도]
		name: "나만의 쇼핑몰", // 결제창에 나오는 결제이름
		amount: document.getElementById("totalpay").innerHTML,	// 결제금액
		buyer_email: "gildong@gmail.com",
		buyer_name: $("#name").val(),
		buyer_tel: $("#phone").val(),
		buyer_addr: $("#sample4_roadAddress").val() + "," + $("#sample4_jibunAddress").val() + "," + $("#sample4_detailAddress").val(),
		buyer_postcode: $("#sample4_postcode").val()	// 우편번호
	}, function(rsp) { // callback
		if (rsp.success) { // 결제 성공했을때 -> 주문 완료 페이지로 이동 []
		} else {
			// 결제 실패 했을때  // 테스트 : 결제 성공
			$.ajax({
				url: "../../controller/productpaymentcontroller.jsp",
				data: {
					order_name: $("#name").val(),
					order_phone: $("#phone").val(),
					order_address: $("#sample4_postcode").val() + "," + $("#sample4_roadAddress").val() + "," + $("#sample4_jibunAddress").val() + "," + $("#sample4_detailAddress").val(),
					order_pay: document.getElementById("totalpay").innerHTML,
					order_payment: document.getElementById("payselect").innerHTML,
					delivery_pay: 3000,
					order_request: document.getElementById("prequest").value
				},
				success: function(result) {
					alert(result);
					// 결제성공 과  db처리 성공시 결제주문 완료 페이지 이동
					location.href = "productpaymentsuccess.jsp";
				}
			})
		}
	});
}
/* 결제 API 아임포트 END */


/* 회원과 동일 체크 */

	
//$(document).ready( function(){ 실행문 });	// 문서내에서 대기상태 이벤트 
$(document).ready( function(){ 
	// 체크 유무 검사 [ jquery ]
	$("#checkbox").change( function(){
		// 체크박스가 변경 이벤트 
		if( $("#checkbox").is(":checked")){
			// 체크박스가 체크가 되었는지 확인 = true 
				// is : 해당 태그에 속성 유무 확인 [ ":속성명" ] 메소드 
			$("#name").val(  $("#mname").val()  );
			$("#phone").val(  $("#mphone").val() );
		}else{ // 체크 해제시 공백 채움
			$("#name").val("");
			$("#phone").val("");
		}
	});
	$("#checkbox2").change( function(){

		if( $("#checkbox2").is(":checked")){
			$("#sample4_postcode").val(  $("#address1").val() );
			$("#sample4_roadAddress").val(  $("#address2").val() );
			$("#sample4_jibunAddress").val(  $("#address3").val() );
			$("#sample4_detailAddress").val(  $("#address4").val() );
		}else{
			$("#sample4_postcode").val( "" );
			$("#sample4_roadAddress").val( "" );
			$("#sample4_jibunAddress").val( "" );
			$("#sample4_detailAddress").val( "" );
		}
	});
});	

/* 회원과 동일 체크 end */


/* 결제 정보 */

function pointcheck(mpoint) {
	var point = document.getElementById("point").value * 1;

	if (mpoint < point) {
		alert("포인트 부족");
		point = 0;
	} else {
		document.getElementById("usepoint").innerHTML = point;

	}
	var totalprice = document.getElementById("totalprice").innerHTML * 1
	var totaldeliverypay = document.getElementById("totaldeliverypay").innerHTML * 1
	document.getElementById("totalpay").innerHTML = totalprice + totaldeliverypay - point;

}

/* 결제 정보 end */












