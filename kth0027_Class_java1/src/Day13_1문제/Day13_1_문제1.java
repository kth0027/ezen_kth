package Day13_1����;

public class Day13_1_����1 {
	public static void main(String[] args) {
	
		�������Ҹ� �������Ҹ� = new �������Ҹ�();
		����̼Ҹ� ����̼Ҹ� = new ����̼Ҹ�();
		ȣ���̼Ҹ� ȣ���̼Ҹ� = new ȣ���̼Ҹ�();
		
		�������Ҹ�.start();
		����̼Ҹ�.start();
		ȣ���̼Ҹ�.start();
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// ������ �̸� Ȯ��
		System.out.println("������1 : " + �������Ҹ�.getName() );
		// ������ �̸� Ȯ��
		System.out.println("������2 : " + ����̼Ҹ�.getName() );
		// ������ �̸� Ȯ��
		System.out.println("������3 : " + ȣ���̼Ҹ�.getName() );
		
		
		
//		Runnable runnable = new �������Ҹ�();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
//		Runnable runnable1 = new ����̼Ҹ�();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
//		Runnable runnable2 = new ȣ���̼Ҹ�();
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		
	} // Ŭ���� ����

}
