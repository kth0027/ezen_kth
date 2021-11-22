package Day13_1문제;

public class 음악재생 extends Thread {

	static boolean stop = true;
	
	public static void 음악스톱 ( boolean sw ) {
		
		stop = sw;
		if (stop) {System.out.println("~~~ 음악 시작");}
		else {System.out.println("음악 종료 ~~ ");}
	}
	
	@Override
	public void run() {
		while(stop) { // stop : true 인 경우만 실행
			System.out.println("음악 재생중 ~~ ");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}
}
