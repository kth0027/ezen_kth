package Day10_2;

public class Day10_9 {
	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance() );
		
		try {
			account.withraw(30000); // �ش� �޼ҵ�� ���ܴ����� ���	
		} catch (�ܰ���� e) {
			System.out.println(e.getMessage() );
			// ���ܰ�ü.getMessage : ���� ���� 
			e.printStackTrace();
			// ���ܰ�ü.printStackTrace() : ���� ���� [ ���� ��ġ ]
		}
		
	}
	
}
