package Day02_변수연산자;

import java.util.Scanner;

public class Day02_4 {
	
	public static void main(String[] args) {
		
		Scanner 입력객체 = new Scanner(System.in);
		
//		// 문제1 : 급여 명세서 
//				/*
//				 * [조건] 입력받기 : 기본급 , 수당 
//				 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
//				 * 
//				 */
//		
//		//문제1 풀이
//		
//			// 1. 입력객체 선언 = Scanner 클래스를 이용한 객체 선언
//			//			Scanner 입력객체 = new Scanner(System.in);
//		
//			// 2. 입력객체에 저장된 값을 변수로 옮기기
//			System.out.println( " 기본급 : "); int 기본급 = 입력객체.nextInt();
//			System.out.println( " 수당 : "); int 수당 = 입력객체.nextInt();
//		
//			// 3. 계산
//				// 100% -> 1		10% ->0.1	1%->0.01
//			int 세금 = (int) (기본급 * 0.1); // int * double
//		
//			//	double 세금 = 기본급 * 0.1; // 소수점 
//			System.out.println( " 실수령액 : " + (기본급 + 수당-세금) );
//		
//		
//				
//				// 문제2 : 지폐 개수 세기 
//				/*
//				 * [조건] : 십만원 단위의 금액을 입력받아
//				 * [출력] : 입력받은 금액의 지폐수 세기 
//				 * [출력 예 ] : 356789  
//				 * 		십만원 : 3장 
//				 *		만원 : 5장 
//				 * 		천원 : 6장 
//				 * 		백원 : 7개
//				 */
//
//		//문제2 풀이
//		
//			// 1. 지폐 입력받기
//			System.out.println(  " 금액 : "); int 금액 = 입력객체.nextInt();
//		
//			// 1-1. 십만원권
//			System.out.println( " 십만원 " + (금액/100000) + "장" );
//			//금액 = 금액 - (금액/100000) * 100000;
//				금액 -= (금액/100000) * 100000; // 십만원 단위 제거
//			
//			// 1-2. 만원권
//			System.out.println( " 만원 : " + (금액/10000) + "장" );
//				금액 -= (금액/10000) * 10000; // 만원 단위 제거
//			
//			// 1-3. 천원권
//			System.out.println( " 천원 : " + (금액/1000) + "장" );
//				금액 -= (금액/1000) * 1000; // 천원 단위 제거
//			
//			// 1-4. 백원
//			System.out.println( " 백원 " + (금액/100) + "장");
			
		 

			
			

//			//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
//			
//			System.out.println( " 문제3 정수입력 "); int 문제3 = 입력객체.nextInt();
//			// * 배수찾기
//				// 값 % 수 == 0 나머지가 0이면 값은 그 수의 배수
//			System.out.println( " 7의 배수?" + (문제3%7 ==0) );
//			
//
//			//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
//			
//			System.out.println( " 문제4 정수입력 "); int 문제4 = 입력객체.nextInt();
//			// *홀수찾기
//				// 값 % 2 == 1	나누기 2를 하였을 때 나머지가 0이면 값은 짝수 1이면 홀수
//			System.out.println( " 홀수?"  + (문제4%2 == 1) );
			
				

//			//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
//			System.out.println( " 문제5 정수입력"); int 문제5 = 입력객체.nextInt();
//			System.out.println( " 7의배수 and 짝수 : " + (문제5%7 == 0 && 문제5%2 == 0) );
			
			

				
//			//문제6 : 두개의 정수를 입력받아10 더 큰지 출력  [ true , false ]
//			System.out.println( " 문제6 정수1 입력 : " ); int 문제6_1 = 입력객체.nextInt();
//			System.out.println( " 문제6 정수2 입력 : " ); int 문제6_2 = 입력객체.nextInt();
//			System.out.println( " 정수1 > 정수2 크다 : " + (문제6_1>문제6_2) );
				
				
//			//문제7 : 반지름을 입력받아 원 넓이 출력하기 
//					// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
//			System.out.println( " 문제7 반지름 입력 : " );	double 반지름 = 입력객체.nextDouble();
//			System.out.println( " 원의 넓이는 : " + (반지름*반지름*3.14) );
				
				
//			//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
//					// 예) 54.5   84.3 이면    64.285714%
//			System.out.println( " 문제8 실수1 입력 : "); double 문제8_1 = 입력객체.nextDouble();
//			System.out.println( " 문제8 실수2 입력 : "); double 문제8_2 = 입력객체.nextDouble();
//			
//			double 비율 = (문제8_1/문제8_2) * 100;
//			System.out.println(" 실수1의 실수2의 백분율 : " + 비율 + "%" );
//			// 소수점 단위의 형식 변경
//			System.out.print(" 실수1의 실수2의 백분율 :%.2f%%" , 비율 );
//				// 형식문자 : %f [ 실수 ] 
//				// %.숫자f [ 숫자 : 소수점 자리수 ]
//				// %.2f [ 소수점 2자리수 ]
			
				
//			//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
//					//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
//			System.out.print(" 문제9의 윗변 : "); double 문제9_1 = 입력객체.nextDouble();
//			System.out.print(" 문제9의 아랫변 : "); double 문제9_2 = 입력객체.nextDouble();
//			System.out.println(" 문제9의 높이 : "); double 문제9_3 = 입력객체.nextDouble();
//			
//			System.out.printf(" 사다리꼴의 넓이는 : %.2f \n", ((문제9_1 * 문제9_2) * 문제9_3/2));
				
				
//			//문제10: 키를 정수를 입력받아 표준체중 출력하기
//					//표준체중 계산식 = > (키 - 100) * 0.9
//			System.out.print( " 문제10의 키 입력 : "); double 키 = 입력객체.nextDouble();
//			System.out.println( " 표춘체중 계산식 : " + (키-100)*0.9 );
				
				
//			//문제11: 키와 몸무게를 입력받아 BMI 출력하기
//					//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
//		
//			System.out.print( " 문제11의 키 입력 : "); double 키 = 입력객체.nextDouble();
//			System.out.print( " 문제11의 몸무게 입력 : "); double 몸무게 = 입력객체.nextDouble();
//			System.out.printf( " BNI 계산식 : %.1f \n" , (몸무게/ ((키/100)*(키/100))) );
				
				
//			//문제12: inch 를 입력받아 cm 로 변환하기
//			System.out.println( "문제12의 inch 입력 : "); double 인치 = 입력객체.nextDouble();
//			System.out.println( " inch => cm 변환값은 : " + (인치 * 2.54) + "cm" );
				
				
			//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
					//소수 둘째 자리 까지 점수 출력하기
					//중간고사 반영비율 => 30 %
					//기말고사 반영비율 => 30 %
					//수행평가 반영비율 => 40 %
		
//			System.out.print( " 문제13의 중간고사 입력 : "); double 중간고사 = 입력객체.nextDouble();
//			System.out.print( " 문제13의 기말고사 입력 : "); double 기말고사 = 입력객체.nextDouble();
//			System.out.print( " 문제13의 수행평가 입력 : "); double 수행평가 = 입력객체.nextDouble();
//			중간고사 *= 0.3; 기말고사 *= 0.3; 수행평가 *= 0.4;
//			System.out.printf( " 전체 반영비율 점수 : %.2f \n", (중간고사 + 기말고사 + 수행평가) );
			
			
				
				
			//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
				 	//int x = 10;
					//int y = x-- + 5 + --x;
					//printf(" x의 값 : %d , y의값 :  %d ", x, y)
			
					// 1. x-- + 5 	=> 10 + 5 : 15
					// 2. x--		=> 10 -> 9
					// 3. --x		=> 9 -> 8
					// 4. 15 + 8 	=> 23
	}

	
		
		
			
			
						
			
		
		
		
	
}
