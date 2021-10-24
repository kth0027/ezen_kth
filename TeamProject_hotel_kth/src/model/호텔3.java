package model;

public class 호텔3 extends 호텔Total {
	
	final String 예약코드 = "03";

	@Override
	public void 예약등록() {
		 System.out.println("호텔3 예약 등록합니다. ");
	}
	@Override
	public void 예약취소() {
		System.out.println("호텔3 예약 취소합니다. ");
	}
	@Override
	public void 본인예약조회() {
		System.out.println("호텔3 예약 현황입니다. ");
	}
	@Override
	public void 전체예약현황() {
		System.out.println("호텔3 전체예약 현황입니다. ");
	}
	@Override
	public void 파일처리() {
		System.out.println("호텔3 파일처리 ");
	}
	
}
