package Trash;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] ar) throws IOException {

		// source

		int student_size = 5;// �л���

		int subject_size = 3;// ���� ��

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String names[] = new String[student_size];// 5���� �л��̸�

		String subject[] = new String[] { "����", "����", "����" };

		double scores[][] = new double[student_size][subject_size + 1];// 1:����,2:����,3:����,4:���

		int rank[] = new int[student_size];

		// �л� �̸� �Է� �ޱ�. ���ڷ� BufferedReader�� �л� �������� �־��׿�.

		names = inputName(in, student_size);

		// �� �л��� ���� �Է�

		System.out.println("*** �Է� ���� �̸� ***");

		for (int i = 0; i < names.length; i++) {

			System.out.println((i + 1) + ". " + names[i]);

		}

		for (int i = 0; i < scores.length; i++) {

			System.out.println(names[i] + "�� �����Է�!!");

			for (int j = 0; j < scores[i].length; j++) {

				if (j == subject_size) {

					double total = 0;

					for (int z = 0; z < subject_size; z++) {

						total += scores[i][z];

					}

					scores[i][j] = total / subject_size;// scores ������ ������ ����� �ֽ��ϴ�.

					break;// ���� ����� �ݺ����� ������������ �ϴ� ������Դϴ�.

				}

				System.out.print(subject[j] + " > ");

				double score = Double.parseDouble(in.readLine());

				scores[i][j] = score;

			}

		}

		// ���� ���ϱ�

		// 1���л��� �������� ���Ͽ�1���л����� ������ ������ ���� ��ũ�� +1, 2���л��� ������������ 2���л� ��ũ+1

		// 2���л��� �������� ���Ͽ� 2���л����� ������ ������ ���� ��ũ�� +1, 2���л��� ������������ 2���л� ��ũ+1

		// �������л����� �ٺ��ϸ� ���������� ������ �������ϴ�.

		for (int i = 0; i < student_size; i++) {

			rank[i] = 1;// �ϴ� ��� ��ũ ���� 1�� �ʱ�ȭ �մϴ�. ���ʿ��� ��� �л����� 1���Դϴ�.

		}

		for (int i = 0; i < student_size; i++) {

			double standard_student_score = scores[i][subject_size];// �����л�����

			for (int j = i; j < student_size; j++) {

				double compare_student_score = scores[j][subject_size];// ���л�����

				if (standard_student_score < compare_student_score) {

					rank[i]++;// �����л��� ������ �����Ƿ� �����л��� ��ũ�� +1���ݴϴ�.

				} else if (standard_student_score > compare_student_score) {

					rank[j]++;// ���л��� ������ �����Ƿ� ���л��� ��ũ�� +1���ݴϴ�.

				}

			}

		}

		showTable(names, subject, scores, rank);

	}

	// �Է��� ������ ���̺�� �����ִ� �޼����Դϴ�. ������ �������� �𸣴� ����� �̷��� �޼���� �������� ���� ���մϴ�.

	public static void showTable(String[] names, String[] subject, double[][] scores, int[] rank) {

		System.out.println();

		System.out.print("�̸�   | ");

		for (int i = 0; i < subject.length + 1; i++) {

			if (i == subject.length) {

				System.out.print("���|   ");

				System.out.print("����|   ");

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

	// �޼��带 ����غ������� ������ �־����ϴ�.

	// Ŭ������ BufferedReader�� �Ű������� ���� �� �ֽ��ϴ�.

	public static String[] inputName(BufferedReader in, int size) {

		String[] names = new String[size];

		for (int i = 0; i < size; i++) {

			System.out.println("�л� �̸��� �Է� ���ּ��� <" + (size - i) + ">");

			try {

				System.out.print("�̸�  > ");

				String name = in.readLine();

				names[i] = name;

			} catch (IOException e) {

				System.out.println("err : IOException");

				i--;// ������ ���ԵǸ� ���α׷��� �����ų���� �ƴ϶� i�� �ϳ� �ٿ��� �ٽ� �����ڸ��� �Է� �޴°��� �� ���������α׷��Դϴ�.

				continue;

			}

		}

		System.out.println();// ���ٰ���

		return names;

	}
}
