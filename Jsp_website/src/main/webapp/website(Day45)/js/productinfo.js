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







