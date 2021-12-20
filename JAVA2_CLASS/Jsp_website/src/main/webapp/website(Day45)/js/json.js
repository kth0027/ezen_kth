/* json */

// js에서 변수 저장하는 방법
// 1. var 변수명 = 값  	: 하나의 값 저장 
// 2. var 배열명 = [ ]	: 여러개 값 저장 
// var arr = [ 1 , 2 , 3 , 4 ];
// 3. var json = { }	: 여러개 엔트리( 키:값 ) 저장 
// json 값 호출시 => 키 를 이용함 
// json변수명[키]		=>	값 호출 
// json 키 호출시 => Object.keys()
// Object.keys( json변수명 ) : 모든 키 호출
// json 활용 [ 배열과 중첩 사용 가능 ]
// 키 : [   ]
// DB 데이터 -> JSON 변환 [ JSON 통신 ]
/*			
// json 형식 { } [  java map형식 ]
var test = { 'id' : 'qweqwe' , 'password' : 'qweqwe' }
			// 키 : 값 => 한쌍[엔트리]
var keys = Object.keys( test ); 
	// Object.keys( json변수명 ) : 모든 키 호출
	
for( var i =0 ; i<keys.length; i++ ){	// 키 개수 만큼 반복 
	var key = keys[i];
	alert( "키 : " + key + "   값 : " + test[key] );		// 키 출력
}
*/
// JSON 형식으로 가져오기 
//$.getJSON('경로/파일명' , function(json인수명){ })
$.getJSON('../../controller/productchart.jsp', function(jsonObject) {
	var keys = Object.keys(jsonObject);   // Object.keys( json변수명 ) : 모든 키 호출
	for (var i = 0; i < keys.length; i++) {	// 키 개수 만큼 반복 
		var key = keys[i];
		alert("키 : " + key + "   값 : " + jsonObject[key]);		// 키 출력
	}
});
/* json end */