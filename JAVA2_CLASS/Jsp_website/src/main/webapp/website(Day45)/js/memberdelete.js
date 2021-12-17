/* 회원탈퇴 [ ajax : jquery  ] */ 

	// $( function(){ 실행문 });	: 함수 
	$( function(){ 
		// 버튼을 클릭했을때 이벤트 걸기 
		$("#delete").click( function(){ 
		
			// ajax : 비동기식 통신 [ 페이지전환없이 통신 ]
				//$.ajax({ 속성명:값 , 속성명:값 , 속성명:값  });
			$.ajax({
				url : "../../controller/memberdeletecontroller.jsp" ,
				/* url : 통신 경로 */
				data : {password:document.getElementById("deleteform").password.value} ,
				/* data : { 변수명 : 값 } */ 
				success : function( result  ){
				
					if( result == 1 ){
						alert('회원탈퇴 되었습니다');
						location.href='../../controller/logoutcontroller.jsp';
					} else {
						document.getElementById("deleteresult").innerHTML = "회원정보가 다릅니다.";
						document.getElementById("deleteresult").style.color = "red";
					}
				
				}
			});
		} ); // 버튼 클릭했을때 함수 끝
	 }); // 전체 함수 끝 

	

/* 회원탈퇴 */