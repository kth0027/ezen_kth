package 항공권_참고;



public class Ticket {
   // 1. 필드 [ 목적지, 자리, 가격, 시간 ]
      private String t_목적지;
      private String t_자리;
      private String t_가격;
      private String t_시간;
      private boolean t_rental;
      private String t_id;
      // 2. 생성자
         // 1. 목적지 자리 가격 출발시간 도착시간 [ 모든 필드 ]

      public Ticket(String t_목적지, String t_자리, String t_가격, String t_시간, boolean t_rental, String t_id) {
         this.t_목적지 = t_목적지;
         this.t_자리 = t_자리;
         this.t_가격 = t_가격;
         this.t_시간 = t_시간;
         this.t_rental = t_rental;
      }
          // 2. 빈생성자 [ 필드X ]
      public Ticket() {
         // TODO Auto-generated constructor stub
      }
      
      
      // 3. 메소드
         // 2. 여행 관리자 등록 메소드 
      public boolean ticket_add() {
         // 1. 입력받기 
         System.out.println("------------------목적지 등록 페이지 ----------------");
         System.out.println(" 목적지 입력 : ");   String t_목적지 = Main.scanner.next();
            // 중복체크 
            boolean check = ticketcheck(t_목적지);
            if( check ) {
               System.out.println(" [[ 알림 ]] : 이미 목적지가 존재합니다. ");
               return false;
            }
         System.out.println(" 자리 입력 : ");   String t_자리 = Main.scanner.next();
         System.out.println(" 가격 입력 : ");   String t_가격 = Main.scanner.next();
         System.out.println(" 시간 입력 : ");   String t_시간 = Main.scanner.next();
         
         
         // 2. 객체 생성      // 자리 초기값 => true       // 회원 초기값 => null
         Ticket ticket = new Ticket(t_목적지, t_자리,t_가격, t_시간, true , null);
         // 3. 객체 배열저장 
         for( int i = 0 ; i< Main.tickets.length ; i++ ) {
            if( Main.tickets[i] == null ) { 
               Main.tickets[i] = ticket ; return true; }
         }
         return false;
      }
      // 6. 자리 체크 메소드 [ 체크할 대상을 인수로 받아서 배열내 존재하면 true 아니면 false ]
      public boolean ticketcheck( String check_isbn ) {
         for( int i = 0 ; i< Main.tickets.length ; i++ ) {
            if( Main.tickets[i] != null && 
                  Main.tickets[i].getT_목적지().equals(check_isbn) ) {
               return true;
            }
         }
         return false;
      }
      
      
         // 3. 예매 목록 메소드 
      public void ticket_list() {
         System.out.println("------------------여행 예매 페이지 ----------------");
         System.out.println("목적지\t자리\t가격\t시간\t자리여부\t예매회원");
         
         for( int i = 0 ; i< Main.tickets.length ; i++ ) {
            if( Main.tickets[i] == null ) return;
            Ticket ticket = Main.tickets[i];

            
            System.out.println( ticket.getT_목적지()+"\t"+ticket.getT_자리()
               +"\t"+ticket.getT_가격()+"\t"+ticket.getT_시간() + "\t" + ticket.getT_rental()+"\t" + ticket.t_id );
         }
         return;
      }
         // 4. 예매 등록 메소드 
      public boolean ticket_rental( String loginid ) {
         System.out.println("------------------예매 페이지 ----------------");
         System.out.println(" 목적지를 입력하세요 : ");   String t_목적지 = Main.scanner.next();
            // 목적지 존재여부 체크 
         boolean check = ticketcheck(t_목적지);
         if( check ) {
            
            for( int i = 0 ; i<Main.tickets.length ;i++ ) {
               if( Main.tickets[i] != null && 
                     Main.tickets[i].getT_목적지().equals(t_목적지)) { // 동일한 목적지가 존재하면
                  // 예매여부 확인 
                  if( Main.tickets[i].getT_rental() ) {
                     System.out.println(" [[ 알림 ]] : " + t_목적지 +" 예매 성공"  );
                     // 1. 예매여부 true => false
                     Main.tickets[i].setT_rental(false);
                     // 2. 예매성공시 예매회원에 현재 로그인된 아이디 대입 
                     Main.tickets[i].setT_id(loginid);
                     // 3. 예매 성공시 자리 인원 카운트 하기 
                     Main.cnt = Main.tickets[i].getT_자리();
                     int t_cnt = Integer.parseInt(Main.cnt);
                     t_cnt--;
                     Main.tickets[i].setT_자리(Integer.toString(t_cnt));
                     
                     
                     return true;
                  }
                  else { System.out.println(" [[ 알림 ]] : 현재 예매불가!!!"); return false; }
               }
            }   
         }else {
            System.out.println("[[알림]] : 목적지명이 다릅니다.");
            return false;
         }
         return false;
      }
         // 5. 예매취소 메소드 
      public boolean ticket_return( String loginid ) {
      
         System.out.println("------------------여행 취소 페이지 ----------------");
         System.out.println(" 취소할 여행지 : ");   String t_목적지 = Main.scanner.next();
         
         // 1.예약중인 목적지들 찾기 
         for( int i = 0 ; i< Main.tickets.length ; i++) {
            if( Main.tickets[i] !=null && !Main.tickets[i].getT_rental() ) {
               // ! : 부정 ( true => false )
               // 2.입력받은 목적지 
               if( Main.tickets[i].getT_목적지().equals(t_목적지) ) {
                  // 3.일반 회원 == 로그인된 예매 회원
                  if( Main.tickets[i].getT_id().equals( loginid ) ) {
                     System.out.println(" [[ 알림 ]] : 여행 취소 성공 !!! ");
                     Main.tickets[i].setT_id(null); 
                     Main.tickets[i].setT_rental(true); 
                     
                     Main.cnt = Main.tickets[i].getT_자리();
                     int t_cnt = Integer.parseInt(Main.cnt);
                     t_cnt++;
                     Main.tickets[i].setT_자리(Integer.toString(t_cnt));
                     return true;
                  }
               }
            }
         }
         System.out.println(" [[ 알림 ]] : 목적지가 일치하지 않습니다. "  );
         return true;
      }
      // 관리자 여행취소 
      public boolean ticket_return2( String loginid ) {
         
         System.out.println("------------------여행 취소 페이지 ----------------");
         System.out.println(" 취소할 여행지 : ");   String t_목적지 = Main.scanner.next();
         
          
         for( int i = 0 ; i< Main.tickets.length ; i++) {
            if( Main.tickets[i] !=null && Main.tickets[i].getT_rental() ) {
               
               if( Main.tickets[i].getT_목적지().equals(t_목적지) ) {
                  
                  
                  System.out.println(" [[ 알림 ]] : 여행 취소 성공 !!! ");
                  Main.tickets[i].setT_목적지(null); 
                  Main.tickets[i].setT_자리(null); 
                  Main.tickets[i].setT_가격(null); 
                  Main.tickets[i].setT_시간(null); 
                  Main.tickets[i].setT_rental(false); 
                  Main.tickets[i].setT_id(null);
                  return true;
                  
               }
            }
         }
         System.out.println(" [[ 알림 ]] : 목적지가 일치하지 않습니다."  );
         return true;
      }
      
      public String getT_목적지() {
         return t_목적지;
      }
      public void setT_목적지(String t_목적지) {
         this.t_목적지 = t_목적지;
      }
      public String getT_자리() {
         return t_자리;
      }
      public void setT_자리(String t_자리) {
         this.t_자리 = t_자리;
      }
      public String getT_가격() {
         return t_가격;
      }
      public void setT_가격(String t_가격) {
         this.t_가격 = t_가격;
      }
      public String getT_시간() {
         return t_시간;
      }
      public void setT_시간(String t_시간) {
         this.t_시간 = t_시간;
      }
      public boolean getT_rental() {
         return t_rental;
      }
      public void setT_rental(boolean t_rental) {
         this.t_rental = t_rental;
      }
      public String getT_id() {
         return t_id;
      }
      public void setT_id(String t_id) {
         this.t_id = t_id;
      }

      
         
      
      
}
