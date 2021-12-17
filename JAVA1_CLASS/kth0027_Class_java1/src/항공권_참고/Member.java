package 항공권_참고;


import java.util.Scanner;

public class Member {
   // 1. 필드 [ 아이디 , 비밀번호 , 이름 , 연락처 등등 ]
   private String t_id ;
   private String t_pw ;
   private String t_name;
   private String t_phone;
      
   // 2. 생성자 [ 객체 생성시 필드의 초기값 ]
      // 1. 회원가입시 생성되는 객체의 생성자 
   public Member(String t_id, String t_pw, String t_name, String t_phone) {
      this.t_id = t_id;
      this.t_pw = t_pw;
      this.t_name = t_name;
      this.t_phone = t_phone;
   }
      // 2. 빈 생성자 
   public Member() {}

   // 3. 메소드 [ 동작 ]
      // 2. 회원가입 메소드 [ 입력받은 정보로 객체 생성해서 배열에 저장 ]
   public static boolean signup() {
      // public : main이 속한 클래스 ( 외부클래스 ) 로 호출 하기 위해
      // 1. 입력받기 
      System.out.println("------------------회원가입 페이지 ----------------");
      System.out.println(" 아이디 : ");      String t_id = Main.scanner.next();
         // 아이디 중복체크 
         boolean check = idcheck(t_id);
         if( check ) {
            System.out.println(" [[ 알림 ]] : 사용할수 없는 아이디 입니다 ");
            return false; // 회원가입 실패  
         }
      System.out.println(" 비밀번호 : ");   String t_pw = Main.scanner.next();
      System.out.println(" 성명 : ");      String t_name = Main.scanner.next();
      System.out.println(" 연락처 : ");      String t_phone = Main.scanner.next();
      
      // 2. 입력받은 정보로 객체 생성 [ 생성자 ] 
      Member member = new Member(t_id, t_pw, t_name, t_phone);
      
      // 3. 만든 객체를 배열에 넣기 [ 빈공간을 찾아서 넣기 ]
      for( int i = 0 ; i < Main.members.length ; i ++ ) {
         if( Main.members[i] == null ) {
            Main.members[i] = member;
            return true;  // 회원가입 성공     // 반환값 : 회원가입성공/실패 => TRUE / FALSE
         }
      }
      return false; // 회원가입 실패  [ 빈공간이 없을경우 ]
   }
   // 6. 아이디 체크(중복체크) 메소드
   public static boolean idcheck( String check_id ) {
      for( int i = 0 ; i<Main.members.length; i++ ) {
         if( Main.members[i] != null && 
               Main.members[i].getT_id().equals(check_id) ) {
            return true; // 인수와 동일한 아이디가 배열내 존재하면 true 
         }
      }
      return false; // 배열내 동일한 값이 없을경우 
   }

   
   
      // 3. 로그인 메소드 [ 입력받은 아이디와 비밀번호가 배열내 존재하면 로그인 성공 아니면 실패 ]
   public static String login() {
      // 1. 아이디 , 비밀번호 입력받기
      System.out.println("------------------로그인 페이지 ----------------");
      System.out.println(" 아이디 : "); String t_id = Main.scanner.next();
      System.out.println(" 비밀번호 : "); String t_pw = Main.scanner.next();
      // 2. 배열내 존재하면 로그인 성공 
      for( int i = 0 ; i<Main.members.length ; i++ ) {
         if(Main.members[i] != null && 
               Main.members[i].getT_id().equals(t_id) && 
               Main.members[i].getT_pw().equals(t_pw) ) {
            return t_id; // 로그인 성공시 성공한 아이디 반환
         }
      }
      return null; // 로그인 실패  // 반환값 : 로그인 성공시 => 성공한 아이디 / 실패시 null
   }
      // 4. 아이디찾기 메소드 ( 이름 , 연락처 입력받아 => 아이디 알려주기 ) 
   public static String findid() {
      // 1. 입력받기 
      System.out.println("------------------아이디찾기 페이지 ----------------");
      System.out.println(" 성명 : "); String t_name = Main.scanner.next();
      System.out.println(" 연락처 : "); String t_phone = Main.scanner.next();
      // 2. 배열내 동일한 정보의 객체 찾기 
      for( int i = 0 ; i<Main.members.length ; i++ ) {
         if(Main.members[i] != null && 
               Main.members[i].getT_name().equals(t_name) && 
               Main.members[i].getT_phone().equals(t_phone) ){
            return Main.members[i].getT_id(); // 아이디 찾기 성공 
         }
      }
      return null;    // 반환값 : 찾았을경우 => 아이디 / 실패시 null
   }
      // 5. 비밀번호찾기 메소드 ( 아이디 , 연락처 입력받아 => 비밀번호 알려주기 )
   public static String findpw() {
      // 1. 입력받기 
      System.out.println("------------------비밀번호찾기 페이지 ----------------");
      System.out.println(" 아이디 : "); String t_id = Main.scanner.next();
      System.out.println(" 연락처 : "); String t_phone = Main.scanner.next();
      // 2. 배열내 동일한 정보의 객체 찾기 
      for( int i = 0 ; i<Main.members.length ; i++ ) {
         if(Main.members[i] != null && 
               Main.members[i].getT_id().equals(t_id) && 
               Main.members[i].getT_phone().equals(t_phone) ){
            return Main.members[i].getT_pw(); // 아이디 찾기 성공 
         }
      }
      return null;    // 반환값 : 찾았을경우 => 비밀번호 / 실패시 null
   }

      // 1. 필드를 private => get, set 메소드 사용 
   public String getT_id() {
      return t_id;
   }
   public void setT_id(String t_id) {
      this.t_id = t_id;
   }
   public String getT_pw() {
      return t_pw;
   }
   public void setT_pw(String t_pw) {
      this.t_pw = t_pw;
   }
   public String getT_name() {
      return t_name;
   }
   public void setM_name(String t_name) {
      this.t_name = t_name;
   }
   public String getT_phone() {
      return t_phone;
   }
   public void setT_phone(String t_phone) {
      this.t_phone = t_phone;
   }

}