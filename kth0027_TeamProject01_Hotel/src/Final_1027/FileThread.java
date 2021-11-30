package Final_1027;

public class FileThread extends Thread {

	@Override
	public void run() {
		while (true) {

			File.fileload(2);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.err.println("贸府吝");
			}
			
			File.filesave(2);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.err.println("贸府吝");
			}
		}
	}

}
