package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TestMain {

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<Member> members = new ArrayList<>(); // user list
	public static ArrayList<호텔Total> 호텔Totals = new ArrayList<>(); // 객실예약 list
	public static 호텔Total[] 호텔Totals2 = new 호텔Total[100]; // 객실예약리스트(배열)
	
	public static void main(String[] args) {
		// 1. 인터페이스 생성
		호텔예약 호텔예약;
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.예약 2.메인메뉴 3.종료");
			System.out.print(">>> 선택 : "); int ch1 = scanner.nextInt();
			
			if (ch1 == 1) {
				System.out.println("======menu======");
				System.out.println("1.예약등록 2.예약취소 3.본인예약조회 4.전체예약조회");
				System.out.print(">>> 선택 : "); int ch2 = scanner.nextInt();

				if (ch2 == 1) { // 예약등록
			
					

				} else if (ch2 == 2) { // 예약취소
					
				} else if (ch2 == 3) { // 본인예약조회
					호텔예약 = new 호텔1();
					호텔예약.본인예약조회();
					호텔예약 = new 호텔2();
					호텔예약.본인예약조회();
					호텔예약 = new 호텔3();
					호텔예약.본인예약조회();
				} else if (ch2 == 4) { // 전체예약현황조회
					호텔예약 = new 호텔1();
					호텔예약.전체예약현황();
					호텔예약 = new 호텔2();
					호텔예약.전체예약현황();
					호텔예약 = new 호텔3();
					호텔예약.전체예약현황();
				} else {
					System.out.println("알 수 없는 번호");
				}
				
			} else if (ch1 == 2) {
				
			} else if (ch1 == 3) {
				System.out.println("종료"); break;
			} 
				
		}
		
	}
	
	
}
