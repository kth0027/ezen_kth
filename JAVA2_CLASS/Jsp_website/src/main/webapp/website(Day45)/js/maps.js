/* kakao 지도 start */
function map(i , lat , lng ){
	var mapContainer = document.getElementById('map'+i), // 지도를 표시할 div 
	mapOption = { 
	        center: new kakao.maps.LatLng(lat, lng), // 지도의 중심좌표 [ 위도 , 경도 ]
	        level: 1 // 지도의 확대 레벨 [ 1 : 최대 확대 ~~~  ]
	    };
	// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
	var map = new kakao.maps.Map(mapContainer, mapOption); 
}
/* kakao 지도 end */
	