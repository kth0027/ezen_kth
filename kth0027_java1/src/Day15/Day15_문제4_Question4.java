package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_문제4_Question4 {

		// 문자4 : 스택구조를 이용한 문자열 역순 출력
			// 조건1 : 스택구조
			// 조건2 : 입력받은 문자열을 순서대로 스택에 저장
				// char // String
			// 조건3 : 문자열 반대로 출력
			// 출력 예시
				// 입력 : ABC
				// 출력 : CBA
	
	public static void main(String[] args) { // m s
	
		
		Scanner scanner = new Scanner(System.in);


		System.out.println("문자열 입력 : "); String str = scanner.next();
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i<str.length(); i++) {
			stack.push(str.charAt(i) );
		}
		
		StringBuilder strb = new StringBuilder();
		while (!stack.empty() ) {
			strb.append(stack.pop() );
		}
		System.out.println(strb);

		

//		// 0. 스텍 객체 선언
//		Stack<Character> stack = new Stack<Character>();
//		
//		// 1. 입력받기
//		System.out.println(" 문자열 입력 : "); String 문자열 = scanner.next();
//		
//		// 2. 문자열 내 문자 하나씩 스텍 저정
//		for (int i = 0; i<문자열.length(); i++) {
//			stack.push(문자열.charAt(i) );
//				// 문자열.charAt(인덱스) : 문자열 내 i
//				// 스택명.push(문자) : 해당문자 저장
//		}
//		
//		// 3. 꺼내기
//		for (int i = 0; i<문자열.length(); i++) {
//			System.out.print( stack.pop() );
//		}
//		
		
		
		
		
		
		
	
	} // m e
}
