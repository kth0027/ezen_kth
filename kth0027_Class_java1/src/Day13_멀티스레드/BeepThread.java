package Day13_��Ƽ������;

import java.awt.Toolkit;

public class BeepThread extends Thread {
			// extends ���
	
	//	������ �̸� ���� (���氡��)
	public BeepThread() {
		setName ("������A");
	}
	
	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// �Ҹ�
		for (int i = 0; i < 5; i++) {

			toolkit.beep(); // ������ �Ҹ� �޼ҵ�

			// ������ ����ó��
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} // 0.5�� �Ͻ����� [Thread.sleep( �и���[1000/1��] )]

		}

	}

}
