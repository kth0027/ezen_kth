package Test4;

import java.lang.Character.Subset;
import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class CartTest2 {
	static ProductDto2 p = new ProductDto2();
	static ProductDto2 p1 = new ProductDto2();

	public static void main(String[] args) {
		// ��ǰ �ӷ�
		ProductDto2 pd1 = new ProductDto2("ī��", "AAAAAA", 1, 20000);
		ProductDto2 pd2 = new ProductDto2("����", "AAAABB", 2, 60000);
		ProductDto2 pd3 = new ProductDto2("��Ʈ", "AAAACC", 3, 30000);
		ProductDto2 pd4 = new ProductDto2("����", "AAAADD", 4, 40000);
		ProductDto2 pd5 = new ProductDto2("��Ʈ", "AAAAEE", 5, 50000);

		Map<Integer, ProductDto2> list = new HashMap<Integer, ProductDto2>();
		// Arraylist ����
		// ��� ��ǰ ���� ��
		Scanner sc = new Scanner(System.in);

		Object[] o = new Object[5];
		boolean ing = false;

		System.out.println("[1,2,3,4,5]��ǰ �ڵ� �Է� ");
		System.out.println("s�� STOP sv�� ���� �Դϴ�.");
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
		revise(list, 2, "��Ƽ", "BBBBAA", 10, 3000);
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
			System.out.println("��ǰ�̸�: " + p.getGoodsname() + " ��ǰ�ڵ�: " + p.getGoodscode() + " ��ǰ ����: " + p.getGoodscnt()
					+ " ��ǰ �ܰ�: " + p.getAmt() + " ��ǰ ����: " + p.getTotAmt());
		}
	}
}
// public static void print(Map sets){
// Set set=sets.keySet();//key����Set����
// java.util.Iterator iter=set.iterator();
//  while(iter.hasNext()){
//  int  key=(int)iter.next();
//  p= (ProductDto2)sets.get(key);
//   System.out.println("��ǰ�̸�: "+p.getGoodsname()+" ��ǰ�ڵ�: "+p.getGoodscode()
//      +" ��ǰ ����: "+p.getGoodscnt()+" ��ǰ �ܰ�: "+p.getAmt()+" ��ǰ ����: "+p.getTotAmt());
//  }
//}
//}
//LIST�� MAP���� �ٲ㼭 �߽��ϴ�.