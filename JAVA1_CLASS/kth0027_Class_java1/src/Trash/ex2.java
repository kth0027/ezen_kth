package Trash;

import java.util.Scanner;

class  ex2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		String title[] = {"�̸�", "����", "����", "����", "����", "���", "����"};

		//�л���
		System.out.print("�л��� = ");
		int studentCnt = scan.nextInt();
		
		//�л� �̸��� ������ �迭
		String name[] = new String[studentCnt];
		//���� ������ �迭
		int jumsu[][] = new int[studentCnt+2][6];

		//�̸�, ����, ����, ���� ���� �Է¹޾� �迭�� ����
		for(int i=0; i<studentCnt; i++){	//�л��� ��ŭ �ݺ�
			System.out.print("�̸� = ");
			name[i] = scan.next();
			//�����Է�
			for(int j=0; j<3; j++){
				System.out.print(title[j+1]+" = ");
				jumsu[i][j] = scan.nextInt();
			}
		}
		for(int i=0; i<studentCnt; i++){	//�л���
			for(int j=0; j<=2; j++){	//�����
				jumsu[i][3]	+= jumsu[i][j];	//���κ� ����
				jumsu[studentCnt][j]+= jumsu[i][j];	//���� ����
			}
			//���κ� ���
			jumsu[i][4]= jumsu[i][3] / 3;
		}

//		//���� ���
//		for(int i=0; i<=2; i++){
//			jumsu[studentCnt+1][i] = jumsu[studentCnt][i] / studentCnt;
//		}

		//���� ���ϱ�
		for(int i=0; i<studentCnt; i++){
			int rank = 0;
			for(int j=0; j<=studentCnt; j++){
				if(jumsu[i][4] < jumsu[j][4]){
					rank++;
				}
			}
			jumsu[i][5] = ++rank;
		}

		//���������� ����
		for(int i=0; i<studentCnt-1; i++){	//�л��� -1��ŭ
			for(int j=0; j<studentCnt-1; j++){
				if(jumsu[j][5] > jumsu[j+1][5]){	//������ ��ȯ
					//�̸� ��ȯ
					String nametemp = name[j];
					name[j] = name[j+1];
					name[j+1] = nametemp;

					//���� ��ȯ
					for(int c=0; c<jumsu[j].length; c++){
						int jumsutemp = jumsu[j][c];
						jumsu[j][c] = jumsu[j+1][c];
						jumsu[j+1][c] = jumsutemp;
					}
				}
			}
		}

		//���
		System.out.println("==============================================================");
		
		//Ÿ��Ʋ ���
		for(int t=0; t<title.length; t++){
			System.out.print(title[t]+"\t");
		}
		System.out.println();

		//���� ���
		for(int row=0; row<jumsu.length-2; row++){	//��
			System.out.print(name[row]+"\t");
			for(int col=0; col<jumsu[row].length; col++){	//��
				System.out.print(jumsu[row][col]+"\t");
			}
			System.out.println();
		}

//		//���� ����, ��� ���
//		int kk = 4; 
//		for(int i=studentCnt; i<=studentCnt+1; i++){
//			System.out.print(title[kk++]+"\t");	//����
//			for(int j=0; j<=2; j++){
//				System.out.print(jumsu[i][j]+"\t");
//			}
//			System.out.println();
//		}
	}
}

