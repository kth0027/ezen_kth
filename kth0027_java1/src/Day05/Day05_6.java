package Day05;

public class Day05_6 {
	
	// 쇼핑몰의 회원 설계
		// 1. 필드 : 속성
			// 1. 아이디, 비밀번호, 이름, 연락처 등

		// 2. 메소드 : 동작
			// 1. 회원가입, 로그인, 회원탈퇴, 회원수
	
	// 객체 만들기
	public static void main(String[] args) {
		
		// 1. 객체 생성
		Member 객체1 = new Member ();
		// Member ㅣ 사용자만든 클래스
			// 객체1 : 클래스명 [아무거나]
				// new : 객체의 메모리할당 [메모리 할당시 무조건]
				// 예외 : 기본자료형 (미리 정해져 있기 때문에)
					// int 정수 = 10;
					// String 문자열 = "유재석" (영문 1바이트 / 한글 2바이트)
						// Member() : 객체  생성시 초기값
		// 2. 객체 내용물 넣기 [ . : 접근연산자 ]
			// 객체 내 필드에 접근해서 해당 필드에 값 넣기
			객체1.아이디 = "qwe"; 	객체1.비밀번호="qwe";
			객체1.이름 = "qwe"; 	객체1.연락처=12345;
			
		// 3. 객체 내용물 호출
			System.out.println( " 객체 : " + 객체1 );
			System.out.println( " 객체내 필드 => 아이디 : " + 객체1.아이디 );
			System.out.println( " 객체내 필드 => 비밀번호 : " + 객체1.비밀번호 );
			System.out.println( " 객체내 필드 => 이름 : " + 객체1.이름 );
			System.out.println( " 객체내 필드 => 연락처 : " + 객체1.연락처 );
			
		
	}

}

