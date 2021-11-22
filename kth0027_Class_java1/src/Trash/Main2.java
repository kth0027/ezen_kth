package Trash;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 정적 배열 = 멈춰 있다, 수동적이다, 능동적이지 못한 점이 크다.
		 * 
		 * int[][] i2 = new int [4=인원수 몇명이냐 4명입니다 ][5] o o o o x x x x x o o o o o o 0 0
		 * 0 o o o o o 0 0 0 0 o o o o o o 0 0 0 int[] i = new int[4]; o o o o
		 * 
		 * 
		 */
		int[][] student = new int[7][6];

		// System.out.println(student.length+ " " + student[0].length);
		// 입력 받기
		for (int i = 0; i < student.length - 2; i++) {
			System.out.println(i + 1 + "번째 사람 입력순서는 번호 국어점수 영어점수 입력하세요");
			student[i][0] = i + 1;
			for (int j = 1; j < student[i].length - 3; j++) {// 1,2
				student[i][j] = sc.nextInt();// 점수 입력
				student[i][3] += student[i][j];// 합계 누적
				student[5][j] += student[i][j];// 과목합계누적
			}
			student[i][4] = student[i][3] / 2;
		} // end for
			// 과목 평균 구하기
		for (int i = 1; i < student.length - 1; i++) {
			student[6][i] = student[5][i] / (student.length - 1);
		}

		// 등수 구하기
		for (int i = 0; i < student.length; i++) {
			student[i][5] = 1;
			for (int j = 0; j < student.length; j++) {
				if (student[i][3] < student[i][3])
					student[i][5]++;
			}
		}

		// 출력하기

		for (int i = 0; i < student.length; i++) {

			for (int j = 0; j < student[i].length; j++) {
				System.out.printf("%5d", student[i][j]);
			}
			System.out.println();
		}

	}
}
