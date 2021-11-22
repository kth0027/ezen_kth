package Day09_2;

public interface ATM {

	
	// 1. 상수필드
	
	// 2. 추상 메소드
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();

	// 3. 디폴트 메소드
	default void 실행() {System.out.println(" ATM 실행중입니다 ");}

	// 4. 정적 메소드
		
}
