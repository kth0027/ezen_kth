package Day08_TF;

import java.util.Scanner;

import Day07.Member;

public class ShopApplication {

	public static Member[] members = new Member[100];
	public static Product[] products = new Product[100];

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			System.out.println("\n\n ------------------ �α��� ������ -------------");
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
			
			if( ch == 3 ) {
				// ���̵�ã�� �޼ҵ� ȣ�� 
			 	String findid = Member.findid();
			 	if( findid == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
			 	else {System.out.println(" [[ ȸ������ ���̵�� "+findid+" ]] ");}
			}
			if( ch == 4 ) {
				// ��й�ȣã�� �޼ҵ� ȣ�� 
			 	String findpw = Member.findpw();
			 	if( findpw == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
			 	else {System.out.println(" [[ ȸ������ ��й�ȣ�� "+findpw+" ]] ");}
			 	
			}
		}



	}

	public static void member_menu(String loginid) {
		Product product = new Product();
		System.out.println("�α���");
		while (true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.��ǰ��� | 2.��ǰ���� | 3.ȯ�� | 4.�α׾ƿ� ");
			System.out.print("���� : ");
			int ch = scanner.nextInt();

			if (ch == 1) {
				Product.product_list();
			}
			
			if( ch == 2 ) {
				System.out.println(" ---------- ��ǰ���� ---------- ");
				Product.product_list();
				System.out.println(" ---------------------------- ");
				System.out.println(" \n ");
				
		
			}
			if( ch == 3 ) { System.out.println(" [[ �˸� ]] : ȯ�ҽ�û �Ǿ����ϴ� "); return; }
			
			if( ch == 4 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		
		}
	}

	public static void admin_menu() {
		System.out.println("admin�α���");
		ShopApplication shop = new ShopApplication(); // Book �ӽð�ü : �޼ҵ� ȣ���
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