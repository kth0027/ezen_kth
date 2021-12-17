package Day13_1문제;

import java.util.Scanner;

public class Day13_1_문제2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean sw = true; // 현재 재생여부 확인 변수
		boolean sw2 = true; // true이면 중지상태 // false 이면 실행상태

//		// 1. 스레드 생성
//		음악재생 음악재생 = new 음악재생();
//		영화재생 영화재생 = new 영화재생();
//
//		// 2. 스레드 실행 [run 메소드 실행]
//		음악재생.start();
//		영화재생.start();

		while (true) { // while 시작
			System.out.println("1. 음악재생 2. 영화재생");
			int ch = scanner.nextInt();

			if (ch == 1) {

				Thread thread = new 음악재생();

				if (sw) {
					음악재생.음악스톱(sw);
					thread.start();
					sw = false;
				}

				else {
					음악재생.음악스톱(sw);
					sw = true;
				}

			} else if (ch == 2) {

				// 1. 스레드 구현 객체 생성
				Thread thread = new 영화재생();

				if (sw2) {
					영화재생.영화스톱(sw2); // 영화시작
					thread.start();
					sw2 = false;
				} else {
					영화재생.영화스톱(sw2);
					sw2 = true;
				}

			}

		} // while 종료
	}

}
