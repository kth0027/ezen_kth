package controller;

public interface 호텔예약 {

	// 1. 상수필드
	
	// 2. 추상메소드
	public void 예약등록();
	public void 예약취소();
	public void 본인예약조회();
	public void 전체예약현황();
	public void 파일처리();
	
	// 3. 디폴트 메소드
	default void 실행 () {System.out.println(" 예약을 실행합니다 ");}
	
	// 4. 정적메소드
	
}
