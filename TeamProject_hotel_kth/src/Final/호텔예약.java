package Final;

import java.io.IOException;

public interface 호텔예약 {

	// 추상메소드
	public void 예약등록(int hotelch, int roomch);
	public void 예약취소(int hotelch, int roomch);
	public void 본인예약조회();
	public void 전체예약현황();
	public void 파일처리();
	
	public static void 스탠다드() {
		String[] 스탠다드 = new String[3];
		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };

		// 스탠다드
		스탠다드[0] = "스탠다드룸";
		스탠다드[1] = "12평";
		스탠다드[2] = "32 인치 이상의 TV,별 난방 조절기,미니바,생수,에스프레소 커피 머신,"
				+ "보스 사운드링크 미니 블루투스 스피커,다리미와 다리미 판,객실 내 금고,조간 신문 (요청 시 제공)," + "유아용침대 (요청 시 제공),르 라보 (Le Labo™) 목욕용품";

		System.out.println("[[" + 스탠다드[0] + "]]");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "." + 카테고리[i] + " : ");
			if (i != 2) {
				System.out.println(스탠다드[i]);
			} else {
				String[] strArray = 스탠다드[i].split(",");
				int k = 1;
				System.out.println();
				for (String temp : strArray) {
					System.out.println(" " + k + ")" + temp);
					k++;
				}
			}
		}
	}

	static void 디럭스() {
		String[] 디럭스 = new String[3];
		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };

		// 디럭스
		디럭스[0] = "디럭스룸";
		디럭스[1] = "15평";
		디럭스[2] = "32 인치 이상의 TV,별 난방 조절기,미니바,생수,에스프레소 커피 머신,"
				+ "보스 사운드링크 미니 블루투스 스피커,다리미와 다리미 판,객실 내 금고,조간 신문 (요청 시 제공),"
				+ "유아용침대 (요청 시 제공),르 라보 (Le Labo™) 목욕용품,목욕가운과 슬리퍼";

		System.out.println("[[" + 디럭스[0] + "]]");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "." + 카테고리[i] + " : ");
			if (i != 2) {
				System.out.println(디럭스[i]);
			} else {
				String[] strArray = 디럭스[i].split(",");
				int k = 1;
				System.out.println();
				for (String temp : strArray) {
					System.out.println(" " + k + ")" + temp);
					k++;
				}
			}
		}
	}

	static void 스위트() {
		String[] 스위트 = new String[3];
		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };

		// 스위트
		스위트[0] = "스위트룸";
		스위트[1] = "34평";
		스위트[2] = "구분된 식사공간과 미니 주방,대형 테이블과 사무공간,정품 용량의 이솝 어메니티,"
				+ "LED TV (거실: 65인치 / 침실: 55인치),개별 난방 조절기,미니바와 생수,에스프레소 커피 머신,"
				+ "보스 사운드링크 미니 블루투스 스피커,뱅 & 올룹슨 오디오 시스템,다리미와 다리미 판,객실 내 금고,"
				+ "유카타 실내 가운 및 슬리퍼,다이슨 슈퍼소닉(Dyson Supersonic™) 헤어드라이어";

		System.out.println("[[" + 스위트[0] + "]]");
		for (int i = 0; i < 3; i++) {
			System.out.print((i + 1) + "." + 카테고리[i] + " : ");
			if (i != 2) {
				System.out.println(스위트[i]);
			} else {
				String[] strArray = 스위트[i].split(",");
				int k = 1;
				System.out.println();
				for (String temp : strArray) {
					System.out.println(" " + k + ")" + temp);
					k++;
				}
			}
		}
	}
	
	
	

