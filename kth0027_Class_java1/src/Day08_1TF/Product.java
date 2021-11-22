package Day08_1TF;

import java.util.Scanner;

public class Product {

	private String 상품명;
	private int 상품재고;
	private int 상품가격;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String 상품명, int 상품재고, int 상품가격) {
		super();
		this.상품명 = 상품명;
		this.상품재고 = 상품재고;
		this.상품가격 = 상품가격;
	}

	public static boolean shop_add() {
		System.out.println("------------------상품 등록 페이지 ----------------");
		System.out.println("상품명: ");
		String 상품명 = Shop.scanner.next();
		System.out.println("상품재고: ");
		int 상품재고 = Shop.scanner.nextInt();
		System.out.println("상품가격: ");
		int 상품가격 = Shop.scanner.nextInt();

		Product product = new Product(상품명, 상품재고, 상품가격);
		for (int i = 0; i < Shop.products.length; i++) {
			if (Shop.products[i] == null) {
				System.out.println("상품이 등록되었습니다");
				Shop.products[i] = product;
				break;
			}
		}

		return false;
	}

	public static void product_list() {
		System.out.println("------------------상품 목록 페이지 ----------------");
		System.out.println("상품명\t상품재고\t상품가격");
		for (int i = 0; i < Shop.products.length; i++) {
			if (Shop.products[i] == null)
				break;
			Product products = Shop.products[i];
			System.out.println(products.get상품명() + "\t" + products.get상품재고() + "\t" + products.get상품가격());

		}

	}
	
	/*//*/
	
	
	

	public String get상품명() {
		return 상품명;
	}

	public void set상품명(String 상품명) {
		this.상품명 = 상품명;
	}

	public int get상품재고() {
		return 상품재고;
	}

	public void set상품재고(int 상품재고) {
		this.상품재고 = 상품재고;
	}

	public int get상품가격() {
		return 상품가격;
	}

	public void set상품가격(int 상품가격) {
		this.상품가격 = 상품가격;
	}

}