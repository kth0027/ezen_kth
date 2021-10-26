package Final2;

public class 호텔1 extends 호텔Total {
	
	public int[][] 예약회원리스트 = new int[3][3]; 
	
	// 메소드
	@Override
	public void 예약등록(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == null) {
				
				System.out.println("호텔1 / 스위트룸 예약 완료");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("이미 예약된 객실입니다");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("호텔1 / 디럭스룸 예약 완료");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("이미 예약된 객실입니다");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("호텔1 / 스탠다드룸 예약 완료");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("이미 예약된 객실입니다");
			}
		}
	}
	@Override
	public void 예약취소(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("호텔1 / 스위트룸 예약취소 완료");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("다시 입력바랍니다");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("호텔1 / 디럭스룸 예약취소 완료");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("다시 입력바랍니다");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("호텔1 / 스탠다드룸 예약취소 완료");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("다시 입력바랍니다");
			}
		}
	}
	@Override
	public void 본인예약조회(String h_id) {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[0][i] != null) {
				if (i == 0) {
					System.out.println("*** 호텔1 / 스위트룸 예약 ***"+h_id);
				} else if (i == 1) {
					System.out.println("*** 호텔1 / 디럭스룸 예약 ***"+h_id);
				} else if (i == 2) {
					System.out.println("*** 호텔1 / 스탠다드룸 예약 ***"+h_id);
				}
				
			}
		}
	
	}
	@Override
	public void 전체예약현황() {
		System.out.print("호텔 1\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null ) {
				System.out.print("□\t");
			} else {
				System.out.print(room[0][i]+"\t");
			}
				
		}
		System.out.println();
	}
	@Override
	public void 파일처리() {
		System.out.println("호텔 1 파일처리");
	}
	
	
}
