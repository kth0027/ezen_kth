/* 제품 수량 변경 */

function pchange(type, stock, price) {	// function:  함수 선정 // 인수 : 버튼타입 , 재고 
    var pcount = document.getElementById("pcount").value * 1; // 현재수량 가져오기 // 문자열->숫자열 : 문자열*1
    if (type == 'm') {	// 마이너스 버튼을 눌렀을때
        pcount -= 1;	// 현재 수량 -1
        if (pcount < 1) {	// 만약에 1보다 작아지면
            alert("수량은 1개 이상만 가능 합니다."); pcount = 1;
        }
    } else if (type == "p") {	// 플러스 버튼을 눌렀을때 
        pcount += 1;	// 현재 수량 +1
        if (pcount > stock) {	// 만약에 1보다 커지면 
            alert("죄송합니다. 재고가 부족합니다."); pcount = stock;
        }
    } else {	// 만약에 직접 수량을 변경 입력했을때 
        if (pcount > stock) {	// 만약에 1보다 커지면 
            alert("죄송합니다. 재고가 부족합니다."); pcount = stock;
        }
        if (pcount < 1) {	// 만약에 1보다 작아지면
            alert("수량은 1개 이상만 가능 합니다."); pcount = 1;
        }
    }
    // 현재 수량을 현재수량 입력상자에 대입
    document.getElementById("pcount").value = pcount; // . value 속성 태그 [ 입력상자 input ]
    var totalprice = pcount * price; // 총가격 = 제품수량 * 제품가격 
    document.getElementById("total").innerHTML = totalprice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ','); 	// . innerHTML 속성 태그 [ div ]
    // 총가격.toString() : 문자열 변환
    // .replace(기존문자 , 새로운문자);
    // 정규표현식[문자 패턴찾기] : /\B(?=(\d{3})+(?!\d))/g
    // 1. / : 시작 
    // 2. \b : 시작 , 끝 문자 [ 예 : 1234일경우 1 , 4 ]
    // 3. \d{3} : 숫자 길이 [ 예 : {3} : 숫자길이 123 ]
    // 4. !\d : 뒤에 숫자가 없을경우
    // 5. /g : 전역 검색
}

/* 제품 수량 변경 end */

/* 찜하기 */
function plike(p_num, m_num) { // 비동기식 통신 함수
    if (m_num == 0) { alert("로그인후 찜하기 사용가능합니다."); return; }
    $.ajax({
        url: "../../controller/productlikecontroller.jsp",
        data: { p_num: p_num, m_num: m_num },
        success: function (result) {
            if (result == 1) {
                document.getElementById("btnplike").innerHTML = "찜하기♡";
            } else if (result == 2) {
                document.getElementById("btnplike").innerHTML = "찜하기♥";
            }
        }
    });
}

/* 찜하기 end */

/* 장바구니 수량 변경  */
function pchange2 (i, type, stock, price) {

    var p_count = document.getElementById("pcount + i").value;
    alert(p_count);

}

/* 장바구니 수량 변경 end  */