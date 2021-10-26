package Final2;

import java.util.ArrayList;

import database.File;
import Final2.Reserve;

public class ReserveController {

	// 1. 필드
	public static ArrayList<Reserve> reservelist = new ArrayList<>();
	// static 없을경우에 해당 필드 호출시 [ BoardController 객체 생성 ]
	// static 있을경우 해당 필드 바로호출 가능

	// 2. 메소드
	// 게시물 등록 메소드
	public static boolean add(Reserve reserve) {
		
		// 1. 리스트 담기 
		reservelist.add(reserve);
		// 2. 파일처리 
		File.filesave(2);
		return true; // 등록 성공시
	}

	// 게시물 상세페이지[조회] 메소드
	public static Reserve detail(int index) {

		Reserve reserve = reservelist.get(index);
		
		return reserve; // 검색한 게시물 반환
	}



}
