package Day01_����Է�;

import java.util.Scanner;

public class Day01_4 { // c s
	public static void main(String[] args) {
		//1. �Է°�ü ���� [ Ű����κ��� �Է°��� �����ϴ� ��ü]
		Scanner �Է°�ü = new Scanner(System.in); 
		
		
		// 2. �Է¹��� �� �����ͼ� ������� �� ���� 
					// ������ ���� �����Ҽ� �ִ� �޸�[ �����ġ ]
		System.out.println("ù��° �Է� : ");
		String ù��°�Է� = �Է°�ü.next();
		
		System.out.print("�ι�° �Է� : ");
		int �ι�°�Է� = �Է°�ü.nextInt();

		// 3. ���� ��� 
		System.out.println("ù��° �Է°��� : " + ù��°�Է�);
		System.out.println("�ι�° �Է°��� : " + �ι�°�Է�);
		
		// ����1 
				/*
				 * �л� �Ѹ��� �̸��� 1~3������ �⼮ ���θ� �Է¹޾� �Է¹��� ���� �Ʒ��� ���� ���
				 * 	// 4��° �Է� ---> �Էµ� ������ ���� => ����,��ü 
				 * 	/*  ��°�� 
				 * 				[[ �⼮�� ]]
				 * --------------------------------------
				 * �̸�		1����	2����	3����		���
				 * ��ȣ��		�⼮		�Ἦ		�⼮
				 * --------------------------------------
				 */

		// �Է¹ޱ�
		System.out.println("�л��� �Է� : "); String �̸� = �Է°�ü.next();
		System.out.println("1���� �⼮ : "); String ����_1 = �Է°�ü.next();
		System.out.println("2���� �⼮ : "); String ����_2 = �Է°�ü.next();
		System.out.println("3���� �⼮ : "); String ����_3 = �Է°�ü.next();
		
		// ����ϱ�
		System.out.println("\n\t\t[[�⼮��]]");
		System.out.println("------------------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("\t\t\t\t");
		System.out.println("------------------------------------------");
	
	}
	
	
} // c e
