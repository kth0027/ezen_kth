package Hotemsample3;

import java.util.HashMap;

public class Solution {
	public long[] solution(long k, long[] room_number) {
		HashMap<Long, Long> room_status = new HashMap<>(); // ���ȣ, ������ ���� ���ȣ
		long[] booked = new long[room_number.length]; // i�� �Խ�Ʈ�� ������ �� ��ȣ

		for (int i = 0; i < room_number.length; i++) {// i�� �Խ�Ʈ ��ȣ
			int guest = i;
			long wanted = room_number[guest]; // �Խ�Ʈ�� ���ϴ� ���ȣ
			booked[i] = assign(room_status, wanted); // �� �Ҵ�(���� ���� ������ ���ȣ ����)
		}

		return booked;
	}

	public long assign(HashMap<Long, Long> room_status, long wanted) {
		if (!room_status.containsKey(wanted)) { // �ؽø� Ű�� �������� �ʴ´ٴ� ����, ���� wanted ���� �������� ���� ���¶�� ��
			room_status.put(wanted, wanted + 1); // �ٷ� �� ����
			return wanted; // ������ ���ȣ ����
		}
		// �ؽø� Ű�� ����, �� wanted ���� �̹� ������ ������ ���
		long next = assign(room_status, room_status.get(wanted)); // ��������� �ٽ� assign �Լ��� ȣ��(������ ���� ���ȣ�� wanted �Ű������� �༭
																	// �ش� wanted�� ���ؼ� ������ ���� �ٽ� Ž��)
		room_status.put(wanted, next); // ���ϵ� ���� ���� �Ҵ� ������ ���ȣ�� �Ǹ� �̸� ������ wanted�� ���� ������ ���� ���ȣ�� ��

		// ��������� �� ���� ������ �׳� ������
		return next;
	}
}
