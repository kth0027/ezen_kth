package 신우현;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import 보완할점.호텔Total;
import 신우현.MemberController;
import 신우현.Member;

public class File {
	// 1. 필드
	// 1. 회원정보를 저장하는 파일의 경로
	private static String memberpath = "C:/Users/ezr210310/git/hotel-reservation-system/TeamProject/src/신우현/memberlist.txt";
	private static String roompath = "C:/Users/ezr210310/git/hotel-reservation-system/TeamProject/src/신우현/roomlist.txt";

	// 2. 저장 메소드
	public synchronized static boolean filesave(int type) {
		try {
			FileOutputStream fileOutputStream = null;

			if (type == 1) { // 회원저장
				// 1. 파일객체에 경로 설정
				fileOutputStream = new FileOutputStream(memberpath);
				// 2. 반복문을 이용한 회원리스트에서 하나씩 회원 가져오기
				for (Member member : MemberController.memberlist) {
					// 3. 각 회원마다 필드[,]와 회원[/n] 구분
					String outstring = member.getH_id() + "," + member.getH_pw() + "," + member.getH_name() + ","
							+ member.getH_phone() + "\n";

					// 4. 바이트로 내보내기
					fileOutputStream.write(outstring.getBytes());
				}
				// 5. 스트림 사용후 초기화
				fileOutputStream.flush(); // 파일스트림내 존재하는 바이트 제거
				fileOutputStream.close(); // 파일스트림 닫기

				return true; // 파일처리 성공
			}

			if (type == 2) {
				// 1. 파일객체에 경로 설정
				fileOutputStream = new FileOutputStream(roompath);
				// 2. 반복문을 이용한 회원리스트에서 하나씩 회원 가져오기
				for (String[] room : 호텔Total.room) {

					// 3. 각 회원마다 필드[,]와 회원[/n] 구분
					String outstring = room[0] + "," + room[1] + "," + room[2] + "\n";

					// 4. 바이트로 내보내기
					fileOutputStream.write(outstring.getBytes());

				}
				// 5. 스트림 사용후 초기화
				fileOutputStream.flush(); // 파일스트림내 존재하는 바이트 제거
				fileOutputStream.close(); // 파일스트림 닫기

				return true; // 파일처리 성공
			}

		} catch (Exception e) {
			System.err.println(" [알림] : 파일 저장 오류 발생 [ 관리자에게 문의 ]");
		}
		return false; // 파일처리 실패
	}

	// 3. 불러오기 메소드
	public synchronized static boolean fileload(int type) {
		try {
			FileInputStream fileInputStream = null;
			if (type == 1) {
				// 1. 입력스트림 경로 설정
				fileInputStream = new FileInputStream(memberpath);
				// 2. 스트림(단위:바이트) 바이트배열 선언
				byte[] bytes = new byte[10000]; // 10kb 정도
				// 3. 입력스트림에서 바이트 읽어와서 배열에 저장
				fileInputStream.read(bytes);
				// 4. 바이트배열 -> 문자열 변환
				String instring = new String(bytes);
				// 5. 회원 분리하기 \n
				String[] members = instring.split("\n"); // \n 구분시 공백회원 추가
				// 6. 반복문을 이용한 회원별 필드 분리하기 ,
				for (int i = 0; i < members.length - 1; i++) { // -1 : 공백회원 제외
					// 7. 회원별 필드 분리
					String[] field = members[i].split(",");
					// 8. 분리된 필드를 객체화 [ point필드는 int형으로 변환 : String -> Int ( Integer.parseInt ) ]
					Member member = new Member(field[0], field[1], field[2], field[3]);
					// 9. 각 객체를 리스트에 저장
					MemberController.memberlist.add(member);
				}
				fileInputStream.close(); // 스트림 닫기
				return true; // 파일 불러오기 성공
			}
			if (type == 2) {
				// 1. 입력스트림 경로 설정
				fileInputStream = new FileInputStream(roompath);
				// 2. 스트림(단위:바이트) 바이트배열 선언
				byte[] bytes = new byte[10000]; // 10kb 정도
				// 3. 입력스트림에서 바이트 읽어와서 배열에 저장
				fileInputStream.read(bytes);
				// 4. 바이트배열 -> 문자열 변환
				String instring = new String(bytes);
				// 5. 회원 분리하기 \n
				String[] rooms = instring.split("\n"); // \n 구분시 공백회원 추가
				// 6. 반복문을 이용한 회원별 필드 분리하기 ,

				for (int i = 0; i < rooms.length - 1; i++) { // -1 : 공백회원 제외
					// 7. 회원별 필드 분리
					String[] room = rooms[i].split(",");
					for (int j = 0; j < room.length; j++) {

						if (!room[j].equals("null")) {
							호텔Total.room[i][j] = room[j];
						}
					}

				}
				fileInputStream.close(); // 스트림 닫기
				return true; // 파일 불러오기 성공
			}

		} catch (Exception e) {
			System.err.println(" [알림] : 파일 불러오기 오류 발생 [ 관리자에게 문의 ]");
		}
		return false; // 파일 블러오기 실패시

	}
}
