package Day01_����Է�;

import java.util.Scanner;

public class Day01_3 {

	//main �޼ҵ� (�Լ�)
	public static void main(String[] args) {

		// ��� Ŭ���� : System
		System.out.println("�Է� : "); // ��� �޼ҵ� ȣ��
		

		// �Է� Ŭ���� : Scanner ��ü
			// 1. Ű����κ��� �Է¹��� ���� �޸�[������ġ] ��ü ����
			// 2. �ٸ� ������ �Է°� �ű��
			// 3. ���ο� �Է°� �ޱ�
		Scanner �Է°�ü = new Scanner(System.in); 
		
		//��ü : Ŭ���� ������� ������ �޸� ����
		// ��ü ���� : Ŭ������ ��ü�� [����] = new ������ ()
		// new : �޸� �Ҵ� ������
		// System.out : ���
		// System.in : �Է�

		// ��ü���� �������� 
			//.next() : ��ü�� ����� ���ڿ� ȣ�� [���� x]
			//.nextInt() : ��ü�� ����� ���� ȣ�� [���� x]
			//.nextLine() : ��ü�� ����� ���ڿ� ȣ�� [���� o]
			//���
		String String1 = �Է°�ü.next();
			// ��ü�� ����� �Է°��� ������ ����
		System.out.println("�Էµ� ���ڿ��� : " + String1);
		
		System.out.print("�Է�2 : ");
			// �ι�° �Է°� ��������
		
		String String2 = �Է°�ü.next();
			//���
		System.out.println("�Էµ� �ι�° ���ڿ��� : " + String2);
	}
}
