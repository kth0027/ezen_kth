package Shop;

import java.util.Set;

public class ShopEx {

	public static void main(String[] args) {
		
		MyShop shop = new MyShop();

		// 상점이름 지정
		shop.setTitle("자바샵");

		// 고객 생성
		shop.genUser();

		// 제품 생성
		shop.genProduct();

		// 상점 시작
		shop.start();
	}

}
