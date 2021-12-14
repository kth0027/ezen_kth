/* 제품 상태변경 */


function activeupdate(p_num) { // function : 함수만들기 

    // confirm : 확인/취소 알람 띄우기 
    if (confirm("상태변경하시겠습니가?") == true) { // 확인 버튼 눌렀을때
        // 동기식
        // location.href('../../controller/productdeletecontroller.jsp?p_num='+p_num);
        // 비동기식
        // ajax 통신으로 상태를 다음 상태로 변경
        // $( function(){ 실행문 }); : jquery
        $(function () {

            $.ajax({
                url: "../../controller/productactivcontroller.jsp",

                data: { p_num: p_num },

                success: function (result) {
                    if (result == 1) { // js 자료형이 없다
                        // 현재 페이지 초기화 [ 현재페이지 refresh ]
                        location.reload(); // jquery 메소드
                    } else {
                        alert("변경 실패 [ 관리자에게 문의] ");
                    }
                }
            });

        });

    }

}

/* 제품 상태변경 end */

// 장바구니

function cartadd() {

    // 제이쿼리를 이용한 값 가져오기

    // 1. ID 이용
    var p_num2 = $("#p_num").val();
    alert("id속성 : " + p_num2);

    // 2. CLASS 속성 이용
    var p_num3 = $(".p_num").val();
    alert("클래스속성 : " + p_num3);

    // 3. NAME 속성 이용
    var p_num4 = $("input[name=p_num]").val();
    alert("name값 속성 : " + p_num4);

    // 3. 클래스 이용
    var p_num = document.getElementById(p_num).value;

    // js를 이용한 값 가져오기

    // 1. id 이용
    var p_num = document.getElementById("p_num").value;
    alert("s id 속성 : " + p_num);

    // 2. class 이용
    var p_num5 = document.getElementsByClassName("p_num")[0].value;
    alert("s class 속성 : " + p_num5);

    // 3. name 속성 이용 // class 속성 허용하기 때문에 배열이용
    var p_num6 = document.getElementsByName("p_num")[0].value;
    alert("s name 속성 : " + p_num6);

}







