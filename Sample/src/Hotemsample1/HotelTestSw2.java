package Hotemsample1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelTestSw2 {
	public static void main(String[] args){
		
		int join; //���� �Է� ��
		int choice; // ��ȣ �Է°�
		
		Scanner sc = new Scanner(System.in);
		HotelSw hsw = new HotelSw();
		
		System.out.println("ȣ���� ��ü ���Ǽ��� �Է����ּ���");
		join = sc.nextInt();
		
		hsw.CreateRoom(join);
		System.out.println("ȣ���� ���Ǽ��� ���� ����ϴ�");
		
		while(true)
		{	
			System.out.println("1.�Խǿ���    2.�������    3.���� ��Ȳ    4.����");
			choice = sc.nextInt();
			
			switch(choice){
			case 1: // ����(�Խ�)
			{
				System.out.print("���� �Ͻ� ���� �Է����ּ��� :");
				int jrc = sc.nextInt(); // �� �Է°� (Join Room Choice)
				
				System.out.print("�����Ͻ� ������ �̸��� �Է��ϼ��� :");
				String name = sc.next();
				hsw.JoinRoom(jrc, name);// �̸� �Է°�
				
				Scanner scan = new Scanner(System.in);
				System.out.println("�ٸ� ������ ���ðڽ��ϱ�? 1.��   2.�ƴϿ�");
				int otw = scan.nextInt();
				
				if(otw==2)
				{
					System.out.println("�ȳ�����ʽÿ�");
					return;
				}
				break;
			}
			case 2:
			{	
				System.out.print("���� ��� �Ͻ� ���� �Է����ּ��� :");
				int orc = sc.nextInt(); //�� �Է°�(Out Room Choice)
				
				hsw.OutRoom(orc);
				
				Scanner scan1 = new Scanner(System.in);
				System.out.println("�ٸ� ������ ���ðڽ��ϱ�? 1.��   2.�ƴϿ�");
				int otw1 = scan1.nextInt();
				
				if(otw1==2)
				{
					System.out.println("�ȳ�����ʽÿ�");
					return;
				}
				break;
			}
			case 3:
			{
				System.out.println("�ѤѤѤѤѤѤѤѤ� �� ��ϤѤѤѤѤѤѤѤѤ�");
				hsw.LookRoom();
				break;
			}
			default :
			{
				if(choice == 4)
				{
					System.out.println("�ȳ�����ʽÿ�");
					return;
				}
			}
			}	
		}
	}	
}