package Day15_컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Scanner;

import Day07_클래스2.array;

public class Day15_문제1_Question1 {

		/*/
		 *	문제1 : list 컬렉션
		 * 		* 대기명단 프로그램
		 * 		[메뉴]
		 * 			1. 명단추가 (인원수를 입력받아 대기번호 반환)
		 * 			2. 명단취소 (대기번호 입력받아 명단 취소)
		 * 			[관리자] 3. 명단입장(대기번호 1번부터 입장없으면 없음 출력)
		 * 

		 * /*/
	
		// 문제1
		
		public static void main(String[] args) { // m s
			
			// 0. 입력객체
			Scanner sc = new Scanner(System.in);
			
			// 0. 리스트 객체에 Integer 객체들을 저장
			ArrayList<Integer> list = new ArrayList<>();
					
			System.out.println(" ------- 대기명단 프로그램 ------- ");
			

			while (true) {
				////////////////////////////////////////////////////////////////////////////////
				System.out.println(" ----- 대기 현황 ------ ");
				for( int i = 0 ; i<list.size() ; i++ ) {
					System.out.println("대기번호 : "+ (i+1) +"번 " + " 인원 : " + list.get(i) );
				}
				//////////////////////////////////////////////////////////////////////////////
				System.out.println("1.명단추가  2.명단취소  3.괸리자");
				System.out.println("선택 : ");
				
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println(" 인원수 : ");
					int count = sc.nextInt();
							
					// 1. 리스트 객체에 저장
					list.add(count);
					System.out.println( " 고객님의 대기번호 : " + list.size() );
					
				}
				else if ( ch == 2 ) {
					System.out.println(" 취소할 대기번호 : ");
					int num = sc.nextInt();
					
					// 2. 리스트 객체에 삭제
					list.remove(num-1);	// -1해주는 이유 = 대기번호는1번 . 인덱스는 0 번부터
					System.out.println(" 취소 되었습니다 ");
					
				}
				else if ( ch == 3 ) {
					if (list.isEmpty() ) {
						System.out.println(" 대기중인 고객이 없습니다 ");
					}
					
					else {
						System.out.println(" 대기번호 1번 입장 ");
						list.remove(0); // 대기번호 1번 삭제
					}
				} 

			
			} // w e
			
			
		} // m e
}
