package Day03_제어문;

import java.util.Scanner;

public class Day03_3 {
	
	// if (논리제어) switch (데이터제어)
	// 경우의 수가 정혀져 있는 경우(논리 없이) => switch [속도빠름]
	// 경우의 수가 정혀져 있는 않는경우 => if
		/* 형태 : switch (key : 검사대상) {
					case 검사 : 실행문;
					case 검사 : 실행문;
					case 검사 : 실행문;
					default : 실행문;
				}
		 */

		// break : switch 혹은 반복문을 탈출 시 사용되는 키워드 - 가장 가까운 중괄호{} 탈출

public static void main(String[] args) { // m s
	
	Scanner 입력객체 = new Scanner(System.in);
	
	// 예1 )
	
	int 정수 = 80;
//	switch ( 정수 ) { // 정수는 검사!!!
//		// 점수가 90이편
//		case 90 : System.out.println( " A등급 입니다 "); break;
//		// 점수가 80이편
//		case 80 : System.out.println( " B등급 입니다 "); break;
//		// 점수가 70이편
//		case 70 : System.out.println( " C등급 입니다 "); break;
//		// 그외
//		default : System.out.println( " 탈락입니다 ");
//	} 
	
	//////////////////////////////////////////////////////////////
	
	//ex - if
	
	if ( 정수 == 90)	System.out.println(" A등급 입니다 ");
	else if ( 정수 == 80 ) System.out.println( " B등급 입니다 " );
	else if ( 정수 == 70 ) System.out.println( " C등급 입니다 " );
	else System.out.println( " 탈락입니다" );
	
	// 예2 )
//	int 버튼 = 3;
//	switch (버튼) {
//	case 1 : System.out.println( " 1층으로 이동 "); break;
//	case 2 : System.out.println( " 2층으로 이동 "); break;
//	case 3 : System.out.println( " 3층으로 이동 "); break;
//	default : System.out.println( " 정지 ");
//	}
	
	// p. 118 char switch문
	char grade = 'B';
	switch (grade) {
	case 'A' : 
	case 'a' : System.out.println("우수 회원입니다"); break;
	
	case 'B' : 
	case 'b' : System.out.println("일반 회원입니다"); break;
	
	default : System.out.println( "손님입니다");
	}
	

	// p. 119 String switch문
	
	String position = "과장";
	switch (position) {
		case "부장" : System.out.println("700만원"); break;
		case "과장" : System.out.println("500만원"); break;
		
		default : System.out.println( "300만원");
	}
	
	// 문제1 : [switch] 국어, 영어, 수학 점수 입력받아 평균이 90점 이상이면 "A등급" 80점 이상이면 "B" 나머지 탈락
	System.out.println("국어 점수 입력 : "); int 국어점수 = 입력객체.nextInt();
	System.out.println("영어 점수 입력 : "); int 영어점수 = 입력객체.nextInt();
	System.out.println("수학 점수 입력 : "); int 수학점수 = 입력객체.nextInt();
	int 평균 = ( 국어점수 + 영어점수 + 수학점수) / 3;
	
	switch (평균/10) {
			// 1의 자리 생략
		case 10 : 
		case 9 :	System.out.println( " A 등급"); break;
		case 8 :	System.out.println( " B 등급"); break;
		default : 	System.out.println(" 탈락 ");
	}
	
	
	
	
	




} // m e

}
