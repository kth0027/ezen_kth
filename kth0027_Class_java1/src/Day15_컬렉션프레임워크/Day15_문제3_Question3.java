package Day15_컬렉션프레임워크;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day15_문제3_Question3 {

	/*
	 * / 문제3: 지하철 관제
	 *
	 * [조건1] : 역 4개 ( 종점역 > 용산 > 서울 > 구로 > 종점역 )
	 * 
	 * [조건2] : 전철 3개 객체 [ 종점역에 3개 전철 대기 ]
	 * 
	 * [조건3] : 출발 신호를 받아서 해당역에서 출발해서 다음역으로 도착
	 * 
	 * [조건4] : 역 당 소요시간 2초
	 *
	 * /
	 */

	public static void main(String[] args) throws Exception {
		

//		Queue <String> 종점역1 = new LinkedList<String>();
//			종점역1.offer("종점역");
//			종점역1.offer("용산역");
//			종점역1.offer("서울역");
//			종점역1.offer("구로역");s
//			종점역1.offer("종점역");
//			
//			System.out.println( 종점역1 );
//			
//			// 3. 삭제
//			System.out.print(종점역1.poll() );
//			System.out.print(" ");
//			System.out.print(종점역1.poll() );
//			System.out.print(" ");
//			System.out.print(종점역1.poll() );
//			System.out.print(" ");
//			System.out.print(종점역1.poll() );
//			System.out.print(" ");
//			System.out.print(종점역1.poll() );
		
		
		Scanner scanner = new Scanner(System.in);
		
		Queue<String> 종점역 = new LinkedList<String>();
		Queue<String> 용산역 = new LinkedList<String>();
		Queue<String> 서울역 = new LinkedList<String>();
		Queue<String> 구로역 = new LinkedList<String>();

		종점역.offer("1번전철");
		종점역.offer("2번전철");
		종점역.offer("3번전철");

		while (true) {
			System.out.println(종점역);
			System.out.println(용산역);
			System.out.println(서울역);
			System.out.println(구로역);
			System.out.println("1.종점 2.용산 3.서울 4.구로");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.println(종점역);
				if (!종점역.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("출발 : " + 종점역.peek());
					용산역.offer(종점역.poll());
				}
			}
			if (ch == 2) {
				System.out.println(용산역);
				if (!용산역.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("출발 : " + 용산역.peek());
					서울역.offer(용산역.poll());
				}
			}
			if (ch == 3) {
				System.out.println(서울역);
				if (!서울역.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("출발 : " + 서울역.peek());
					구로역.offer(서울역.poll());
				}
			}
			if (ch == 4) {
				System.out.println(구로역);
				if (!구로역.isEmpty()) {
					Thread.sleep(2000);
					System.out.println("출발 : " + 구로역.peek());
					종점역.offer(구로역.poll());
				}
			}
		}

		//////////////////////////////////////////////////////////////////////////////

//		역 종점역 = new 역();
//			종점역.전철목록.offer(new 전철("A-1") );
//			종점역.전철목록.offer(new 전철("A-2") );
//			종점역.전철목록.offer(new 전철("A-3") );
//			종점역.전철목록.offer(new 전철("A-4") );
//			
//		역 용산역 = new 역();
//		역 서울역 = new 역();
//		역 구로역 = new 역();
//		
//		while (true) {
//			System.out.println("  출 발 신 호  ");
//			System.out.println(" 1.종점 2.용산 3.서울 4.구로");
//			int ch = sc.nextInt();
//			if ( ch == 1 ) {
//				//////////////////////////////
//				if (종점역.전철목록.isEmpty() ) {
//					System.out.println("대기중인 전철이 없습니다");
//				} else {
//					전철 전철 = 종점역.전철목록.poll();
//					try {
//						System.out.println("이동중입니다");
//						Thread.sleep(2000);
//					} catch (Exception e) {
//						// TODO: handle exception
//					}
//					종점역.전철목록.offer(전철);
//				}
//				//////////////////////////////
//			}
//			if ( ch == 2 ) {}
//			if ( ch == 3 ) {}
//			if ( ch == 4 ) {}
//		}

	} // m e

}
