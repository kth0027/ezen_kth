package application;

import java.net.Socket;

public class Client {

	// 1. 소캣
	Socket socket;
	
	// 2. 생성자
	public Client(Socket socket) {
		this.socket = socket; // 외부로부터 들어온 소켓이 내부소켓
		receive();
	}
	
	// 3. 서버로 메세지 받는 메소드
	public void receive () {
		
	}
	
	// 4. 서버가 메세지를 보내는 메소드
	public void send() {
		
	}
	
}
