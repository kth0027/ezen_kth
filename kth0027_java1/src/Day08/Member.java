package Day08;

import java.util.Scanner;

import Day08_1TF.Shop;

public class Member { // C S 회원 클래스 설계

// 1. 필드 [ 아이디, 비밀번호, 이름, 생년월일]
	private String m_아이디;
	private String m_비밀번호;
	private String m_이름;
	private String m_생년월일;

// 2. 생성자 [ 객체 생성시 필드의 초기값 ]

// -1. 회원가입시 생성되는 객체의 생성자
	public Member(String m_아이디, String m_비밀번호, String m_이름, String m_생년월일) {

		this.m_아이디 = m_아이디;
		this.m_비밀번호 = m_비밀번호;
		this.m_이름 = m_이름;
		this.m_생년월일 = m_생년월일;
	}

// 2. 빈 생성자
	public Member() {
	}

// 3. 메소드 [동작]

// -2. 회권가입 메소드 [ 입력받은 정보로 객체 생성하여 배열에 저장 ]
	public static boolean signup() {
		// --1. 입력 받기
		System.out.println(" <<<<<<<<<<<<< 회원가입 페이지 >>>>>>>>>>>>> ");
		System.out.println(" 아이디 : ");
		String m_아이디 = Shop.scanner.next();
		// 아이디 중복체크
		boolean check = idcheck(m_아이디);
		if (check) {
			System.out.println(" [[알림]] : 사용할 수 없는 아이디 입니다.");
			return false; // 회원가입 실패
		}

		System.out.println(" 비밀번호 : ");
		String m_비밀번호 = Shop.scanner.next();
		System.out.println(" 이름 : ");
		String m_이름 = Shop.scanner.next();
		System.out.println(" 생년월일(YY-MM-DD) : ");
		String m_생년월일 = Shop.scanner.next();

		// --2. 입력받은 정보로 객체 생성 [ 생성자 ]
		Member member = new Member(m_아이디, m_비밀번호, m_이름, m_생년월일);

		// 3. 만든 객체를 배열에 넣기 [ 빈공간을 찾아서 넣기 ]
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] == null) {
				Shop.members[i] = member;
				return true; // 회원가입 성공 // 반환값 : 회원가입성공/실패 => TRUE / FALSE
			}
		}
		return false; // 회원가입 실패 [ 빈공간이 없을경우 ]
	}

// -6. 아이디 중복 체크 메소드
	public static boolean idcheck(String check_id) {
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_아이디().equals(check_id)) {
				return true; // 인수와 동일한 아이디가 배열내 존재하면 true
			}
		}
		return false; // 배열내 동일한 값이 없을경우
	} // 회원가입 메소드 종료

// -3. 로그인 메소드
	public static String login() {

		// --1. 아이디 , 비밀번호 입력받기
		System.out.println(" <<<<<<<<<<<<< 로그인 페이지 >>>>>>>>>>>>> ");
		System.out.println(" 아이디 : ");
		String m_아이디 = Shop.scanner.next();
		System.out.println(" 비밀번호 : ");
		String m_비밀번호 = Shop.scanner.next();

		// --2. 배열내 존재하면 로그인 성공
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_아이디().equals(m_아이디)
					&& Shop.members[i].getM_비밀번호().equals(m_비밀번호)) {
				return m_아이디; // 로그인 성공시 성공한 아이디 반환
			}
		}
		return null; // 로그인 실패 // 반환값 : 로그인 성공시 => 성공한 아이디 / 실패시 null
	}

// -4. 아이디찾기 메소드 ( 이름, 생년월일 입력받아 => 아이다 찾기 )
	public static String findid() {
		// --1. 입력받기
		System.out.println(" <<<<<<<<<<<<< 아이디찾기 페이지 >>>>>>>>>>>>> ");
		System.out.println(" 이름 : ");
		String m_이름 = Shop.scanner.next();
		System.out.println(" 생년월일(YY-MM-DD) : ");
		String m_생년월일 = Shop.scanner.next();
		// --2. 배열내 동일한 정보의 객체 찾기
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_이름().equals(m_이름)
					&& Shop.members[i].getM_생년월일().equals(m_생년월일)) {
				return Shop.members[i].getM_아이디(); // 아이디 찾기 성공
			}
		}
		return null; // 반환값 : 찾았을경우 => 아이디 / 실패시 null

	}

// -5. 비밀번호찾기 메소드 ( 아이디 , 연락처 입력받아 => 비밀번호 알려주기 )
	public static String findpw() {

		// --1. 입력받기
		System.out.println(" <<<<<<<<<<<<< 비밀번호 찾기 페이지 >>>>>>>>>>>>> ");
		System.out.println(" 아이디 : ");
		String m_아이디 = Shop.scanner.next();
		System.out.println(" 생년월일 : ");
		String m_생년월일 = Shop.scanner.next();

		// --2. 배열내 동일한 정보의 객체 찾기
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_아이디().equals(m_아이디)
					&& Shop.members[i].getM_생년월일().equals(m_생년월일)) {
				return Shop.members[i].getM_비밀번호(); // 아이디 찾기 성공
			}
		}
		return null; // 반환값 : 찾았을경우 => 비밀번호 / 실패시 null
	}

// -1. 필드 private => get, set 메소드 사용
	public String getM_아이디() {
		return m_아이디;
	}

	public void setM_아이디(String m_아이디) {
		this.m_아이디 = m_아이디;
	}

	public String getM_비밀번호() {
		return m_비밀번호;
	}

	public void setM_비밀번호(String m_비밀번호) {
		this.m_비밀번호 = m_비밀번호;
	}

	public String getM_이름() {
		return m_이름;
	}

	public void setM_이름(String m_이름) {
		this.m_이름 = m_이름;
	}

	public String getM_생년월일() {
		return m_생년월일;
	}

	public void setM_생년월일(String m_생년월일) {
		this.m_생년월일 = m_생년월일;
	}
}