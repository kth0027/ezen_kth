package Day10_2;

public class Account {

	// 필드
	private long balance;
	
	// 생성자
	public Account() {}
	
	// 메소드
	public long getBalance() {
		return balance;
	}
	
	// 예금
	public void deposit ( int money ) {
		balance += money;
	}
	
	// 출금 [ 예금액보다 출금액이 더 크면 예외 만들기 ]
	public void withraw ( int money ) throws 잔고부족 {
		if (balance < money) {
			// 예외만들어서 발생하기
			throw new 잔고부족 ("잔고부족 : " + (money-balance)+ "모자람" );
					// 잔고부족 클래스 생성
		}
		// 아니면
		balance -= money;
	}
	
		
}
