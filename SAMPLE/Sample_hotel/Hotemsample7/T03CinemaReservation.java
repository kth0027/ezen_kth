package Hotemsample7;

import java.util.Scanner;

public class T03CinemaReservation {
	String[][] seat = new String[4][8]; // �¼��� ǥ�� �� �迭

	char rn; // �¼��� ���� ǥ���� ����

	int row_int, col, system; // �¼��� ���� �迭�� ���ȣ, ����ȣ, ��ɵ���

	boolean confirm; // �ݺ����� Ż���ϱ� ���� ����

	String con_char, name, c_name, row, q;

	// �̸��� Ȯ�ι��� ����, �̸��� ���� ����, ��ҿ� �� �̸�, ���̸�, ���࿩��ǥ��

	String pw = "password";

	// pw = ������ ��й�ȣ

	public void Interface(){//���� �������̽�

		System.out.println("�ȳ��ϼ���. �¼� ���� �ý����Դϴ�.");

		System.out.println("��ȣ�� �����ϼ���");

		System.out.println("����(1),���(2),�¼���ȸ(3),����(4)");

		Scanner scan = new Scanner(System.in);

                try{

		     system = scan.nextInt();

	             switch(system){

                     case 00:Admin();break;

		     case 1 :Reservation();break;

		     case 2 :Cancel();break;

		     case 3 :Reference();break;

		     case 4 :System.out.println("�ý����� �����մϴ�.");break;

		     }

               catch(InputMismatchException e){

                     System.out.pritnln("�߸��Է��ϼ̽��ϴ�.");

               }

	}

	public void Admin(){ //�����ڸ��

		System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");

		Scanner scan = new Scanner(System.in);

		if(scan.nextLine().equals(pw)){

			System.out.println("������ �α��� �Ǿ����ϴ�.");

			confirm = true

			do{

                                try{

				     System.out.print("���(1),�¼���ȸ(2),����(3) : ");

				     system = new Scanner(System.in).nextInt();

				     switch(system){

				     case 1:AdminCancel();break;

				     case 2:AdminRef();	break;

				     case 3:System.out.println("�����ڸ�� ����");

						confirm = false; break;

				     }

                                catch(InputMismatchException e){

                                     System.out.pritnln("�߸��Է��ϼ̽��ϴ�.");

                                }

			}while(confirm);

		}else{

			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.\n");

		}

	}

	public void Initialize() {// �ʱ�ȭ

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 8; j++) {

				seat[i][j] = "____";

			}

		}

	}

	public void AdminRef() {// ������ ��ȸ

		rn = 'A';

		for (int i = 0; i < 4; i++) {

			System.out.print(rn + "�� ");

			col = 1;

			rn++;

			for (int j = 0; j < 8; j++) {

				System.out.print(col + seat[i][j] + " ");

				col++;

			}

			System.out.println();

		}

	}

	public void Reference() {// ��ȸ

		rn = 'A';

		for (int i = 0; i < 4; i++) {

			System.out.print(rn + "�� ");

			col = 1;

			rn++;

			for (int j = 0; j < 8; j++) {

				q = seat[i][j].equals("____") ? " �� " : " �� ";

				System.out.print(col + q);

				col++;

			}

			System.out.println();

		}

	}

	// ����

	public void Reservation() {

		Reference();

		System.out.print("�̸��� �Է����ּ��� : ");

		// �̸� �Է�

		do {

			confirm = true;

			Scanner scan = new Scanner(System.in);

			name = scan.nextLine();

			System.out.println("�̸��� Ȯ�����ּ���.");

			System.out.print("������ Y, Ʋ���� N : ");

			con_char = scan.next();

			confirm = (con_char.equals("Y") || con_char.equals("y")) ? false : true;

		} while (confirm);

		// �� ����

		do {

			confirm = true;

			System.out.print("���� �����ϼ���(A~D) : ");

			Scanner scan = new Scanner(System.in);

			try {

				row = scan.next();

			} catch (Exception e) {

				System.out.println("A~D�� �Է��ϼ���");

			}

			if (row.equals("A") || ow.equals("a")) {

				row_int = 0;

				confirm = false;

			}

			else if (ow.equals("B") || ow.equals("b")) {

				row_int = 1;

				confirm = false;

			}

			else if (ow.equals("C") || ow.equals("c")) {

				row_int = 2;

				confirm = false;

			}

			else if (ow.equals("D") || ow.equals("d")) {

				row_int = 3;

				confirm = false;

			}

			else {

				System.out.println("A~D�� �Է��ϼ���");

			}

		} while (confirm);

		// �¼���ȣ ����

		do {

			confirm = true;

			Scanner scan = new Scanner(System.in);

			try {

				System.out.print("�¼� ��ȣ�� �������ּ���. 1~8 : ");

				col = scan.nextInt();

				if (col >= 1 && col <= 8) {

					if (seat[row_int][col - 1].equals("____")) {

						seat[row_int][col - 1] = name;

						confirm = false;

					} else {

						System.out.println("�̹� ����� �ڸ��Դϴ�.");

					}

				} else {

					System.out.println("�¼��� 1~8������ �Դϴ�.");

				}

			} catch (Exception e) {

				System.out.println("�¼��� 1~8������ �Դϴ�.");

			}

		} while (confirm);

		System.out.println(seat[row_int][col - 1] + "�� " + row + "��" + col + "�� ���� ������ �Ϸ�Ǿ����ϴ�.");

		Reference();

	}

	// ���

	public void Cancel() {

		System.out.println("�̸��� �Է��ϼ���");

		Scanner scan = new Scanner(System.in);

		c_name = scan.nextLine();

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 8; j++) {

				if (seat[i][j].equals(c_name)) {

					seat[i][j] = "____";

					System.out.println("��Ұ� �Ϸ�Ǿ����ϴ�.");

					Reference();

				}

			}

		}

	}

	// ������ ���� ���

	public void AdminCancel() {

		System.out.println("�̸��� �Է��ϼ���");

		Scanner scan = new Scanner(System.in);

		c_name = scan.nextLine();

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 8; j++) {

				if (seat[i][j].equals(c_name)) {

					seat[i][j] = "____";

					System.out.println("��Ұ� �Ϸ�Ǿ����ϴ�.");

					AdminRef();

				}

			}

		}

	}

	public static void main(String[] args) {

		//���α׷� ���۽� ����� �̸� ����

		//1.��ȸ 2.���� 3.��� 4.����(���)

		//���������ߴ��� �����ϼ���. �̸�

		//������ ���� �Ǵٽ� ������ �� ���� �ؾ���

		//���� ����� 1.������ 2.�ڸ���ȣ ����

		T03CinemaReservation movie = new T03CinemaReservation();

		movie.Initialize();

		while(true){

			movie.Interface();

			if(movie.system == 4)break;

		}

	}// main end

	��ó:https:// cbts.tistory.com/51 [IT�ϱ���]
}
