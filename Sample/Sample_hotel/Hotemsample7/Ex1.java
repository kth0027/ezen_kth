package Hotemsample7;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		// 2���� �迭�� �̿�
		int[][] seats = new int[10][10];

		// �ݺ� flag
		boolean isRun = true;

		// ���̸�
		String strColumn;
		char inputColumn;

		// ���ȣ
		int rowNum;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println();
			System.out.println("������������������������������������������������������������������������SCREEN������������������������������������������������������������������������");
			System.out.println();
			for (int i = 0; i < seats.length; i++) {
				System.out.print(" [ " + (i + 1) + " ] ");
			}
			System.out.println(" [��] ");

			for (int i = 0; i < seats.length; i++) {
				System.out.println();
				for (int j = 0; j < seats[i].length; j++) {

					if (seats[i][j] == 0) {
						System.out.print("[ �� ]");
					} else {
						System.out.print("[ �� ]");
					}
				}
				System.out.println(" [ " + (char) (i + 65) + " ] ��");
			}
			System.out.print("��������������������������������������������������������������������������������������������������������������������������������������������������������������");
			System.out.print("\n�����Ͻ� �¼��� ���� �Է����ּ��� (��������� exit) : ");

			strColumn = sc.next();

			if (strColumn.equals("exit")) {
				System.out.println("����Ǿ����ϴ�");
				break;
			}

			inputColumn = strColumn.trim().charAt(0);
			System.out.println("�Է��� �� : " + inputColumn);

			if (inputColumn < 65 || inputColumn > 74) {
				System.out.println("������ �� ���� �¼��Դϴ�");
				continue;
			}

			int column = inputColumn - 65;

			System.out.print("�����Ͻ� �¼��� �� ��ȣ�� �Է����ּ��� : ");
			rowNum = sc.nextInt();

			if (rowNum < 1 || rowNum > 10) {
				System.out.println("������ �� ���� �� ��ȣ�Դϴ�");
				continue;
			}

			System.out.println("�����Ͻ� �¼��� : " + inputColumn + " ���̰� " + rowNum + " ���Դϴ�");
			System.out.println("���� �Ϸ� �Ͻðڽ��ϱ� ? (Yes / No) : ");

			String s = sc.next();
			if (s.equals("y") || s.equals("Y")) {
				seats[column][rowNum - 1] = 1;
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
			} else {
				System.out.println("��ҵǾ����ϴ�");
				isRun = false;
			}

		} while (isRun);

	}
}
