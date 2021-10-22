package Day13_1문제;

public class 강아지소리 extends Thread {
	
//	스레드 이름 설정 (변경가능)
	public 강아지소리() {
		super.setName("강아지소리");
	}
	

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

			System.out.println("강아지소리 멍멍");
		}

	}


}
