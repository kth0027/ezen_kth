package Day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4_Question4 {

		// ����4 : ���ñ����� �̿��� ���ڿ� ���� ���
			// ����1 : ���ñ���
			// ����2 : �Է¹��� ���ڿ��� ������� ���ÿ� ����
				// char // String
			// ����3 : ���ڿ� �ݴ�� ���
			// ��� ����
				// �Է� : ABC
				// ��� : CBA
	
	public static void main(String[] args) { // m s
	
		
		Scanner scanner = new Scanner(System.in);


		System.out.println("���ڿ� �Է� : "); String str = scanner.next();
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i<str.length(); i++) {
			stack.push(str.charAt(i) );
		}
		
		StringBuilder strb = new StringBuilder();
		while (!stack.empty() ) {
			strb.append(stack.pop() );
		}
		System.out.println(strb);

		

//		// 0. ���� ��ü ����
//		Stack<Character> stack = new Stack<Character>();
//		
//		// 1. �Է¹ޱ�
//		System.out.println(" ���ڿ� �Է� : "); String ���ڿ� = scanner.next();
//		
//		// 2. ���ڿ� �� ���� �ϳ��� ���� ����
//		for (int i = 0; i<���ڿ�.length(); i++) {
//			stack.push(���ڿ�.charAt(i) );
//				// ���ڿ�.charAt(�ε���) : ���ڿ� �� i
//				// ���ø�.push(����) : �ش繮�� ����
//		}
//		
//		// 3. ������
//		for (int i = 0; i<���ڿ�.length(); i++) {
//			System.out.print( stack.pop() );
//		}
//		
		
		
		
		
		
		
	
	} // m e
}
