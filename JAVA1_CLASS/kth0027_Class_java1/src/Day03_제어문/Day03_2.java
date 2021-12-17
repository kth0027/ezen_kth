package Day03_제어문;

import java.util.Scanner;

public class Day03_2 { // c s
	
	public static void main(String[] args) {
		Scanner 입력객체 = new Scanner(System.in);
	
//	// 문제1 : 2개의 정수를 입력받아 더 큰수 출력
//		System.out.println( "문제1 정수입력1 : " ); int 문제1_1 = 입력객체.nextInt();
//		System.out.println( "문제1 정수입력2 : " ); int 문제1_2 = 입력객체.nextInt();
//		if ( 문제1_1 > 문제1_2 ) 		System.out.println( " 더 큰 수는 : " + 문제1_1 );
//		else if ( 문제1_1 < 문제1_2) 	System.out.println( " 더 큰 수는 : " + 문제1_2 );
//		else			 			System.out.println( " 두 수는 같다 ");
//
//	// 문제2 : 3개의 정수를 입력받아 가장 큰수 출력
//		System.out.println( "문제2 정수입력1 : " ); int 문제2_1 = 입력객체.nextInt();
//		System.out.println( "문제2 정수입력2 : " ); int 문제2_2 = 입력객체.nextInt();
//		System.out.println( "문제2 정수입력2 : " ); int 문제2_3 = 입력객체.nextInt();
//		
//		if ( 문제2_1 > 문제2_2 && 문제2_1 > 문제2_3 ) System.out.println( " 가장 큰 수는 :" + 문제2_1 );
//		else if ( 문제2_2 > 문제2_1 && 문제2_2 > 문제2_3 ) 	System.out.println( " 가장 큰 수는 :" + 문제2_2 );
//		else if ( 문제2_3 > 문제2_1 && 문제2_3 > 문제2_2 ) 	System.out.println( " 가장 큰 수는 :" + 문제2_3 );
//		else											System.out.println( " 세정수는 다 같다" );
		
		
//	// 문제3 : 4개의 정수를 입력받아 가장 큰수 출력
//		System.out.println( "문제3 정수입력1 : " ); int 문제3_1 = 입력객체.nextInt();
//		System.out.println( "문제3 정수입력2 : " ); int 문제3_2 = 입력객체.nextInt();
//		System.out.println( "문제3 정수입력3 : " ); int 문제3_3 = 입력객체.nextInt();
//		System.out.println( "문제3 정수입력4 : " ); int 문제3_4 = 입력객체.nextInt();
//		
//		//ex1
//		if ( 문제3_1 > 문제3_2 && 문제3_1 > 문제3_3 && 문제3_1 > 문제3_4)	System.out.println( " 가장 큰 수는 :" + 문제3_1 );
//		else if ( 문제3_2 > 문제3_1 && 문제3_2 > 문제3_3 && 문제3_2 > 문제3_4) 	System.out.println( " 가장 큰 수는 :" + 문제3_2 );
//		else if ( 문제3_3 > 문제3_1 && 문제3_3 > 문제3_2 && 문제3_3 > 문제3_4) 	System.out.println( " 가장 큰 수는 :" + 문제3_3 );
//		else if ( 문제3_4 > 문제3_1 && 문제3_4 > 문제3_2 && 문제3_4 > 문제3_3) 	System.out.println( " 가장 큰 수는 :" + 문제3_4 );
//		else														System.out.println( " 네정수는 다 같다" );
//		
//		//ex2
//		int 최대값 = 문제3_1; // max변수에 첫번째 값 넣기
//		
//		if ( 문제3_1 < 문제3_2) 최대값 = 문제3_2; // 만약에 max 변수에 있는 값 보다 크면 max값 변경
//		if ( 문제3_1 < 문제3_3) 최대값 = 문제3_3;
//		if ( 문제3_1 < 문제3_4) 최대값 = 문제3_4;
//		System.out.println( " 가장 큰 수는 : " + 최대값);
		
		
//	// 문제4 : 4개의 정수를 입력받아 오름차순으로 출력
//		System.out.println( "문제4 정수입력1 : " ); int 문제4_1 = 입력객체.nextInt();
//		System.out.println( "문제4 정수입력2 : " ); int 문제4_2 = 입력객체.nextInt();
//		System.out.println( "문제4 정수입력3 : " ); int 문제4_3 = 입력객체.nextInt();
//		System.out.println( "문제4 정수입력4 : " ); int 문제4_4 = 입력객체.nextInt();
//		
//		int temp; // 교환 시 사용되는 임시 변수
//		
//		if ( 문제4_1 > 문제4_2 ) {temp = 문제4_1; 문제4_1 = 문제4_2; 문제4_2 = temp;}
//		if ( 문제4_1 > 문제4_3 ) {temp = 문제4_1; 문제4_1 = 문제4_3; 문제4_3 = temp;}
//		if ( 문제4_1 > 문제4_4 ) {temp = 문제4_1; 문제4_1 = 문제4_4; 문제4_4 = temp;}
//		
//		if ( 문제4_2 > 문제4_3 ) {temp = 문제4_2; 문제4_2 = 문제4_3; 문제4_3 = temp;}
//		if ( 문제4_2 > 문제4_4 ) {temp = 문제4_2; 문제4_2 = 문제4_4; 문제4_4 = temp;}
//		
//		if ( 문제4_3 > 문제4_4 ) {temp = 문제4_3; 문제4_3 = 문제4_4; 문제4_4 = temp;}
//		
//		System.out.printf(" 오름차순 : %d %d %d %d \n", 문제4_1, 문제4_2, 문제4_3, 문제4_4);
		
		
//	// 문제5 : 4개의 정수를 입력받아 내림차순으로 출력
//		
//		System.out.println( "문제4 정수입력1 : " ); int 문제4_1 = 입력객체.nextInt();
//		System.out.println( "문제4 정수입력2 : " ); int 문제4_2 = 입력객체.nextInt();
//		System.out.println( "문제4 정수입력3 : " ); int 문제4_3 = 입력객체.nextInt();
//		System.out.println( "문제4 정수입력4 : " ); int 문제4_4 = 입력객체.nextInt();
//		
//		int temp; // 교환 시 사용되는 임시 변수
//		
//		if ( 문제4_1 < 문제4_2 ) {temp = 문제4_1; 문제4_1 = 문제4_2; 문제4_2 = temp;}
//		if ( 문제4_1 < 문제4_3 ) {temp = 문제4_1; 문제4_1 = 문제4_3; 문제4_3 = temp;}
//		if ( 문제4_1 < 문제4_4 ) {temp = 문제4_1; 문제4_1 = 문제4_4; 문제4_4 = temp;}
//		
//		if ( 문제4_2 < 문제4_3 ) {temp = 문제4_2; 문제4_2 = 문제4_3; 문제4_3 = temp;}
//		if ( 문제4_2 < 문제4_4 ) {temp = 문제4_2; 문제4_2 = 문제4_4; 문제4_4 = temp;}
//		
//		if ( 문제4_3 < 문제4_4 ) {temp = 문제4_3; 문제4_3 = 문제4_4; 문제4_4 = temp;}
//		
//		System.out.printf("내림차순 : %d %d %d %d \n", 문제4_1, 문제4_2, 문제4_3, 문제4_4);
		
		// 문제6 : 로그인페이지
					// [ 입력 ] : 아이디와 비밀번호를 입력받기 
					// [ 조건 ] : 회원아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력
		
		System.out.println( " ============ 로그인 페이지 ============== ");
		System.out.println( " 아이디 : "); String 아이디 = 입력객체.next();
		System.out.println( " 비밀번호 : "); int 비밀번호 = 입력객체.nextInt();
		
		if ( 아이디.equals("admin")) {
			// String 비교시 equals메소드 사용 // 아이디가 admin이면
			if ( 비밀번호 == 1234 ) {
				System.out.println( ">>>>> 로그인 성공 >>>>>>>" );
//				return; // 가장 가까운 함수(메소드)를 종료 -> 메인 종료
			} else {
				System.out.println( "[로그인실패] 패스워드가 다릅니다");
			}
		} else {
			System.out.println( " [로그인실패] 존재하지 않는 아이디입니다");
		}
		
		
		
		
		
	
	} // m e
} // c e

