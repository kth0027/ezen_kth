package Test3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.lang.Exception;

public class CartTest {
	public static void main(String[] args) {

		Goods g1 = new Goods(1001, "����", 1000, 2); // 1. ��ǰ3�� �Է�
		Goods g2 = new Goods(1002, "����", 500, 3);
		Goods g3 = new Goods(1003, "����", 6000, 2);

		System.out.println("// 2. �Է»�ǰ ���");
		System.out.println("��ǰ�ڵ�\t��ǰ�� \t�ܰ�\t����\t�հ�");
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
		System.out.println("");

		Cart cart = new Cart(); // 3. ��ٱ��Ͽ� 3�� ��ǰ�Է�
		cart.Add(g1);
		cart.Add(g2);
		cart.Add(g3);
		System.out.println("// 4. ��ٱ��� ���");
		System.out.println(cart);
		System.out.println("");

		Goods g = cart.getGoods(1); // 5. īƮ��ȣ�� 1�� ��ǰ�� ���� 5���� ����
		g.setCount(5);
		System.out.println("// 6. ��ٱ��� ���");
		System.out.println(cart);
		System.out.println("");
		cart.DeleteGoods(1002); // 7. ��ǰ�ڵ尡 1002�� ��ǰ�� ����

		System.out.println("// 8. ��ٱ��� ���");
		System.out.println(cart);
		System.out.println("");
	}
}
