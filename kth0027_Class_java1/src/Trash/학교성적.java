/**
 * 
 */
package Trash;

import java.util.Scanner;

public class �б����� {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String Ÿ��Ʋ[] = {"�̸�","����","����","����","����","���","����"};
		
		try {
			
			//1
			System.out.println("�л��� : "); int �л��� = sc.nextInt();
			
			//2
			String �̸�[] = new String[�л���];
			int ����[][] = new int [�л���+2][6];
			
			//3
			
			for (int i=0; i<�л���;i++) {
				System.out.println("�̸� : "); �̸�[i] = sc.next();
				for(int j=0; j<3; j++) {
					System.out.println(Ÿ��Ʋ[j+1] + ":");
					����[i][j] = sc.nextInt();
				}
			}
			
			//4 ����
			
			for (int i=0; i<�л���;i++) {
				for (int j=0; j<3; j++) {
					����[i][3] += ����[i][3];
				}
				
				���� [i][4] = ���� [i][3]/ 3;
			}
			
			//5. ����
			
			for (int i =0; i<�л���; i++) {
				int ���� = 0;
				
				for ( int j = 0; j<�л���; j++) {
					if (����[i][4] < ����[j][4]) {
						����++;
					}
				}
				����[i][5] = ++����;
			}
			
			//6.����
			for (int i =0; i<�л���-1;i++) {
				for (int j=0; j<�л���-1; j++) {
					if (����[j][5] > ����[j+1][5]) {
						
						//�̸�
						String �̸���ȯ = �̸�[j];
						�̸�[j] = �̸�[j+1];
						�̸�[j+1] = �̸���ȯ;
						//����
						
						for (int c=0; c<����[j].length; c++) {
							int ������ȯ = ����[j][c];
							����[j][c] = ����[j+1][c];
							����[j+1][c] = ������ȯ;
						}
					}
				}
			}
			
			///////////////////////// ��� //////////////////
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
