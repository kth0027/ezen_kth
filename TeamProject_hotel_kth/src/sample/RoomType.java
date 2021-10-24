package sample;

import java.util.*;

public class RoomType extends Room{
	
		void book(String[][] s,String[][] a,String[][] b){ // ���� ������ �� �� ����ϴ� �޼ҵ�
			System.out.print("�뱸�� S(1), A(2), B(3) >> ");
			Scanner input = new Scanner(System.in);
			int roomT;
			String name;
			int roomN;
			roomT = input.nextInt(); // ���� Ÿ���� ���ϱ� ���� ����ڿ��� �Է¹���
			
			if(roomT != 1 && roomT != 2 && roomT != 3) // ��Ÿ���� �� �� �Է� ���� ���
			{
				System.out.println("�� �� �Է��ϼ˽��ϴ�!");
				book(s,a,b);
			}
			
			switch(roomT)
			{
			case 1: // S���� ����
				while(true)
				{
					System.out.print("S>> ");
					for(int i=0; i<10; i++) // s���� �� ��Ȳ�� ���
						System.out.print(s[i][0]);
					System.out.println();
					name = getName() + " "; // room Ŭ������ �ִ� getName() �޼ҵ带 �̿��Ͽ� �̸��� ����  
					roomN = getRoomNumber() - 1; // room Ŭ������ �ִ� roomN() �޼ҵ带 �̿��Ͽ� ���ȣ�� ����
					
					if(roomN >= 0 && roomN < 10) // ���ȣ�� ��ȿ���� Ȯ��
					{
						if( roomChk(roomT,roomN,name) == 1) // room Ŭ������ �ִ� roomChk() �޼ҵ带 �̿��Ͽ� �̹� ����� �ڸ������� Ȯ��
							break;
					}
					
					else
						System.out.println("�ڸ���ȣ �����Դϴ�. �ٽ� �Է����ּ���!");
				}
				break;
				
			case 2:
				while(true)
				{
					System.out.print("A>> ");
					for(int i=0; i<15; i++) // a���� �� ��Ȳ�� ���
						System.out.print(a[i][0]);
					System.out.println();
					name = getName() + " "; // room Ŭ������ �ִ� getName() �޼ҵ带 �̿��Ͽ� �̸��� ����
					roomN = getRoomNumber() - 1; // room Ŭ������ �ִ� roomN() �޼ҵ带 �̿��Ͽ� ���ȣ�� ����
					
					if(roomN >= 0 && roomN < 15)  // ���ȣ�� ��ȿ���� Ȯ��
					{
						if( roomChk(roomT,roomN,name) == 1) // room Ŭ������ �ִ� roomChk() �޼ҵ带 �̿��Ͽ� �̹� ����� �ڸ������� Ȯ��
							break;
					}
					
					else
						System.out.println("�ڸ���ȣ �����Դϴ�. �ٽ� �Է����ּ���!");

				}
				break;
			case 3:
				while(true)
				{
					System.out.print("B>> ");
					for(int i=0; i<20; i++) // b���� �� ��Ȳ�� ���
						System.out.print(b[i][0]);
					System.out.println();
					name = getName()+ " "; // room Ŭ������ �ִ� getName() �޼ҵ带 �̿��Ͽ� �̸��� ����
					roomN = getRoomNumber() - 1; // room Ŭ������ �ִ� roomN() �޼ҵ带 �̿��Ͽ� ���ȣ�� ����
					if(roomN >= 0 && roomN < 20) // ���ȣ�� ��ȿ���� Ȯ��
					{
						if( roomChk(roomT,roomN,name) == 1) // room Ŭ������ �ִ� roomChk() �޼ҵ带 �̿��Ͽ� �̹� ����� �ڸ������� Ȯ��
							break;
					}
					
					else
						System.out.println("�ڸ���ȣ �����Դϴ�. �ٽ� �Է����ּ���!");

				}
				break;
			}
			
		}
		
		void check(String[][] s, String[][] a, String[][] b){ // ��ȸ�� �� �� ����ϴ� �޼ҵ�
			System.out.print("S>> ");
			for(int i=0; i<10; i++) //s���� �� ��Ȳ�� ���
				System.out.print(s[i][0]);
			System.out.println();
			
			System.out.print("A>> "); 
			for(int i=0; i<15; i++) //a���� �� ��Ȳ�� ���
				System.out.print(a[i][0]);
			System.out.println();
			
			System.out.print("B>> ");
			for(int i=0; i<20; i++) //b���� �� ��Ȳ�� ���
				System.out.print(b[i][0]);
			System.out.println();
			
			System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
		}
		
		void cancel(String[][] s, String[][] a, String[][] b){ // ��Ҹ� �� �� ����ϴ� �޼ҵ�

			System.out.print("�뱸�� S(1), A(2), B(3)>>");
			Scanner input = new Scanner(System.in);
			int num = input.nextInt(); //���� Ÿ���� ���ϱ� ���� ����ڿ��� �Է¹���
			
			if(num != 1 && num != 2 && num != 3) // ��Ÿ���� �� �� �Է��������
			{
				System.out.println("�� �� �Է��ϼ˽��ϴ�!");
				cancel(s,a,b);
			}
			
			switch(num)
			{
			case 1:
				System.out.print("S>> ");
				for(int i=0; i<10; i++) //s���� �� ��Ȳ�� ���
					System.out.print(s[i][0]);
				System.out.println();
				break;
			case 2:
				System.out.print("A>> "); 
				for(int i=0; i<15; i++) //a���� �� ��Ȳ�� ���
					System.out.print(a[i][0]);
				System.out.println();
				break;
			case 3:
				System.out.print("B>> ");
				for(int i=0; i<20; i++) //b���� �� ��Ȳ�� ���
					System.out.print(b[i][0]);
				System.out.println();
				break;
			}
			
			String name = getName() + " "; // ����� �̸��� �Է� ����
			
			if(cancleChk(num, name) == 0) // ����� �̸��� ������ ��Ͽ� �������
				cancel(s,a,b); // �ٽ� cancel() �޼ҵ带 ȣ���Ͽ� �ٽ� ���� 
		}
		
		void end (){ //���α׷� ���� �޼ҵ�
			System.out.println("���α׷��� ����˴ϴ�.");
			System.exit(0);
		}
}