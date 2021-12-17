package Shop;

import java.util.Scanner;

public class MyShop implements iShop {
	private String title;
	private Scanner sc = new Scanner(System.in);
	private String sellUser;

	// 장바구니 배열
	private Product[] carts = new Product[10];

	// 회원정보 배열 - 회원이믈, 결제타입
	private User users[] = new User[2];

	// 상품정보 배열 - 상품이름, 가격, 상세정보
	private Product products[] = new Product[5];

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		// 고객 2명 생성
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		products[0] = new SmartTv("스마트tv1", 300000, "1080");
		products[1] = new SmartTv("스마트tv2", 200000, "1080");
		products[2] = new Cellphone("스마트폰1", 1000000, "kt");
		products[3] = new Cellphone("스마트폰2", 1100000, "lg");
		products[4] = new Cellphone("스마트폰3", 1500000, "skt");

	}

	@Override
	public void start() {
		System.out.println(title + ": 메인 화면 - 계정 선택");
		System.out.println("======================");
		for (int i = 0; i < users.length; i++) {
			System.out.printf("[%d] %s(%s)\n", i, users[i].getName(), users[i].getPayType());
		}
		System.out.println("[x] 종료");
		System.out.print("선택 : ");

		String input = sc.next();
		System.out.println("### " + input + "선택 ###");

		switch (input) {
		case "x":
			System.exit(0);
			break;

		default:
			sellUser = input;
			productList();
			break;
		}
	}

	public void productList() {
		System.out.println(title + ": 상품 목록 - 상품 선택");
		System.out.println("======================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]", i);
			products[i].printDetial();
		}
		System.out.println("[h] 메인화면");
		System.out.println("[c] 체크아웃");
		System.out.print("선택 : ");

		String input = sc.next();

		switch (input) {
		case "h":
			// 메인화면 보여주기
			start();

			break;
		case "c":
			checkOut();

			break;

		default:
			// 사용자가 선택한 상품을 cart에 담기
			for (int i = 0; i < carts.length; i++) {
				if (carts[i] == null) {
					carts[i] = products[Integer.parseInt(input)];
					break;
				}
			}

			// 상품 목록 보여주기
			productList();
			break;

		}
	}

	public void checkOut() {
		System.out.println("## c선택 ##");
		System.out.println(title + ": 체크아웃");
		System.out.println("======================");

		int total = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i] != null) {
				System.out.printf("[%d] %s (%d)\n", i, carts[i].getPname(), carts[i].getPrice());
				total += carts[i].getPrice();
			}
		}
		System.out.println("======================");
		System.out.println("결제방법 : " + users[Integer.parseInt(sellUser)].getPayType());
		System.out.println("합계 : " + total);
		System.out.println("[p] 이전, [q] 결제 완료");
		System.out.print("선택 : ");

		String input = sc.next();

		switch (input) {
		case "p":
			productList();
			break;
		case "q":
			System.out.println("결제가 완료되었습니다.");
			break;
		default:
			break;
		}
	}

}
