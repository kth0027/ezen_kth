package Reference;

import java.util.Scanner;

public class Main {
      //메인메뉴

      public static Member[] members = new Member[10];
      public static Ticket[] tickets = new Ticket[100]; 
      public static String cnt ; 
      
      // 0. 입력객체
      public static Scanner scanner = new Scanner(System.in);
      
      // mian 메소드=> 코드실행 시작지점 
      public static void main(String[] args) {
         main_menu(); // 메소드 호출 
      }
      
      // 1. 메인메뉴 메소드 
      public static void main_menu() {
         while(true) {
            System.out.println("\n\n ------------------ 로그인 페이지 -------------");
            System.out.println(" 1.로그인 | 2.회원가입 | 3.아이디찾기 | 4.비밀번호찾기 ");
            System.out.print(" >>> 선택 : ");   int ch = scanner.nextInt();
            if( ch == 1 ) {
               // 로그인 메소드 호출
               String loginid = Member.login();
                  // login 메소드의 반환값에 따른 제어
               // 1. 로그인 실패
               if( loginid ==null ) { System.out.println(" [[ 알림 ]] : 동일한 회원정보가 없습니다");}
               // 2. 관리자메뉴
               else if( loginid.equals("admin")) { admin_menu(loginid); }
               // 3.  일반회원메뉴
               else { member_menu( loginid ); }
                  
            }
            if( ch == 2 ) {
               // 회원가입 메소드 호출 
                  // 1. 다른클래스 메소드 호출 방법 
                     // 1. 객체생성후 객체로 부터 멤버 접근 
                        //Member member = new Member();
                        //member.login()
                     // 2. 해당 메소드 static
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
      // 2. 로그인시 메뉴 메소드  
      public static void member_menu( String loginid ) {
         Ticket ticket = new Ticket(); // 티켓 임시객체 : 메소드 호출용
         while(true) {
            System.out.println(" ---------- Ticket Menu ----------");
            System.out.println(" 1.여행지목록 | 2.예매등록 | 3.예매취소 | 4.로그아웃 ");
            System.out.print("선택 : ");   int ch = scanner.nextInt();
            if( ch == 1 ) { ticket.ticket_list(); }
            if( ch == 2 ) { ticket.ticket_rental( loginid ); } 
            if( ch == 3 ) { ticket.ticket_return( loginid ); }
            if( ch == 4 ) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
         }
      }
      
      // 3. 관리자 메뉴 메소드 
      public static void admin_menu(String loginid) {
         Ticket ticket = new Ticket(); 
         while(true) {
            System.out.println(" ---------- Admin Menu ----------");
            System.out.println(" 1.여행지등록 | 2.여행지현황 | 3.여행지취소 | 4.로그아웃 ");
            System.out.print("선택 : ");   int ch = scanner.nextInt();
            if( ch == 1 ) { ticket.ticket_add();}
            if( ch == 2 ) { ticket.ticket_list(); } 
            if( ch == 3 ) { ticket.ticket_return2(loginid); } 
            if( ch == 4) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
            
         }
      }
}
