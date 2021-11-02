package 가위바위보;

import java.util.Random;
import java.util.Scanner;

public class ex_1가위바위보 { // c s


	// 가위바위보
	
	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		
		int 플레이어; int 컴퓨터;
		int 게임수 = 0;
		int 플레이어승리수 = 0; int 컴퓨터승리수 = 0;
		
		while (true) { // w s
			
			// 1. 사용자 입력
			System.out.println( " ------------ 가위바위보 게임 ------------ " );
			System.out.println( " >>>>> 가위[0] 바위[1] 보[2] 종료[3] 중 선택 : " );

			플레이어 = scanner.nextInt();
			
			// 4. 3번 입력시 게임 종료
			if ( 플레이어 == 3 ) {
				System.out.println( " >>>>> [게임종료] : 게임횟수 : " + 게임수 );
				if ( 플레이어승리수 > 컴퓨터승리수 ) {
					System.out.println( " >>>>> [최종승리자] : 플레이어 " + 플레이어승리수 );
				} else if ( 플레이어승리수 < 컴퓨터승리수 ) {
					System.out.println( " >>>>> [최종승리자] : 컴퓨터 " + 컴퓨터승리수 );
				} else {
					System.out.println( " >>>>> [최종승리자] : 무승부 " );
				} break;
			}
			
			if ( 플레이어 < 0 || 플레이어>3 ) {
				System.out.println( " [알수 없는 번호 입니다 : 다시입력하세요 ]" );
				continue;
			}
			
			// 2. 컴퓨터 난수설정
			Random random = new Random(); /// 난수 객체
			컴퓨터 = random.nextInt(3); // 0 ~  2 사이 난수
			System.out.println( " >>>  컴퓨터가 낸 수 : " + 컴퓨터 );
			
			// 3. 플레이어 승리자 판단 
			if ( (플레이어 == 0 && 컴퓨터 == 2) || (플레이어 == 1 && 컴퓨터 == 0) || (플레이어 == 2 && 컴퓨터 == 1) ) {
				System.out.println( " >>> 플레이어 승리 ");
				플레이어승리수++;
			}
			
			else if ( (플레이어 == 0 && 컴퓨터 == 0) || (플레이어 == 1 && 컴퓨터 == 1) || (플레이어 == 2 && 컴퓨터 == 2) ) {
				System.out.println( " >>> 무승부 ");
			} 
			
			else {
				System.out.println( " >>> 컴퓨터 승리 ");
				컴퓨터승리수++;
			} 
			
			게임수++;
			
			 
			
			
			
		} // w e
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	
} // c e
