package Day15;

import java.util.HashSet;
import java.util.Scanner;

public class Day15_문제2_Question2 {

		/*/
		 *
		 *	문제2 : set 컬렉션
		 *		* 로또프로그램
		 *			1. 6개 입력받아 set컬렉션에 저장하여 출력
		 *			[조건] 중복값 허용x
		 * /*/
	
		// 문제2
		
		public static void main(String[] args) { // m s
			
			Scanner sc = new Scanner (System.in);
			
			HashSet<Integer> set = new HashSet<>(); //★★★★★★★★★ 선언
			
			while (true) {
				System.out.println(" 1~45 숫자 선택(중복 불가) ");
				
				int num = sc.nextInt();
				
				if ( num < 1 || num > 45 ) {
					System.out.println("선택할 수 없는 번호");
				}
				
				else {
					// 중복확인
					if (set.contains(num)) {
						System.out.println(" 중복번호 입니다 ");
					}
					else {
						set.add(num);
						System.out.println(" 확인 : " + set );
					}
				}
				
				// 무한루프 끄탄는 조건 : 6개입력
				if( set.size() == 6 ) break;
				

			
			
			} // w e
			
			
			
			
			
			
			
		} // m e
}
