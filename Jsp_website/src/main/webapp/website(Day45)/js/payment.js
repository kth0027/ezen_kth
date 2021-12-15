/* 결제 API 아임포트 */

function payment() {

	var IMP = window.IMP;
	IMP.init("imp57335471"); // [본인]관리자 식별코드 

	IMP.request_pay({ // param
		pg: "html5_inicis",
		pay_method: "card",
		merchant_uid: "ORD20180131-0000011",
		name: "나만의 쇼핑몰", // 결제창에 나오는 결제이름
		amount: document.getElementById("totalprice").value * 1, // 결제금액
		buyer_email: "gildong@gmail.com",
		buyer_name: "홍길동",
		buyer_tel: "010-4242-4242",
		buyer_addr: "서울특별시 강남구 신사동",
		buyer_postcode: "01181"

	}, function (rsp) { // callback
		if (rsp.success) {
			// 결제 성공했을때 -> 주문 완료 페이지로 이동 

		} else {
			// 결제 실패 했을때 
		}
	});

};

/* function payment() {
	IMP.init('imp57335471'); //iamport 대신 자신의 "가맹점 식별코드"를 사용하시면 됩니다
	
	IMP.request_pay({
		merchant_uid: 'merchant_' + new Date().getTime(),
		name: '결제테스트',
		amount: 14000,
		buyer_email: 'iamport@siot.do',
		buyer_name: '구매자',
		buyer_tel: '010-1234-5678',
		buyer_addr: '서울특별시 강남구 삼성동',
		buyer_postcode: '123-456'
	}, function (rsp) {
		if (rsp.success) {
			var msg = '결제가 완료되었습니다.';
			msg += '고유ID : ' + rsp.imp_uid;
			msg += '상점 거래ID : ' + rsp.merchant_uid;
			msg += '결제 금액 : ' + rsp.paid_amount;
			msg += '카드 승인번호 : ' + rsp.apply_num;
		} else {
			var msg = '결제에 실패하였습니다.';
			msg += '에러내용 : ' + rsp.error_msg;
		}
	});
} */


/* 결제 API 아임포트 END */