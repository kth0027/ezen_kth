package kr.or.ddit.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class T11_Hotel {

	private Scanner scan;
	private Map<Integer, CheckIn> HotelCheck;

	public T11_Hotel() {
		scan = new Scanner(System.in);
		HotelCheck = new HashMap<>();
	}

	// �޴��� ����ϴ� �޼���
	public void HotelMenu() {
		System.out.println();
		System.out.println("=====================");
		System.out.println("   ȣ�� ���� �������ϴ�.");
		System.out.println("=====================");
		System.out.println();
		System.out.println("� ������ �Ͻðڽ��ϱ�?");
		System.out.println("1.üũ�� 2.üũ�ƿ� 3.���ǻ��� 4.��������");
	}

	// ���α׷��� �����ϴ� �޼���
	public void HotelMenuStart() {

		while (true) {

			HotelMenu(); // �޴� ���

			int menuNum = scan.nextInt(); // �޴� ��ȣ �Է�

			switch (menuNum) {
			case 1:
				in(); // üũ��
				break;
			case 2:
				out(); // üũ�ƿ�
				break;
			case 3:
				showRoom(); // ���ǻ���
				break;
			case 4:
				System.out.println("=====================");
				System.out.println("   ȣ�� ���� �ݾҽ��ϴ�.");
				System.out.println("=====================");
				return;
			default:
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ��Է��ϼ���.");
			} // switch��
		} // while��
	}

	/**
	 * ���� üũ�� �޼���
	 */
	private void in() {
		System.out.println();
		System.out.println("����濡 üũ�� �Ͻðڽ��ϱ�?");
		System.out.print("���ȣ �Է� =>");
		int roomNum = scan.nextInt();

		// �̹� üũ�ε� ������ �˻�
		// get()�޼���� ���� ������ �� ������ �ڷᰡ ������ null�� ��ȯ�Ѵ�.
		if (HotelCheck.get(roomNum) != null) {
			System.out.println(roomNum + "���� �̹� üũ�ε� ���Դϴ�.");
			return; // �޼��� ����
		}
		System.out.println("������ üũ�� �Ͻðڽ��ϱ�? =>");
		String name = scan.next();

		HotelCheck.put(roomNum, new CheckIn(name, roomNum));
		System.out.println(roomNum + "�� üũ�� �Ǿ����ϴ�.");
	}

	/**
	 * ���� üũ�ƿ� �޼���
	 */
	private void out() {
		System.out.println();
		showRoom();
		System.out.println("������� üũ�ƿ� �Ͻðڽ��ϱ�?");
		System.out.print("���ȣ �Է� =>");
		int roomNum = scan.nextInt();

		// remove(key) => ���� �����ϸ� ������ value���� ��ȯ�ϰ�, �����ϸ� null�� ��ȯ��.
		if (HotelCheck.remove(roomNum) == null) {
			System.out.println(roomNum + "���� üũ�ε� ���� �ƴմϴ�..");
		} else {
			System.out.println(roomNum + "���� üũ�ƿ� �Ͽ����ϴ�.");
		}

	}

	/**
	 * ���� ���� �޼���
	 */
	private void showRoom() {
		Set<Integer> keySet = HotelCheck.keySet();

		if (keySet.size() == 0) {
			System.out.println("��ϵ� üũ�� ������ �����ϴ�.");
		} else {
			Iterator<Integer> it = keySet.iterator();

			while (it.hasNext()) {
				int roomNum = it.next(); // Ű��
				CheckIn c = HotelCheck.get(roomNum);
				System.out.println(" " + "���ȣ:" + "\t" + c.getRoomNum() + "\t" + "������:" + c.getName());
			}
		}
		System.out.println("================================================");
		System.out.println("��� �Ϸ�.");
	}

	public static void main(String[] args) {
		new T11_Hotel().HotelMenuStart();
	}
}

/**
 * üũ�� ������ �����ϱ� ���� VO Ŭ����
 */
class CheckIn {
	private String name; // �̸�
	private int roomNum; // ���ȣ

	public CheckIn(String name, int roomNum) {
		super();
		this.name = name;
		this.roomNum = roomNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	@Override
	public String toString() {
		return "CheckIn [name=" + name + ", roomNum=" + roomNum + "]";
	}

}
