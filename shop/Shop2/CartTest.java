package Shop2;

public class CartTest {
	public static void main(String[] args) {
		Goods goods1 = new Goods(1001, "����", 1000);
		Goods goods2 = new Goods(1002, "����", 500);
		Goods goods3 = new Goods(1003, "����", 6000);

		// ��ٱ��Ͽ� ���
		ArrayList<Cart> carts = new ArrayList<Cart>();
		carts.add(new Cart(goods1, 2));
		carts.add(new Cart(goods2, 3));
		carts.add(new Cart(goods3, 2));

		for (int i = 0; i < carts.size(); i++) {
			System.out.println(carts.get(i).toString());
		}

		for (Cart c : carts) {
			if (c.getGoods().getGoodsNo() == 1001) {
				c.setCount(5);
				c.setSum(c.getCount() * c.getGoods().getDanga());
			}
		}
		System.out.println();
		System.out.println("----- 1001�� ���� 5���� ���� ��-----");

		for (Cart c : carts) {
			System.out.println(c);
		}

		System.out.println();
		System.out.println("----- ��ٱ��Ͽ��� 1002�� ����-----");
		int i = 0;
		for (Cart c : carts) {
			if (c.getGoods().getGoodsNo() == 1002) {
				carts.remove(i);
			}
			i++;
		}

		for (Cart c : carts) {
			System.out.println(c);
		}
	}
}
