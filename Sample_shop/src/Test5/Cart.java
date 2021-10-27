package Test5;

import java.util.*;
import java.lang.Character.Subset;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Cart {
	static Container p = new Container();// 상품목록 객체 생성

	private static void revise(Map set, int i, String name, int code, int cnt, int amt) {// 수정메소드 생성
		p = (Container) set.get(i);
		p.goodsname = name;
		p.goodscode = code;
		p.cnt = cnt;
		p.amt = amt;
		p.totAmt = amt * cnt;
	}

	public static void print(Map<Integer, Container> heo) {// 출력메소드 생성
		for (int i : heo.keySet()) {
			p = (Container) heo.get(i);
			System.out.println("상품이름: " + p.getGoodsName() + " 상품코드: " + p.getGoodsCode() + " 상품 수량: " + p.getCnt()
					+ " 상품 단가: " + p.getAmt() + " 상품 가격: " + p.getTotAmt());
		}
	}

	public static void main(String[] args) {

		Container c1 = new Container("김치", 001, 1, 25000);
		Container c2 = new Container("된장", 002, 6, 6000);
		Container c3 = new Container("콩나물", 003, 4, 3000);
		Container c4 = new Container("생선", 004, 2, 4000);
		Container c5 = new Container("간장", 005, 7, 5000);// 상품목록 작성

		Map<Integer, Container> heo = new HashMap<Integer, Container>();// Map테이블 생성

		Scanner sc = new Scanner(System.in);

		Object[] o = new Object[5];// 입력 저장 배열 생성.
		boolean ing = false;

		System.out.println("[1,2,3,4,5]상품 코드 입력 ");
		System.out.println("s는 STOP sv는 저장 입니다.");

		while (true) {
			switch (sc.next()) {
			case "1":
				heo.put(1, c1);
				break;
			case "2":
				heo.put(2, c2);
				break;
			case "3":
				heo.put(3, c3);
				break;
			case "4":
				heo.put(4, c4);
				break;
			case "5":
				heo.put(5, c5);
				break;
			case "s":
				ing = true;
				break;

			}
			if (ing == true)
				break;
		}
		print(heo);
		heo.remove(3);
		System.out.println();
		print(heo);
		revise(heo, 2, "고기", 003, 10, 3000);
		System.out.println();
		print(heo);
	}
}
