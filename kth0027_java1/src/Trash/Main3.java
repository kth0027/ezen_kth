package Trash;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 3. ������ �������� �迭�� ����� �� ��� ���� ���ϱ�
		// ����(rank)�� �񱳸� �ϸ鼭 ������ �Űܾ��ϴµ�..

		// �ο��� ��ŭ �迭�� �޸𸮸� �Ҵ��Ѵ�.
		int cnt;
		int num[];
		int korEng[][];
		int sum[];
		int avg[];
		int rank[];

		do {
			System.out.print("�ο����� �Է��ϼ���. 1~10�� >");
			cnt = sc.nextInt();
		} while (cnt < 1 || cnt > 10);

		// �޸� �Ҵ�
		num = new int[cnt];
		korEng = new int[cnt][2];
		sum = new int[cnt];
		avg = new int[cnt];
		rank = new int[cnt];
		String[] title = { "����", "����" };
		// ����� ������ �޴� (for������ �������)

		for (int i = 0; i < cnt; i++) {
			System.out.print("��ȣ �Է� >");
			num[i] = sc.nextInt();
			for (int j = 0; j < 2; j++) { // ����� ��� �Է� �� ���̱� ������ 2�� �ݺ�
				System.out.print(title[j] + " ���� �Է� :");
				korEng[i][j] = sc.nextInt();
				sum[i] += korEng[i][j]; // �������
			}
		}
		for (int i = 0; i < cnt; i++) {
			rank[i] = 1; // ��ũ�� 1�� �ʱ�ȭ ���ѳ��� �ؿ��� ������ �� ���� ������ ��ũ�� ++
		}
		// �������
		for (int i = 0; i < cnt - 1; i++) { // �ο��� 5���̸� 4���� ���ϱ� ������ -1
			for (int j = i + 1; j < cnt; j++) { // �ڽ� ������ �ε����� ���ϱ� ���� �ʱ��
				if (sum[i] > sum[j]) { // �ε��� �ڱ� �ڽ��� ���� ������ ���� �� ���������� �� �۴ٸ�
					rank[j]++; // ���������� ��ũ ��� (��ũ�� �ö� ���� ������, ��� �̱� ������ 1� ����ϴ� ����)
				} else if (sum[i] < sum[j]) { // �ڽ��� ������������ �۴ٸ� �ڽ��� ��ũ �ø�
					rank[i]++;
				}
			}
		}
		
		///////// ����ϱ� ////////////
		System.out.println("\n����ó��\n��ȣ\t\t  ����   ����   �հ�   ���\t����");
		for (int i = 0; i < cnt; i++) {
			System.out.print(num[i] + "\t\t"); //
			for (int j = 0; j < korEng[i].length; j++) {
				System.out.printf("%5d", korEng[i][j]);
			}
			System.out.printf("%5d %d %5d\n", sum[i], sum[i] / 2, rank[i]);
		}

	}
}
