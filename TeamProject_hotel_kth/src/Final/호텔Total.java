package Final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;



public class 호텔Total implements 호텔예약 {

	// 필드
	public static int[][] room = new int[3][3]; 
	
	// 생성자
	
	// 메소드
	@Override
	public void 예약등록(int hotelch, int roomch) {
		if (room[hotelch-1][roomch-1] == 0) {
			System.out.println("*** 호텔 / ** 룸 예약 완료 ***");
			room[hotelch-1][roomch-1] = 1;
		} else {
			System.out.println("이미 예약된 객실입니다");
		}
	}
	@Override
	public void 예약취소(int hotelch, int roomch) {
		if (room[hotelch-1][roomch-1] == 1) {
			System.out.println("*** 호텔 / ** 룸 예약취소 완료 ***");
			room[hotelch-1][roomch-1] = 0;
		}
		System.out.println("*** 예약 취소 완료 ***");
	}
	@Override
	public void 본인예약조회() {
		System.out.println("*** 본인예약조회 ***");
	}
	@Override
	public void 전체예약현황() {
		System.out.print("호텔 **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == 0)
				System.out.print("□\t");
			if (room[0][i] == 1)
				System.out.print("■\t");
		}
	}
	@Override
	public void 파일처리() {
		
	}
	
	
}
