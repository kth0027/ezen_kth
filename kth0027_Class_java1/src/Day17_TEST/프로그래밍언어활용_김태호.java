package Day17_TEST;

import java.util.Scanner;

public class ���α׷��־��Ȱ��_����ȣ {

	public static void main(String[] args) throws Exception { // m s
		
		// 0. �Է°�ü ����
		Scanner sc = new Scanner(System.in);
		
		String Ÿ��Ʋ [] = {"�̸�","����","����","����","����","���", "����"};
		
		try {
			// 1. �Է°� �ޱ�
			System.out.println("�л��� : "); 
			int �л��� = sc.nextInt();
			
			// 2. �л� ���� ��ü ����
			String �̸�[] = new String[�л���];
			int ����[][] = new int[�л���+2][6];
			
			// 3. �л� ���� �Է¹ޱ�
			for ( int i = 0; i<�л���; i++) {
				System.out.println("�̸� : "); �̸�[i] = sc.next();
				for (int j = 0; j<3;j++) {
					System.out.println(Ÿ��Ʋ[j+1] + ":"); ����[i][j] = sc.nextInt();
				}
			}
			
			// 4. �������
			for ( int i = 0; i<�л���; i++) {
				for ( int j =0; j<3; j++) {
					����[i][3] += ����[i][j];	
				}
				// 5. ���
					����[i][4] = ����[i][3]/3;
			}
			
			// 5. ����

			for (int i = 0; i < �л���; i++) {
				int ���� = 0;

				for (int j = 0; j < �л���; j++) {
					if (����[i][4] < ����[j][4]) { // i < j �� ���� Ȯ��
						����++;
					}
				}
				����[i][5] = ++����;
			}

			// 5-1. ��������
			for (int i = 0; i < �л��� - 1; i++) { // �л���-1 Ȯ��
				for (int j = 0; j < �л��� - 1; j++) {
					if (����[j][5] > ����[j + 1][5]) { // j > j+1 �� Ȯ��

						// �̸���ȯ
						String �̸���ȯ = �̸�[j];
						�̸�[j] = �̸�[j + 1];
						�̸�[j + 1] = �̸���ȯ;
						// ������ȯ
						for (int c = 0; c < ����[j].length; c++) { // ����j ����Ȯ��
							int ������ȯ = ����[j][c];
							����[j][c] = ����[j + 1][c];
							����[j + 1][c] = ������ȯ;
						}

					}
				}
			}
			
			//////////////////////////////// ��� �ϱ� ///////////////////////////////////////////
			System.out.println("-------------------------------------------------------");
			System.out.println("                        �� �� ǥ                         ");
			System.out.println("-------------------------------------------------------");
			// Ÿ��Ʋ���2
			for (int t = 0; t < Ÿ��Ʋ.length; t++) {
				System.out.print(Ÿ��Ʋ[t] + "\t");
			}
			System.out.println();

			// �������3
			for (int i = 0; i < �л���; i++) { // �л����� ���� for��

				// �̸�
				System.out.print(�̸�[i] + "\t");

				// ����
				for (int j = 0; j < ����[j].length - 3; j++) { 
					System.out.printf("%d\t", ����[i][j]);
				}

				// ���� ��� ����
				System.out.printf("%d\t %.2f\t %d\n", ����[i][3], (float) ����[i][3] / 3, ����[i][5]);
			}
				
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		


		
		
		
		
		
		
		
	} // m e
}
 