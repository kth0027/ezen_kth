/**
 * 
 */
package Trash;

import java.util.Scanner;

public class 학교성적 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		String 타이틀[] = {"이름","국어","영어","수학","총점","평균","석차"};
		
		try {
			
			//1
			System.out.println("학생수 : "); int 학생수 = sc.nextInt();
			
			//2
			String 이름[] = new String[학생수];
			int 점수[][] = new int [학생수+2][6];
			
			//3
			
			for (int i=0; i<학생수;i++) {
				System.out.println("이름 : "); 이름[i] = sc.next();
				for(int j=0; j<3; j++) {
					System.out.println(타이틀[j+1] + ":");
					점수[i][j] = sc.nextInt();
				}
			}
			
			//4 총점
			
			for (int i=0; i<학생수;i++) {
				for (int j=0; j<3; j++) {
					점수[i][3] += 점수[i][3];
				}
				
				점수 [i][4] = 점수 [i][3]/ 3;
			}
			
			//5. 석차
			
			for (int i =0; i<학생수; i++) {
				int 석차 = 0;
				
				for ( int j = 0; j<학생수; j++) {
					if (점수[i][4] < 점수[j][4]) {
						석차++;
					}
				}
				점수[i][5] = ++석차;
			}
			
			//6.정렬
			for (int i =0; i<학생수-1;i++) {
				for (int j=0; j<학생수-1; j++) {
					if (점수[j][5] > 점수[j+1][5]) {
						
						//이름
						String 이름교환 = 이름[j];
						이름[j] = 이름[j+1];
						이름[j+1] = 이름교환;
						//점수
						
						for (int c=0; c<점수[j].length; c++) {
							int 점수교환 = 점수[j][c];
							점수[j][c] = 점수[j+1][c];
							점수[j+1][c] = 점수교환;
						}
					}
				}
			}
			
			///////////////////////// 출력 //////////////////
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
