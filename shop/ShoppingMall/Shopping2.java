package ShoppingMall;

import java.util.Scanner;

public class Shopping2 {

	Scanner scan = new Scanner(System.in);

	String[] item = { "����", "���", "��Ʈ", "�ð�", "����", "����" };
	String[] id = { "����", "����", "�߸�" };
	String JangID[] = null;
	String JangItem[] = null;
	int count = 0;
	int log = -1;
	int x = 0;
	
	while (x==0) {
		if (log == -1) {
			System.out.println( "*** �α��� �ϼ��� ***");
		} else if (log != -1) {
			System.out.println("**" + id[log] +"�α����� **");
		}
		
		System.out.println("1.�α��� 2.�α׾ƿ� 5.����");
		System.out.println("3.���� ��ٱ��� 4.��ü ��ٱ���");
		int sel = scan.nextInt();
		if (sel==1) {
			if (log == -1) {
				System.out.println("ID�� �Է��ϼ���");
				String logid = scan.next();
				for ( int i = 0; i<id.length; i++) {
					if (logid.equals(id[i]) ) {
						log = i;
					}
				}
			} else if {
				System.out.println( " [�̷̹α��� ���Դϴ�] ");
			}
		
		}
	}

}
