package Day09_3TF;

public class Day09_6 {

	// 쇼핑몰 프로그램 [ 상속, 인터페이스 ]
	// ORDER & CART [인터페이스]
	// 추상 메소드 : 상품등록, 상품리스트, 장바구니, 상품구매, 환불

	// 1. 쇼핑몰 [슈퍼클래스]
		// 필드(속성) : 상품번호, 상품구매가격
	
	// 2. 11번가 [서브클래스]
	// 3. 쿠팡 [서브클래스]
	
	public static 쇼핑몰[] shoplist = new 쇼핑몰[100];
	
	public static void main(String[] args) {
		// 1. 인터페이스 생성
		ShopManager shop;
		
		// 2. 인터페이스 클래스 연결
		shop = new 쿠팡();
		
		// 3. 인터페이스로부터 클래스
		shop.상품등록();
		shop.상품리스트();
		shop.장바구니();
		shop.상품구매();
		shop.환불();
		
		// 4. 인터페이스 내 클래스 변경
		shop = new 십일번가();
		shop.상품등록();
		
		// 5. 동일한 슈퍼클래슬로부터 서로 다른 서브클래스를 배열로 사용
		// 슈퍼클래스로 배열 선언
		
		쇼핑몰 productadd1 = new 쇼핑몰();
		shoplist[0] = productadd1;
		
		쿠팡 productadd2 = new 쿠팡();
		shoplist[0] = productadd1;
		
		십일번가 productadd3 = new 십일번가();
		shoplist[0] = productadd1;
	}
}
