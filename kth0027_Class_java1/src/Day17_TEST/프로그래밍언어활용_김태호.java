package Day17_TEST;

import java.util.Scanner;

public class 프로그래밍언어활용_김태호 {

	public static void main(String[] args) throws Exception { // m s
		
		// 0. 입력객체 생성
		Scanner sc = new Scanner(System.in);
		
		String 타이틀 [] = {"이름","국어","영어","수학","총점","평균", "석차"};
		
		try {
			// 1. 입력값 받기
			System.out.println("학생수 : "); 
			int 학생수 = sc.nextInt();
			
			// 2. 학생 점수 객체 생성
			String 이름[] = new String[학생수];
			int 점수[][] = new int[학생수+2][6];
			
			// 3. 학생 점수 입력받기
			for ( int i = 0; i<학생수; i++) {
				System.out.println("이름 : "); 이름[i] = sc.next();
				for (int j = 0; j<3;j++) {
					System.out.println(타이틀[j+1] + ":"); 점수[i][j] = sc.nextInt();
				}
			}
			
			// 4. 총점계산
			for ( int i = 0; i<학생수; i++) {
				for ( int j =0; j<3; j++) {
					점수[i][3] += 점수[i][j];	
				}
				// 5. 평균
					점수[i][4] = 점수[i][3]/3;
			}
			
			// 5. 석차

			for (int i = 0; i < 학생수; i++) {
				int 석차 = 0;

				for (int j = 0; j < 학생수; j++) {
					if (점수[i][4] < 점수[j][4]) { // i < j 비교 주의 확인
						석차++;
					}
				}
				점수[i][5] = ++석차;
			}

			// 5-1. 석차정렬
			for (int i = 0; i < 학생수 - 1; i++) { // 학생수-1 확인
				for (int j = 0; j < 학생수 - 1; j++) {
					if (점수[j][5] > 점수[j + 1][5]) { // j > j+1 비교 확인

						// 이름교환
						String 이름교환 = 이름[j];
						이름[j] = 이름[j + 1];
						이름[j + 1] = 이름교환;
						// 점수교환
						for (int c = 0; c < 점수[j].length; c++) { // 점수j 길이확인
							int 점수교환 = 점수[j][c];
							점수[j][c] = 점수[j + 1][c];
							점수[j + 1][c] = 점수교환;
						}

					}
				}
			}
			
			//////////////////////////////// 출력 하기 ///////////////////////////////////////////
			System.out.println("-------------------------------------------------------");
			System.out.println("                        성 적 표                         ");
			System.out.println("-------------------------------------------------------");
			// 타이틀출력2
			for (int t = 0; t < 타이틀.length; t++) {
				System.out.print(타이틀[t] + "\t");
			}
			System.out.println();

			// 내용출력3
			for (int i = 0; i < 학생수; i++) { // 학생수에 따른 for문

				// 이름
				System.out.print(이름[i] + "\t");

				// 점수
				for (int j = 0; j < 점수[j].length - 3; j++) { 
					System.out.printf("%d\t", 점수[i][j]);
				}

				// 총점 평균 석차
				System.out.printf("%d\t %.2f\t %d\n", 점수[i][3], (float) 점수[i][3] / 3, 점수[i][5]);
			}
				
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		


		
		
		
		
		
		
		
	} // m e
}
 