//	// 정적메소드
//	static void 객실() {
//
//		// 각 지점마다 정보 동일
//		String[][] 객실정보 = new String[3][5];
//
//		String[] 디럭스 = new String[5];
//		String[] 스위트 = new String[5];
//
//		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };
//
//		// 스탠다드
//		객실정보[0][0] = "스탠다드룸";
//		객실정보[0][1] = "12평";
//		객실정보[0][2] = "32 인치 이상의 TV,별 난방 조절기,미니바,생수,에스프레소 커피 머신,"
//				+ "보스 사운드링크 미니 블루투스 스피커,다리미와 다리미 판,객실 내 금고,조간 신문 (요청 시 제공)," + "유아용침대 (요청 시 제공),르 라보 (Le Labo™) 목욕용품";
//		객실정보[0][3] = "true";
//		객실정보[0][4] = "id";
//		// 디럭스
//		객실정보[1][0] = "디럭스룸";
//		객실정보[1][1] = "15평";
//		객실정보[1][2] = "32 인치 이상의 TV,별 난방 조절기,미니바,생수,에스프레소 커피 머신,"
//				+ "보스 사운드링크 미니 블루투스 스피커,다리미와 다리미 판,객실 내 금고,조간 신문 (요청 시 제공),"
//				+ "유아용침대 (요청 시 제공),르 라보 (Le Labo™) 목욕용품,목욕가운과 슬리퍼";
//		객실정보[1][3] = "true";
//		객실정보[1][4] = "id";
//		// 스위트
//		객실정보[2][0] = "스위트룸";
//		객실정보[2][1] = "34평";
//		객실정보[2][2] = "구분된 식사공간과 미니 주방,대형 테이블과 사무공간,정품 용량의 이솝 어메니티,"
//				+ "LED TV (거실: 65인치 / 침실: 55인치),개별 난방 조절기,미니바와 생수,에스프레소 커피 머신,"
//				+ "보스 사운드링크 미니 블루투스 스피커,뱅 & 올룹슨 오디오 시스템,다리미와 다리미 판,객실 내 금고,"
//				+ "유카타 실내 가운 및 슬리퍼,다이슨 슈퍼소닉(Dyson Supersonic™) 헤어드라이어";
//		객실정보[2][3] = "true";
//		객실정보[2][4] = "id";
//
//
//
//		// 객실정보 순차출력
//		System.out.println(">>>>>>>>>객실 정보<<<<<<<<<");
//
//	}
//
//	public static void 스탠다드() {
//		String[] 스탠다드 = new String[5];
//		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };
//
//		// 스탠다드
//		스탠다드[0] = "스탠다드룸";
//		스탠다드[1] = "12평";
//		스탠다드[2] = "32 인치 이상의 TV,별 난방 조절기,미니바,생수,에스프레소 커피 머신,"
//				+ "보스 사운드링크 미니 블루투스 스피커,다리미와 다리미 판,객실 내 금고,조간 신문 (요청 시 제공)," 
//				+ "유아용침대 (요청 시 제공),르 라보 (Le Labo™) 목욕용품";
//		스탠다드[3] = "true";
//		스탠다드[4] = "id";
//
//		System.out.println("[[" + 스탠다드[0] + "]]");
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "." + 카테고리[i] + " : ");
//			if (i != 2) {
//				System.out.println(스탠다드[i]);
//			} else {
//				String[] strArray = 스탠다드[i].split(",");
//				int k = 1;
//				System.out.println();
//				for (String temp : strArray) {
//					System.out.println(" " + k + ")" + temp);
//					k++;
//				}
//			}
//		}
//	}
//
//	static void 디럭스() {
//		String[] 디럭스 = new String[5];
//		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };
//
//		// 디럭스
//		디럭스[0] = "디럭스룸";
//		디럭스[1] = "15평";
//		디럭스[2] = "32 인치 이상의 TV,별 난방 조절기,미니바,생수,에스프레소 커피 머신,"
//				+ "보스 사운드링크 미니 블루투스 스피커,다리미와 다리미 판,객실 내 금고,조간 신문 (요청 시 제공),"
//				+ "유아용침대 (요청 시 제공),르 라보 (Le Labo™) 목욕용품,목욕가운과 슬리퍼";
//		디럭스[3] = "true";
//		디럭스[4] = "id";
//
//		System.out.println("[[" + 디럭스[0] + "]]");
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "." + 카테고리[i] + " : ");
//			if (i != 2) {
//				System.out.println(디럭스[i]);
//			} else {
//				String[] strArray = 디럭스[i].split(",");
//				int k = 1;
//				System.out.println();
//				for (String temp : strArray) {
//					System.out.println(" " + k + ")" + temp);
//					k++;
//				}
//			}
//		}
//	}
//
//	static void 스위트() {
//		String[] 스위트 = new String[5];
//		String[] 카테고리 = { "방타입", "객실면적", "부가혜택", "예약가능여부", "예약아이디" };
//
//		// 스위트
//		스위트[0] = "스위트룸";
//		스위트[1] = "34평";
//		스위트[2] = "구분된 식사공간과 미니 주방,대형 테이블과 사무공간,정품 용량의 이솝 어메니티,"
//				+ "LED TV (거실: 65인치 / 침실: 55인치),개별 난방 조절기,미니바와 생수,에스프레소 커피 머신,"
//				+ "보스 사운드링크 미니 블루투스 스피커,뱅 & 올룹슨 오디오 시스템,다리미와 다리미 판,객실 내 금고,"
//				+ "유카타 실내 가운 및 슬리퍼,다이슨 슈퍼소닉(Dyson Supersonic™) 헤어드라이어";
//		스위트[3] = "true";
//		스위트[4] = "id";
//
//		System.out.println("[[" + 스위트[0] + "]]");
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "." + 카테고리[i] + " : ");
//			if (i != 2) {
//				System.out.println(스위트[i]);
//			} else {
//				String[] strArray = 스위트[i].split(",");
//				int k = 1;
//				System.out.println();
//				for (String temp : strArray) {
//					System.out.println(" " + k + ")" + temp);
//					k++;
//				}
//			}
//		}
//	}

}
