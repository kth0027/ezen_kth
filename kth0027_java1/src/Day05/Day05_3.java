package Day05;

import java.util.Scanner;

public class Day05_3 {
	
	// p.181 Ȯ�ι���
		// 1. 2
			//���� : �����̸� ����
			// �� : ������ ���� ��
			// 3. == != ��ü�ּҰ� �� [ ��ü ���빰 ��x ]
				// .equals [ ��ü ���빰 �� o ]
	
		// 2. 3
			// 1. ���α׷� ����� �޸� �ʱ�ȭ 	
			// 3. �������� �ʴ� ��ü�� �ڵ� �Ҹ�
			
		// 3. 2 [ ���ڿ� �����ص� ��ü�� �ٸ� �� �ֱ� ������ ]

		// 4. 2 [ int[] array = {1, 2, 3 } ]
			// int ���� ;
			// ���� = 10
	
		// 5.  [ boolean	Ÿ�� �迭�� �ʱⰪ�� false ] 
	
		// 6. 3 / 5
			// �迭��.length : �����
			// �迭��[��].length : �ش� ���� �� ����
	
		// 7. [ �迭 �� ��� �ε����� �����ϱ� ���ؼ� for Ȱ�� ]
		public static void main(String[] args) {
			
//			int max = 0;
//			int[] array = { 1, 5, 3, 8, 2};
//			
//			//�ۼ���ġ
//			for ( int i = 0; i<array.length; i++) { // i�� �ε��� 0���� 4���� 1�� �����ϸ鼭 �ݺ�
//				if ( array[i] > max) max = array[i]; // i��° �ε��� ���� max���� ũ�� max�� i��° �ε��� ��
//			}
//			
//			System.out.println( "max: " + max);
			
//		// 8. [ �迭�� ��� �ε����� �����ϱ� ���ؼ� for Ȱ�� ] 
//
//			int [][] array = {
//					{95, 86},
//					{83, 92, 96},
//					{78, 83, 93, 87, 88},
//			};
//			
//			
//		  	int sum = 0;
//		  	double avg = 0.0;
//			
//			// �ۼ���ġ
//
//		  	int count = 0 ; // ���� ���� 
//
//		  	// �� �ݺ���
//		  	for( int i = 0 ; i < array.length ; i++ ) {
//		  	// �� �ݺ���
//		  		for( int j = 0 ; j< array[j].length ; j++ ){
//		  			 			// �ش� �ε��� �� �����ͼ� sum �����հ� ���ϱ�  
//		  				sum += array[i][j];
//		  		}
//		  		count += array[i].length;  // 2 + 3 + 5 
//		  	}
//		  	
//		  	avg = (double)sum / count; 	
//
//			System.out.println(" sum: " + sum);
//			System.out.println(" avg: " + avg);
			
		// 9.
			
			boolean run = true; // while ���ѷ��� ���� ����
			
			
			Scanner scanner = new Scanner(System.in); // �Է°�ü
			int studentNum = 0; // �л��� -> �迭�� ����
			int[] scores = null; // �л����� �迭 [ �ʱ�ȭ ���� null ���� ]
			
//			while (true) => ���
			while (run) { // ���ѷ��� [ 5���Է��ϸ� ���ѷ��� ���� ]
				System.out.println( " ----------------------------------------------------- ");
				System.out.println( " 1. �л��� �� 2. �����Է� �� 3. ��������Ʈ �� 4. �м� �� 5. ���� ");
				System.out.println( " ----------------------------------------------------- ");
				System.out.print(" ���� > ");
				
				int selectNo = scanner.nextInt();
				
				if (selectNo == 1) {
					//�ۼ���ġ					
					System.out.println( "�л��� �Է� : "); studentNum = scanner.nextInt();
					scores = new int [studentNum]; // �Է¹��� ������ƴ �迭���� �Ҵ� 

				} else if (selectNo == 2) {
					// �ۼ���ġ
					for ( int i = 0; i < studentNum; i++) {
						System.out.print( "scores ["+i+"] : " ); 
						scores[i] = scanner.nextInt(); // �Է¹��� ���� i��°�� ���� 
					}
					
				} else if (selectNo == 3) {
					// �ۼ���ġ
					for( int i = 0 ; i<studentNum; i++ ) {
						System.out.println("scores[" + i + "] : " + scores[i] ); // i��° �ε��� �� ��� 
					}

				} else if (selectNo == 4)  {
					int max = 0;  int sum = 0 ; double avg = 0.0;
					
					for( int i = 0 ; i< studentNum ; i++ ) {
						if( scores[i] > max ) max = scores[i]; // i��° �ε��� ���� max ���� ũ�� max�� i��° �ε��� �� �ֱ� 
						sum += scores[i]; // i��° �ε��� ���� sum �� �����հ� 
					}
					avg = (double)sum / studentNum ;
					System.out.println("�ְ� ���� : " + max);
					System.out.println("��� ���� : " + avg);
				}
				else if( selectNo == 5 ) { 
					run = false;
				} 
			}
			
			System.out.println( " ���α׷� ���� ");
			
			

		
		} // m e
} // c e
