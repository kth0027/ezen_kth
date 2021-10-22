package Day12_1_회원관리입력;

import java.util.Scanner;

import Day07.Book;
import Day07.Member;

public class Manager {
	// 0. 입력객체 선언
	static Scanner scanner = new Scanner(System.in);
	
	// 1. 객체 생성
	public static Member[] members = new Member[100];

	public static void main(String[] args) {
		main_menu(); // 메소드 호출
		}
	
	public static void main_menu() { // 1. 회언원가입

		
		while(true) {
			System.out.println("\n\n ------------------ 회원관리 프로그램 -------------");
			System.out.println(" 1.로그인 | 2.회원가입 ");
			System.out.print(" >>> 선택 : ");	 int ch = scanner.nextInt();

			if( ch == 1 ) {
				// 로그인 메소드 호출
				String loginid = Member.login();
					// login 메소드의 반환값에 따른 제어
				// 1. 로그인 실패
				if( loginid == null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
					
			}
			if( ch == 2 ) {
				// 회원가입 메소드 호출 
					// 1. 다른클래스 메소드 호출 방법 
						// 1. 객체생성후 객체로 부터 멤버 접근 
							//Member member = new Member();
							//member.login()
						// 2. 해당 메소드 static
				Member.signup();
				System.out.println("회원가입 되었습니다.");
			}
		}

	} // 1. 메소드 종료
	
	// 2. 로그인시 메뉴 메소드  
	public static void member_menu( String loginid ) {
		Member member = new Member();
		while(true) {
			System.out.println(" ---------- 회원메뉴 ----------");
			System.out.println(" 1.회원목록 | 2.로그아웃 ");
			System.out.print("선택 : ");	int ch = scanner.nextInt();
			if( ch == 1 ) { System.out.println(" ------ 회원목록입니다 ----- "); }
			if( ch == 2 ) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
		}
	}
		
		

		
	
	
	
	
	


}
