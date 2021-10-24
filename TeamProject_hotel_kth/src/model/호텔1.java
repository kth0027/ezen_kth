package model;

public class 호텔1 extends 호텔Total {
	
	final String 예약코드 = "02";

	@Override
	public void 예약등록() {
		 System.out.println("호텔1 예약 등록합니다. ");
	}
	@Override
	public void 예약취소() {
		System.out.println("호텔1 예약 취소합니다. ");
	}
	@Override
	public void 본인예약조회() {
		System.out.println("호텔1 예약 현황입니다. ");
	}
	@Override
	public void 전체예약현황() {
		System.out.println("호텔1 전체예약 현황입니다. ");
	}
	@Override
	public void 파일처리() {
		System.out.println("호텔1 파일처리 ");
	}
}
