package Day14_���׸�;

import java.util.ArrayList;

public class Day14_3 {
	
	public static void main(String[] args) { // ���� ����
		
		// �÷��� �����ӿ�ũ
			// �÷��� : ���� [�ڷᱸ�� : �����͸� �����ϴ� ���]
			// �����ӿ�ũ : �̸� ������� ���̺귯���� ����� ����
		
		// 1. List : Arraylist, Vector, LinkedList
		// 2. Set :
		// 3. Map
		
		// p.728
		// 1. Arraylist : �迭�� ����
			// 1. �������� [ �⺻ 10 ������, 10�� ������ ���� �뷮 �ڵ����� �þ ]
			// 2. ��ü�� ���� [ ������ �ε��� �ڷ� ��ĭ�� ����� ]
				// ��) 3�� �ε��� ������ [ 4�� �ε����� ����� -> 3�� �ε��� ]
		
			// 3. �޼ҵ�
				// 1. ��Ʈ����.add(��ü��) : �ش� ��ü�� ����Ʈ�� ����
		
		// 1. ����Ʈ ����
		ArrayList<String> list = new ArrayList<>();
				// <���׸�> : ���׸��� ���� Ÿ������ ����Ʈ �� ��ü ���
		
		// 2. ����Ʈ�� ��ü �߰�
		list.add("java");
		list.add("jabc");
		list.add("servlet/jsp");
		list.add(2, "Database");
		list.add("ibats");
		
		// 3. ����Ʈ ���
		System.out.println( list );
		System.out.println( "����Ʈ �� ��ü�� : " + list.size() );
		
		// 4. ����Ʈ �� ��ü ȣ��
		System.out.println("2�� �ε��� ȣ�� : " + list.get(2) );
		
		// 5. ����Ʈ �� ��� ��ü ȣ�� [ 1: �ݺ��� ��� ]
		System.out.println(" -------------- ����Ʈ �� ��� ��ü ȣ�� --------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 5. ����Ʈ �� ��� ��ü ȣ�� [ 1: �ݺ��� ��� ]
		System.out.println(" -------------- ����Ʈ �� ��� ��ü ȣ�� --------------");
		for (String temp : list) {
			// for (�ӽð�ü : ����Ʈ)
			// ����Ʈ �� ��� ��ü�� �ϳ��� �ӽ� ��ü�� ����
			System.out.println(temp);
		}
		
		// 6. ����Ʈ �� ��ü ����
		list.remove(2); // Database ���� => ���� �� => servlet / jsp ��ü�� 2�� �ε���
		System.out.println( " ���� Ȯ�� : " + list );
		
		list.remove(2); // servlet / jsp ����
		System.out.println( " ���� Ȯ�� : " + list );
		
		// 7. �˻�
		System.out.println( list.contains("java") );
		System.out.println( list.indexOf("java") );
		
		// 8. ����Ʈ �ʱ�ȭ
		
		list.clear(); //
		  
		
		
		
	} // ���� ����
}
