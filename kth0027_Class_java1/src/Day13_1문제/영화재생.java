package Day13_1����;

public class ��ȭ��� extends Thread {

	static boolean stop = true;
	
	public static void ��ȭ���� ( boolean sw ) {
		
		stop = sw;
		if (stop) {System.out.println("~~~ ��ȭ ����");}
		else {System.out.println("��ȭ ���� ~~ ");}
	}
	
	@Override
	public void run() {
		while(stop) { // stop : true �� ��츸 ����
			System.out.println("��ȭ ����� ~~ ");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
		}
	}
}
