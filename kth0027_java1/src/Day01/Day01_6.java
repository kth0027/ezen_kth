package Day01;

import java.util.Scanner;

public class Day01_6 {
	
	//����3 : �ϳ��� �湮�� �Է¹޾� ����ϱ� 
		/*[�Է¹ޱ�] : �ۼ��� , ���� , ��¥ 
		 *[ ��� ] 
		 *	---------------�湮��--------------------
		 *  | ���� | �ۼ��� | 	���� 	| ��¥  |
		 *  |  1  | ��ȣ�� | �ȳ��ϼ��� | 09-28|
		 *  ----------------------------------------
		 */
	
	
	public static void main(String[] args) {
		/*
		Scanner �Է°�ü = new Scanner(System.in);
		
		// �Է�
		System.out.println("�湮�� �ۼ��� : "); String �ۼ��� = �Է°�ü.next();
		System.out.println("�湮�� ���� : "); String ���� = �Է°�ü.next();
		System.out.println("�湮�� ��¥ : "); String ��¥ = �Է°�ü.next();

		
		// ���
		System.out.println("------------ �湮�� ------------");
		System.out.println("����\t�ۼ���\t����\t��¥");
		System.out.println("1"+"\t" + �ۼ��� + "\t" + ���� + "\t" + ��¥ );
		*/
		
		
		// 1. �Է°�ü ����
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ۼ��� : "); String writer = scanner.next();
			scanner.nextLine(); // �ذ���
		System.out.println("���� : "); String contents = scanner.nextLine(); //�������� o 
		// scanner.nextLine(); // next �������� nextLine ���� ���� �߻� 
		// �ذ��� : next �� nextLine ���̿� nextLine() �߰� 
		
		System.out.println("��¥ : "); String date = scanner.next();
		
		// ���
		System.out.println("------------ �湮�� -------------- ");
		System.out.println("| ���� | �ۼ��� | ���� \t | ��¥ |");
		System.out.println("|  1  | "+writer+" | " + contents + "\t | " + date +" |");
		System.out.println("--------------------------------- ");
		
		
	}
}