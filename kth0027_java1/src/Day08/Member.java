package Day08;

import java.util.Scanner;

import Day08_1TF.Shop;

public class Member { // C S ȸ�� Ŭ���� ����

// 1. �ʵ� [ ���̵�, ��й�ȣ, �̸�, �������]
	private String m_���̵�;
	private String m_��й�ȣ;
	private String m_�̸�;
	private String m_�������;

// 2. ������ [ ��ü ������ �ʵ��� �ʱⰪ ]

// -1. ȸ�����Խ� �����Ǵ� ��ü�� ������
	public Member(String m_���̵�, String m_��й�ȣ, String m_�̸�, String m_�������) {

		this.m_���̵� = m_���̵�;
		this.m_��й�ȣ = m_��й�ȣ;
		this.m_�̸� = m_�̸�;
		this.m_������� = m_�������;
	}

// 2. �� ������
	public Member() {
	}

// 3. �޼ҵ� [����]

// -2. ȸ�ǰ��� �޼ҵ� [ �Է¹��� ������ ��ü �����Ͽ� �迭�� ���� ]
	public static boolean signup() {
		// --1. �Է� �ޱ�
		System.out.println(" <<<<<<<<<<<<< ȸ������ ������ >>>>>>>>>>>>> ");
		System.out.println(" ���̵� : ");
		String m_���̵� = Shop.scanner.next();
		// ���̵� �ߺ�üũ
		boolean check = idcheck(m_���̵�);
		if (check) {
			System.out.println(" [[�˸�]] : ����� �� ���� ���̵� �Դϴ�.");
			return false; // ȸ������ ����
		}

		System.out.println(" ��й�ȣ : ");
		String m_��й�ȣ = Shop.scanner.next();
		System.out.println(" �̸� : ");
		String m_�̸� = Shop.scanner.next();
		System.out.println(" �������(YY-MM-DD) : ");
		String m_������� = Shop.scanner.next();

		// --2. �Է¹��� ������ ��ü ���� [ ������ ]
		Member member = new Member(m_���̵�, m_��й�ȣ, m_�̸�, m_�������);

		// 3. ���� ��ü�� �迭�� �ֱ� [ ������� ã�Ƽ� �ֱ� ]
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] == null) {
				Shop.members[i] = member;
				return true; // ȸ������ ���� // ��ȯ�� : ȸ�����Լ���/���� => TRUE / FALSE
			}
		}
		return false; // ȸ������ ���� [ ������� ������� ]
	}

// -6. ���̵� �ߺ� üũ �޼ҵ�
	public static boolean idcheck(String check_id) {
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_���̵�().equals(check_id)) {
				return true; // �μ��� ������ ���̵� �迭�� �����ϸ� true
			}
		}
		return false; // �迭�� ������ ���� �������
	} // ȸ������ �޼ҵ� ����

// -3. �α��� �޼ҵ�
	public static String login() {

		// --1. ���̵� , ��й�ȣ �Է¹ޱ�
		System.out.println(" <<<<<<<<<<<<< �α��� ������ >>>>>>>>>>>>> ");
		System.out.println(" ���̵� : ");
		String m_���̵� = Shop.scanner.next();
		System.out.println(" ��й�ȣ : ");
		String m_��й�ȣ = Shop.scanner.next();

		// --2. �迭�� �����ϸ� �α��� ����
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_���̵�().equals(m_���̵�)
					&& Shop.members[i].getM_��й�ȣ().equals(m_��й�ȣ)) {
				return m_���̵�; // �α��� ������ ������ ���̵� ��ȯ
			}
		}
		return null; // �α��� ���� // ��ȯ�� : �α��� ������ => ������ ���̵� / ���н� null
	}

// -4. ���̵�ã�� �޼ҵ� ( �̸�, ������� �Է¹޾� => ���̴� ã�� )
	public static String findid() {
		// --1. �Է¹ޱ�
		System.out.println(" <<<<<<<<<<<<< ���̵�ã�� ������ >>>>>>>>>>>>> ");
		System.out.println(" �̸� : ");
		String m_�̸� = Shop.scanner.next();
		System.out.println(" �������(YY-MM-DD) : ");
		String m_������� = Shop.scanner.next();
		// --2. �迭�� ������ ������ ��ü ã��
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_�̸�().equals(m_�̸�)
					&& Shop.members[i].getM_�������().equals(m_�������)) {
				return Shop.members[i].getM_���̵�(); // ���̵� ã�� ����
			}
		}
		return null; // ��ȯ�� : ã������� => ���̵� / ���н� null

	}

// -5. ��й�ȣã�� �޼ҵ� ( ���̵� , ����ó �Է¹޾� => ��й�ȣ �˷��ֱ� )
	public static String findpw() {

		// --1. �Է¹ޱ�
		System.out.println(" <<<<<<<<<<<<< ��й�ȣ ã�� ������ >>>>>>>>>>>>> ");
		System.out.println(" ���̵� : ");
		String m_���̵� = Shop.scanner.next();
		System.out.println(" ������� : ");
		String m_������� = Shop.scanner.next();

		// --2. �迭�� ������ ������ ��ü ã��
		for (int i = 0; i < Shop.members.length; i++) {
			if (Shop.members[i] != null && Shop.members[i].getM_���̵�().equals(m_���̵�)
					&& Shop.members[i].getM_�������().equals(m_�������)) {
				return Shop.members[i].getM_��й�ȣ(); // ���̵� ã�� ����
			}
		}
		return null; // ��ȯ�� : ã������� => ��й�ȣ / ���н� null
	}

// -1. �ʵ� private => get, set �޼ҵ� ���
	public String getM_���̵�() {
		return m_���̵�;
	}

	public void setM_���̵�(String m_���̵�) {
		this.m_���̵� = m_���̵�;
	}

	public String getM_��й�ȣ() {
		return m_��й�ȣ;
	}

	public void setM_��й�ȣ(String m_��й�ȣ) {
		this.m_��й�ȣ = m_��й�ȣ;
	}

	public String getM_�̸�() {
		return m_�̸�;
	}

	public void setM_�̸�(String m_�̸�) {
		this.m_�̸� = m_�̸�;
	}

	public String getM_�������() {
		return m_�������;
	}

	public void setM_�������(String m_�������) {
		this.m_������� = m_�������;
	}
}