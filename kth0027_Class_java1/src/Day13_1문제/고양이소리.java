package Day13_1문제;

public class 고양이소리 extends Thread {
	
//	스레드 이름 설정 (변경가능)
	public 고양이소리() {
		super.setName("고양이소리");
	}

	@Override
	public void run() {
		for (int i = 0; i<5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
			System.out.println("고양이소리 야옹");
		}
		
	}
	

}
