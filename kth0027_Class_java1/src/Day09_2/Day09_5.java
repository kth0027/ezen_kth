package Day09_2;



public class Day09_5 {

	// ���� ���α׷� [ ���, �������̽� ]
		// ATM [�������̽�]
			// �߻� �޼ҵ� : ���µ��, ����, ���, ��ü, �ܰ�
	
		// 1. ���� [����Ŭ����]
			// �ʵ�(�Ӽ�) : ���¹�ȣ, ���ݾ�

		// 2. �������� [����Ŭ����]	
		// 3. �������� [����Ŭ����]
	
	public static Bank[] banklist = new Bank[100];
	
	public static void main(String[] args) {
		
		// 1. �������̽� ����
		ATM atm;
		
		// 2. �������̽� Ŭ���� ����
		atm = new ��������();
		
		// 3. �������̽��κ��� Ŭ���� 
		atm.���µ��();
		atm.����();
		atm.���();
		atm.�ܰ�();
		
		// 4. �������̽� �� Ŭ���� ����
		atm = new ��������();
		atm.���µ��();
		
		// 5. ������ ����Ŭ�����κ��� ���� �ٸ� ����Ŭ������ �迭�� ���
			// ����Ŭ������ �迭 ����
		
		Bank account1 = new Bank();	
		banklist[0] = account1;
		
		�������� account2 = new ��������();
		banklist[1] = account2;
		
		�������� account3 = new ��������();
		banklist[2] = account3;
		
	}
}