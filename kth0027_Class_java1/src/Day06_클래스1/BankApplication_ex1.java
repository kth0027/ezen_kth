package Day06_Ŭ����1;
//package Day06;
//
//import java.util.Scanner;
//
//public class BankApplication_ex1 { // c s
//	
//	// 1. �迭����
//	private static Account[] accountArray = new Account[100];
//	private static Scanner scanner = new Scanner(System.in); 
//	
//	
//	// 2. �޴�
//	public static void main(String[] args) { // m s
//
//		boolean run = true;
//		
//		while (run) {
//			System.out.println("------------------------------------");
//			System.out.println("1.���»��� / 2.���¸�� / 3.���� / 5.����");
//			System.out.println("----------------------------------");
//			System.out.println("���� >>> ");
//			
//			int selectNo = scanner.nextInt();
//			
//			if (selectNo == 1) { createAccount(); }
//			else if (selectNo == 2) {  }
//			else if (selectNo == 3) {  }
//			else if (selectNo == 4) {  }
//			else if (selectNo == 5) {  }
//		}
//		
//	} // m e
//	
//	
//	// 3. ���� �����ϱ�
//	private static void createAccount() {
//		System.out.println("------------------------------------");
//		System.out.println("���»���");
//		System.out.println("----------------------------------");
//		
//		// 1) �Է¹ޱ� 
//		System.out.println(">>> ���¹�ȣ : "); String ano = scanner.next();
//		System.out.println(">>> ������ : "); String owner = scanner.next();
//		System.out.println(">>> �ʱ��Աݾ� : "); int balance = scanner.nextInt();
//		
//		// 2) ��ü����
//		Account account = new Account ( ano, owner, balance);
//		
//		// 3) �迭����
//		for ( int i = 0; i<accountArray.length; i++) {
//			if ( accountArray[i] == null ) {
//				accountArray[i] = account;
//				System.out.println("��� : ���°� �����Ǿ����ϴ�.");
//				break;
//			}
//		} 
//	}
//	
//	
//	// 4. ���� ��Ϻ���
//	private static void accountList() {
//		System.out.println("------------------------------------");
//		System.out.println("���¸��");
//		System.out.println("----------------------------------");
//		
//		// 1) �ε��� ȣ��
//		for ( int i = 0; i < accountArray.length; i++ ) {
//			if ( accountArray[i]==null) break;
//			
//			System.out.println( accountArray[i].getAno() + "\t" accountArray[i].getOwner);
//		}
//		
//	}
//	
//	
//	// 4. �����ϱ�
//	private static void deposit() {
//		
//	}
//	
//	// 5. ����ϱ�
//	private static void withdraw() {
//		
//	}
//	
//	// 6. ���� �ߺ�ã��
//	private static Account findAccount ( String ano ) {
//		
//		Account account = null;
//		
//		for ( int i = 0; i<accountArray.length; i++) {
//			if ( accountArray[i] != null ) {
//				if ( accountArrayp[i].getAno().equals(ano) ) {
//					account = accountArray[i];
//					break;
//				}
//			}
//		}
//		
//		return account;
//		
//	}
//
//} // c e
