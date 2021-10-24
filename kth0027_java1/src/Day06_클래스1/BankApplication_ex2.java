package Day06_클래스1;
//package Day06;
//
//import java.util.Scanner;
//
//public class BankApplication_ex2 {
//
//	// 1. 배열 설정
//	private static Account[] accountArray = new Account[100]; 
//	private static Scanner scanner = new Scanner(System.in);
//	
//	
//	
//	// 2. 메뉴구성
//	public static void main(String[] args) {
//		
//		boolean run = true;
//		
//		while (run) {
//			System.out.println("---------------------------------------------------");
//			System.out.println("1.계좌생성 ㅣ 2.계좌목록 ㅣ 3.예금하기 ㅣ 4.출금하기 ㅣ 5.종료");
//			System.out.println("---------------------------------------------------");
//			System.out.println(">>> 선택 : ");
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
//		System.out.println(" 프로그램 종료 ");
//		
//		
//		
//			
//	}
//	
//	// 3. 계좌생성 
//	public static void createAccount() {
//		System.out.println("---------------------------------------------------");
//		System.out.println("계좌생성");
//		System.out.println("---------------------------------------------------");
//		
//		System.out.print(">> 계좌번호 : "); String ano = scanner.next();
//		System.out.print(">> 계좌명 : "); String owner = scanner.next();
//		System.out.print(">> 입금액 : "); int balance = scanner.nextInt();
//		
//		// 객체 생성
//		Account account = new Account ( ano, owner, balance);
//		
//		for ( int i = 0; i<accountArray.length; i++) {
//			if ( accountArray[i] == null ) {
//				accountArray[i] = account;
//				System.out.println( " 계좌가 생성되었습니다. ");
//				break;
//			} 
//		}
//		
//		
//	}
//	
//	
//	// 3. 계좌 리스트
//	public static void accountList() {
//		System.out.println( "-------------" );
//		System.out.println( "계좌목록");
//		System.out.println( "-------------" );
//		
//		// 배열 내 객체 호출
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
//	// 4. 중복계좌 찾기
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
//	// 5. 입금하기
//	public static void deposit() {
//		System.out.println( "-------------" );
//		System.out.println( "입금하기");
//		System.out.println( "-------------" );
//		
//		// 1) 입력 받기
//		System.out.println(">>> 계좌번호 : "); String ano = scanner.next();
//		System.out.println(">>>예금액 : ");	int balance = scanner.nextInt();
//		
//		// 2) 메소드 호출
//		Account account = findAccount(ano); //
//
//		
//		// 3)
//		if (account = null) {
//			System.out.println( "결과 : 계좌가 존재하지 않습니다.");
//			return;
//		}
//		
//		account.setBalance((account.getBalance() + balance));
//		System.out.println( "결과 : 예금이 성공되었습니다. ");
//		
//	}
//	
//	// 6. 출금하기
//	public static void widtdraw() {
//		System.out.println( "-------------" );
//		System.out.println( "출금하기");
//		System.out.println( "-------------" );
//	}
//	
//	
//
//}
