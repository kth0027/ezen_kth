package Day13_1����;

public class �������Ҹ� extends Thread {
	
//	������ �̸� ���� (���氡��)
	public �������Ҹ�() {
		super.setName("�������Ҹ�");
	}
	

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

			System.out.println("�������Ҹ� �۸�");
		}

	}


}
