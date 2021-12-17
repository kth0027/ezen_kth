package Test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.Exception;

public class CartTest {
	public static void main(String[] args) {

		Goods g1 = new Goods(1001, "볼펜", 1000, 2); // 1. 상품3개 입력
		Goods g2 = new Goods(1002, "연필", 500, 3);
		Goods g3 = new Goods(1003, "딸기", 6000, 2);

		System.out.println("// 2. 입력상품 출력");
		System.out.println("상품코드\t상품명 \t단가\t수량\t합계");
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println("");

		Cart cart = new Cart(); // 3. 장바구니에 3개 상품입력
		cart.Add(g1);
		cart.Add(g2);
		cart.Add(g3);
		System.out.println("// 4. 장바구니 출력");
		System.out.println(cart);
		System.out.println("");

		Goods g = cart.getGoods(1); // 5. 카트번호가 1인 상품의 수량 5개로 변경
		g.setCount(5);
		System.out.println("// 6. 장바구니 출력");
		System.out.println(cart);
		System.out.println("");
		cart.DeleteGoods(1002); // 7. 상품코드가 1002인 상품을 삭제

		System.out.println("// 8. 장바구니 출력");
		System.out.println(cart);
		System.out.println("");
	}
}
