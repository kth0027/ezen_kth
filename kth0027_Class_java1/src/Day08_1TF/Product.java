package Day08_1TF;

import java.util.Scanner;

public class Product {

	private String ��ǰ��;
	private int ��ǰ���;
	private int ��ǰ����;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String ��ǰ��, int ��ǰ���, int ��ǰ����) {
		super();
		this.��ǰ�� = ��ǰ��;
		this.��ǰ��� = ��ǰ���;
		this.��ǰ���� = ��ǰ����;
	}

	public static boolean shop_add() {
		System.out.println("------------------��ǰ ��� ������ ----------------");
		System.out.println("��ǰ��: ");
		String ��ǰ�� = Shop.scanner.next();
		System.out.println("��ǰ���: ");
		int ��ǰ��� = Shop.scanner.nextInt();
		System.out.println("��ǰ����: ");
		int ��ǰ���� = Shop.scanner.nextInt();

		Product product = new Product(��ǰ��, ��ǰ���, ��ǰ����);
		for (int i = 0; i < Shop.products.length; i++) {
			if (Shop.products[i] == null) {
				System.out.println("��ǰ�� ��ϵǾ����ϴ�");
				Shop.products[i] = product;
				break;
			}
		}

		return false;
	}

	public static void product_list() {
		System.out.println("------------------��ǰ ��� ������ ----------------");
		System.out.println("��ǰ��\t��ǰ���\t��ǰ����");
		for (int i = 0; i < Shop.products.length; i++) {
			if (Shop.products[i] == null)
				break;
			Product products = Shop.products[i];
			System.out.println(products.get��ǰ��() + "\t" + products.get��ǰ���() + "\t" + products.get��ǰ����());

		}

	}
	
	/*//*/
	
	
	

	public String get��ǰ��() {
		return ��ǰ��;
	}

	public void set��ǰ��(String ��ǰ��) {
		this.��ǰ�� = ��ǰ��;
	}

	public int get��ǰ���() {
		return ��ǰ���;
	}

	public void set��ǰ���(int ��ǰ���) {
		this.��ǰ��� = ��ǰ���;
	}

	public int get��ǰ����() {
		return ��ǰ����;
	}

	public void set��ǰ����(int ��ǰ����) {
		this.��ǰ���� = ��ǰ����;
	}

}