package Final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);

//   public static ArrayList<Member> members = new ArrayList<>(); // user list
//   public static ArrayList<호텔Total> 호텔Totals = new ArrayList<>(); // 객실예약 list
//   public static 호텔Total[] 호텔Totals2 = new 호텔Total[100]; // 객실예약리스트(배열)

	public static void main(String[] args) {
      
   
      
      // 1. 인터페이스 생성
      호텔예약 호텔예약;
      
      while(true) {
         try {
         System.out.println("====== main menu======");
         System.out.println("1.회원가입 2.로그인 3.종료");
         System.out.print(">>> 선택 : "); int ch = scanner.nextInt();
            if (ch == 1) { // 회원가입

               System.out.println("++++++++++++ 회원가입 페이지 ++++++++++++");
               // * 입력받기 -> 변수 저장 -> 변수가 여러개 -> 객체 -> 객체 여러개 -> 배열/컬렉션 담는다
               System.out.print(" Id[4글자이상] : ");       String h_id = scanner.next();
               System.out.print(" Password[4글자만] : ");    String h_pw = scanner.next();
               System.out.print(" name[2글자이상] : ");       String h_name = scanner.next();
               System.out.print(" HP Number : ");       String h_phone = scanner.next();
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
            
               System.out.println("회원가입 완료");
         

            } else if(ch==2) {
               System.out.println("++++++++++++ 로그인 페이지 ++++++++++++");
               System.out.println("\t1.회원 \t2.관리자");
               System.out.print("선택 : ");      int ch4 = scanner.nextInt();
               if (ch4 == 1) { // 회원
                  System.out.print(" Id : ");       String h_id = scanner.next();
                  System.out.print(" Password : ");    String h_pw = scanner.next();
                  
                  boolean result  =  MemberController.login(h_id, h_pw);
                  if( result ) {// 로그인 성공시 
                     System.err.println(" [알림] : 로그인 성공 ");
                     
                     
                     while(true) {
                        System.out.println("1.예약등록 2.예약취소 3.본인예약조회 4.전체예약조회 5.객실세부정보");
                        System.out.print(">>> 선택 : "); int ch2 = scanner.nextInt();
                     
                        if (ch2 == 1) { // 예약등록
                           
                           System.out.println(">>호텔지점 선택<<");
                           System.out.println("1.호텔1 2.호텔2 3.호텔3"); int hotelch = TestMain.scanner.nextInt();
                           System.out.println(">>방 타입 선택<<");
                           System.out.println("1.스위트 2.디럭스 3.스탠다드"); int roomch = TestMain.scanner.nextInt();
                           
                           if (hotelch == 1) {
                              호텔예약 = new 호텔1();
                              if (roomch == 1) {
                                 호텔예약.예약등록(hotelch, roomch);
                              } else if (roomch == 2) {
                                 호텔예약.예약등록(hotelch, roomch);
                              } else if (roomch == 3) {
                                 호텔예약.예약등록(hotelch, roomch);
                              }
                           } else if (hotelch == 2) {
                              호텔예약 = new 호텔2();

아카, [25.10.21 15:09]
if (roomch == 1) {
                                 호텔예약.예약등록(hotelch, roomch);
                              } else if (roomch == 2) {
                                 호텔예약.예약등록(hotelch, roomch);
                              } else if (roomch == 3) {
                                 호텔예약.예약등록(hotelch, roomch);
                              }
                           } else if (hotelch == 3) {
                              호텔예약 = new 호텔3();
                              if (roomch == 1) {
                                 호텔예약.예약등록(hotelch, roomch);
                              } else if (roomch == 2) {
                                 호텔예약.예약등록(hotelch, roomch);
                              } else if (roomch == 3) {
                                 호텔예약.예약등록(hotelch, roomch);
                              }
                           }
                           
                        } else if (ch2 == 2) { // 예약취소
                           System.out.println(">>호텔지점 선택<<");
                           System.out.println("1.호텔1 2.호텔2 3.호텔3"); int hotelch = TestMain.scanner.nextInt();
                           System.out.println(">>방 타입 선택<<");
                           System.out.println("1.스위트 2.디럭스 3.스탠다드"); int roomch = TestMain.scanner.nextInt();
                           
                           if (hotelch == 1) {
                              호텔예약 = new 호텔1();
                              if (roomch == 1) {
                                 호텔예약.예약취소(hotelch, roomch);
                              } else if (roomch == 2) {
                                 호텔예약.예약취소(hotelch, roomch);
                              } else if (roomch == 3) {
                                 호텔예약.예약취소(hotelch, roomch);
                              }
                           } else if (hotelch == 2) {
                              호텔예약 = new 호텔2();
                              if (roomch == 1) {
                                 호텔예약.예약취소(hotelch, roomch);
                              } else if (roomch == 2) {
                                 호텔예약.예약취소(hotelch, roomch);
                              } else if (roomch == 3) {
                                 호텔예약.예약취소(hotelch, roomch);
                              }
                           } else if (hotelch == 3) {
                              호텔예약 = new 호텔3();
                              if (roomch == 1) {
                                 호텔예약.예약취소(hotelch, roomch);
                              } else if (roomch == 2) {
                                 호텔예약.예약취소(hotelch, roomch);
                              } else if (roomch == 3) {
                                 호텔예약.예약취소(hotelch, roomch);
                              }
                           }
                        } else if (ch2 == 3) { // 본인예약조회
                           호텔예약 = new 호텔1();   호텔예약.본인예약조회();
                           호텔예약 = new 호텔2();   호텔예약.본인예약조회();
                           호텔예약 = new 호텔3();   호텔예약.본인예약조회();
                        } else if (ch2 == 4) { // 전체예약현황조회
                           System.out.println("---------------------------------");
                           System.out.println("\t전체예약현황조회");
                           System.out.println("---------------------------------");
                           System.out.println("호텔\t스위트룸\t디럭스룸\t스탠다드룸");
                           System.out.println("---------------------------------");
                           호텔예약 = new 호텔1();   호텔예약.전체예약현황();
                           호텔예약 = new 호텔2();   호텔예약.전체예약현황();
                           호텔예약 = new 호텔3();   호텔예약.전체예약현황();
                           System.out.println("---------------------------------");
                        }else if (ch2==5) { 
                           System.out.println("방정보 : 1.스탠다드 2.디럭스 3.스위트");

아카, [25.10.21 15:09]
System.out.println(" 선택 : ");
                           int ch5 = scanner.nextInt();
                        
                              if(ch5==1) {신우현.호텔예약.스탠다드();}
                              else if(ch5==2) {신우현.호텔예약.디럭스();}
                              else if(ch5==3) {신우현.호텔예약.스위트();}
                              else{
                                 System.out.println("알 수 없는 행동");
                              }
                              
                              
                        } else {
                           System.out.println("알 수 없는 행동");
                        }
                        
                           
                     }
                     
                  }else {
                     System.err.println(" [알림] : 로그인 실패 ( 동일한 회원정보가 없습니다 ) ");
                  }
               } else if (ch4 == 2) { // 관리자
                  System.out.print(" Id : ");       String h_id = scanner.next();
                  System.out.print(" Password : ");    String h_pw = scanner.next();
                  if(h_id.equals("admin")) {
                     System.out.println(" 관리자가 로그인하셨습니다. ");
                     
                     
                  } else {
                     System.out.println(" 다시 입력해주세요.");
                     ch = scanner.nextInt();
                  }
               
               
               }
                  
               
            } else {
               System.out.println("종료"); break;
            }
               
         } catch (Exception e) {
            System.err.println(" [알림] : 메뉴 페이지 오류 [ 관리자문의 ] ");
            scanner = new Scanner(System.in); // 입력객체 초기화
            
         }
      
      }
               
   }

}