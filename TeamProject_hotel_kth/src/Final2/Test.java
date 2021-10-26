package Final2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------");
			System.out.print("1.스위트 2.디럭스 3.스탠다드  >> 선택 : "); int roomno = scanner.nextInt();
			System.out.println("--------------------------------");
			if (roomno == 1) {
				호텔예약.스위트();
			} else if (roomno == 2) {
				호텔예약.디럭스();
			} else if (roomno == 3) {
				호텔예약.스탠다드();
			}
		}
		
		
	}
}
