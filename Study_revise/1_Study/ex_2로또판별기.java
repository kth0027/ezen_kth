package Study01;

import java.util.Scanner;

public class ex_2�ζ��Ǻ��� { // c s
	public static void main(String[] args) { // m s

		// �Է°�ü
		Scanner scanner = new Scanner(System.in);

		// 1. �迭����

		int[] number = new int[6];
		int[] random = new int[6];

		// 2. ����ڷκ��� 6�� �Է¹޾� ����
		for (int i = 0; i < 6; i++) {
			System.out.println(i + "��° ��ȣ[1~45] �� ���� : ");

			int num = scanner.nextInt();
			if (num < 1 || num > 45) { // 1 ~ 45 ���� �ƴ� ���
				System.out.println("��� : 1~45���� �� �Է�");
		
			i--; // ���Է��ϱ����� ����
			continue;
			}
			
			Boolean check = true; // �ߺ��� ������� true �ߺ��� �������� false
			// �ߺ�üũ!!!!!!! : ���࿡ �Է��� ���� �迭�� ������ ���� �����ϸ� �ٽ� �Է� 
			for( int j = 0 ; j<6 ; j++ ) {
				if( num == number[j] ) { // �ߺ�ã�� ���� 
					System.out.println(" [[ �˸� ]] : ������ ���� �̹� ���� �մϴ� : �ٽ� �Է� " );
					i--;  // �������� �Է��� �ƴϱ� ������ i ����
					check = false; // �ߺ��� �ִ°�� 
					break; // �ߺ��� ã�ұ� ������ �ݺ��� ���� 
				}
			}
			if( check ) number[i] = num; // 1~45 ���� �� �̸鼭 �ߺ����� �ƴϸ� i��° �迭�� ����
			
		}
		
		
		// 3. ���
		System.out.println("����ڰ� ������ �� : ");
		for ( int i = 0; i<6; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i<6; i++) {
			
		}
		
		
		

	

	} // m e
} // c e
