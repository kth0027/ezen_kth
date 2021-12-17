package Day08_TF;

import java.util.Scanner;

import Day07.BookApplication;

public class Product {

	private String 상품번호;
	private String 상품명;
	private int 상품재고;
	private int 상품가격;

	public Product() {
	}

	public Product(String 상품번호, String 상품명, int 상품재고, int 상품가격) {
		super();
		this.상품번호 = 상품번호;
		this.상품명 = 상품명;
		this.상품재고 = 상품재고;
		this.상품가격 = 상품가격;
	}

	public static boolean shop_add() {
		System.out.println("------------------상품 등록 페이지 ----------------");
		System.out.println("상품번호: ");
		String 상품번호 = ShopApplication.scanner.next();
		System.out.println("상품명: ");
		String 상품명 = ShopApplication.scanner.next();
		System.out.println("상품재고: ");
		int 상품재고 = ShopApplication.scanner.nextInt();
		System.out.println("상품가격: ");
		int 상품가격 = ShopApplication.scanner.nextInt();

		Product product = new Product(상품번호, 상품명, 상품재고, 상품가격);
		for (int i = 0; i < ShopApplication.products.length; i++) {
			if (ShopApplication.products[i] == null) {
				System.out.println("상품이 등록되었습니다");
				ShopApplication.products[i] = product;
				break;
			}
		}

		return false;
	}

	public static void product_list() {
		System.out.println("------------------상품 목록 페이지 ----------------");
		System.out.println("상품번호\t상품명\t상품재고\t상품가격");
		for (int i = 0; i < ShopApplication.products.length; i++) {
			if (ShopApplication.products[i] == null)
				break;
			Product products = ShopApplication.products[i];
			System.out.println(products.get상품번호() + "\t" + products.get상품명() + "\t" + products.get상품재고() + "\t" + products.get상품가격());

		}

	}
	
	// 상품 구매 메소드

	/*//*/
	
	public String get상품번호() {
		return 상품번호;
	}

	public void set상품번호(String 상품번호) {
		this.상품번호 = 상품번호;
	}
	

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