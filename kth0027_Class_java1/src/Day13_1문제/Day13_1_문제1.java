package Day13_1문제;

public class Day13_1_문제1 {
	public static void main(String[] args) {
	
		강아지소리 강아지소리 = new 강아지소리();
		고양이소리 고양이소리 = new 고양이소리();
		호랑이소리 호랑이소리 = new 호랑이소리();
		
		강아지소리.start();
		고양이소리.start();
		호랑이소리.start();
		
		try {
			Thread.sleep(6000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 스레드 이름 확인
		System.out.println("스레드1 : " + 강아지소리.getName() );
		// 스레드 이름 확인
		System.out.println("스레드2 : " + 고양이소리.getName() );
		// 스레드 이름 확인
		System.out.println("스레드3 : " + 호랑이소리.getName() );
		
		
		
//		Runnable runnable = new 강아지소리();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
//		Runnable runnable1 = new 고양이소리();
//		Thread thread = new Thread(runnable);
//		thread.start();
//		
//		Runnable runnable2 = new 호랑이소리();
//		Thread thread = new Thread(runnable);
//		thread.start();
		
		
	} // 클래스 종료

}
