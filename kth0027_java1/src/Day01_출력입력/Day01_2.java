package Day01_출력입력;

public class Day01_2 { // c s
	//	System.out.print() // main 없이  실행 불가
	
	// main + ctrl + spacebar
	public static void main(String[] args) { // m s
		// 1. 출력
			// print(출력할 문구); : 출력
			// println(출력할 문구); : 출력후 줄바꿈 [라인 바꿈]
			// printf( 형식문자, 출력문구); : 형식문자 맞는출력
				// f : format : 모양 
				// 형식문자
					//%d : 정수 
					//%f : 실수
					//%s : 문자열
					//%c : 문자 
		
				// 제어문자 [ p.34 ]
				// \ : 엔터위에 원화기호 \
				// \n : 줄바꿈
				// \t : 탭 [ 들여쓰기 => 5칸 ]
				// \r : 줄바꿈
				// \\ : \출력
		

		
		
		
		

		
		// 예1 : syso + ctrl + spacebar
		System.out.print("Java");
		System.out.print(12345); // 기계어이기 때문에 문자처리x
		System.out.print("Java12345"); // 문자 + 숫자 => 문자

		// System : 미리 만들어진 시스템이라는 클래스

		// out : 출력 스토링
					// print(인수 : 출력하고 싶은말) : 출력 함수
					// . : 클래스내 엠버 (함수, 변수) 접근연산자 [특수문자]
					// " " : 키워드, [미리 작성된 단어], 변수 등 제외한 모든 문자에는 문자처리
		
		// ctrl + f11 : 컴파일
		
		//예제2
		System.out.println("Java");
		System.out.println(12345);
		System.out.println("Java12345");
		
		//예제3
		System.out.printf("%s" , "java");
		System.out.printf("%d" , 12345);
		System.out.printf("%s" , "java10");

		// printf 장점
//		System.out.printf("나이는 %d20 입니다");
		System.out.println("나이는" + 20 + "입니다");
			// + : 연결 연산자
		
		
		// 제어문자
		System.out.print("\njava\n");
		System.out.print("\t12345");
		System.out.print("\rjava10");
		
		// 문제1
		
		/* 출력결과
		 *			[[ 출석부 ]]
		 * ------------------------------
		 * 이름  		1교시  2교시  3교시  비고
		 * 강호동 	출석   결석   출석
		 * 유재석 	출석   결석   출석
		 * ------------------------------
		 * 
		 */
		
		
		System.out.println("\n\t\t[[출석부]]");
		System.out.println("------------------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println("강호동\t출석\t결석\t출석");
		System.out.println("유재석\t출석\t결석\t출석");
		System.out.println("------------------------------------------");
		
		// 문제2 : 고양이
		System.out.println("\\    /\\");
		System.out.println(" )  ( ^)");
		System.out.println("(  /   )");
		System.out.println(" \\(__)ㅣ");
		
		// 문제3 : 개
		System.out.println("");
		System.out.println("│\\_/│");
		System.out.println("│q p│   /)");
		System.out.println("( 0 )\"\"\"\\");	
		System.out.println("│\"^\"`   │");
		System.out.println("│_/=\\\\__│");
		
		
	} // m e
	
} // c e
