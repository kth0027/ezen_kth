package test;


public class 호텔Total implements 호텔예약 {

	// 필드
	
	// 생성자
	
	// 메소드
	@Override
	public void 예약등록() {
		System.out.println("*** 예약 등록 완료 ***");
	}
	@Override
	public void 예약취소() {
		System.out.println("*** 예약 취소 완료 ***");
	}
	@Override
	public void 본인예약조회() {
		System.out.println("*** 본인예약조회 ***");
	}
	@Override
	public void 전체예약현황() {
		System.out.println("*** 전체 예약현황 조회 ***");
		for (호텔Total temp : TestMain.호텔Totals) {
			System.out.println(temp);
		}
	}
	@Override
	public void 파일처리() {
		System.out.println("*** 파일처리 ***");
	}
	
	
}
