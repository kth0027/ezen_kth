package Day29;

import java.net.ServerSocket;

public class Day29_Server {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(); // 1. 서버소켓 만들기
			// 2. 서버소켓에 ip, port 설정
			serverSocket.bind(new InetSocketAddress() );
		} catch (Exception e) {

		}
	}
}
