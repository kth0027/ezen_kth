package Day13_1����;

public class ȣ���̼Ҹ� extends Thread {
	
//	������ �̸� ���� (���氡��)
	public ȣ���̼Ҹ�() {
		super.setName("ȣ���̼Ҹ�");
	}

	@Override
	public void run() {
		for (int i = 0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println("ȣ���̼Ҹ� ����");
		}
		
	}

}
