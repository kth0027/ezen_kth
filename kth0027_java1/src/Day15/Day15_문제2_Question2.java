package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day15_����2_Question2 {

		/*/
		 *
		 *	����2 : set �÷���
		 *		* �ζ����α׷�
		 *			1. 6�� �Է¹޾� set�÷��ǿ� �����Ͽ� ���
		 *			[����] �ߺ��� ���x
		 * /*/
	
		// ����2
		
		public static void main(String[] args) { // m s
			
			Scanner sc = new Scanner (System.in);
			
			HashSet<Integer> set = new HashSet<>(); //�ڡڡڡڡڡڡڡڡ� ����
			
			while (true) {
				System.out.println(" 1~45 ���� ����(�ߺ� �Ұ�) ");
				
				int num = sc.nextInt();
				
				if ( num < 1 || num > 45 ) {
					System.out.println("������ �� ���� ��ȣ");
				}
				
				else {
					// �ߺ�Ȯ��
					if (set.contains(num)) {
						System.out.println(" �ߺ���ȣ �Դϴ� ");
					}
					else {
						set.add(num);
						System.out.println(" Ȯ�� : " + set );
					}
				}
				
				// ���ѷ��� ��ź�� ���� : 6���Է�
				if( set.size() == 6 ) break;
				

			
			
			} // w e
			
			
			
			
			
			
			
		} // m e
}
