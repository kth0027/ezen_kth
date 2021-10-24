package Day08_1TF;

import java.util.Scanner;

import Day08_���.Member;

public class Shop {

	public static Member[] members = new Member[100];
	public static Product[] products = new Product[100];
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("---------------------------------------------");
			System.out.println("1.�α��� | 2.ȸ������ | 3.���̵�ã�� | 4.��й�ȣã�� ");
			System.out.println("----------------------------------------------");
			System.out.println(" ���� >>>>");
			int ch = scanner.nextInt();
			if (ch == 1) {
				// �α��� �޼ҵ�
				String loginid = Member.login();
				if (loginid == null) {
					System.out.println("������ ȸ�������� �����ϴ�");
				} else if (loginid.equals("admin")) {
					admin_menu();

				} else {
					member_menu(loginid);
				}

			}
			if (ch == 2) {// ȸ������ �޼ҵ�
				Member.signup();
			}
		}

//			if(ch ==3 ) {//���̵�ã�� �޼ҵ� ȣ��
//				String findid = Member.findid();
//				if(findid==null)}

//			if(ch ==4 ) {}

	}

	public static void member_menu(String loginid) {
		Product product = new Product();
		System.out.println("�α���");
		while (true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.��ǰ��� | 2.���� | 3.ȯ�� | 4.�α׾ƿ� ");
			System.out.print("���� : ");
			int ch = scanner.nextInt();

			if (ch == 1) {
				Product.product_list();
			}
			
			if( ch == 2 ) {
				System.out.println(" ---------- ��ǰ ��� ---------- ");
				Product.product_list();
				System.out.println(" ---------------------------- ");
				System.out.println(" \n ");
				
				
				
			}
			// if( ch == 3 ) { book.book_return( loginid ); }
			if (ch == 4) {
				System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� ");
			}
		}
	}

	public static void admin_menu() {
		System.out.println("admin�α���");
		Shop shop = new Shop(); // Book �ӽð�ü : �޼ҵ� ȣ���
		while (true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.��ǰ��� | 2.��ǰ��� | 3.�α׾ƿ� ");
			System.out.print("���� : ");
			int ch = scanner.nextInt();
			if (ch == 1) {
				Product.shop_add();
			}
			if (ch == 2) {
				Product.product_list();
			}
			if (ch == 3) {
				System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� ");
				return;
			}
		}
	}

}