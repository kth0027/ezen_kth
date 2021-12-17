package Final_1027;

import java.util.ArrayList;

import Reference.Main;
import Reference.Ticket;

public class 호텔1 extends 호텔Total {


	// 메소드
	@Override
	public void 예약등록(int hotelch, int roomch, String h_id) {
		if (roomch == 1) {
			if (room[hotelch - 1][roomch - 1] == null) {
				System.err.println(" [[예약 완료]] : 신라호텔 / 스위트룸 ");
				room[hotelch - 1][roomch - 1] = h_id;

			} else {
				System.err.println(" 이미 예약된 객실입니다. ");
			}
		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1] == null) {
				System.err.println(" [[예약 완료]] : 신라호텔 / 디럭스룸 ");
				room[hotelch - 1][roomch - 1] = h_id;

			} else {
				System.err.println(" 이미 예약된 객실입니다. ");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1] == null) {
				System.err.println(" [[예약 완료]] : 신라호텔 / 스탠다드룸 ");
				room[hotelch - 1][roomch - 1] = h_id;

			} else {
				System.err.println(" 이미 예약된 객실입니다. ");
			}
		}
	}

	@Override
	public void 예약취소(int hotelch, int roomch, String h_id) {
		if (roomch == 1) {
			if (room[hotelch - 1][roomch - 1].equals(h_id)) {
				System.err.println(" [[예약 취소]] : 신라호텔 / 스위트룸 ");
				room[hotelch - 1][roomch - 1] = null;

			} else {
				System.err.println(" 다시 입력바랍니다. ");
			}
		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1].equals(h_id)) {
				System.err.println(" [[예약 취소]] : 신라호텔 / 디럭스룸 ");
				room[hotelch - 1][roomch - 1] = null;

			} else {
				System.err.println(" 다시 입력바랍니다. ");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1].equals(h_id)) {
				System.err.println(" [[예약 취소]] : 신라호텔 / 스탠다드룸 ");
				room[hotelch - 1][roomch - 1] = null;

			} else {
				System.err.println(" 다시 입력바랍니다. ");
			}
		}
	}

	@Override
	public void 본인예약조회(String h_id) {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[0][i] != null && room[0][i].equals(h_id)) {
				if (i == 0) {
					System.out.println(" *** 신라호텔 / 스위트룸 " + room[0][i] + " 님 예약 *** ");
				} else if (i == 1) {
					System.out.println(" *** 신라호텔 / 디럭스룸 " + room[0][i] + " 님 예약 *** ");
				} else if (i == 2) {
					System.out.println(" *** 신라호텔 / 스탠다드룸 " + room[0][i] + " 님 예약 *** ");
				}

			}
		}

	}

	@Override
	public void 전체예약현황_회원() {
		System.out.print("신라호텔\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t□\t");
			} else {
				System.out.print("\t■\t");
			}
		}
		System.out.println();
	}

	@Override
	public void 전체예약현황_관리자() {
		System.out.print("신라호텔\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t□\t");
			} else {
				System.out.print("\t"+room[0][i] + "\t");
			}

		}
		System.out.println();
	}

}
