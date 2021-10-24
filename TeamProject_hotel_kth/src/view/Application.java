package view;

import java.util.Scanner;

import controller.MemberController;
import model.Member;

public class Application {

	// 0. 설정
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) { // M S

		// 0.프로그램 파일 로딩

		// 1. 프로그램 시작
		mainmenu();
	}// M E
	
	/////////////////////////////////////////////////////////////////////////////////////////
	// 1. 메인 메뉴 메소드
	private static void mainmenu() {

		while(true) { // 무한루프
			try {
				System.out.println("\n+++++++++++++ Main Menu ++++++++++++++");
				System.out.println("\t1.회원가입 \t2.로그인");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("선택 : ");		int ch = scanner.nextInt();
				
				if (ch == 1) {
					System.out.println("++++++++++++ 회원가입 페이지 ++++++++++++");
					// * 입력받기 -> 변수 저장 -> 변수가 여러개 -> 객체 -> 객체 여러개 -> 배열/컬렉션 담는다
					System.out.print(" Id[4글자이상] : "); 		String h_id = scanner.next();
					System.out.print(" Password[4글자만] : "); 	String h_pw = scanner.next();
					System.out.print(" name[2글자이상] : "); 		String h_name = scanner.next();
					System.out.print(" HP Number : "); 		String h_phone = scanner.next();
					// 4개 변수를 따로따로 저장하면 힘들어짐 => 4개 변수를 묶어줄 객체화
					Member member = new Member(h_id, h_pw, h_name, h_phone);
					
					// Controller 전달 [ 다른 클래스내 메소드 호출하는 방법 :  1.    2. 
					boolean result =  MemberController.signup(member);
					if(result) {
						System.err.println(" [알림] : 회원가입 성공 ");
					}else {
						System.err.println(" [알림] : 회원가입 실패 ");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
					
				} else if (ch == 2) {
					
					System.out.println("++++++++++++ 로그인 페이지 ++++++++++++");
					System.out.println("\t1.회원 \t2.관리자");
					System.out.print("선택 : ");		int ch1 = scanner.nextInt();
					if (ch1 == 1) {
						System.out.print(" Id : "); 		String h_id = scanner.next();
						System.out.print(" Password : "); 	String h_pw = scanner.next();
						
						boolean result  =  MemberController.login(h_id, h_pw);
						if( result ) {// 로그인 성공시 
							System.err.println(" [알림] : 로그인 성공 ");
							membermenu(h_id); // 회원메뉴 메소드 호출 ( 로그인 성공한 아이디를 인수로 전달 )
							
						}else {
							System.err.println(" [알림] : 로그인 실패 ( 동일한 회원정보가 없습니다 ) ");
						}
					} else if (ch1 == 2) {
						System.out.print(" Id : "); 		String h_id = scanner.next();
						System.out.print(" Password : "); 	String h_pw = scanner.next();}
				
					
					
					
				}
				
			} catch (Exception e) {
				System.err.println(" [알림] : 메뉴 페이지 오류 [ 관리자문의 ] ");
				scanner = new Scanner(System.in); // 입력객체 초기화
			}
		}
	} // 메인 메뉴메소드 종료
	/////////////////////////////////////////////////////////////////////////////////////////
	
	/////////////////////////////////////////////////////////////////////////////////////////
	// 2. 회원 메뉴 메소드
	public static void membermenu( String h_id ) {
		while(true) { // 무한루프
			try {
				System.out.println("\n+++++++++++++ 회원 페이지 ++++++++++++++");
				System.out.println("1.예약하기 2.예약정보 3.예약현황리스트 4.뒤로가기");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t 선택 : ");		int ch = scanner.nextInt();
			} catch (Exception e) {
			
			}
		}
	} // 회원메뉴 메소드
	
	// 3. 관리자 메뉴 메소드
	public static void admin_menu() {
		while(true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.예약현황리스트 | 2.회원정보조회 | 3.로그아웃 ");
			System.out.print("선택 : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {}
			if( ch == 2 ) {} 
			if( ch == 3 ) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
		}
	}
	
}
