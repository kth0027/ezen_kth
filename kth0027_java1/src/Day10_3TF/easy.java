package Day10_3TF;

public class easy {
	public static void main(String[] args) {
		// �α����ϱ� , ���ܻ����� �����Ƿ� try,catch,finally

		try {
			// �α��� �õ��ϱ�
			boolean loginResult = login("dalso", "11112");
			// ���ܻ��׾��� true���� ���� �ÿ���
			if (loginResult)
				System.out.println("�α��� �Ǿ����ϴ�");
		} catch (Exception e) {
			// ���ܻ����� �߻��� ���
			System.out.println("Error Message");
			// ���ܻ��� �޼����� ���
			System.out.println(e.getMessage());
		} finally {
			// ���ܻ����� �߻��ϵ� ���ϵ� ����
			System.out.println("�Ϳ��� �޼ҳ� ��");
		}
	}

	// �α��� �޼ҵ�
	static boolean login(String id, String password) throws Exception {

		// ������ ���� �����⸦ �ȹ�����Ƿ� �ؿ� ������ ȯ�漳��

		// �������� ���ܻ��� ����
		// false �� ��� Pass�̹Ƿ� �α��� ����
		boolean networkFailed = false;
		boolean wrongId = false;
		boolean wrongPassword = false;
		boolean passwordExpired = false;
		// true�� �ɸ� ��� ������ ������ ���߾ ���ܸ޼��� ����
		if (networkFailed)
			throw new Exception("��Ʈ��ũ�� ������� �ʾҽ��ϴ�");
		else if (wrongId)
			throw new Exception("���̵� �������� �ʽ��ϴ�");
		else if (wrongPassword)
			throw new Exception("��й�ȣ�� �߸��Ǿ����ϴ�");
		else if (passwordExpired)
			throw new Exception("��й�ȣ�� ����Ǿ����ϴ�");

		// ���� ��� false���� ������ server�� ��� ������ ��� true �� ��ȯ
		return true;

	}

}
