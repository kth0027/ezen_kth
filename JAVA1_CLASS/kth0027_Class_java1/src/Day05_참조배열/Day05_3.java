package Day05_참조배열;

import java.util.Scanner;

public class Day05_3 {
	
	// p.181 확인문제
		// 1. 2
			//스택 : 변수이름 저장
			// 힙 : 변수내 실제 값
			// 3. == != 객체주소값 비교 [ 객체 내용물 비교x ]
				// .equals [ 객체 내용물 비교 o ]
	
		// 2. 3
			// 1. 프로그램 종료시 메모리 초기화 	
			// 3. 참조되지 않는 객체는 자동 소멸
			
		// 3. 2 [ 문자열 동일해도 객체가 다를 수 있기 때문에 ]

		// 4. 2 [ int[] array = {1, 2, 3 } ]
			// int 변수 ;
			// 변수 = 10
	
		// 5.  [ boolean	타입 배열의 초기값은 false ] 
	
		// 6. 3 / 5
			// 배열명.length : 행길이
			// 배열명[행].length : 해당 행의 열 길이
	
		// 7. [ 배열 내 모든 인덱스에 접근하기 위해서 for 활용 ]
		public static void main(String[] args) {
			
//			int max = 0;
//			int[] array = { 1, 5, 3, 8, 2};
//			
//			//작성위치
//			for ( int i = 0; i<array.length; i++) { // i는 인덱스 0부터 4까지 1씩 증가하면서 반복
//				if ( array[i] > max) max = array[i]; // i번째 인덱스 값이 max보다 크면 max에 i번째 인덱스 값
//			}
//			
//			System.out.println( "max: " + max);
			
//		// 8. [ 배열내 모든 인덱스에 접근하기 위해서 for 활용 ] 
//
//			int [][] array = {
//					{95, 86},
//					{83, 92, 96},
//					{78, 83, 93, 87, 88},
//			};
//			
//			
//		  	int sum = 0;
//		  	double avg = 0.0;
//			
//			// 작성위치
//
//		  	int count = 0 ; // 점수 개수 
//
//		  	// 행 반복문
//		  	for( int i = 0 ; i < array.length ; i++ ) {
//		  	// 열 반복문
//		  		for( int j = 0 ; j< array[j].length ; j++ ){
//		  			 			// 해당 인덱스 값 가져와서 sum 누적합계 더하기  
//		  				sum += array[i][j];
//		  		}
//		  		count += array[i].length;  // 2 + 3 + 5 
//		  	}
//		  	
//		  	avg = (double)sum / count; 	
//
//			System.out.println(" sum: " + sum);
//			System.out.println(" avg: " + avg);
			
		// 9.
			
			boolean run = true; // while 무한루프 제어 변수
			
			
			Scanner scanner = new Scanner(System.in); // 입력객체
			int studentNum = 0; // 학생수 -> 배열의 길이
			int[] scores = null; // 학생점수 배열 [ 초기화 값은 null 공백 ]
			
//			while (true) => 상수
			while (run) { // 무한루프 [ 5번입력하면 무한루프 종료 ]
				System.out.println( " ----------------------------------------------------- ");
				System.out.println( " 1. 학생수 │ 2. 점수입력 │ 3. 점수리스트 │ 4. 분석 │ 5. 종료 ");
				System.out.println( " ----------------------------------------------------- ");
				System.out.print(" 선택 > ");
				
				int selectNo = scanner.nextInt();
				
				if (selectNo == 1) {
					//작성위치					
					System.out.println( "학생수 입력 : "); studentNum = scanner.nextInt();
					scores = new int [studentNum]; // 입력받은 정수만틈 배열같이 할당 

				} else if (selectNo == 2) {
					// 작성위치
					for ( int i = 0; i < studentNum; i++) {
						System.out.print( "scores ["+i+"] : " ); 
						scores[i] = scanner.nextInt(); // 입력받은 값을 i번째에 저장 
					}
					
				} else if (selectNo == 3) {
					// 작성위치
					for( int i = 0 ; i<studentNum; i++ ) {
						System.out.println("scores[" + i + "] : " + scores[i] ); // i번째 인덱스 값 출력 
					}

				} else if (selectNo == 4)  {
					int max = 0;  int sum = 0 ; double avg = 0.0;
					
					for( int i = 0 ; i< studentNum ; i++ ) {
						if( scores[i] > max ) max = scores[i]; // i번째 인덱스 값이 max 보다 크면 max에 i번째 인덱스 값 넣기 
						sum += scores[i]; // i번째 인덱스 값을 sum 에 누적합계 
					}
					avg = (double)sum / studentNum ;
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
				}
				else if( selectNo == 5 ) { 
					run = false;
				} 
			}
			
			System.out.println( " 프로그램 종료 ");
			
			

		
		} // m e
} // c e
