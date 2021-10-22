package Day13_1문제;

public class 영화재생 extends Thread {

	static boolean stop = true;
	
	public static void 영화스톱 ( boolean sw ) {
		
		stop = sw;
		if (stop) {System.out.println("~~~ 영화 시작");}
		else {System.out.println("영화 종료 ~~ ");}
	}
	
	@Override
	public void run() {
		while(stop) { // stop : true 인 경우만 실행
			System.out.println("영화 재생중 ~~ ");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}
}
