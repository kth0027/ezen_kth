/* 장바구니 삭제 */

function cartdelete( type , p_num , p_size ){
	// Js<-->jsp 클래스 호환X
	$.ajax({ // 페이지 전환이 없음 [ 해당 페이지와 통신 ]
			
			url :  "../../controller/productcartdeletecontroller.jsp" ,
			data : { type : type , p_num : p_num , p_size : p_size , i : -1 , p_count : -1 } ,
			success : function( result ){
				location.reload(); // 현재페이지 새로고침
			}
	});
}

/* 장바구니 삭제 end */


/* 장바구니 수량 변경 */
function pchange2(i, type, stock, price) {
    var p_count = document.getElementById("pcount" + i).value * 1;
    if (type == 'm') {
        p_count -= 1;
        if (p_count < 1) {
            alert("수량은 1개 이상만 가능 합니다."); p_count = 1;
        }
    } else if (type == "p") {
        p_count += 1;
        if (p_count > stock) {
            alert("죄송합니다. 재고가 부족합니다."); p_count = stock;
        }
    } else {
        if (p_count > stock) {
            alert("죄송합니다. 재고가 부족합니다."); p_count = stock;
        }
        if (p_count < 1) {	// 만약에 1보다 작아지면
            alert("수량은 1개 이상만 가능 합니다."); p_count = 1;
        }
    }
    document.getElementById("pcount" + i).value = p_count;
    var totalprice = p_count * price; // 총가격 = 제품수량 * 제품가격 
    document.getElementById("total" + i).innerHTML = totalprice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ','); 	// . innerHTML 속성 태그 [ div ]
    $.ajax({
        url: "../../controller/productcartdeletecontroller.jsp",
        data: { type: type, p_num: -1, p_size: -1, i: i, p_count: p_count },
        success: function (result) {
            location.reload();
        }
    });
}

/* 장바구니 수량 변경 end */



/* 장바구니 수량 변경 end */
