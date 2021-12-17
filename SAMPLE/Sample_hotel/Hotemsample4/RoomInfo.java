package Hotemsample4;

import java.util.Scanner;

public class RoomInfo {
	static final int ALLROOMNUMBER = 34;
	static final int ROWNUM02 = 2;
	static final int ROWNUM03 = 3;
	static final int COLNUM = 3;
	static final int STANDARDLIMIT = 20; // �Ϲ� �� ��ȣ 101~121ȣ����
	static final int DELUXLIMIT = 30; // �𷰽� �� ��ȣ�� 201~211ȣ���� // ����Ʈ���� 301~304ȣ

	static String[][] ihotelRoom = new String[ROWNUM03][ALLROOMNUMBER];
	static String[][] sroomType = new String[ROWNUM02][COLNUM]; // stadard 1 5����; delux 2-10���� ; suite 3-15����
	static char cfirstNum; // �迭�� ���ִ� ù��° ��ȣ�� ���Ĵٵ� 1; �𷰽� 2; ����Ʈ 3 ������

	static Scanner scan = new Scanner(System.in);
	static Scanner scan00 = new Scanner(System.in);
	static boolean bProgramexit = false; // ��� ���� ���� ���̸� ���α׷� ����
	static String sSelRoomNum = ""; // ���� ������ ��
	static int iSelRoomType = 0; // ���� ������ �� Ÿ�� ���� ����
	static String sSelRoomPeople = ""; // �߰��� �ο��� ��

	public static void main(String[] args) {
		InitialSet(); // ó���� �� ����
		do {
			OutPut_MainRoomInfo();
			if (InPut_RoomNum().equals("back"))// �������� ���ư���
				continue;
			else {
				OutPutRoomInfo(); // ������ �� Ȯ�� ���� ����
				SelAddorDecide(); // �ο� �߰� �Ǵ� Ȯ��
			}
		} while (!bProgramexit);
	}

	static void OutPutRoomInfo() { // ���� ������ �� Ȯ���� �� �ֵ��� ���� ����
		// TODO Auto-generated method stub
		String sText = "";
		int iRoomType = iSelRoomType - 1;
		int iRoomNumAdd = 0;
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (sSelRoomNum.equals(ihotelRoom[0][i]))
				iRoomNumAdd = i;
		}

