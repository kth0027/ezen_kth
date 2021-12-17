package Day09_3TF;

public interface ShopManager {


	
	// 1. 상수필드
	
	// 2. 추상 메소드
		public void 상품등록();
		public void 상품리스트();
		public void 장바구니();
		public void 상품구매();
		public void 환불();

	// 3. 디폴트 메소드
		default void 실행() {System.out.println(" 쇼핑몰 운영중입니다 ");}

	// 4. 정적 메소드
}

	