/* 스크롤 : jquery */
	
	var item = 2 ;	// 기본 주문 2개를 제외한 세번째 주문 부터
	// $(window) : 현재 창
	$(window).scroll( function () {	// 스크롤 이벤트
		// $(window).scrollTop() : 현재 스크롤의 위치
		//alert("현재 스크롤 위치 : "+ $(window).scrollTop() );
		//alert("현재 화면의 높이[ 보이는 화면 ] : "+ $(window).height() );
		//alert("문서 높이[ 보이지 않는 화면까지 포함] : "+ $(document).height() );
		// 스크롤에 바닥에 닿았을때 계산 
		if( $(window).scrollTop() == $(document).height() - $(window).height()  ){
				// 계산 : (문서전체)현재스크롤위치 == 문서전체높이 - 현재문서높이 
			$.ajax({ 
				url :"../../controller/orderlistscrollcontroller.jsp" ,
				data : { item : item } ,
				success : function( result ){  
					$("section").append(result);
					 // $("태그명").append(html) : 해당 태그에 html 추가
				}
			});
			item++; // 스크롤 바닥에 닿을떄 주문 1씩 증가
		}
	});
	
/* 스크롤 */