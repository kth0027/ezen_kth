package Day08_TF;

import java.util.Scanner;

import Day07.BookApplication;

public class Product {

	private String ��ǰ��ȣ;
	private String ��ǰ��;
	private int ��ǰ���;
	private int ��ǰ����;

	public Product() {
	}

	public Product(String ��ǰ��ȣ, String ��ǰ��, int ��ǰ���, int ��ǰ����) {
		super();
		this.��ǰ��ȣ = ��ǰ��ȣ;
		this.��ǰ�� = ��ǰ��;
		this.��ǰ��� = ��ǰ���;
		this.��ǰ���� = ��ǰ����;
	}

	public static boolean shop_add() {
		System.out.println("------------------��ǰ ��� ������ ----------------");
		System.out.println("��ǰ��ȣ: ");
		String ��ǰ��ȣ = ShopApplication.scanner.next();
		System.out.println("��ǰ��: ");
		String ��ǰ�� = ShopApplication.scanner.next();
		System.out.println("��ǰ���: ");
		int ��ǰ��� = ShopApplication.scanner.nextInt();
		System.out.println("��ǰ����: ");
		int ��ǰ���� = ShopApplication.scanner.nextInt();

		Product product = new Product(��ǰ��ȣ, ��ǰ��, ��ǰ���, ��ǰ����);
		for (int i = 0; i < ShopApplication.products.length; i++) {
			if (ShopApplication.products[i] == null) {
				System.out.println("��ǰ�� ��ϵǾ����ϴ�");
				ShopApplication.products[i] = product;
				break;
			}
		}

		return false;
	}

	public static void product_list() {
		System.out.println("------------------��ǰ ��� ������ ----------------");
		System.out.println("��ǰ��ȣ\t��ǰ��\t��ǰ���\t��ǰ����");
		for (int i = 0; i < ShopApplication.products.length; i++) {
			if (ShopApplication.products[i] == null)
				break;
			Product products = ShopApplication.products[i];
			System.out.println(products.get��ǰ��ȣ() + "\t" + products.get��ǰ��() + "\t" + products.get��ǰ���() + "\t" + products.get��ǰ����());

		}

	}
	
	// ��ǰ ���� �޼ҵ�

	/*//*/
	
	public String get��ǰ��ȣ() {
		return ��ǰ��ȣ;
	}

	public void set��ǰ��ȣ(String ��ǰ��ȣ) {
		this.��ǰ��ȣ = ��ǰ��ȣ;
	}
	

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