package Day29;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day29_client {

	// ��ſ� Ŭ���̾�Ʈ�� ���� �����
	
	public static void main(String[] args) {
		// 1. ���� �����
		Socket socket = new Socket();
		while (true) {
			socket.connect (new InetSocketAddress("127.168.102.50", 5000) );
			System.out.println(" [[ ������ ���� ���� ]]");
			
			// 3. ������ �۽��ϱ� [ ������ ] : ��Ʈ�� �̿��� �ܺ� ��Ʈ��ũ ����
			Scanner scanner = new Scanner (System.in);
		}
	}
}
