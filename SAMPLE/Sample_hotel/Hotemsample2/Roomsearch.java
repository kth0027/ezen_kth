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

		System.out.print("층수를 입력하세요 : ");

		room1 = sc.nextInt();

		System.out.print("방수를 입력하세요: ");

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

				System.out.print("몇층을 원하시나요? :");// 층수

				check = sc.nextInt();

				System.out.print("호수가 어떻게 되나요?");// 호수

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

				System.out.print("몇층인가요?");

				check = sc.nextInt();

				System.out.println("호수가 어떻게 되나요?");

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

				System.out.println("비어있는 방이 몇개 없습니다 빠른 예약 부탁드립니다.");

				for (int i = room1 - 1; i >= 0; i--) {

					for (int j = room2 - 1; j >= 0; j--) {

						if (room[i][j] == 0)

							System.out.print("가능\t");

						if (room[i][j] == 1)

							System.out.print("불가능\t");

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
