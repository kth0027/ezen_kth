package Day12_1_ȸ�������Է�;

import java.util.Scanner;

import Day07.Book;
import Day07.Member;

public class Manager {
	// 0. �Է°�ü ����
	static Scanner scanner = new Scanner(System.in);
	
	// 1. ��ü ����
	public static Member[] members = new Member[100];

	public static void main(String[] args) {
		main_menu(); // �޼ҵ� ȣ��
		}
	
	public static void main_menu() { // 1. ȸ�������

		
		while(true) {
			System.out.println("\n\n ------------------ ȸ������ ���α׷� -------------");
			System.out.println(" 1.�α��� | 2.ȸ������ ");
			System.out.print(" >>> ���� : ");	 int ch = scanner.nextInt();

			if( ch == 1 ) {
				// �α��� �޼ҵ� ȣ��
				String loginid = Member.login();
					// login �޼ҵ��� ��ȯ���� ���� ����
				// 1. �α��� ����
				if( loginid == null ) { System.out.println(" [[ �˸� ]] : ������ ȸ�������� �����ϴ�");}
					
			}
			if( ch == 2 ) {
				// ȸ������ �޼ҵ� ȣ�� 
					// 1. �ٸ�Ŭ���� �޼ҵ� ȣ�� ��� 
						// 1. ��ü������ ��ü�� ���� ��� ���� 
							//Member member = new Member();
							//member.login()
						// 2. �ش� �޼ҵ� static
				Member.signup();
				System.out.println("ȸ������ �Ǿ����ϴ�.");
			}
		}

	} // 1. �޼ҵ� ����
	
	// 2. �α��ν� �޴� �޼ҵ�  
	public static void member_menu( String loginid ) {
		Member member = new Member();
		while(true) {
			System.out.println(" ---------- ȸ���޴� ----------");
			System.out.println(" 1.ȸ����� | 2.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) { System.out.println(" ------ ȸ������Դϴ� ----- "); }
			if( ch == 2 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		}
	}
		
		

		
	
	
	
	
	


}
