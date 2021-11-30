package Final_1027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// 스레드 시작
		FileThread fileThread = new FileThread();
		fileThread.start();

		File.fileload(1);

		// 1. 인터페이스 생성
		호텔예약 호텔예약;

		while (true) {
			try {
				System.out.println(" ======================== 호텔예약시스템 ========================= ");
				System.out.println(" ========================= main menu ========================= ");
				System.out.println("\t 1.회원가입 \t 2.로그인 \t 3.종료");
				System.out.println(" ============================================================= ");
				System.out.print(">>> 선택 : ");

				int ch = scanner.nextInt();
				if (ch == 1) { // 회원가입

					System.out.println(" ======================== 회원가입 페이지 ======================== ");
					MemberController.signup();

				} else if (ch == 2) {
					System.out.println(" ======================== 로그인 페이지 ======================== ");
					System.out.println("\t\t1.회원 \t\t2.관리자");
					System.out.println(" ============================================================= ");
					System.out.print("선택 : ");
					int ch1 = scanner.nextInt();

					if (ch1 == 1) { // 회원
						System.out.println(" ============================================================= ");
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();

						boolean result = MemberController.login(h_id, h_pw);
						if (result) {// 로그인 성공시
							System.err.println(" [알림] : 로그인 성공 ");

							while (true) {
								System.out.println(" ============================================================= ");
								System.out.println("1.예약등록 2.예약취소 3.본인예약조회\n4.전체예약조회 5.객실세부정보 6.뒤로가기");
								System.out.println(" ============================================================= ");
								System.out.print(">>> 선택 : ");
								int ch2 = scanner.nextInt();

								if (ch2 == 1) { // 예약등록
									System.out
											.println(" ============================================================= ");
									System.out.println(">>호텔지점 선택<<");
									System.out.println("1.신라호텔 2.라마다호텔 3.그랜드호텔");
									int hotelch = TestMain.scanner.nextInt();
									System.out
											.println(" ============================================================= ");
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
									System.out
											.println(" ============================================================= ");
									System.out.println(">>호텔지점 선택<<");
									System.out.println("1.신라호텔 2.라마다호텔 3.그랜드호텔");
									int hotelch = TestMain.scanner.nextInt();
									System.out
											.println(" ============================================================= ");
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
									System.out
											.println(" ============================================================= ");
									System.out.println("\t\t\t본인예약현황조회");
									System.out
											.println(" ============================================================= ");
									호텔예약 = new 호텔1();
									호텔예약.본인예약조회(h_id);
									호텔예약 = new 호텔2();
									호텔예약.본인예약조회(h_id);
									호텔예약 = new 호텔3();
									호텔예약.본인예약조회(h_id);
									System.out
											.println(" ============================================================= ");
								} else if (ch2 == 4) { // 전체예약현황조회
									System.out
											.println(" ============================================================= ");
									System.out.println("\t\t\t전체예약현황조회");
									System.out
											.println(" ============================================================= ");
									System.out.println("호텔\t\t스위트룸\t\t디럭스룸\t\t스탠다드룸");
									System.out
											.println(" ============================================================= ");
									호텔예약 = new 호텔1();
									호텔예약.전체예약현황_회원();
									호텔예약 = new 호텔2();
									호텔예약.전체예약현황_회원();
									호텔예약 = new 호텔3();
									호텔예약.전체예약현황_회원();
									System.out
											.println(" ============================================================= ");
								} else if (ch2 == 5) { // 방정보
									System.out
											.println(" ============================================================= ");
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
						System.out.println(" ============================================================= ");
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();

						if (h_id.equals("admin") && h_pw.equals("1234")) {
							System.err.println(" 관리자가 로그인하셨습니다. ");
							while (true) {
								System.out.println(" ============================================================= ");
								System.out.println("\t1.예약현황\t2.회원정보\t3.뒤로가기");
								System.out.println(" ============================================================= ");
								System.out.print(">>> 선택 : ");
								int ch3 = scanner.nextInt();
								if (ch3 == 1) {
									System.out
											.println(" ============================================================= ");
									System.out.println("\t\t\t전체예약현황조회");
									System.out
											.println(" ============================================================= ");
									System.out.println("호텔\t\t스위트룸\t\t디럭스룸\t\t스탠다드룸");
									System.out
											.println(" ============================================================= ");
									호텔예약 = new 호텔1();
									호텔예약.전체예약현황_관리자();
									호텔예약 = new 호텔2();
									호텔예약.전체예약현황_관리자();
									호텔예약 = new 호텔3();
									호텔예약.전체예약현황_관리자();
									System.out
											.println(" ============================================================= ");

								} else if (ch3 == 2) {
									System.out.println(" ========================== 회원 정보 ========================== ");
									System.out.println("회원ID\t   이름\t       연락처");
									System.out
											.println(" ============================================================= ");
									Member member = new Member(h_id, h_pw, h_id, h_pw);
									for (Member temp : MemberController.memberlist) {
										if (!temp.getH_id().equals("admin")) {
											System.out.println("ID : " + temp.getH_id() + "/ 이름 : " + temp.getH_name()
													+ "/ 연락처 : " + temp.getH_phone());
											System.out.println(
													" ============================================================= ");

										}
									}
								} else if (ch3 == 3) {
									System.err.println(" 관리자가 로그아웃하셨습니다. ");
									break;
								} else { // 관리자 선택
									System.err.println(" 다시 입력해주세요.");

								}
							}

						} else {
							System.err.println(" 회원정보가 다릅니다. ");
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