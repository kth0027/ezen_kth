package Day06_Ŭ����1;
//package Day06;
//
//import java.util.Scanner;
//
//public class BankApplication_ex2 {
//
//	// 1. �迭 ����
//	private static Account[] accountArray = new Account[100]; 
//	private static Scanner scanner = new Scanner(System.in);
//	
//	
//	
//	// 2. �޴�����
//	public static void main(String[] args) {
//		
//		boolean run = true;
//		
//		while (run) {
//			System.out.println("---------------------------------------------------");
//			System.out.println("1.���»��� �� 2.���¸�� �� 3.�����ϱ� �� 4.����ϱ� �� 5.����");
//			System.out.println("---------------------------------------------------");
//			System.out.println(">>> ���� : ");
//			
//			int selectNo = scanner.nextInt();
//			
//			if ( selectNo == 1) { createAccount(); }
//			else if ( selectNo == 2) { accountList(); }
//			else if ( selectNo == 3) { deposit();}
//			else if ( selectNo == 4) { }
//			else if ( selectNo == 5) { run = false; }
//			
//			
//			
//		}
//		System.out.println(" ���α׷� ���� ");
//		
//		
//		
//			
//	}
//	
//	// 3. ���»��� 
//	public static void createAccount() {
//		System.out.println("---------------------------------------------------");
//		System.out.println("���»���");
//		System.out.println("---------------------------------------------------");
//		
//		System.out.print(">> ���¹�ȣ : "); String ano = scanner.next();
//		System.out.print(">> ���¸� : "); String owner = scanner.next();
//		System.out.print(">> �Աݾ� : "); int balance = scanner.nextInt();
//		
//		// ��ü ����
//		Account account = new Account ( ano, owner, balance);
//		
//		for ( int i = 0; i<accountArray.length; i++) {
//			if ( accountArray[i] == null ) {
//				accountArray[i] = account;
//				System.out.println( " ���°� �����Ǿ����ϴ�. ");
//				break;
//			} 
//		}
//		
//		
//	}
//	
//	
//	// 3. ���� ����Ʈ
//	public static void accountList() {
//		System.out.println( "-------------" );
//		System.out.println( "���¸��");
//		System.out.println( "-------------" );
//		
//		// �迭 �� ��ü ȣ��
//		for ( int i = 0; i<accountArray.length; i++) {
//			if (accountArray[i] == null ) break;
//			
//			System.out.println( accountArray[i].getAno() + "\t"
//					+ accountArray[i].getOwner() + "\t" + accountArray[i].getBalance() );
//			
//		}
//				
//	}
//	
//	// 4. �ߺ����� ã��
//	public static Account findAccount ( String ano ) {
//		Account account = null;
//	
//		for ( int i = 0; i<accountArray.length; i++) {
//			if ( accountArray[i] != null ) {
//				account = accountArray[i];
//				break;
//			}
//		}
//		
//		return account;
//	}
//	
//	// 5. �Ա��ϱ�
//	public static void deposit() {
//		System.out.println( "-------------" );
//		System.out.println( "�Ա��ϱ�");
//		System.out.println( "-------------" );
//		
//		// 1) �Է� �ޱ�
//		System.out.println(">>> ���¹�ȣ : "); String ano = scanner.next();
//		System.out.println(">>>���ݾ� : ");	int balance = scanner.nextInt();
//		
//		// 2) �޼ҵ� ȣ��
//		Account account = findAccount(ano); //
//
//		
//		// 3)
//		if (account = null) {
//			System.out.println( "��� : ���°� �������� �ʽ��ϴ�.");
//			return;
//		}
//		
//		account.setBalance((account.getBalance() + balance));
//		System.out.println( "��� : ������ �����Ǿ����ϴ�. ");
//		
//	}
//	
//	// 6. ����ϱ�
//	public static void widtdraw() {
//		System.out.println( "-------------" );
//		System.out.println( "����ϱ�");
//		System.out.println( "-------------" );
//	}
//	
//	
//
//}
