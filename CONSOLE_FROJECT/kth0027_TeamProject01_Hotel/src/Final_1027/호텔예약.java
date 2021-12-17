package Final_1027;

import java.io.IOException;

public interface 호텔예약 {

	// 추상메소드
	public void 예약등록(int hotelch, int roomch, String h_id);

	public void 예약취소(int hotelch, int roomch, String h_id);

	public void 본인예약조회(String h_id);

	public void 전체예약현황_회원();

	public void 전체예약현황_관리자();

}