package application;

import java.net.Socket;

public class Client {

	// 1. ��Ĺ
	Socket socket;
	
	// 2. ������
	public Client(Socket socket) {
		this.socket = socket; // �ܺηκ��� ���� ������ ���μ���
		receive();
	}
	
	// 3. ������ �޼��� �޴� �޼ҵ�
	public void receive () {
		
	}
	
	// 4. ������ �޼����� ������ �޼ҵ�
	public void send() {
		
	}
	
}
