package Hotemsample1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelSw {

	String[] room;
	
	int ho;
	int name;
	
	//�� ����� or ���Ǽ� �Է��ϱ�
	public void CreateRoom(int cr)
	{
		room = new String[cr];
	}
	
	//ȣ�� �����ϱ� or �Խ��ϱ�
	public void JoinRoom(int jr,String name)
	{	
		 Pattern pt = Pattern.compile("^[��-�K-��-�R-��-�K-��-�m-��-�P-�D-�l-��-�P-��-]*$");
		 Matcher match = pt.matcher(name);
		
		 if(name.trim().equals("") || !match.matches())
		 {
			 System.out.println("�̸��� �Է����ּž� ������ �����մϴ�.");
   			 return;
		 }
		 else if(room[jr-1] != null) 
		 {
			System.out.println("���� ����� �����Դϴ�. Ȯ�� �� �ٽ� ���� ��Ź�帳�ϴ�.");
			return;
		 }
		 room[jr-1] = name + "���� �����ϼ̽��ϴ�.";
		 System.out.println(name + "��  "+ jr + "ȣ�ǿ� " + "����Ǽ̽��ϴ�.");
	}

	//���� ����ϱ� or ����ϱ�
	public void OutRoom(int or)
	{
		if(room[or - 1] == null)
		{
			System.out.println("���� ���� ��������� �ʽ��ϴ�.");
			return;
		}
		room[or-1] = null;
		System.out.println("���� ��� �Ǽ̽��ϴ�.");
	}
	
	//�� ��� �����ֱ�
	public void LookRoom()
	{
		for(int cr = 0; cr < room.length; cr++) {
			if (room[cr] == null)
				System.out.println((cr+1) + "ȣ�� ----> " + "�������");
			else
				System.out.println((cr + 1) + "ȣ�� ----> " + room[cr]);
		}
	}
	
	
}
