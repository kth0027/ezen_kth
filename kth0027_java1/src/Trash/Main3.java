package Trash;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 3. 번문제 사진참고 배열을 사용해 합 평균 석차 구하기
		// 석차(rank)는 비교를 하면서 순위를 매겨야하는데..

		// 인원수 만큼 배열의 메모리를 할당한다.
		int cnt;
		int num[];
		int korEng[][];
		int sum[];
		int avg[];
		int rank[];

		do {
			System.out.print("인원수를 입력하세요. 1~10명 >");
			cnt = sc.nextInt();
		} while (cnt < 1 || cnt > 10);

		// 메모리 할당
		num = new int[cnt];
		korEng = new int[cnt][2];
		sum = new int[cnt];
		avg = new int[cnt];
		rank = new int[cnt];
		String[] title = { "국어", "영어" };
		// 국어와 영어라는 메뉴 (for문에서 써먹을용)

		for (int i = 0; i < cnt; i++) {
			System.out.print("번호 입력 >");
			num[i] = sc.nextInt();
			for (int j = 0; j < 2; j++) { // 국어와 영어를 입력 할 것이기 때문에 2번 반복
				System.out.print(title[j] + " 점수 입력 :");
				korEng[i][j] = sc.nextInt();
				sum[i] += korEng[i][j]; // 총점계산
			}
		}
		for (int i = 0; i < cnt; i++) {
			rank[i] = 1; // 랭크를 1로 초기화 시켜놓고 밑에서 비교했을 때 낮은 점수는 랭크를 ++
		}
		// 석차계산
		for (int i = 0; i < cnt - 1; i++) { // 인원은 5명이면 4번만 비교하기 때문에 -1
			for (int j = i + 1; j < cnt; j++) { // 자신 다음의 인덱스와 비교하기 위한 초기식
				if (sum[i] > sum[j]) { // 인덱스 자기 자신을 다음 순서와 비교할 때 다음순서가 더 작다면
					rank[j]++; // 다음순서가 랭크 상승 (랭크는 올라갈 수록 낮은것, 등수 이기 때문에 1등만 기억하는 세상)
				} else if (sum[i] < sum[j]) { // 자신이 다음순서보다 작다면 자신을 랭크 올림
					rank[i]++;
				}
			}
		}
		
		///////// 출력하기 ////////////
		System.out.println("\n성적처리\n번호\t\t  국어   영어   합계   평균\t석차");
		for (int i = 0; i < cnt; i++) {
			System.out.print(num[i] + "\t\t"); //
			for (int j = 0; j < korEng[i].length; j++) {
				System.out.printf("%5d", korEng[i][j]);
			}
			System.out.printf("%5d %d %5d\n", sum[i], sum[i] / 2, rank[i]);
		}

	}
}
