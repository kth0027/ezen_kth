package Day01_출력입력;

import java.util.Scanner;

public class Day01_4 { // c s
	public static void main(String[] args) {
		//1. 입력객체 선언 [ 키보드로부터 입력값을 저장하는 객체]
		Scanner 입력객체 = new Scanner(System.in); 
		
		
		// 2. 입력받은 값 꺼내와서 저장상자 에 저장 
					// 변수는 값을 저장할수 있는 메모리[ 기억장치 ]
		System.out.println("첫번째 입력 : ");
		String 첫번째입력 = 입력객체.next();
		
		System.out.print("두번째 입력 : ");
		int 두번째입력 = 입력객체.nextInt();

		// 3. 변수 출력 
		System.out.println("첫번째 입력값은 : " + 첫번째입력);
		System.out.println("두번째 입력값은 : " + 두번째입력);
		
		// 문제1 
				/*
				 * 학생 한명의 이름과 1~3교시의 출석 여부를 입력받아 입력받은 값을 아래와 같이 출력
				 * 	// 4번째 입력 ---> 입력된 데이터 저장 => 변수,객체 
				 * 	/*  출력결과 
				 * 				[[ 출석부 ]]
				 * --------------------------------------
				 * 이름		1교시	2교시	3교시		비고
				 * 강호동		출석		결석		출석
				 * --------------------------------------
				 */

		// 입력받기
		System.out.println("학생명 입력 : "); String 이름 = 입력객체.next();
		System.out.println("1교시 출석 : "); String 교시_1 = 입력객체.next();
		System.out.println("2교시 출석 : "); String 교시_2 = 입력객체.next();
		System.out.println("3교시 출석 : "); String 교시_3 = 입력객체.next();
		
		// 출력하기
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("------------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("\t\t\t\t");
		System.out.println("------------------------------------------");
	
	}
	
	
} // c e
