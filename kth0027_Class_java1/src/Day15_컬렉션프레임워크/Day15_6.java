package Day15_�÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Day15_6 {
	
	// �÷��������� ��ũ ��ø
	public static void main(String[] args) {
		
		// ��ø map <Ű,arraylist>
		HashMap<String, ArrayList<String> > ������� = new HashMap<>();
			ArrayList<String> �Ƿ���� = new ArrayList<>();
			ArrayList<String> �Ź߸�� = new ArrayList<>();
			
		�������.put( "�Ƿ�", �Ƿ���� );
		�������.put( "�Ź�", �Ź߸�� );
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println( " --------------- ��ǰ ��Ȳ --------------- ") ;
			for ( int i = 0; i<�Ƿ����.size(); i++) {
				System.out.println( �������.get("�Ƿ�").get(i) );
			}
			
			System.out.println( "��ǰ��� : 1.�Ƿ� 2.�Ź�"  ); int ch = sc.nextInt();
			if ( ch==1) {
				System.out.println("��ǰ�� : "); String ��ǰ�� = sc.next();
				�Ƿ����.add(��ǰ��);
			}
			
			
		} // w e
		
	} // m e
	

}
