package Day04_�ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 { // c s
	
	public static void main(String[] args) { // m s
		Scanner scanner = new Scanner(System.in);
		
		// ���ѷ��� => while �̿��� ���ѹݺ�
			// Ű���带 �̿��� ��������
			// ���ѷ��� ���� ��� : 1. ������ false, 2. break

		while (true) {
			
			// ���� [����] ����
			// 1. Random Ŭ���� // 2. Math Ŭ����
				// Random ��ü
					// .nextInt() : int�� ǥ���Ҽ� ������ŭ ���� ���� 
					// .nextInt(����) : 0~���������� ����
					// .nextInt( ���� ) + �ʱⰪ : �ʱⰪ~���ڱ����� ����
			
			Random random = new Random();
			System.out.println( random.nextInt(10) + 1 );
			
//			System.out.println(random.nextInt());
//			System.out.println(random.nextDouble());
//			System.out.println(random.nextBoolean());
				
			
//			System.out.println("���ѷ���");
//			int ���� = scanner.nextInt();
//			if(���� == 4) break;
		}
		
		
			
			
	} // m e
		
} // c e
