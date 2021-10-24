package Day08_TF;

import java.util.Scanner;

import Day07.Member;

public class ShopApplication {

	public static Member[] members = new Member[100];
	public static Product[] products = new Product[100];

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n\n ------------------ 로그인 페이지 -------------");
			System.out.println("---------------------------------------------");
			System.out.println("1.로그인 | 2.회원가입 | 3.아이디찾기 | 4.비밀번호찾기 ");
			System.out.println("----------------------------------------------");
			System.out.println(" 선택 >>>>");
			int ch = scanner.nextInt();

			if (ch == 1) {
				// 로그인 메소드
				String loginid = Member.login();
				if (loginid == null) {
					System.out.println("동일한 회원정보가 없습니다");
				} else if (loginid.equals("admin")) {
					admin_menu();

				} else {
					member_menu(loginid);
				}

			}

			if (ch == 2) {// 회원가입 메소드
				Member.signup();
			}
			
			if( ch == 3 ) {
				// 아이디찾기 메소드 호출 
			 	String findid = Member.findid();
			 	if( findid == null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
			 	else {System.out.println(" [[ 회원님의 아이디는 "+findid+" ]] ");}
			}
			if( ch == 4 ) {
				// 비밀번호찾기 메소드 호출 
			 	String findpw = Member.findpw();
			 	if( findpw == null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
			 	else {System.out.println(" [[ 회원님의 비밀번호는 "+findpw+" ]] ");}
			 	
			}
		}



	}

	public static void member_menu(String loginid) {
		Product product = new Product();
		System.out.println("로그인");
		while (true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.상품목록 | 2.상품선택 | 3.환불 | 4.로그아웃 ");
			System.out.print("선택 : ");
			int ch = scanner.nextInt();

			if (ch == 1) {
				Product.product_list();
			}
			
			if( ch == 2 ) {
				System.out.println(" ---------- 상품선택 ---------- ");
				Product.product_list();
				System.out.println(" ---------------------------- ");
				System.out.println(" \n ");
				
		
			}
			if( ch == 3 ) { System.out.println(" [[ 알림 ]] : 환불신청 되었습니다 "); return; }
			
			if( ch == 4 ) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
		
		}
	}

	public static void admin_menu() {
		System.out.println("admin로그인");
		ShopApplication shop = new ShopApplication(); // Book 임시객체 : 메소드 호출용
		while (true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.상품등록 | 2.상품목록 | 3.로그아웃 ");
			System.out.print("선택 : ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				Product.shop_add();
			}
			if (ch == 2) {
				Product.product_list();
			}
			if (ch == 3) {
				System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 ");
				return;
			}
		}
	}

}