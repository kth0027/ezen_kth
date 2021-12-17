package Hotemsample7;

import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0, tnum = 0, snum = 0, s = 0, n = 0;

		// snum:층갯수
		// tnum:방갯수
		// s:층 배열 선택 때 사용
		// n:방 배열 선택 때 사용
		// check:해당층에 빈방 카운트

		System.out.println("전체 층 수를 설정하세요");
		snum = Integer.parseInt(in.readLine());
		System.out.println("층의 전체 객실 수를 설정하세요");
		tnum = Integer.parseInt(in.readLine());
		String[][] name = new String[snum + 1][tnum + 1]; // 배열 0번지를 제외시키기 위해 +1
		boolean bool = true;
		boolean check = false;

		while (bool) {
			System.out.println("<<1.입실,성함입력  2.퇴실 3.전체현황 4.프로그램종료>>\n번호를 입력하세요");
			num = Integer.parseInt(in.readLine());

			switch (num) {

			/*
			 * case 1: 해당 층이 다 찼을 때: 층을 다시 확인 /해당 방에 사람이 있는 경우: 층과 호실 다시 확인
			 */

			case 1: // 호실, 이름입력
				do {
					System.out.println("투숙할 층을 선택하세요");
					s = Integer.parseInt(in.readLine());
					// 빈층 확인
					check = false;
					for (int i = 1; i <= tnum; ++i) {
						if (s < 1 || s > tnum) { // 층수의 범위 체크
							System.out.println("범위를 벗어났습니다.");
							break;
						}
						if (name[s][i] == null) // 선택층의 빈방 확인
							check = true;
					} // end for
					if (check == false) { // 선택층의 방이 없거나 범위가 벗어 났을 때
						System.out.println("다른 층을 선택하세요");

					} else {
						System.out.println("투숙할 호실을 선택하세요");
						n = Integer.parseInt(in.readLine());
					} // end if
					// 층, 호실 입력값 검사
				} while (s < 1 || s > tnum || n < 1 || n > tnum || check == false);

				// 투숙객이 있을 경우(name[][]!=null) do while 문으로 계속 입력
				if (name[s][n] != null) {
					do {
						System.out.println("현재 투숙객이 있습니다. 층을 선택하세요");
						s = Integer.parseInt(in.readLine());
						System.out.println("호실을 선택하세요");
						n = Integer.parseInt(in.readLine());

					} while (name[s][n] != null);
				} // end if

				System.out.println("투숙객 이름을 입력하세요");
				name[s][n] = in.readLine();

				bool = true; // false로 바뀐 bool을 true로 다시 초기화
				break;
			case 2: // 퇴실
				System.out.println("체크아웃한 층을 선택하세요");
				s = Integer.parseInt(in.readLine());
				System.out.println("체크아웃할 호실을 선택하세요");
				n = Integer.parseInt(in.readLine());
				name[s][n] = null; // 해당 층 호실을 null로 초기화 (방을 비움)
				break;
			case 3: // 전체현황
				for (int i = 1; i <= snum; i++) {
					System.out.println(i + "층=============");
					for (int j = 1; j <= tnum; j++) {
						if (name[i][j] == null) {
							System.out.println(j + "호실이 비었습니다.");
						} else
							System.out.println(j + "호실의 투숙객:" + name[i][j] + "입니다.");
					}
				}
				break;
			case 4: // 종료
				bool = false;
			}
		} // end while

	}
}
