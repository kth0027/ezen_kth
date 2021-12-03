/* 회원정보 수정 */
function namechange(){
	alert("클릭");
	document.getElementById("tdname").innerHTML = "<input type='text' id='name' class='form-control'> <button id='namechangebtn' class='form-control'>확인</button>"

	$(function() {

		$("#namechangebtn").click(function() {

			$.ajax({
				url: "../../controller/memberupdatecontroller.jsp",

				data: { newname: document.getElementById("name").value },

				success: function(result) {
					if (result == 1) {
						alert("1")
						document.getElementById("tdname").innerHTML = document.getElementById("name").value;
					} else {
						alert("수정 오류 : 관리자에게 문의")
					}
				}

			});

		});
	});
}
/* 회원정보 수정 end */

function sexchange(){
	alert("클릭");
	document.getElementById("tdsex").innerHTML = "<input type='text' id='sex' class='form-control'> <button id='sexchangebtn' class='form-control'>확인</button>"

	$(function() {

		$("#sexchangebtn").click(function() {

			$.ajax({
				url: "../../controller/memberupdatecontroller.jsp",

				data: { newname: document.getElementById("sex").value },

				success: function(result) {
					if (result == 1) {
						alert("1")
						document.getElementById("tdsex").innerHTML = document.getElementById("sex").value;
					} else {
						alert("수정 오류 : 관리자에게 문의")
					}
				}

			});

		});
	});
}



