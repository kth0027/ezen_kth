package Day12_1_ȸ�������Է�;

import java.util.Scanner;

public class Memberfile {
	
	/*	������ : �α��� / ȸ������ ���α׷� [����ó��]
	 * 
	 *	> [����] : ȸ������ �� ȸ������ ���Ͽ� ����
	 *		// [ȸ��Ŭ����] : ���̵�, ��й�ȣ, ����, ����ó
	 *
	 *	> [����] : �α��� �� ���ϳ� ȸ�������� �����ϸ� �α���
	 */
	
	// 1. �Է¹ޱ� -> 2. ��ü���� -> 3.���Ͼ���[out]
	//	* ������ : 1.ȸ������ 2.ȸ���� �ʵ屸��
	
	// 0. ���� [ ���� �޼ҵ� �ۿ� ���� �ϴ� ���� : �ٸ� Ŭ������ �޼ҵ尡 �����Ҽ� �ֵ��� ]
	public static Scanner scanner = new Scanner(System.in);
	// [ static ����ϴ� ���� : main �޼ҵ庸�� �޸� �켱 �Ҵ� ]
	
	public static Member[] members = new Member[100];
	
	
	public static void main(String[] args) {
		
		// ���Ͽ� ���� ���� �ҷ�����
		while(true) {
			Member temp = new Member();
			temp.signup();
			
		}

	
	
	
	} // m e
	
	

}
