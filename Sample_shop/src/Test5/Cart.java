package Test5;

import java.util.*;
import java.lang.Character.Subset;
import javax.swing.text.html.HTMLDocument.Iterator;

public class Cart {
	static Container p = new Container();// ��ǰ��� ��ü ����

	private static void revise(Map set, int i, String name, int code, int cnt, int amt) {// �����޼ҵ� ����
		p = (Container) set.get(i);
		p.goodsname = name;
		p.goodscode = code;
		p.cnt = cnt;
		p.amt = amt;
		p.totAmt = amt * cnt;
	}

	public static void print(Map<Integer, Container> heo) {// ��¸޼ҵ� ����
		for (int i : heo.keySet()) {
			p = (Container) heo.get(i);
			System.out.println("��ǰ�̸�: " + p.getGoodsName() + " ��ǰ�ڵ�: " + p.getGoodsCode() + " ��ǰ ����: " + p.getCnt()
					+ " ��ǰ �ܰ�: " + p.getAmt() + " ��ǰ ����: " + p.getTotAmt());
		}
	}

	public static void main(String[] args) {

		Container c1 = new Container("��ġ", 001, 1, 25000);
		Container c2 = new Container("����", 002, 6, 6000);
		Container c3 = new Container("�ᳪ��", 003, 4, 3000);
		Container c4 = new Container("����", 004, 2, 4000);
		Container c5 = new Container("����", 005, 7, 5000);// ��ǰ��� �ۼ�

		Map<Integer, Container> heo = new HashMap<Integer, Container>();// Map���̺� ����

		Scanner sc = new Scanner(System.in);

		Object[] o = new Object[5];// �Է� ���� �迭 ����.
		boolean ing = false;

		System.out.println("[1,2,3,4,5]��ǰ �ڵ� �Է� ");
		System.out.println("s�� STOP sv�� ���� �Դϴ�.");

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
		revise(heo, 2, "���", 003, 10, 3000);
		System.out.println();
		print(heo);
	}
}
