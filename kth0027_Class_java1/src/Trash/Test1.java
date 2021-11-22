package Trash;

import java.util.Scanner;

public class Test1 {

	/*
	 * 1. 데이터는 키보드로 입력받아 배열에 저장 2. 성적 입력은 5명으로 // 무제한 입력가능하도록 3. 번호 이름, 국어, 영어, 수학을
	 * 입력하고 총점 평균을 구하여 출력 4. 평균은 소숫점 2자리 이하까지 5. 총점을 이용하여 석차 6. 입력 오류에 대한 예외발생 처리
	 */

	/*
	 * ----------------------------- 성 적 표 -----------------------------
	 * 번호 이름 국어 영어 수학 총점 평균 석차 1 2 3 4 5 -----------------------------
	 */

	public static void main(String[] args) { // m s



		// 입력객체 생성
		Scanner sc = new Scanner(System.in);

		String 이름[];
		int 점수[][];
		int 총점[];
		int 석차[];

		// 인원수를 입력 받는다.

		System.out.println("인원수: ");
		int 학생수 = sc.nextInt();

		// 인원수만큼 배열의 메모리 할당을 한다.
		이름 = new String[학생수];
		점수 = new int[학생수][3];
		총점 = new int[학생수];
		석차 = new int[학생수];

		// 인원수만큼 데이터를 입력받고 입력 받으면서 총점을 계산

		String[] 과목 = { "국어:", "영어:", "수학:" };
		for (int i = 0; i < 학생수; i++) {
			System.out.print("이름:");
			이름[i] = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.print(과목[j]);
				점수[i][j] = sc.nextInt();
				총점[i] += 점수[i][j]; // 총점계산
			}
		}

		// 석차계산

		// 석차 초기화(석차는 1로 초기화 함)
		for (int i = 0; i < 학생수; i++)
			석차[i] = 1;

		// 석차계산
		for (int i = 0; i < 학생수 - 1; i++) {
			for (int j = i + 1; j < 학생수; j++) {
				if (총점[i] > 총점[j])
					석차[j]++;
				else if (총점[i] < 총점[j])
					석차[i]++;
	
			}
		}

		// 데이터 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("-----------------------------------------------------");
		for (int i = 0; i < 학생수; i++) {
			// 이룸출력
			System.out.print(이름[i] + "\t");
			for (int j = 0; j < 점수[i].length; j++) {
				// 점수출력
				System.out.printf("%d\t", 점수[i][j]);
			}
			// 총점 평균 석차 출력
			System.out.printf("%d\t %.2f\t %d\n", 총점[i], (float) 총점[i] / 3, 석차[i]);
		}

	} // m e

}
