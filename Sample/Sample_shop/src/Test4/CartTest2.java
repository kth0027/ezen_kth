package Test4;

import java.lang.Character.Subset;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class CartTest2 {
	static ProductDto2 p = new ProductDto2();
	static ProductDto2 p1 = new ProductDto2();

	public static void main(String[] args) {
		// 상품 임력
		ProductDto2 pd1 = new ProductDto2("카모", "AAAAAA", 1, 20000);
		ProductDto2 pd2 = new ProductDto2("셔츠", "AAAABB", 2, 60000);
		ProductDto2 pd3 = new ProductDto2("코트", "AAAACC", 3, 30000);
		ProductDto2 pd4 = new ProductDto2("바지", "AAAADD", 4, 40000);
		ProductDto2 pd5 = new ProductDto2("니트", "AAAAEE", 5, 50000);

		Map<Integer, ProductDto2> list = new HashMap<Integer, ProductDto2>();
		// Arraylist 생성
		// 몇번 상품 늘지 골름
		Scanner sc = new Scanner(System.in);

		Object[] o = new Object[5];
		boolean ing = false;

		System.out.println("[1,2,3,4,5]상품 코드 입력 ");
		System.out.println("s는 STOP sv는 저장 입니다.");
		list.put(1, pd1);
		// System.out.println(list.size());
		// p= (ProductDto2) list.get(0);
		// System.out.println(p.getGoodsname());
		while (true) {
			switch (sc.next()) {
			case "1":
				list.put(1, pd1);
				break;
			case "2":
				list.put(2, pd2);
				break;
			case "3":
				list.put(3, pd3);
				break;
			case "4":
				list.put(4, pd4);
				break;
			case "5":
				list.put(5, pd5);
				break;
			case "s":
				ing = true;
				break;
			}
			if (ing == true)
				break;
		}
		print(list);
		list.remove(1);
		System.out.println();
		print(list);
		revise(list, 2, "팬티", "BBBBAA", 10, 3000);
		System.out.println();
		print(list);

	}

	private static void revise(Map set, int i, String name, String code, int cnt, int amt) {
		p = (ProductDto2) set.get(i);
		p.goodsname = name;
		p.goodscode = code;
		p.goodscnt = cnt;
		p.amt = amt;
		p.totAmt = amt * cnt;
	}

	public static void print(Map<Integer, ProductDto2> list) {
		for (int i : list.keySet()) {
			p = (ProductDto2) list.get(i);
			System.out.println("상품이름: " + p.getGoodsname() + " 상품코드: " + p.getGoodscode() + " 상품 수량: " + p.getGoodscnt()
					+ " 상품 단가: " + p.getAmt() + " 상품 가격: " + p.getTotAmt());
		}
	}
}
// public static void print(Map sets){
// Set set=sets.keySet();//key값을Set으로
// java.util.Iterator iter=set.iterator();
//  while(iter.hasNext()){
//  int  key=(int)iter.next();
//  p= (ProductDto2)sets.get(key);
//   System.out.println("상품이름: "+p.getGoodsname()+" 상품코드: "+p.getGoodscode()
//      +" 상품 수량: "+p.getGoodscnt()+" 상품 단가: "+p.getAmt()+" 상품 가격: "+p.getTotAmt());
//  }
//}
//}
//LIST를 MAP으로 바꿔서 했습니다.