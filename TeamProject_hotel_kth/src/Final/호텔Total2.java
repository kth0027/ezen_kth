package Final;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ȣ��Total2 implements ȣ�ڿ��� {

	// �ʵ�
	public static String[][] room = new String[3][3];

	// ������

	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch, String h_id) {

		if (room[hotelch - 1][roomch - 1] == null) {
			System.out.println("*** ȣ�� / ** �� ���� �Ϸ� ***");
			room[hotelch - 1][roomch - 1] = h_id;

		}

	}

	@Override
	public void �������(int hotelch, int roomch, String h_id) {
		if (room[hotelch - 1][roomch - 1] == null) {
			System.out.println("*** ȣ�� / ** �� ������� �Ϸ� ***");
			room[hotelch - 1][roomch - 1] = h_id;
		}
		System.out.println("*** ���� ��� �Ϸ� ***");
	}

	@Override
	public void ���ο�����ȸ() {
		System.out.println("*** ���ο�����ȸ ***");
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (room[i][j] != null) {
					System.out.println("*** ȣ�� / ** �� ���� ***");
				}
			}
		}

	}

	@Override
	public void ��ü������Ȳ(String h_id) {
		System.out.print("ȣ�� **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("��\t");
			} else {
				System.out.print(h_id);
			}

		}
	}

	@Override
	public void ����ó��() {
		System.out.println("*** ����ó�� ***");
	}

}
