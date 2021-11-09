package Day29;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Day29_client {

	// 통신용 클라이언트용 서버 만들기
	
	public static void main(String[] args) {
		// 1. 소켓 만들기
		Socket socket = new Socket();
		while (true) {
			socket.connect (new InetSocketAddress("127.168.102.50", 5000) );
			System.out.println(" [[ 서버와 연결 성공 ]]");
			
			// 3. 데이터 송신하기 [ 보내기 ] : 스트림 이용한 외부 네트워크 토인
			Scanner scanner = new Scanner (System.in);
		}
	}
}
