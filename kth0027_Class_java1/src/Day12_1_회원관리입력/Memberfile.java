package Day12_1_회원관리입력;

import java.util.Scanner;

public class Memberfile {
	
	/*	팀문제 : 로그인 / 회원가입 프로그램 [파일처리]
	 * 
	 *	> [조건] : 회원가입 시 회원정보 파일에 저장
	 *		// [회원클래스] : 아이디, 비밀번호, 성명, 연락처
	 *
	 *	> [조건] : 로그인 시 파일내 회원정보가 존재하면 로그인
	 */
	
	// 1. 입력받기 -> 2. 객체생성 -> 3.파일쓰기[out]
	//	* 주의점 : 1.회원구분 2.회원당 필드구분
	
	// 0. 설정 [ 메인 메소드 밖에 선언 하는 이유 : 다른 클래스나 메소드가 접근할수 있도록 ]
	public static Scanner scanner = new Scanner(System.in);
	// [ static 사용하는 이유 : main 메소드보다 메모리 우선 할당 ]
	
	public static Member[] members = new Member[100];
	
	
	public static void main(String[] args) {
		
		// 파일에 저장 이후 불러오기
		while(true) {
			Member temp = new Member();
			temp.signup();
			
		}

	
	
	
	} // m e
	
	

}
