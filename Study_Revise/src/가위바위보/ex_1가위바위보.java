package ����������;

import java.util.Random;
import java.util.Scanner;

public class ex_1���������� { // c s


	// ����������
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		int �÷��̾�; int ��ǻ��;
		int ���Ӽ� = 0;
		int �÷��̾�¸��� = 0; int ��ǻ�ͽ¸��� = 0;
		
		while (true) { // w s
			
			// 1. ����� �Է�
			System.out.println( " ------------ ���������� ���� ------------ " );
			System.out.println( " >>>>> ����[0] ����[1] ��[2] ����[3] �� ���� : " );

			�÷��̾� = scanner.nextInt();
			
			// 4. 3�� �Է½� ���� ����
			if ( �÷��̾� == 3 ) {
				System.out.println( " >>>>> [��������] : ����Ƚ�� : " + ���Ӽ� );
				if ( �÷��̾�¸��� > ��ǻ�ͽ¸��� ) {
					System.out.println( " >>>>> [�����¸���] : �÷��̾� " + �÷��̾�¸��� );
				} else if ( �÷��̾�¸��� < ��ǻ�ͽ¸��� ) {
					System.out.println( " >>>>> [�����¸���] : ��ǻ�� " + ��ǻ�ͽ¸��� );
				} else {
					System.out.println( " >>>>> [�����¸���] : ���º� " );
				} break;
			}
			
			if ( �÷��̾� < 0 || �÷��̾�>3 ) {
				System.out.println( " [�˼� ���� ��ȣ �Դϴ� : �ٽ��Է��ϼ��� ]" );
				continue;
			}
			
			// 2. ��ǻ�� ��������
			Random random = new Random(); /// ���� ��ü
			��ǻ�� = random.nextInt(3); // 0 ~  2 ���� ����
			System.out.println( " >>>  ��ǻ�Ͱ� �� �� : " + ��ǻ�� );
			
			// 3. �÷��̾� �¸��� �Ǵ� 
			if ( (�÷��̾� == 0 && ��ǻ�� == 2) || (�÷��̾� == 1 && ��ǻ�� == 0) || (�÷��̾� == 2 && ��ǻ�� == 1) ) {
				System.out.println( " >>> �÷��̾� �¸� ");
				�÷��̾�¸���++;
			}
			
			else if ( (�÷��̾� == 0 && ��ǻ�� == 0) || (�÷��̾� == 1 && ��ǻ�� == 1) || (�÷��̾� == 2 && ��ǻ�� == 2) ) {
				System.out.println( " >>> ���º� ");
			} 
			
			else {
				System.out.println( " >>> ��ǻ�� �¸� ");
				��ǻ�ͽ¸���++;
			} 
			
			���Ӽ�++;
			
			 
			
			
			
		} // w e
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	
} // c e
