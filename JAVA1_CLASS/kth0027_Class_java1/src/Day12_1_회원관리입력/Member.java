package Day12_1_ȸ�������Է�;

import java.io.FileOutputStream;
import java.util.Scanner;

public class Member {

	// 1. �ʵ� [ �޸� = ���� ]
	private String id;
	private String name;
	private String password;
	private String phone;
	// private : ���������� : �ʵ带 ��ȣ�� ��ȣ�ϱ� ���� [ �ٸ� Ŭ�������� ���� �Ұ� ]

	// 2. ������ �ڵ�����
	// 2-1 �� ������
	public Member() {
	}

	// 2-2 ��� �ʵ� �޴� ������
	public Member(String id, String name, String password, String phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	// 3. �޼ҵ�

	// 3-2. �α��� �޼ҵ�
	public void login() {

	}

	// 3-3. ȸ������ �޼ҵ�
	public void signup() {

		// 0. �Է°�ü ��������
		Scanner scanner = Memberfile.scanner;

		// 1. �Է�
		System.out.println(" *** ȸ������ ������ *** ");
		System.out.println(" ���̵� : ");
		String id = scanner.next();
		System.out.println(" ��й�ȣ : ");
		String password = scanner.next();
		System.out.println(" �̸� : ");
		String name = scanner.next();
		System.out.println(" ����ó : ");
		String phone = scanner.next();

		// 2. ��ü ����
		Member member = new Member(id, password, name, phone);

		// * �迭�� ����
		for (int i = 0; i < Memberfile.members.length; i++) {
			if (Memberfile.members[i] == null) {
				Memberfile.members[i] = member;
				break;
			}
		}

		// 3. ���� ����
		// 1. ȸ����[\n] �ʵ庰[ , ] ���� ����

		// * �迭 �� ��� ��ü�� ���� ó��

		// 1. ������� ��ü
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(
					"C:/Users/505/git/back_develop/JAVA(����ȣ)/src/Day12_1_ȸ�������Է�/memberlist.txt", true); // �̾� ����
			// 2. ��ü �������� [ �ʵ� ���� ( \n: ȸ������ , : �ʵ屸�� ]
			String outstring = member.id + "," + member.password + "," + member.name + "," + member.phone + "\n";
			fileOutputStream.write(outstring.getBytes()); // ����Ʈ�� ��ȯ�� ����
		} catch (Exception e) {
			System.out.println(" [�˸�] : ȸ�� DB ���� ���� : " + e);
		}
	}

	// 3-1. �޼ҵ� �ڵ����� private �ʵ� ���� get , set [ �ܺ� Ŭ������ ���� ]
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
