package Day06_클래스1;
//package Day06;
//
//import java.util.Scanner;
//
//public class BankApplication_ex1 { // c s
//	
//	// 1. 배열선언
//	private static Account[] accountArray = new Account[100];
//	private static Scanner scanner = new Scanner(System.in); 
//	
//	
//	// 2. 메뉴
//	public static void main(String[] args) { // m s
//
//		boolean run = true;
//		
//		while (run) {
//			System.out.println("------------------------------------");
//			System.out.println("1.계좌생성 / 2.계좌목록 / 3.예금 / 5.종료");
//			System.out.println("----------------------------------");
//			System.out.println("선택 >>> ");
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
//	// 3. 계좌 생성하기
//	private static void createAccount() {
//		System.out.println("------------------------------------");
//		System.out.println("계좌생성");
//		System.out.println("----------------------------------");
//		
//		// 1) 입력받기 
//		System.out.println(">>> 계좌번호 : "); String ano = scanner.next();
//		System.out.println(">>> 계좌주 : "); String owner = scanner.next();
//		System.out.println(">>> 초기입금액 : "); int balance = scanner.nextInt();
//		
//		// 2) 객체생성
//		Account account = new Account ( ano, owner, balance);
//		
//		// 3) 배열저장
//		for ( int i = 0; i<accountArray.length; i++) {
//			if ( accountArray[i] == null ) {
//				accountArray[i] = account;
//				System.out.println("결과 : 계좌가 생성되었습니다.");
//				break;
//			}
//		} 
//	}
//	
//	
//	// 4. 계좌 목록보기
//	private static void accountList() {
//		System.out.println("------------------------------------");
//		System.out.println("계좌목록");
//		System.out.println("----------------------------------");
//		
//		// 1) 인덱스 호출
//		for ( int i = 0; i < accountArray.length; i++ ) {
//			if ( accountArray[i]==null) break;
//			
//			System.out.println( accountArray[i].getAno() + "\t" accountArray[i].getOwner);
//		}
//		
//	}
//	
//	
//	// 4. 예금하기
//	private static void deposit() {
//		
//	}
//	
//	// 5. 출금하기
//	private static void withdraw() {
//		
//	}
//	
//	// 6. 계좌 중복찾기
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