		Line();
		sText = ">> �����Ͻ� ���� " + sroomType[0][iRoomType] + " �� �� " + ihotelRoom[0][iRoomNumAdd] + "�� ���Դϴ�.\n"
				+ ">> �����Ͻ� " + sSelRoomNum + " ���� ������ " + sroomType[1][iRoomType] + "�� �Դϴ�.\n"
				+ ">> �����Ͻ� ���� �Խ� ������ �ο��� " + ihotelRoom[2][iRoomNumAdd] + "���Դϴ�. (�ִ� ���� �ο� : "
				+ (ihotelRoom[2][iRoomNumAdd]) + "/" + (Integer.parseInt(ihotelRoom[2][iRoomNumAdd]) + 2)
				+ "��)\n- �ο� �߰� ��, �δ� 10,000���� �߰� ����� �߻��մϴ�.";
		System.out.print(sText);
	}

	static void SelAddorDecide() { // �� ���� ��, �ο� �߰� �Ǵ� ���� Ȯ�� �� ����
		System.out.print("\n- �ο� �߰��� ���Ͻø� Add��\n- ���� Ȯ�� �� �����Ͻ÷��� ok�� �Է����ּ���.");
		String sinputData = "";
		sinputData = scan00.next();

		sinputData = sinputData.toLowerCase();
		// TODO Auto-generated method stub
		if (sinputData.equals("add"))
			AddPeople();
		else if (sinputData.equals("ok"))
			DecideAndCalculation();
		else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			SelAddorDecide(); // �ٽ� �Է� �ް�, ó���ϱ�
		}
	}

	private static void DecideAndCalculation() { // ���� Ȯ�� �� ���� ���� �����ֱ�
		// TODO Auto-generated method stub

		int istandardPeople = 0;
		int iAddPeople = 0;
		if (!sSelRoomPeople.equals(""))
			iAddPeople = Integer.parseInt(sSelRoomPeople);
		String stotal = "";

		// OutPutRoomInfo();
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (sSelRoomNum.equals(ihotelRoom[0][i])) {
				istandardPeople = Integer.parseInt(ihotelRoom[2][i]);
				if (iAddPeople > istandardPeople) {
					stotal = String.valueOf((Integer.parseInt(sroomType[1][iSelRoomType - 1])
							+ ((iAddPeople - istandardPeople) * 10000))); // �� ����
				} else
					stotal = sroomType[1][iSelRoomType - 1]; // �� ����
			}
		}
		Payment(stotal);
	}

	private static void Payment(String stotal) { // ��� ���� ���� �ޱ�
		// TODO Auto-generated method stub
		String sText = "";

		sText = "\n- ������ �����ϰڽ��ϴ�.\n- ������ ����ϰ� �������� ���ư����� main�� �Է����ּ���.\n- �� ���� �ݾ��� " + stotal
				+ "�Դϴ�.\n- ������ �����Ϸ��� ok�� �Է����ּ��� :";

		System.out.print(sText);

		PaymentChk(stotal);
	}

	private static void PaymentChk(String stotal) { // ��꿡 �ʿ��� ���� �ޱ�
		int iInputMoney = 0;
		boolean bChk = false;
		String sInput = "";
		Scanner scan02 = new Scanner(System.in);

		do {
			sInput = scan02.next();
			sInput = sInput.toLowerCase();
			if (sInput.equals("main")) // �ʱ� ȭ������ ���ư��� �� ��� �� �ʱ�ȭ
			{
				sSelRoomNum = "";
				iSelRoomType = 0;
				sSelRoomPeople = "";
				bChk = true;
			} else if (sInput.equals("ok")) {
				System.out.println("������ �����մϴ�. �ݾ��� �Ա����ּ���.");
				iInputMoney = scan.nextInt();

				if (stotal.equals(String.valueOf(iInputMoney))) {
					System.out.println("���������� ������ �Ϸ�Ǿ����ϴ�.\n" + sSelRoomNum + "���� ���� ���� �Ǿ����ϴ�.");
					RoomReserveSet();
					sSelRoomNum = "";
					iSelRoomType = 0;
					sSelRoomPeople = "";
					return;
				} else if (Integer.parseInt(stotal) > iInputMoney) // �� ���� �Ա����� ��
				{
					LowMoney(iInputMoney, stotal);
				} else // ���� ���� �Ա����� ��
				{
					iInputMoney -= Integer.parseInt(stotal);// �ܵ� ���
					System.out.println("���������� ������ �Ϸ�Ǿ����ϴ�.\n" + "�Ž��� �� " + iInputMoney + "���� ��ȯ�Ǿ����ϴ�.\n" + sSelRoomNum
							+ "���� ���� ���� �Ǿ����ϴ�.");
					RoomReserveSet();
					sSelRoomNum = "";
					iSelRoomType = 0;
					sSelRoomPeople = "";
				}
				bChk = true;
			} else {
				System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.\n- ������ ����ϰ� �������� ���ư����� main�� �Է����ּ���.\n������ �����Ϸ��� ok�� �Է����ּ��� :");
			}
		} while (!bChk);
	}

	private static void LowMoney(int iInputMoney, String stotal) { // ���� ������ ���, ó�����ִ� ��
		// TODO Auto-generated method stub
		int iInput = 0;
		boolean bFlag = false;
		int iMoney = iInputMoney;
		do {
			System.out.println("���� �Ա��� �ݾ��� " + iMoney + "�� �Դϴ�.");
			System.out.print("�ܾ��� �����մϴ�.\n- ������ ����ϰ� �������� ���ư����� main�� 99�� �Է����ּ���.\n- �߰��� �ݾ��� �Ա����ּ��� : ");
			iInput = scan00.nextInt();
			if (iInput == 99) {
				System.out.println("�������� ���ư��ϴ�.");
				sSelRoomNum = "";
				iSelRoomType = 0;
				sSelRoomPeople = "";
				bFlag = true;
			} else if ((iInput < 0)) {
				System.out.println("��Ȯ�� ������ �Է����ּ���.");
			} else {
				iMoney += iInput;
				if (iMoney >= Integer.parseInt(stotal)) {
					iMoney -= Integer.parseInt(stotal);// �ܵ� ���
					System.out.println("���������� ������ �Ϸ�Ǿ����ϴ�.\n" + "�Ž��� �� " + iMoney + "���� ��ȯ�Ǿ����ϴ�.\n" + sSelRoomNum
							+ "���� ���� ���� �Ǿ����ϴ�.");
					RoomReserveSet();
					sSelRoomNum = "";
					iSelRoomType = 0;
					sSelRoomPeople = "";
					bFlag = true;
				} else
					bFlag = false;
			}
		} while (!bFlag);
	}

	private static void AddPeople() { // �ο� �߰�
		// TODO Auto-generated method stub
		int iRoomNumPeople = 0;
		int iAddPeopleNum = 0;
		System.out.print("- �߰� �ο��� �ִ� 2����� �����մϴ�.\n�߰��ϰ��� �ϴ� �ο� ���� �Է����ּ��� : ");
		iAddPeopleNum = scan.nextInt();
		if ((iAddPeopleNum > 2) || (iAddPeopleNum < 0)) {
			System.out.print("- �߰� �ο����� Ȯ�����ּ���.");
			AddPeople();
		}
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (sSelRoomNum.equals(ihotelRoom[0][i])) {
				iRoomNumPeople = Integer.parseInt(ihotelRoom[2][i]);
				sSelRoomPeople = String.valueOf(iRoomNumPeople + (iAddPeopleNum * 1));// �ο� �� �� ��ŭ
																						// �߰����ֱ�
			}
		}
		DecideAndCalculation();
	}

	static void RoomReserveSet() { // �� ���� �� ���� �Ұ������� �����ϱ� ���� 1�� �ٲ��ֱ�
		// TODO Auto-generated method stub
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (ihotelRoom[0][i].equals(sSelRoomNum)) {
				ihotelRoom[1][i] = "1";
				break;
			}
		}
	}

	static void RoomTypeChk() { // �� ��ȣ�� �� Ÿ�� ��������
		// TODO Auto-generated method stub
		String sInitialNum; // ù��° ���� ���� ����
		char chRoomNumType = sSelRoomNum.charAt(0);
		sInitialNum = String.valueOf(chRoomNumType);

		iSelRoomType = Integer.parseInt(sInitialNum);
	}

	static String InPut_RoomNum() { // ���� �Ϸ��� �ϴ� ���� ��ȣ �Է� �ޱ�
		// TODO Auto-generated method stub
		String sRoomNum = "";
		boolean bRoomNum = false; // ���������� ��ȣ �Է� �� üũ
		boolean bInputChk = false; // �������� �Է������� true
		while (!bInputChk) {
			Line();
			System.out.print("�������� ���ư����� Back�� �Է����ּ���\n>> �����ϰ��� �ϴ� ���� ��ȣ�� �Է����ּ��� : ");
			// scan.nextLine();
			sRoomNum = scan.next();
			sRoomNum = sRoomNum.toLowerCase();
			if (sRoomNum.equals("back")) {
				bInputChk = true;
				return sRoomNum;
			} else {
				for (int i = 0; i < ALLROOMNUMBER; i++) {
					if (sRoomNum.equals(ihotelRoom[0][i])) {
						if (SelRoomPossible(i)) // �Ұ����̸� false , �����̸� true
						{
							System.out.println("������ ������ ���Դϴ�.");
							bRoomNum = true;
							bInputChk = true;
							sSelRoomNum = sRoomNum;
							RoomTypeChk();
							break;
						} else {
							System.out.println("�� �̹� ������ �� ���Դϴ�. �ٸ� ���� �������ּ���.");
							bRoomNum = true;
							bInputChk = false;
						}
					}
				}
				if (!bRoomNum) {
					System.out.println("�� ���� ���Դϴ�. �� ��ȣ�� �ٽ� Ȯ�� �� �� ��ȣ�� �����ּ���.");
					bInputChk = false;
				}
			}
		}
		return sRoomNum;
	}

	static boolean SelRoomPossible(int iroomNumAddres) { // ���� ������ ������ üũ // 1�̸� �Ұ��� 0�̸� ����
		// TODO Auto-generated method stub
		boolean bReserPos = false;
		if (ihotelRoom[1][iroomNumAddres].equals("1"))
			bReserPos = false;
		else
			bReserPos = true;

		return bReserPos;
	}

	static void OutPut_MainRoomInfo() { // �� ���� ��� - ��� ���

		// TODO Auto-generated method stub
		System.out.println("\n###################################### ȣ�� �� ���� ########################################");
		System.out.println("�� >> ���� �Ұ���\r\n" + "�� >> ���� ����");
		System.out.println("------------------------------- 1�� " + sroomType[0][0] + " " + sroomType[1][0]
				+ "�� --------------------------------------");
		System.out.print("��  ��ȣ || ");
		for (int i = 0; i < STANDARDLIMIT; i++) {
			System.out.print(" " + ihotelRoom[0][i]);
		}
		System.out.println("");
		System.out.print("���ɿ��� || ");
		for (int i = 0; i < STANDARDLIMIT; i++) {
			System.out.print("  " + CheckInableChk(ihotelRoom[1][i]) + " ");
		}
		System.out.println("");
		System.out.print("�ο�  �� || ");
		for (int i = 0; i < STANDARDLIMIT; i++) {
			System.out.print(" " + ihotelRoom[2][i] + "��");
		}
		System.out.println("");
		System.out.println("------------------------------- 2�� " + sroomType[0][1] + " " + sroomType[1][1]
				+ "�� ---------------------------------------");
		System.out.print("��  ��ȣ || ");
		for (int i = STANDARDLIMIT; i < DELUXLIMIT; i++) {
			System.out.print(" " + ihotelRoom[0][i]);
		}
		System.out.println("");
		System.out.print("���ɿ��� || ");
		for (int i = STANDARDLIMIT; i < DELUXLIMIT; i++)
			System.out.print("  " + CheckInableChk(ihotelRoom[1][i]) + " ");

		System.out.println("");
		System.out.print("�ο�  �� || ");
		for (int i = STANDARDLIMIT; i < DELUXLIMIT; i++) {
			System.out.print(" " + ihotelRoom[2][i] + "��");
		}
		System.out.println("");
		System.out.println("-------------------------------- 3�� " + sroomType[0][2] + " " + sroomType[1][2]
				+ "�� ---------------------------------------");
		System.out.print("��  ��ȣ || ");
		for (int i = DELUXLIMIT; i < ALLROOMNUMBER; i++) {
			System.out.print(" " + ihotelRoom[0][i]);
		}
		System.out.println("");
		System.out.print("���ɿ��� || ");
		for (int i = DELUXLIMIT; i < ALLROOMNUMBER; i++)
			System.out.print("  " + CheckInableChk(ihotelRoom[1][i]) + " ");
		System.out.println("");
		System.out.print("�ο�  �� || ");
		for (int i = DELUXLIMIT; i < ALLROOMNUMBER; i++) {
			System.out.print(" " + ihotelRoom[2][i] + "��");
		}
		System.out.println("");
	}

	static String CheckInableChk(String string) { // ���� ���� �����ֱ�
		// TODO Auto-generated method stub
		String sText = "";
		if (string.equals("1"))
			sText = "��";
		else if (string.equals("0"))
			sText = "��";
		else
			sText = "????";

		return sText;
	}

	static void Line() { // ���ڰ� ������� ����
		System.out.println(
				"============================================================================================");
	}

	static void InitialSet() { // ��� �� �ʱ� ���� - �Һ��� // -> ����Ʈ : 4~8�� �𷰽� : 3~5�� ���Ĵٵ� 2~4��
		// TODO Auto-generated method stub
		for (int i = 0; i < ALLROOMNUMBER; i++) // ihotelRoom[][] // �� ��ȣ ���� �� ��� ���� ���� ���� �������� �ʱ�ȭ
		{
			if (i >= DELUXLIMIT) // ����Ʈ��
			{
				ihotelRoom[0][i] = String.valueOf(270 + (i + 1));
				ihotelRoom[2][i] = String.valueOf((int) (Math.random() * 5) + 4);
			} else if (i >= STANDARDLIMIT) // �𷰽� ��
			{
				ihotelRoom[0][i] = String.valueOf(180 + (i + 1)); // 0�� ���,
				ihotelRoom[2][i] = String.valueOf((int) (Math.random() * 2) + 3);
			} else// ���Ĵٵ� ��
			{
				ihotelRoom[0][i] = String.valueOf(100 + (i + 1));
				ihotelRoom[2][i] = String.valueOf((int) (Math.random() * 2) + 2);
			}
			ihotelRoom[1][i] = String.valueOf((int) (Math.random() * 2)); // 0�� ���, ���� ���� | 1�� ��� ���� �Ұ���
		}
		// sroomType [][] ����
		sroomType[0][0] = "Standard";
		sroomType[0][1] = "Deluxe";
		sroomType[0][2] = "Suite";
		sroomType[1][0] = "50000";
		sroomType[1][1] = "100000";
		sroomType[1][2] = "150000";
	}
}
