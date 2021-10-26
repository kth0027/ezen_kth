package Final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class 호텔Total2 implements 호텔예약 {

	// 필드
	public static String[][] room = new String[3][3];

	// 생성자

	// 메소드
	@Override
	public void 예약등록(int hotelch, int roomch, String h_id) {

		if (room[hotelch - 1][roomch - 1] == null) {
			System.out.println("*** 호텔 / ** 룸 예약 완료 ***");
			room[hotelch - 1][roomch - 1] = h_id;

		}

	}

	@Override
	public void 예약취소(int hotelch, int roomch, String h_id) {
		if (room[hotelch - 1][roomch - 1] == null) {
			System.out.println("*** 호텔 / ** 룸 예약취소 완료 ***");
			room[hotelch - 1][roomch - 1] = h_id;
		}
		System.out.println("*** 예약 취소 완료 ***");
	}

	@Override
	public void 본인예약조회() {
		System.out.println("*** 본인예약조회 ***");
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (room[i][j] != null) {
					System.out.println("*** 호텔 / ** 룸 예약 ***");
				}
			}
		}

	}

	@Override
	public void 전체예약현황(String h_id) {
		System.out.print("호텔 **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("□\t");
			} else {
				System.out.print(h_id);
			}

		}
	}

	@Override
	public void 파일처리() {
		System.out.println("*** 파일처리 ***");
	}

}
