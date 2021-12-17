package 보완할점;

import java.util.ArrayList;

import Reference.Main;
import Reference.Ticket;
import 신우현.Member;
import 신우현.호텔예약;

public class 호텔Total implements 호텔예약 {

	
	String 호텔명 ;
	
	ArrayList< rooms > roomlist = new ArrayList<>();
	

	// 메소드
	public 호텔Total(String 호텔명) {
	
		this.호텔명 = 호텔명;
	}

	@Override
	public void 예약등록(int hotelch, int roomch, String h_id) {

		if (room[hotelch - 1][roomch - 1] == null) {
			System.err.println(" *** " + this.호텔명 + " 호텔 / ** " + rooms. + " 예약 완료 *** ");
			room[hotelch - 1][roomch - 1] = h_id;

		} else {
			System.err.println(" 이미 예약된 객실입니다. ");
		}
		
		
		

	}

	@Override
	public void 예약취소(int hotelch, int roomch, String h_id) {
		if (room[hotelch - 1][roomch - 1] == null) {
			System.err.println(" *** " + rooms.호텔명 + " 호텔 / ** " + rooms.방타입 + " 예약 취소완료 *** ");
			room[hotelch - 1][roomch - 1] = h_id;

		}
		System.out.println("*** 예약 취소 완료 ***");
	}

	@Override
	public void 본인예약조회(String h_id) {
		System.err.println(" *** 본인예약조회 *** ");
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (room[i][j] != null) {
					System.err.println(" *** " + rooms.호텔명 + " 호텔 / ** " + rooms.방타입 + room[0][i] + " 님 예약 *** ");
				}
			}
		}

	}

	@Override
	public void 전체예약현황_회원() {
		System.err.print("호텔 **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t□\t");
			} else {
				System.out.print("\t■\t");
			}
		}
		System.out.println();
	}

	@Override
	public void 전체예약현황_관리자() {
		System.out.print("호텔 **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t□\t");
			} else {
				System.out.print("\t"+room[0][i]+"\t");
			}

		}
	}

}
