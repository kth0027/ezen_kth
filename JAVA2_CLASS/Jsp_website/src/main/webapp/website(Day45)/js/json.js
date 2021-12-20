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
		$.getJSON('../../controller/productchart.jsp' , function(jsonObject){
			var keyval = [ ];	// 모든 키를 저장하는 배열
			var valueval = [ ]; // 모든 값을 저장하는 배열 
			
			var keys = Object.keys( jsonObject );   // Object.keys( json변수명 ) : 모든 키 호출
			for( var i =0 ; i<keys.length; i++ ){	// 키 개수 만큼 반복 
				keyval[i] = keys[i];	// i번째 키 저장 
				valueval[i] = jsonObject[ keyval[i] ]; // i번째 값 저장 
			}
				/* 차트 만들기 chart.js */
				var context = document.getElementById('myChart').getContext('2d');
	           	var myChart = new Chart( context, {
	               type: 'bar', // 차트의 형태
	               data: { // 차트에 들어갈 데이터
	                   labels: keyval ,	// 가로축
	                   datasets: 
							[
		                        { // 계열추가 
		                           	label: '날짜별 주문수', // 계열명 
		                           	data: valueval ,	// 계열 데이터 
		                       	 	backgroundColor: [	// 계열색상
							                'rgba(255, 99, 132, 0.2)',
							                'rgba(54, 162, 235, 0.2)',
							                'rgba(255, 206, 86, 0.2)',
							                'rgba(75, 192, 192, 0.2)',
							                'rgba(153, 102, 255, 0.2)',
							                'rgba(255, 159, 64, 0.2)'
							            ],
									borderColor: [	// 계열 테두리 색상
							                'rgba(255, 99, 132, 1)',
							                'rgba(54, 162, 235, 1)',
							                'rgba(255, 206, 86, 1)',
							                'rgba(75, 192, 192, 1)',
							                'rgba(153, 102, 255, 1)',
							                'rgba(255, 159, 64, 1)'
							            ],
							      	borderWidth: 1	// 계열 테두리 굵기
							  	},
							]
						},
					options: {	// 차트 옵션 
				    	scales: {	
				       		yAxes: 	// y : 세로축 
								[
				            		{
				               			ticks: {	
												beginAtZero: true // 기본값 : 0부터 시작 
												}
				                   	}
				             	]
				           		}
				        	}
					});
				/* 차트 만들기 end */
		});
/* json end */
