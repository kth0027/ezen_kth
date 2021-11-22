package Day13_멀티스레드;

import java.awt.Toolkit;

public class BeepThread extends Thread {
			// extends 상속
	
	//	스레드 이름 설정 (변경가능)
	public BeepThread() {
		setName ("쓰레드A");
	}
	
	@Override
	public void run() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 소리
		for (int i = 0; i < 5; i++) {

			toolkit.beep(); // 비프음 소리 메소드

			// 무조건 예외처리
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			} // 0.5초 일시정지 [Thread.sleep( 밀리초[1000/1초] )]

		}

	}

}
