package Day15_�÷��������ӿ�ũ;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_����3_Question3 {

	/*
	 * / ����3: ����ö ����
	 *
	 * [����1] : �� 4�� ( ������ > ��� > ���� > ���� > ������ )
	 * 
	 * [����2] : ��ö 3�� ��ü [ �������� 3�� ��ö ��� ]
	 * 
	 * [����3] : ��� ��ȣ�� �޾Ƽ� �ش翪���� ����ؼ� ���������� ����
	 * 
	 * [����4] : �� �� �ҿ�ð� 2��
	 *
	 * /
	 */

	public static void main(String[] args) throws Exception {
		

//		Queue <String> ������1 = new LinkedList<String>();
//			������1.offer("������");
//			������1.offer("��꿪");
//			������1.offer("���￪");
//			������1.offer("���ο�");s
//			������1.offer("������");
//			
//			System.out.println( ������1 );
//			
//			// 3. ����
//			System.out.print(������1.poll() );
//			System.out.print(" ");
//			System.out.print(������1.poll() );
//			System.out.print(" ");
//			System.out.print(������1.poll() );
//			System.out.print(" ");
//			System.out.print(������1.poll() );
//			System.out.print(" ");
//			System.out.print(������1.poll() );
		
		
		Scanner scanner = new Scanner(System.in);
		
		Queue<String> ������ = new LinkedList<String>();
		Queue<String> ��꿪 = new LinkedList<String>();
		Queue<String> ���￪ = new LinkedList<String>();
		Queue<String> ���ο� = new LinkedList<String>();

		������.offer("1����ö");
		������.offer("2����ö");
		������.offer("3����ö");

		while (true) {
			System.out.println(������);
			System.out.println(��꿪);
			System.out.println(���￪);
			System.out.println(���ο�);
			System.out.println("1.���� 2.��� 3.���� 4.����");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.println(������);
				if (!������.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("��� : " + ������.peek());
					��꿪.offer(������.poll());
				}
			}
			if (ch == 2) {
				System.out.println(��꿪);
				if (!��꿪.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("��� : " + ��꿪.peek());
					���￪.offer(��꿪.poll());
				}
			}
			if (ch == 3) {
				System.out.println(���￪);
				if (!���￪.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("��� : " + ���￪.peek());
					���ο�.offer(���￪.poll());
				}
			}
			if (ch == 4) {
				System.out.println(���ο�);
				if (!���ο�.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("��� : " + ���ο�.peek());
					������.offer(���ο�.poll());
				}
			}
		}

		//////////////////////////////////////////////////////////////////////////////

//		�� ������ = new ��();
//			������.��ö���.offer(new ��ö("A-1") );
//			������.��ö���.offer(new ��ö("A-2") );
//			������.��ö���.offer(new ��ö("A-3") );
//			������.��ö���.offer(new ��ö("A-4") );
//			
//		�� ��꿪 = new ��();
//		�� ���￪ = new ��();
//		�� ���ο� = new ��();
//		
//		while (true) {
//			System.out.println("  �� �� �� ȣ  ");
//			System.out.println(" 1.���� 2.��� 3.���� 4.����");
//			int ch = sc.nextInt();
//			if ( ch == 1 ) {
//				//////////////////////////////
//				if (������.��ö���.isEmpty() ) {
//					System.out.println("������� ��ö�� �����ϴ�");
//				} else {
//					��ö ��ö = ������.��ö���.poll();
//					try {
//						System.out.println("�̵����Դϴ�");
//						Thread.sleep(2000);
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//					������.��ö���.offer(��ö);
//				}
//				//////////////////////////////
//			}
//			if ( ch == 2 ) {}
//			if ( ch == 3 ) {}
//			if ( ch == 4 ) {}
//		}

	} // m e

}
