package test;

public class 호텔3 extends 호텔Total {

	@Override
	public void 예약등록() {
		System.out.println("호텔 3 예약 등록 완료");
	}
	@Override
	public void 예약취소() {
		System.out.println("호텔 3 예약 취소 완료");
	}
	@Override
	public void 본인예약조회() {
		System.out.println("호텔 3 본인예약조회");
	}
	@Override
	public void 전체예약현황() {
		System.out.println("호텔 3 전체 예약현황 조회");
	}
	@Override
	public void 파일처리() {
		System.out.println("호텔 3 파일처리");
	}
	
}
