package Day10_2;

public class Account {

	// �ʵ�
	private long balance;
	
	// ������
	public Account() {}
	
	// �޼ҵ�
	public long getBalance() {
		return balance;
	}
	
	// ����
	public void deposit ( int money ) {
		balance += money;
	}
	
	// ��� [ ���ݾ׺��� ��ݾ��� �� ũ�� ���� ����� ]
	public void withraw ( int money ) throws �ܰ���� {
		if (balance < money) {
			// ���ܸ��� �߻��ϱ�
			throw new �ܰ���� ("�ܰ���� : " + (money-balance)+ "���ڶ�" );
					// �ܰ���� Ŭ���� ����
		}
		// �ƴϸ�
		balance -= money;
	}
	
		
}
