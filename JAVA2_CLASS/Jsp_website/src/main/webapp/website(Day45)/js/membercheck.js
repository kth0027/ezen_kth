
/* 회원과 동일 체크 */


//$(document).ready( function(){ 실행문 });	// 문서내에서 대기상태 이벤트 
$(document).ready(function () {
	// 체크 유무 검사 [ jquery ]
	$("#checkbox").change(function () {
		// 체크박스가 변경 이벤트 
		if ($("#checkbox").is(":checked")) {
			// 체크박스가 체크가 되었는지 확인 = true 
			// is : 해당 태그에 속성 유무 확인 [ ":속성명" ] 메소드 
			$("#name").val($("#mname").val());
			$("#phone").val($("#mphone").val());
		} else { // 체크 해제시 공백 채움
			$("#name").val("");
			$("#phone").val("");
		}
	});
	$("#checkbox2").change(function () {

		if ($("#checkbox2").is(":checked")) {
			$("#sample4_postcode").val($("#address1").val());
			$("#sample4_roadAddress").val($("#address2").val());
			$("#sample4_jibunAddress").val($("#address3").val());
			$("#sample4_detailAddress").val($("#address4").val());
		} else {
			$("#sample4_postcode").val("");
			$("#sample4_roadAddress").val("");
			$("#sample4_jibunAddress").val("");
			$("#sample4_detailAddress").val("");
		}
	});
});

/* 회원과 동일 체크 end */