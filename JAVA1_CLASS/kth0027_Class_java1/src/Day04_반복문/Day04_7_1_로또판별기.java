package Day04_�ݺ���;

import java.util.Random;
import java.util.Scanner;

public class Day04_7_1_�ζ��Ǻ��� { // Ŭ���� ����

	// ���� : itdanja@kakao.com
	
	// ���� 1. �ζ��Ǻ���

		// [����1] : 1~45 ������ ���� 6�� �Է¹޾� �迭�� ����
			// �� : �ߺ� �Ұ� // 1~45 ���̸� ����

		// [����2] : ��÷��ȣ�� �������� 1~45 ���̸� ����

		// [����3] : �� �迭�� ������ ���ڰ� � �ִ��� üũ�Ͽ� ��� ���
	

		// [���] : ��� �������� ����ϰ� ��� ���

		// 6����� �����ϸ� 1�� // 5�� �����ϸ� 2�� // 4�� �����ϸ� 3�� // 3�� �����ϸ� 4�� // ��
	
	public static void main(String[] args) { // ���� ����
		
		// �Է°�ü
		Scanner scanner = new Scanner(System.in);
		
		// 0. �迭	[ �迭���� : �ڷ���[] �迭�� = new �ڷ���[����]	]
		int[] number = new int[6]; // int�� 6�� ������ ������ �� �ִ� �迭
		int[] random = new int[6];
		
		
		// 1~45 ���� �� �� 6���� ���� �Է��Ͽ� �迭 ����
		for (int i = 0; i<6; i++) {	
			System.out.println( i + "��° ��ȣ [1~45] ���� : ");
			
			int num = scanner.nextInt();
			if ( num < 1 || num > 45 ) { // 0 ~ 45 ���� ���ڰ� �ƴ� ���
				System.out.println( " [[�˸� ]] 0 ~ 45 ���� ���ڸ� �Է� �����մϴ�. ");
				i--; // ������ �Է��� �ƴϹǷ� i ����
				continue;
			}
			
			Boolean check = true; // �ߺ��� ������ true ������ false
			
			// �ߺ�üũ!! ������ �� ���Է� //
			for ( int j = 0; j <6; j++) {
				if ( num == number[j] )	{ // �ߺ�ã�� ����
					System.out.println( " [[�˸� ]] �ߺ��� �����Դϴ�. �ٽ��Է��ϼ���. ");
					i--; // �������� �Է��� �ƴϹǷ� i ����
					check = false; // �ߺ� �ִ� ���
					break;
				}
			}
			if (check) number [i] = num; // 1 ~ 45 ���� �� �̸鼭 �ߺ� �ƴ� �� i ��° �迭 ����
		}
		
		// 2. ���
		System.out.print(" ����ڰ� ������ �� : ");
		for( int i = 0 ; i<6 ; i++ ) {
			System.out.print( number[i] +" ");
		}
		System.out.println();
		
		// 3. 6�� ������ �����Ͽ� �迭�� ���� [�ߺ� üũ]
		for( int i = 0 ; i<6 ;i++ ) {
			Random random2 = new Random(); // ���� ��ü ���� 
			int num = random2.nextInt(45)+1; // ���� ��ü���� 1~45������ ���� �������� 
		
			Boolean check = true;  // �ߺ����� Ȯ�� üũ 
			for( int j = 0 ; j<6 ;j++ ) { // �ݺ��ϸ鼭 �迭�� �ߺ��� ã�� 
				if( num == random[j] ) { // ���࿡ ������ ���� �迭�� ���� �����ϸ� 
					i--;
					check = false;
					break;
				}
			}
			if( check ) random[i] = num; // �ߺ����� ������� i��°�� ���� �ֱ� 
		}
		
		// 4. ��� 
				System.out.print(" �̹��� ��÷ ��ȣ : ");
				for( int i = 0 ; i<6 ; i++ ) {
					System.out.print( random[i] +" ");
				}
				System.out.println();
				
				int count = 0; // ���� ��  ���� 
		
		// 5. �� �迭 ���� �� üũ
				
		for( int i = 0 ; i<6 ;i++ ) {	// i�� number �迭�� �ε��� 
			for( int j = 0 ; j<6 ; j++ ) { // j�� random �迭�� �ε���  => 36�� �� [ i 1���� j�� 6���� �� ]
				if( number[i] == random[j] ) { // ���࿡ �����ϸ� 
					count++; // ���� �� ������ 1���� 
				}
			}
		}
		System.out.println(" >>> ��÷ ��� : " + count );
				
		
		
		
	} // ��������
				
} // Ŭ���� ����
