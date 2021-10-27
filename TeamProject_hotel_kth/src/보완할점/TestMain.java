package 보완할점;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import 신우현.File;
import 신우현.FileThread;
import 신우현.Member;
import 신우현.MemberController;
import 신우현.호텔1;
import 신우현.호텔2;
import 신우현.호텔3;
import 신우현.호텔예약;

public class TestMain {

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);

	public static ArrayList< 호텔Total > 호텔리스트 = new ArrayList<>();

	public static void main(String[] args) {
		
		// 호텔 세팅 
		호텔Total 호텔1 = new 호텔Total("신라호텔");호텔Total 호텔2 = new 호텔Total("라마다호텔");호텔Total 호텔3 = new 호텔Total("그랜드호텔");
		호텔리스트.add(호텔1); 호텔리스트.add(호텔2); 호텔리스트.add(호텔3);
		
		// 룸 세팅 
		호텔1.roomlist.add( new rooms("스위트") );
		호텔1.roomlist.add( new rooms("디럭스") );
		호텔1.roomlist.add( new rooms("스탠다드") );
		
		호텔2.roomlist.add( new rooms("스위트") );
		호텔2.roomlist.add( new rooms("디럭스") );
		호텔2.roomlist.add( new rooms("스탠다드") );
		
		호텔3.roomlist.add( new rooms("스위트") );
		호텔3.roomlist.add( new rooms("디럭스") );
		호텔3.roomlist.add( new rooms("스탠다드") );
		
		for( 호텔Total total : 호텔리스트 ) {
			for( rooms rooms : total.roomlist ) {
				System.out.println( "호텔명 : " +  total.호텔명  + " / "+  rooms.get방타입() + " : " + rooms.get예약자ID() );
			}
		}
		
		// 스레드 시작
		FileThread fileThread = new FileThread();
		fileThread.start();

		File.fileload(1);

		// 1. 인터페이스 생성
		호텔예약 호텔예약;

		while (true) {
			try {
				System.out.println(" ======================== 호텔예약시스템 ======================== ");
				System.out.println(" ========================= main menu ========================= ");
				System.out.println("\t1.회원가입\t2.로그인\t\t3.종료");
				System.out.println(" ========================================================= ");
				System.out.print(">>> 선택 : ");

				int ch = scanner.nextInt();
				if (ch == 1) { // 회원가입

					System.out.println(" ======================== 회원가입 페이지 ======================== ");
					// * 입력받기 -> 변수 저장 -> 변수가 여러개 -> 객체 -> 객체 여러개 -> 배열/컬렉션 담는다
					System.out.print(" Id[4글자이상] : ");
					String h_id = scanner.next();
					System.out.print(" Password[4글자만] : ");
					String h_pw = scanner.next();
					System.out.print(" name[2글자이상] : ");
					String h_name = scanner.next();
					System.out.print(" HP Number : ");
					String h_phone = scanner.next();
					// 4개 변수를 따로따로 저장하면 힘들어짐 => 4개 변수를 묶어줄 객체화
					Member member = new Member(h_id, h_pw, h_name, h_phone);

					// Controller 전달 [ 다른 클래스내 메소드 호출하는 방법 : 1. 2.
					boolean result = MemberController.signup(member);
					if (result) {
						System.err.println(" [알림] : 회원가입 성공 ");
					} else {
						System.err.println(" [알림] : 회원가입 실패 ");
					}

				} else if (ch == 2) {
					System.out.println(" ======================== 로그인 페이지 ======================== ");
					System.out.println("\t\t1.회원 \t\t2.관리자");
					System.out.println(" ========================================================= ");
					System.out.print("선택 : ");
					int ch1 = scanner.nextInt();

					if (ch1 == 1) { // 회원
						System.out.println(" ========================================================= ");
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();

						boolean result = MemberController.login(h_id, h_pw);
						if (result) {// 로그인 성공시
							System.err.println(" [알림] : 로그인 성공 ");

							while (true) {
								System.out.println(" ========================================================= ");
								System.out.println("1.예약등록 2.예약취소 3.본인예약조회\n4.전체예약조회 5.객실세부정보 6.뒤로가기");
								System.out.println(" ========================================================= ");
								System.out.print(">>> 선택 : ");
								int ch2 = scanner.nextInt();

								if (ch2 == 1) { // 예약등록
									System.out.println(" ========================================================= ");
									System.out.println(">>호텔지점 선택<<");
									System.out.println("1.신라호텔 2.라마다호텔 3.그랜드호텔");
									int hotelch = TestMain.scanner.nextInt();
									System.out.println(" ========================================================= ");
									System.out.println(">>방 타입 선택<<");
									System.out.println("1.스위트 2.디럭스 3.스탠다드");
									int roomch = TestMain.scanner.nextInt();

									if (hotelch == 1) {
										호텔예약 = new 호텔1();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												호텔예약.예약등록(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 2) {
										호텔예약 = new 호텔2();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												호텔예약.예약등록(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 3) {
										호텔예약 = new 호텔3();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												호텔예약.예약등록(hotelch, roomch, h_id);
											}
										}
									} else {
										System.err.println(" 잘못된 입력번호입니다. 번호를 다시 선택해주세요. ");
									}

								} else if (ch2 == 2) { // 예약취소
									System.out.println(" ========================================================= ");
									System.out.println(">>호텔지점 선택<<");
									System.out.println("1.신라호텔 2.라마다호텔 3.그랜드호텔");
									int hotelch = TestMain.scanner.nextInt();
									System.out.println(" ========================================================= ");
									System.out.println(">>방 타입 선택<<");
									System.out.println("1.스위트 2.디럭스 3.스탠다드");
									int roomch = TestMain.scanner.nextInt();
									if (hotelch == 1) {
										호텔예약 = new 호텔1();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												호텔예약.예약취소(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 2) {
										호텔예약 = new 호텔2();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												호텔예약.예약취소(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 3) {
										호텔예약 = new 호텔3();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												호텔예약.예약취소(hotelch, roomch, h_id);
											}
										}
									} else {
										System.err.println("  잘못된 입력번호입니다. 번호를 다시 선택해주세요. ");
									}

								} else if (ch2 == 3) { // 본인예약조회
									System.out.println(" ========================================================= ");
									System.out.println("\t\t\t본인예약현황조회");
									System.out.println(" ========================================================= ");
									호텔예약 = new 호텔1();	호텔예약.본인예약조회(h_id);
									호텔예약 = new 호텔2();	호텔예약.본인예약조회(h_id);
									호텔예약 = new 호텔3();	호텔예약.본인예약조회(h_id);
									System.out.println(" ========================================================= ");
								} else if (ch2 == 4) { // 전체예약현황조회
									System.out.println(" ========================================================= ");
									System.out.println("\t\t\t전체예약현황조회");
									System.out.println(" ========================================================= ");
									System.out.println("호텔\t\t스위트룸\t\t디럭스룸\t\t스탠다드룸");
									System.out.println(" ========================================================= ");
									호텔예약 = new 호텔1();	호텔예약.전체예약현황_회원();
									호텔예약 = new 호텔2();	호텔예약.전체예약현황_회원();
									호텔예약 = new 호텔3();	호텔예약.전체예약현황_회원();
									System.out.println(" ========================================================= ");
								} else if (ch2 == 5) { // 방정보
									System.out.println(" ========================================================= ");
									System.out.println(" 방정보 : 1.스탠다드 2.디럭스 3.스위트 ");
									System.out.println(">>> 선택 : ");
									int ch3 = scanner.nextInt();

									if (ch3 == 1) {
										Room.스탠다드();
									} else if (ch3 == 2) {
										Room.디럭스();
									} else if (ch3 == 3) {
										Room.스위트();
									} else {
										System.err.println(" 방을 다시 선택해주세요. ");
										ch3 = scanner.nextInt();
									}
								} else if (ch2 == 6) {
									break;

								} else {
									System.err.println(" 번호를 다시 선택해주세요. ");
									ch2 = scanner.nextInt();
								}

							}

						} else { // 로그인 실패시
							System.err.println(" 아이디를 다시 입력해주세요. ");
						}
					} else if (ch1 == 2) { // 관리자
						System.out.println(" ========================================================= ");
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");

						String h_pw = scanner.next();
						System.out.println(" ========================================================= ");
						if (h_id.equals("admin")) {
							System.err.println(" 관리자가 로그인하셨습니다. ");
							while (true) {
								System.out.println(" ========================================================= ");
								System.out.println("\t1.예약현황\t2.회원정보\t3.뒤로가기");
								System.out.println(" ========================================================= ");
								System.out.print(">>> 선택 : ");
								int ch3 = scanner.nextInt();
								if (ch3 == 1) {
									System.out.println(" ========================================================= ");
									System.out.println("\t\t\t전체예약현황조회");
									System.out.println(" ========================================================= ");
									System.out.println("호텔\t\t스위트룸\t\t디럭스룸\t\t스탠다드룸");
									System.out.println(" ========================================================= ");
									호텔예약 = new 호텔1();	호텔예약.전체예약현황_관리자();
									호텔예약 = new 호텔2();	호텔예약.전체예약현황_관리자();
									호텔예약 = new 호텔3();	호텔예약.전체예약현황_관리자();
									System.out.println(" ========================================================= ");

								} else if (ch3 == 2) {
									System.out.println(" ======================== 회원 정보 ======================== ");
									System.out.println("회원ID\t   이름\t       연락처");
									System.out.println(" ========================================================= ");
									Member member = new Member(h_id, h_pw, h_id, h_pw);
									for (Member temp : MemberController.memberlist) {
										if (!temp.getH_id().equals("admin")) {
											System.out.println("ID : " + temp.getH_id() + "/ 이름 : " + temp.getH_name()
													+ "/ 연락처 : " + temp.getH_phone());
											System.out.println(
													" ========================================================= ");

										}
									}
								} else if (ch3 == 3) {
									System.err.println(" 관리자가 로그아웃하셨습니다. ");
									break;
								} else { // 관리자 선택
									System.err.println(" 다시 입력해주세요.");

								}
							}

						}

					} else {
						System.err.println(" 잘못입력하셨습니다. 초기화면으로 돌아갑니다. ");

					}
				} else if (ch == 3) {
					System.err.println(" 종료 ");
					break;
				} else {
					System.err.println(" 다시 입력해주세요. ");
				}
			} catch (Exception e) {
				System.err.println(" [알림] : 메뉴 입력번호 오류 [ 관리자문의 ] ");
				scanner = new Scanner(System.in);
			} // 입력객체 초기화

		}

	}

}