package Day12_1_회원관리입력;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {

	// 1. 필드 [ 메모리 = 저장 ]
	private String id;
	private String name;
	private String password;
	private String phone;
	// private : 접근제한자 : 필드를 보호을 보호하기 위해 [ 다른 클래스에서 접근 불가 ]

	// 2. 생성자 자동생성
	// 2-1 빈 생성자
	public Member() {
	}

	// 2-2 모든 필드 받는 생성자
	public Member(String id, String name, String password, String phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	// 3. 메소드

	// 3-2. 로그인 메소드
	public void login() {

	}

	// 3-3. 회원가입 메소드
	public void signup() {

		// 0. 입력객체 가져오기
		Scanner scanner = Memberfile.scanner;

		// 1. 입력
		System.out.println(" *** 회원가입 페이지 *** ");
		System.out.println(" 아이디 : ");
		String id = scanner.next();
		System.out.println(" 비밀번호 : ");
		String password = scanner.next();
		System.out.println(" 이름 : ");
		String name = scanner.next();
		System.out.println(" 연락처 : ");
		String phone = scanner.next();

		// 2. 객체 생성
		Member member = new Member(id, password, name, phone);

		// * 배열에 저장
		for (int i = 0; i < Memberfile.members.length; i++) {
			if (Memberfile.members[i] == null) {
				Memberfile.members[i] = member;
				break;
			}
		}

		// 3. 파일 저장
		// 1. 회원별[\n] 필드별[ , ] 파일 저장

		// * 배열 내 모든 객체를 파일 처리

		// 1. 파일출력 객체
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:/Users/505/git/back_develop/JAVA(김태호)/src/Day12_1_회원관리입력/memberlist.txt", true); // 이어 쓰기
			// 2. 객체 내보내기 [ 필드 구분 ( \n: 회원구분 , : 필드구분 ]
			String outstring = member.id + "," + member.password + "," + member.name + "," + member.phone + "\n";
			fileOutputStream.write(outstring.getBytes()); // 바이트열 변환후 쓰기
		} catch (Exception e) {
			System.out.println(" [알림] : 회원 DB 저장 실패 : " + e);
		}
	}

	// 3-1. 메소드 자동생성 private 필드 사용시 get , set [ 외부 클래스가 접근 ]
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
