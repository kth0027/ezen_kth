package Final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class 호텔1 extends 호텔Total {

	// 메소드
	@Override
	public void 예약등록(int hotelch, int roomch) {
		if (roomch == 1) {
			try {
				if (room[hotelch - 1][roomch - 1] == 0) {
					System.out.println("호텔1 / 스위트룸 예약 완료");
					room[hotelch - 1][roomch - 1] = 1;
				} else {
					System.out.println("이미 예약된 객실입니다");
				}
			} catch (Exception e) {}

		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1] == 0) {
				System.out.println("호텔1 / 디럭스룸 예약 완료");
				room[hotelch - 1][roomch - 1] = 1;
			} else {
				System.out.println("이미 예약된 객실입니다");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1] == 0) {
				System.out.println("호텔1 / 스탠다드룸 예약 완료");
				room[hotelch - 1][roomch - 1] = 1;
			} else {
				System.out.println("이미 예약된 객실입니다");
			}
		}
	}

	@Override
	public void 예약취소(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch - 1][roomch - 1] == 1) {
				System.out.println("호텔1 / 스위트룸 예약취소 완료");
				room[hotelch - 1][roomch - 1] = 0;
			} else {
				System.out.println("다시 입력바랍니다");
			}
		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1] == 1) {
				System.out.println("호텔1 / 디럭스룸 예약취소 완료");
				room[hotelch - 1][roomch - 1] = 0;
			} else {
				System.out.println("다시 입력바랍니다");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1] == 1) {
				System.out.println("호텔1 / 스탠다드룸 예약취소 완료");
				room[hotelch - 1][roomch - 1] = 0;
			} else {
				System.out.println("다시 입력바랍니다");
			}
		}
	}

	@Override
	public void 본인예약조회() {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[0][i] != 0) {
				if (i == 0) {
					System.out.println("*** 호텔1 / 스위트룸 예약 ***");
				} else if (i == 1) {
					System.out.println("*** 호텔1 / 디럭스룸 예약 ***");
				} else if (i == 2) {
					System.out.println("*** 호텔1 / 스탠다드룸 예약 ***");
				}
				
			}
		}
	}

	@Override
	public void 전체예약현황() {
		System.out.print("호텔 1\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == 0)
				System.out.print("□\t");
			if (room[0][i] == 1)
				System.out.print("■\t");
		}
		System.out.println();
	}

	@Override
	public void 파일처리() {
		System.out.println("호텔 1 파일처리완료");
	}
}
