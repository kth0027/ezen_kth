package Hotemsample7;

import java.io.*;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = 0, tnum = 0, snum = 0, s = 0, n = 0;

		// snum:������
		// tnum:�氹��
		// s:�� �迭 ���� �� ���
		// n:�� �迭 ���� �� ���
		// check:�ش����� ��� ī��Ʈ

		System.out.println("��ü �� ���� �����ϼ���");
		snum = Integer.parseInt(in.readLine());
		System.out.println("���� ��ü ���� ���� �����ϼ���");
		tnum = Integer.parseInt(in.readLine());
		String[][] name = new String[snum + 1][tnum + 1]; // �迭 0������ ���ܽ�Ű�� ���� +1
		boolean bool = true;
		boolean check = false;

		while (bool) {
			System.out.println("<<1.�Խ�,�����Է�  2.��� 3.��ü��Ȳ 4.���α׷�����>>\n��ȣ�� �Է��ϼ���");
			num = Integer.parseInt(in.readLine());

			switch (num) {

			/*
			 * case 1: �ش� ���� �� á�� ��: ���� �ٽ� Ȯ�� /�ش� �濡 ����� �ִ� ���: ���� ȣ�� �ٽ� Ȯ��
			 */

			case 1: // ȣ��, �̸��Է�
				do {
					System.out.println("������ ���� �����ϼ���");
					s = Integer.parseInt(in.readLine());
					// ���� Ȯ��
					check = false;
					for (int i = 1; i <= tnum; ++i) {
						if (s < 1 || s > tnum) { // ������ ���� üũ
							System.out.println("������ ������ϴ�.");
							break;
						}
						if (name[s][i] == null) // �������� ��� Ȯ��
							check = true;
					} // end for
					if (check == false) { // �������� ���� ���ų� ������ ���� ���� ��
						System.out.println("�ٸ� ���� �����ϼ���");

					} else {
						System.out.println("������ ȣ���� �����ϼ���");
						n = Integer.parseInt(in.readLine());
					} // end if
					// ��, ȣ�� �Է°� �˻�
				} while (s < 1 || s > tnum || n < 1 || n > tnum || check == false);

				// �������� ���� ���(name[][]!=null) do while ������ ��� �Է�
				if (name[s][n] != null) {
					do {
						System.out.println("���� �������� �ֽ��ϴ�. ���� �����ϼ���");
						s = Integer.parseInt(in.readLine());
						System.out.println("ȣ���� �����ϼ���");
						n = Integer.parseInt(in.readLine());

					} while (name[s][n] != null);
				} // end if

				System.out.println("������ �̸��� �Է��ϼ���");
				name[s][n] = in.readLine();

				bool = true; // false�� �ٲ� bool�� true�� �ٽ� �ʱ�ȭ
				break;
			case 2: // ���
				System.out.println("üũ�ƿ��� ���� �����ϼ���");
				s = Integer.parseInt(in.readLine());
				System.out.println("üũ�ƿ��� ȣ���� �����ϼ���");
				n = Integer.parseInt(in.readLine());
				name[s][n] = null; // �ش� �� ȣ���� null�� �ʱ�ȭ (���� ���)
				break;
			case 3: // ��ü��Ȳ
				for (int i = 1; i <= snum; i++) {
					System.out.println(i + "��=============");
					for (int j = 1; j <= tnum; j++) {
						if (name[i][j] == null) {
							System.out.println(j + "ȣ���� ������ϴ�.");
						} else
							System.out.println(j + "ȣ���� ������:" + name[i][j] + "�Դϴ�.");
					}
				}
				break;
			case 4: // ����
				bool = false;
			}
		} // end while

	}
}
