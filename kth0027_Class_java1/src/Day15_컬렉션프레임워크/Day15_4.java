package Day15_�÷��������ӿ�ũ;

import java.util.Hashtable;
import java.util.Scanner;

public class Day15_4 {

	public static void main(String[] args) {
		

		// Hashtable // ȸ������ // �α���
		// 0. ����
		Scanner sc = new Scanner(System.in);
		
		// 0. map�÷��� ����
		Hashtable<String, String> hashtable = new Hashtable<>();
				//���̵�(Ű) , ��й�ȣ(��) 		// Ű : �ߺ��Ұ�
		
		// �޴�
		while (true) {
			System.out.println("1.ȸ������ 2. �α���"); int ch = sc.nextInt();
			
			if ( ch == 1) {
				System.out.println("���̵� : "); String id = sc.next();
				System.out.println("��й�ȣ : "); String password = sc.next();
				
				//*
				if ( hashtable.contains(id)) {
					System.out.println("[���Խ���] ** �̹� ������� ���̵��Դϴ�");
				} 
				else {
					// 1. map�� ��ü �ֱ�
					hashtable.put(id, password); System.out.println("[[���Լ���]]");
				}
			}
			
			///////////////////////////////////////////////////////////////////////////
			if (ch == 2) {
				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��й�ȣ : ");
				String password = sc.next();

				if (hashtable.get(id).equals(password)) {
					System.out.println("�α��� ����");
				} else {
					System.out.println("�н����尡 �ٸ��ϴ�");
				}

			} else {
				System.out.println(" ���̵� �ٸ��ϴ� ");
			}
			/////////////////////////////////////////////////////////////////////////

			
		
		} // w e
		
		 
		

		
		
		
		
	}
}

