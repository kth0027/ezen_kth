package Hotemsample4;

import java.util.Scanner;

public class RoomInfo {
	static final int ALLROOMNUMBER = 34;
	static final int ROWNUM02 = 2;
	static final int ROWNUM03 = 3;
	static final int COLNUM = 3;
	static final int STANDARDLIMIT = 20; // 일반 룸 번호 101~121호까지
	static final int DELUXLIMIT = 30; // 디럭스 룸 번호는 201~211호까지 // 스위트룸은 301~304호

	static String[][] ihotelRoom = new String[ROWNUM03][ALLROOMNUMBER];
	static String[][] sroomType = new String[ROWNUM02][COLNUM]; // stadard 1 5만원; delux 2-10만원 ; suite 3-15만원
	static char cfirstNum; // 배열에 들어가있는 첫번째 번호로 스탠다드 1; 디럭스 2; 스위트 3 구분자

	static Scanner scan = new Scanner(System.in);
	static Scanner scan00 = new Scanner(System.in);
	static boolean bProgramexit = false; // 모든 방이 예약 중이면 프로그램 종료
	static String sSelRoomNum = ""; // 내가 선택한 방
	static int iSelRoomType = 0; // 내가 선택한 방 타입 변수 저장
	static String sSelRoomPeople = ""; // 추가된 인원의 수

	public static void main(String[] args) {
		InitialSet(); // 처음에 한 번만
		do {
			OutPut_MainRoomInfo();
			if (InPut_RoomNum().equals("back"))// 메인으로 돌아가기
				continue;
			else {
				OutPutRoomInfo(); // 예약한 방 확인 문구 노출
				SelAddorDecide(); // 인원 추가 또는 확정
			}
		} while (!bProgramexit);
	}

	static void OutPutRoomInfo() { // 내가 예약한 방 확인할 수 있도록 문구 노출
		// TODO Auto-generated method stub
		String sText = "";
		int iRoomType = iSelRoomType - 1;
		int iRoomNumAdd = 0;
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (sSelRoomNum.equals(ihotelRoom[0][i]))
				iRoomNumAdd = i;
		}

