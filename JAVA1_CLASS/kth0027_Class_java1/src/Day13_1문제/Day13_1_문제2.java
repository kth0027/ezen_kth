package Day13_1����;

import java.util.Scanner;

public class Day13_1_����2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean sw = true; // ���� ������� Ȯ�� ����
		boolean sw2 = true; // true�̸� �������� // false �̸� �������

//		// 1. ������ ����
//		������� ������� = new �������();
//		��ȭ��� ��ȭ��� = new ��ȭ���();
//
//		// 2. ������ ���� [run �޼ҵ� ����]
//		�������.start();
//		��ȭ���.start();

		while (true) { // while ����
			System.out.println("1. ������� 2. ��ȭ���");
			int ch = scanner.nextInt();

			if (ch == 1) {

				Thread thread = new �������();

				if (sw) {
					�������.���ǽ���(sw);
					thread.start();
					sw = false;
				}

				else {
					�������.���ǽ���(sw);
					sw = true;
				}

			} else if (ch == 2) {

				// 1. ������ ���� ��ü ����
				Thread thread = new ��ȭ���();

				if (sw2) {
					��ȭ���.��ȭ����(sw2); // ��ȭ����
					thread.start();
					sw2 = false;
				} else {
					��ȭ���.��ȭ����(sw2);
					sw2 = true;
				}

			}

		} // while ����
	}

}
