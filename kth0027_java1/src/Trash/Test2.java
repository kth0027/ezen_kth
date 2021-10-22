package Trash;

import java.util.Scanner;

public class Test2 {

	static final int MAX = 1;

	public static void main(String[] args) {
		// 성적출력 프로그램
		// 5명의 성적을 입력받아 출력하는 프로그램
		// 입력 : 성명, 국어점수, 영어점수, 수학점수를 입력받아서
		// 출력사항 : 입력내용 출력되고 / 학생별 총점, 학생별 평균, 학생별 평균의 학점, 학생별 등수

		String[] name = new String[MAX];
		int[] kor = new int[MAX];
		int[] eng = new int[MAX];
		int[] math = new int[MAX];

		int[] total = new int[MAX];
		double[] avg = new double[MAX];

		int[] rank = new int[MAX];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < MAX; i++) {
			System.out.print((i + 1) + "번 학생의 이름을 입력하세요>>");
			name[i] = sc.next();

			do {
				System.out.print((i + 1) + "번 학생의 국어성적을 입력하세요>>");
				kor[i] = sc.nextInt();
			} while (kor[i] < 0 || kor[i] > 100);
			do {
				System.out.print((i + 1) + "번 학생의 영어성적을 입력하세요>>");
			} while (eng[i] < 0 || eng[i] > 100);
			eng[i] = sc.nextInt();
			do {
				System.out.print((i + 1) + "번 학생의 수학성적을 입력하세요>>");
				math[i] = sc.nextInt();
			} while (math[i] < 0 || math[i] > 100);

			total[i] = kor[i] + eng[i] + math[i]; // total
			avg[i] = total[i] / 3; // avg

			

			rank[i] = 1; // 등수를 모두 1로 초기화

		} // for 입력, 총합, 평균 연산까지

		for (int i = 0; i < MAX; i++) {
			for (int j = 0; j < MAX; j++) {
				if (i != j && avg[i] < avg[j]) { // 똑같은건 건너뛰기
					rank[i]++;
				}
			}

		}

		System.out.println("성명\t국어\t영어\t수학\t총점\t평균\t등수");
		System.out.println("------------------------------------------------------------");

		for (int i = 0; i < MAX; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d", name[i], kor[i], eng[i], math[i], total[i], avg[i]
					, rank[i]);
			System.out.println();

		}

	} // main

}