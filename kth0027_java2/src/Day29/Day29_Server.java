package Day29;

import java.net.ServerSocket;

public class Day29_Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(); // 1. �������� �����
			// 2. �������Ͽ� ip, port ����
			serverSocket.bind(new InetSocketAddress() );
		} catch (Exception e) {

		}
	}
}
