// 장바구니

/* 장바구니 */

function cartadd() {
    // 제이쿼리[jquery]를 이용한 값 가져오기
    // 1. id속성 이용 
    // var p_num2 = $("#p_num").val();								alert("id속성 : " +  p_num2 );
    // 2. class속성 이용
    // var p_num3 = $(".p_num").val(); 								alert("class속성 : " +  p_num3 );
    // 3. name속성 이용
    // var p_num4 = $("input[name=p_num]").val(); 					alert("name속성 : " +  p_num4 );
    // 자바스크립트[js] 를 이용한 값 가져오기 
    // 1. id속성 이용
    var p_num = document.getElementById("p_num").value;				//alert("s id속성 : " +  p_num );
    // 2. class 속성 이용 // class 속성 중복 허용 하기 때문에 배열 이용
    //var p_num5 = document.getElementsByClassName("p_num")[0].value;	alert("s class속성 : " +  p_num5 );
    // 3. name속성 이용	// name 속성 중복 허용 하기 때문에 배열 이용
    //var p_num6 = document.getElementsByName("p_num")[0].value;		alert("s  name속성 : " +  p_num6 );
    var p_size = document.getElementById("p_size").value;			//alert("s id속성 : " +  p_size );
    if (p_size == 0) { // 만약에 옵션을 선택 안했으면 
        alert("옵션 선택해주세요"); return;	// 함수 종료 
    }
    var p_count = document.getElementById("pcount").value;			//alert("s id속성 : " +  p_count );

    // 컨트롤러 페이지 이동 [ 1. 하이퍼링크 2.ajax ]
    // location.href = "../../controller/productcartcontroller.jsp?p_num="+p_num+"&p_size="+p_size+"&p_count="+p_count;

    $.ajax({ // 페이지 전환이 없음 [ 해당 페이지와 통신 ]

        url: "../../controller/productcartcontroller.jsp",
        data: { p_num: p_num, p_size: p_size, p_count: p_count },
        success: function (result) {
            if (confirm("장바구니에 담았습니다 [ 장바구니로 이동할까요? ]") == true) {
                location.href = "productcart.jsp"
            }
        }
    });


}


/* 장바구니 end */


/* 장바구니 삭제 */

function cartdelete( type , p_num , p_size ){
	// Js<-->jsp 클래스 호환X
	$.ajax({ // 페이지 전환이 없음 [ 해당 페이지와 통신 ]
			
			url :  "../../controller/productcartdeletecontroller.jsp" ,
			data : { type : type , p_num : p_num , p_size : p_size } ,
			success : function( result ){
				location.reload(); // 현재페이지 새로고침
			}
	});
}

/* 장바구니 삭제 end */







