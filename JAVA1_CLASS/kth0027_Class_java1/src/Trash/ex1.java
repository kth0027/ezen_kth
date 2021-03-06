package Trash;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] ar) throws IOException {

		// source

		int student_size = 5;// 학생수

		int subject_size = 3;// 과목 수

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String names[] = new String[student_size];// 5명의 학생이름

		String subject[] = new String[] { "국어", "영어", "수학" };

		double scores[][] = new double[student_size][subject_size + 1];// 1:국어,2:영어,3:수학,4:평균

		int rank[] = new int[student_size];

		// 학생 이름 입력 받기. 인자로 BufferedReader와 학생 수변수를 넣었네요.

		names = inputName(in, student_size);

		// 각 학생의 점수 입력

		System.out.println("*** 입력 받은 이름 ***");

		for (int i = 0; i < names.length; i++) {

			System.out.println((i + 1) + ". " + names[i]);

		}

		for (int i = 0; i < scores.length; i++) {

			System.out.println(names[i] + "의 점수입력!!");

			for (int j = 0; j < scores[i].length; j++) {

				if (j == subject_size) {

					double total = 0;

					for (int z = 0; z < subject_size; z++) {

						total += scores[i][z];

					}

					scores[i][j] = total / subject_size;// scores 마지막 공간에 평균을 넣습니다.

					break;// 가장 가까운 반복문을 빠져나가도록 하는 예약어입니다.

				}

				System.out.print(subject[j] + " > ");

				double score = Double.parseDouble(in.readLine());

				scores[i][j] = score;

			}

		}

		// 석차 구하기

		// 1번학생과 나머지를 비교하여1번학생보다 점수가 낮으면 상대방 래크를 +1, 2번학생이 점수가낮으면 2번학생 랭크+1

		// 2번학생과 나머지를 비교하여 2번학생보다 점수가 낮으면 상대방 래크를 +1, 2번학생이 점수가낮으면 2번학생 랭크+1

		// 마지막학생까지 바복하면 최종적으로 석차가 구해집니다.

		for (int i = 0; i < student_size; i++) {

			rank[i] = 1;// 일단 모든 랭크 값을 1로 초기화 합니다. 최초에는 모든 학생들이 1등입니다.

		}

		for (int i = 0; i < student_size; i++) {

			double standard_student_score = scores[i][subject_size];// 기준학생점수

			for (int j = i; j < student_size; j++) {

				double compare_student_score = scores[j][subject_size];// 비교학생점수

				if (standard_student_score < compare_student_score) {

					rank[i]++;// 기준학생이 점수가 납으므로 기준학생의 랭크를 +1해줍니다.

				} else if (standard_student_score > compare_student_score) {

					rank[j]++;// 비교학생의 점수가 낮으므로 비교학생의 랭크를 +1해줍니다.

				}

			}

		}

		showTable(names, subject, scores, rank);

	}

	// 입력한 내용을 테이블로 보여주는 메서드입니다. 여러번 사용될지도 모르는 기능은 이렇게 메서드로 만들어놓는 것이 편합니다.

	public static void showTable(String[] names, String[] subject, double[][] scores, int[] rank) {

		System.out.println();

		System.out.print("이름   | ");

		for (int i = 0; i < subject.length + 1; i++) {

			if (i == subject.length) {

				System.out.print("평균|   ");

				System.out.print("석차|   ");

				break;

			}

			System.out.print(subject[i] + "| ");

		}

		System.out.println();

		for (int i = 0; i < names.length; i++) {

			System.out.print(names[i] + " |");

			for (int j = 0; j < scores[i].length; j++) {

				System.out.print(scores[i][j] + "| ");

			}

			System.out.println(rank[i] + "|");

		}

		System.out.println();

	}

	// 메서드를 사용해보기위해 억지로 넣었습니다.

	// 클래스인 BufferedReader도 매개변수로 넣을 수 있습니다.

	public static String[] inputName(BufferedReader in, int size) {

		String[] names = new String[size];

		for (int i = 0; i < size; i++) {

			System.out.println("학생 이름을 입력 해주세요 <" + (size - i) + ">");

			try {

				System.out.print("이름  > ");

				String name = in.readLine();

				names[i] = name;

			} catch (IOException e) {

				System.out.println("err : IOException");

				i--;// 오류가 나게되면 프로그램을 종료시킬것이 아니라 i를 하나 줄여서 다시 같은자리에 입력 받는것이 더 유연한프로그램입니다.

				continue;

			}

		}

		System.out.println();// 한줄개행

		return names;

	}
}