		Line();
		sText = ">> 선택하신 룸은 " + sroomType[0][iRoomType] + " 룸 의 " + ihotelRoom[0][iRoomNumAdd] + "번 방입니다.\n"
				+ ">> 선택하신 " + sSelRoomNum + " 룸의 가격은 " + sroomType[1][iRoomType] + "원 입니다.\n"
				+ ">> 선택하신 방의 입실 가능한 인원은 " + ihotelRoom[2][iRoomNumAdd] + "명입니다. (최대 가능 인원 : "
				+ (ihotelRoom[2][iRoomNumAdd]) + "/" + (Integer.parseInt(ihotelRoom[2][iRoomNumAdd]) + 2)
				+ "명)\n- 인원 추가 시, 인당 10,000원의 추가 비용이 발생합니다.";
		System.out.print(sText);
	}

	static void SelAddorDecide() { // 방 선택 후, 인원 추가 또는 예약 확정 중 선택
		System.out.print("\n- 인원 추가를 원하시면 Add를\n- 예약 확정 후 결제하시려면 ok를 입력해주세요.");
		String sinputData = "";
		sinputData = scan00.next();

		sinputData = sinputData.toLowerCase();
		// TODO Auto-generated method stub
		if (sinputData.equals("add"))
			AddPeople();
		else if (sinputData.equals("ok"))
			DecideAndCalculation();
		else {
			System.out.println("잘못 입력하셨습니다.");
			SelAddorDecide(); // 다시 입력 받고, 처리하기
		}
	}

	private static void DecideAndCalculation() { // 예약 확정 후 최종 가격 보여주기
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
							+ ((iAddPeople - istandardPeople) * 10000))); // 총 가격
				} else
					stotal = sroomType[1][iSelRoomType - 1]; // 총 가격
			}
		}
		Payment(stotal);
	}

	private static void Payment(String stotal) { // 계산 관련 문구 받기
		// TODO Auto-generated method stub
		String sText = "";

		sText = "\n- 결제를 진행하겠습니다.\n- 결제를 취소하고 메인으로 돌아가려면 main을 입력해주세요.\n- 총 결제 금액은 " + stotal
				+ "입니다.\n- 결제를 진행하려면 ok를 입력해주세요 :";

		System.out.print(sText);

		PaymentChk(stotal);
	}

	private static void PaymentChk(String stotal) { // 계산에 필요한 값을 받기
		int iInputMoney = 0;
		boolean bChk = false;
		String sInput = "";
		Scanner scan02 = new Scanner(System.in);

		do {
			sInput = scan02.next();
			sInput = sInput.toLowerCase();
			if (sInput.equals("main")) // 초기 화면으로 돌아가기 전 모든 값 초기화
			{
				sSelRoomNum = "";
				iSelRoomType = 0;
				sSelRoomPeople = "";
				bChk = true;
			} else if (sInput.equals("ok")) {
				System.out.println("결제를 진행합니다. 금액을 입금해주세요.");
				iInputMoney = scan.nextInt();

				if (stotal.equals(String.valueOf(iInputMoney))) {
					System.out.println("정상적으로 결제가 완료되었습니다.\n" + sSelRoomNum + "룸이 정상 예약 되었습니다.");
					RoomReserveSet();
					sSelRoomNum = "";
					iSelRoomType = 0;
					sSelRoomPeople = "";
					return;
				} else if (Integer.parseInt(stotal) > iInputMoney) // 돈 적게 입금했을 떄
				{
					LowMoney(iInputMoney, stotal);
				} else // 돈을 많이 입금했을 때
				{
					iInputMoney -= Integer.parseInt(stotal);// 잔돈 계산
					System.out.println("정상적으로 결제가 완료되었습니다.\n" + "거스름 돈 " + iInputMoney + "원이 반환되었습니다.\n" + sSelRoomNum
							+ "룸이 정상 예약 되었습니다.");
					RoomReserveSet();
					sSelRoomNum = "";
					iSelRoomType = 0;
					sSelRoomPeople = "";
				}
				bChk = true;
			} else {
				System.out.println("잘못된 값을 입력하였습니다.\n- 결제를 취소하고 메인으로 돌아가려면 main을 입력해주세요.\n결제를 진행하려면 ok를 입력해주세요 :");
			}
		} while (!bChk);
	}

	private static void LowMoney(int iInputMoney, String stotal) { // 돈이 부족할 경우, 처리해주는 가
		// TODO Auto-generated method stub
		int iInput = 0;
		boolean bFlag = false;
		int iMoney = iInputMoney;
		do {
			System.out.println("현재 입금한 금액은 " + iMoney + "원 입니다.");
			System.out.print("잔액이 부족합니다.\n- 결제를 취소하고 메인으로 돌아가려면 main을 99를 입력해주세요.\n- 추가로 금액을 입금해주세요 : ");
			iInput = scan00.nextInt();
			if (iInput == 99) {
				System.out.println("메인으로 돌아갑니다.");
				sSelRoomNum = "";
				iSelRoomType = 0;
				sSelRoomPeople = "";
				bFlag = true;
			} else if ((iInput < 0)) {
				System.out.println("정확한 값으로 입력해주세요.");
			} else {
				iMoney += iInput;
				if (iMoney >= Integer.parseInt(stotal)) {
					iMoney -= Integer.parseInt(stotal);// 잔돈 계산
					System.out.println("정상적으로 결제가 완료되었습니다.\n" + "거스름 돈 " + iMoney + "원이 반환되었습니다.\n" + sSelRoomNum
							+ "룸이 정상 예약 되었습니다.");
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

	private static void AddPeople() { // 인원 추가
		// TODO Auto-generated method stub
		int iRoomNumPeople = 0;
		int iAddPeopleNum = 0;
		System.out.print("- 추가 인원은 최대 2명까지 가능합니다.\n추가하고자 하는 인원 수를 입력해주세요 : ");
		iAddPeopleNum = scan.nextInt();
		if ((iAddPeopleNum > 2) || (iAddPeopleNum < 0)) {
			System.out.print("- 추가 인원수를 확인해주세요.");
			AddPeople();
		}
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (sSelRoomNum.equals(ihotelRoom[0][i])) {
				iRoomNumPeople = Integer.parseInt(ihotelRoom[2][i]);
				sSelRoomPeople = String.valueOf(iRoomNumPeople + (iAddPeopleNum * 1));// 인원 수 그 만큼
																						// 추가해주기
			}
		}
		DecideAndCalculation();
	}

	static void RoomReserveSet() { // 방 예약 후 예약 불가능으로 변경하기 위해 1로 바꿔주기
		// TODO Auto-generated method stub
		for (int i = 0; i < ALLROOMNUMBER; i++) {
			if (ihotelRoom[0][i].equals(sSelRoomNum)) {
				ihotelRoom[1][i] = "1";
				break;
			}
		}
	}

	static void RoomTypeChk() { // 룸 번호의 룸 타입 가져오기
		// TODO Auto-generated method stub
		String sInitialNum; // 첫번째 숫자 담을 변수
		char chRoomNumType = sSelRoomNum.charAt(0);
		sInitialNum = String.valueOf(chRoomNumType);

		iSelRoomType = Integer.parseInt(sInitialNum);
	}

	static String InPut_RoomNum() { // 예약 하려고 하는 방의 번호 입력 받기
		// TODO Auto-generated method stub
		String sRoomNum = "";
		boolean bRoomNum = false; // 비정상적인 번호 입력 시 체크
		boolean bInputChk = false; // 정상적인 입력했으면 true
		while (!bInputChk) {
			Line();
			System.out.print("메인으로 돌아가려면 Back을 입력해주세요\n>> 예약하고자 하는 방의 번호를 입력해주세요 : ");
			// scan.nextLine();
			sRoomNum = scan.next();
			sRoomNum = sRoomNum.toLowerCase();
			if (sRoomNum.equals("back")) {
				bInputChk = true;
				return sRoomNum;
			} else {
				for (int i = 0; i < ALLROOMNUMBER; i++) {
					if (sRoomNum.equals(ihotelRoom[0][i])) {
						if (SelRoomPossible(i)) // 불가능이면 false , 가능이면 true
						{
							System.out.println("예약이 가능한 방입니다.");
							bRoomNum = true;
							bInputChk = true;
							sSelRoomNum = sRoomNum;
							RoomTypeChk();
							break;
						} else {
							System.out.println("※ 이미 예약이 된 방입니다. 다른 방을 예약해주세요.");
							bRoomNum = true;
							bInputChk = false;
						}
					}
				}
				if (!bRoomNum) {
					System.out.println("※ 없는 방입니다. 방 번호를 다시 확인 후 새 번호를 눌러주세요.");
					bInputChk = false;
				}
			}
		}
		return sRoomNum;
	}

	static boolean SelRoomPossible(int iroomNumAddres) { // 예약 가능한 방인지 체크 // 1이면 불가능 0이면 가능
		// TODO Auto-generated method stub
		boolean bReserPos = false;
		if (ihotelRoom[1][iroomNumAddres].equals("1"))
			bReserPos = false;
		else
			bReserPos = true;

		return bReserPos;
	}

	static void OutPut_MainRoomInfo() { // 방 정보 출력 - 계속 사용

		// TODO Auto-generated method stub
		System.out.println("\n###################################### 호텔 룸 정보 ########################################");
		System.out.println("● >> 예약 불가능\r\n" + "○ >> 예약 가능");
		System.out.println("------------------------------- 1층 " + sroomType[0][0] + " " + sroomType[1][0]
				+ "원 --------------------------------------");
		System.out.print("방  번호 || ");
		for (int i = 0; i < STANDARDLIMIT; i++) {
			System.out.print(" " + ihotelRoom[0][i]);
		}
		System.out.println("");
		System.out.print("가능여부 || ");
		for (int i = 0; i < STANDARDLIMIT; i++) {
			System.out.print("  " + CheckInableChk(ihotelRoom[1][i]) + " ");
		}
		System.out.println("");
		System.out.print("인원  수 || ");
		for (int i = 0; i < STANDARDLIMIT; i++) {
			System.out.print(" " + ihotelRoom[2][i] + "명");
		}
		System.out.println("");
		System.out.println("------------------------------- 2층 " + sroomType[0][1] + " " + sroomType[1][1]
				+ "원 ---------------------------------------");
		System.out.print("방  번호 || ");
		for (int i = STANDARDLIMIT; i < DELUXLIMIT; i++) {
			System.out.print(" " + ihotelRoom[0][i]);
		}
		System.out.println("");
		System.out.print("가능여부 || ");
		for (int i = STANDARDLIMIT; i < DELUXLIMIT; i++)
			System.out.print("  " + CheckInableChk(ihotelRoom[1][i]) + " ");

		System.out.println("");
		System.out.print("인원  수 || ");
		for (int i = STANDARDLIMIT; i < DELUXLIMIT; i++) {
			System.out.print(" " + ihotelRoom[2][i] + "명");
		}
		System.out.println("");
		System.out.println("-------------------------------- 3층 " + sroomType[0][2] + " " + sroomType[1][2]
				+ "원 ---------------------------------------");
		System.out.print("방  번호 || ");
		for (int i = DELUXLIMIT; i < ALLROOMNUMBER; i++) {
			System.out.print(" " + ihotelRoom[0][i]);
		}
		System.out.println("");
		System.out.print("가능여부 || ");
		for (int i = DELUXLIMIT; i < ALLROOMNUMBER; i++)
			System.out.print("  " + CheckInableChk(ihotelRoom[1][i]) + " ");
		System.out.println("");
		System.out.print("인원  수 || ");
		for (int i = DELUXLIMIT; i < ALLROOMNUMBER; i++) {
			System.out.print(" " + ihotelRoom[2][i] + "명");
		}
		System.out.println("");
	}

	static String CheckInableChk(String string) { // 가능 여부 보여주기
		// TODO Auto-generated method stub
		String sText = "";
		if (string.equals("1"))
			sText = "●";
		else if (string.equals("0"))
			sText = "○";
		else
			sText = "????";

		return sText;
	}

	static void Line() { // 예쁘게 만들어줄 라인
		System.out.println(
				"============================================================================================");
	}

	static void InitialSet() { // 모든 값 초기 세팅 - 불변값 // -> 스위트 : 4~8명 디럭스 : 3~5명 스탠다드 2~4명
		// TODO Auto-generated method stub
		for (int i = 0; i < ALLROOMNUMBER; i++) // ihotelRoom[][] // 룸 번호 설정 및 모든 예약 가능 여부 랜덤으로 초기화
		{
			if (i >= DELUXLIMIT) // 스위트룸
			{
				ihotelRoom[0][i] = String.valueOf(270 + (i + 1));
				ihotelRoom[2][i] = String.valueOf((int) (Math.random() * 5) + 4);
			} else if (i >= STANDARDLIMIT) // 디럭스 룸
			{
				ihotelRoom[0][i] = String.valueOf(180 + (i + 1)); // 0일 경우,
				ihotelRoom[2][i] = String.valueOf((int) (Math.random() * 2) + 3);
			} else// 스탠다드 룸
			{
				ihotelRoom[0][i] = String.valueOf(100 + (i + 1));
				ihotelRoom[2][i] = String.valueOf((int) (Math.random() * 2) + 2);
			}
			ihotelRoom[1][i] = String.valueOf((int) (Math.random() * 2)); // 0일 경우, 예약 가능 | 1일 경우 예약 불가능
		}
		// sroomType [][] 세팅
		sroomType[0][0] = "Standard";
		sroomType[0][1] = "Deluxe";
		sroomType[0][2] = "Suite";
		sroomType[1][0] = "50000";
		sroomType[1][1] = "100000";
		sroomType[1][2] = "150000";
	}
}
