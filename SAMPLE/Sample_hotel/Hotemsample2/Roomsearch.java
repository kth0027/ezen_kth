package Hotemsample2;

import java.util.Random;

import java.util.Scanner;
import java.util.Scanner;

public class Roomsearch {
	Scanner sc = new Scanner(System.in);

	Random r = new Random();

	int room1;

	int room2;

	int check;

	int number;

	public void roomsearch() {

		System.out.print("������ �Է��ϼ��� : ");

		room1 = sc.nextInt();

		System.out.print("����� �Է��ϼ���: ");

		room2 = sc.nextInt();

		int[][] room = new int[room1][room2];

		for (int i = 0; i < room1; i++) {

			for (int j = 0; j < room2; j++) {

				room[i][j] = 0;

			}

		}

		while (true) {

			System.out.println("1. Check In / 2. Check out / 3. Search / 4. Exit");

			System.out.print("Input");

			int input = sc.nextInt();

			switch (input) {

			case 1:

				System.out.print("������ ���Ͻó���? :");// ����

				check = sc.nextInt();

				System.out.print("ȣ���� ��� �ǳ���?");// ȣ��

				number = sc.nextInt();

				if (room[check][number] == 0) {

					System.out.println("Ok...Now room is Check in");

					room[check][number] = 1;

				}

				else {

					System.out.println("No......Now room is already Check in");

					break;

				}

				break;

			case 2:

				System.out.print("�����ΰ���?");

				check = sc.nextInt();

				System.out.println("ȣ���� ��� �ǳ���?");

				number = sc.nextInt();

				if (room[check][number] == 1) {

					System.out.println("Ok...Now room is Check out");

					room[check][number] = 0;

				}

				else {

					System.out.println("No......Now room is already Check out");

					break;

				}

				break;

			case 3:

				System.out.println("����ִ� ���� � �����ϴ� ���� ���� ��Ź�帳�ϴ�.");

				for (int i = room1 - 1; i >= 0; i--) {

					for (int j = room2 - 1; j >= 0; j--) {

						if (room[i][j] == 0)

							System.out.print("����\t");

						if (room[i][j] == 1)

							System.out.print("�Ұ���\t");

					}

					System.out.println("");

				}

				System.out.println("");

				break;

			case 4:
				return;

			}

		}

	}

}
