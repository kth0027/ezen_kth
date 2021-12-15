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

function cartdelete(type, p_num, p_size) {
    // Js<-->jsp 클래스 호환X
    $.ajax({ // 페이지 전환이 없음 [ 해당 페이지와 통신 ]

        url: "../../controller/productcartdeletecontroller.jsp",
        data: { type: type, p_num: p_num, p_size: p_size, i: -1 },
        success: function (result) {
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
        data: { type: type, p_num: -1, p_size: -1, i: i },
        success: function (result) {
            location.reload();
        }
    });

}



/* 장바구니 수량 변경 end */










