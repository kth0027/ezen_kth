package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Member {

	// 1. 필드 - 아이디 , 비밀번호 , 이름 , 연락처
	private String h_id;
	private String h_pw;
	private String h_name;
	private String h_phone;

	// 2. 생성자
	public Member() {
	}

	public Member(String h_id, String h_pw, String h_name, String h_phone) {
		super();
		this.h_id = h_id;
		this.h_pw = h_pw;
		this.h_name = h_name;
		this.h_phone = h_phone;
	}

	// 3. 메소드

	// 1. 회원가입
	public static void signup() {

		// 1. 회원정보 입력
		System.out.println("------------------회원가입 페이지 ----------------");
		System.out.print(" 아이디 : ");
		String h_id = TestMain.scanner.next();
		System.out.print(" 비밀번호 : ");
		String h_pw = TestMain.scanner.next();
		System.out.print(" 성명 : ");
		String h_name = TestMain.scanner.next();
		System.out.print(" 연락처 : ");
		String h_phone = TestMain.scanner.next();

		// 2. 임시객체 생성
		Member members = new Member(h_id, h_pw, h_name, h_phone);

		// 아이디 중복체크
		boolean idcheck = true;
		for (Member temp : TestMain.members) {
			if (temp.getH_id().equals(h_id)) {
				System.out.println(" [[ 알림 ]] : 중복된 아이디 입니다 ");
				idcheck = false;
				break; // 회원가입 실패
			}
		}

		// 3. 만든 객체를 리스트에 넣기
		if (idcheck) {
			TestMain.members.add(members);
			System.out.println("[[ 알림 ]] : 회원가입이 되었습니다");

			// 4. 파일 저장
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(
						"C:/Users/ez201208/git/hotel-reservation-system/TeamProject/src/장용범/userlist.txt", true);

				// 필드간 구분 : [,] 회원간 구분 : [\n]
				String outstring = members.getH_id() + "," + members.getH_pw() + "," + members.getH_name() + ","
						+ members.getH_phone() + "\n";

				fileOutputStream.write(outstring.getBytes());
				System.out.println(" [[ 알림 ]] : 파일처리 성공 ");
			} catch (Exception e) {
				System.out.println(" [[ 알림 ]] : 파일처리 실패 ");
			}
		}

	}

	// 파일 불러오기
	public static void fileread() {
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/ez201208/git/ezen-education/java11/src/Day14/userlist.txt");
			// 1. 파일내 모든 글자 가져오기 [ 스트림 단위 : 바이트 ]
			// 1. 바이트배열 선언
			byte[] bytes = new byte[1024]; // 1bit -> 8bit -> 1byte -> 1024byte -> 1kbyte
			// 영문,공백,특수문자 1바이트 // 한글 2바이트
			// 2. 바이트 읽어오기
			fileInputStream.read(bytes);
			// 3. 바이트 -> 문자열 변화
			String inString = new String(bytes);

			// 2. 회원 구분하기
			String[] usernum = inString.split("\n");
			// split( 기준 ) 분리 => 배열
			// 3. 필드 구분하기
			for (String temp : usernum) {
				String[] userdata = temp.split(",");
				if (userdata.length == 1)
					break;
				// * 마지막 회원(공백회원) 제외
				// 4. 객체 생성
				Member members = new Member(userdata[0], userdata[1], userdata[2], userdata[3]);
				// 5. 리스트 담기
				TestMain.members.add(members);
			}
		} catch (Exception e) {
			System.out.println(" [[ 파일 불러오기 실패 ]]");
		}
	}

	// 2. 로그인

	// 3. 관리자로그인

	public String getH_id() {
		return h_id;
	}

	public void setH_id(String h_id) {
		this.h_id = h_id;
	}

	public String getH_pw() {
		return h_pw;
	}

	public void setH_pw(String h_pw) {
		this.h_pw = h_pw;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getH_phone() {
		return h_phone;
	}

	public void setH_phone(String h_phone) {
		this.h_phone = h_phone;
	}

}
