package Day15_�÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.Scanner;

import Day07_Ŭ����2.array;

public class Day15_����1_Question1 {

		/*/
		 *	����1 : list �÷���
		 * 		* ����� ���α׷�
		 * 		[�޴�]
		 * 			1. ����߰� (�ο����� �Է¹޾� ����ȣ ��ȯ)
		 * 			2. ������ (����ȣ �Է¹޾� ��� ���)
		 * 			[������] 3. �������(����ȣ 1������ ��������� ���� ���)
		 * 

		 * /*/
	
		// ����1
		
		public static void main(String[] args) { // m s
			
			// 0. �Է°�ü
			Scanner sc = new Scanner(System.in);
			
			// 0. ����Ʈ ��ü�� Integer ��ü���� ����
			ArrayList<Integer> list = new ArrayList<>();
					
			System.out.println(" ------- ����� ���α׷� ------- ");
			

			while (true) {
				////////////////////////////////////////////////////////////////////////////////
				System.out.println(" ----- ��� ��Ȳ ------ ");
				for( int i = 0 ; i<list.size() ; i++ ) {
					System.out.println("����ȣ : "+ (i+1) +"�� " + " �ο� : " + list.get(i) );
				}
				//////////////////////////////////////////////////////////////////////////////
				System.out.println("1.����߰�  2.������  3.������");
				System.out.println("���� : ");
				
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println(" �ο��� : ");
					int count = sc.nextInt();
							
					// 1. ����Ʈ ��ü�� ����
					list.add(count);
					System.out.println( " ������ ����ȣ : " + list.size() );
					
				}
				else if ( ch == 2 ) {
					System.out.println(" ����� ����ȣ : ");
					int num = sc.nextInt();
					
					// 2. ����Ʈ ��ü�� ����
					list.remove(num-1);	// -1���ִ� ���� = ����ȣ��1�� . �ε����� 0 ������
					System.out.println(" ��� �Ǿ����ϴ� ");
					
				}
				else if ( ch == 3 ) {
					if (list.isEmpty() ) {
						System.out.println(" ������� ���� �����ϴ� ");
					}
					
					else {
						System.out.println(" ����ȣ 1�� ���� ");
						list.remove(0); // ����ȣ 1�� ����
					}
				} 

			
			} // w e
			
			
		} // m e
}
