package Day13_1����;

public class ������� extends Thread {

	static boolean stop = true;
	
	public static void ���ǽ��� ( boolean sw ) {
		
		stop = sw;
		if (stop) {System.out.println("~~~ ���� ����");}
		else {System.out.println("���� ���� ~~ ");}
	}
	
	@Override
	public void run() {
		while(stop) { // stop : true �� ��츸 ����
			System.out.println("���� ����� ~~ ");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}
}
