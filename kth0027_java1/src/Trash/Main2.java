package Trash;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * ���� �迭 = ���� �ִ�, �������̴�, �ɵ������� ���� ���� ũ��.
		 * 
		 * int[][] i2 = new int [4=�ο��� ����̳� 4���Դϴ� ][5] o o o o x x x x x o o o o o o 0 0
		 * 0 o o o o o 0 0 0 0 o o o o o o 0 0 0 int[] i = new int[4]; o o o o
		 * 
		 * 
		 */
		int[][] student = new int[7][6];

		// System.out.println(student.length+ " " + student[0].length);
		// �Է� �ޱ�
		for (int i = 0; i < student.length - 2; i++) {
			System.out.println(i + 1 + "��° ��� �Է¼����� ��ȣ �������� �������� �Է��ϼ���");
			student[i][0] = i + 1;
			for (int j = 1; j < student[i].length - 3; j++) {// 1,2
				student[i][j] = sc.nextInt();// ���� �Է�
				student[i][3] += student[i][j];// �հ� ����
				student[5][j] += student[i][j];// �����հ贩��
			}
			student[i][4] = student[i][3] / 2;
		} // end for
			// ���� ��� ���ϱ�
		for (int i = 1; i < student.length - 1; i++) {
			student[6][i] = student[5][i] / (student.length - 1);
		}

		// ��� ���ϱ�
		for (int i = 0; i < student.length; i++) {
			student[i][5] = 1;
			for (int j = 0; j < student.length; j++) {
				if (student[i][3] < student[i][3])
					student[i][5]++;
			}
		}

		// ����ϱ�

		for (int i = 0; i < student.length; i++) {

			for (int j = 0; j < student[i].length; j++) {
				System.out.printf("%5d", student[i][j]);
			}
			System.out.println();
		}

	}
}
