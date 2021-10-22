package Day15;

import java.util.HashSet;
import java.util.Iterator;

public class Day15_2 {
	
	public static void main(String[] args) {	// m s
		
		// p.737 : HashSet 
		
		// 1. set ��ü ���� [set��ü�� ���� �ڷ����� ���׸����ֱ�]
		HashSet<String> set = new HashSet<>();
		
		// 2. set�� ��ü �ֱ� [�ߺ����x, ����x]
		set.add("java");
		set.add("jabc");
		set.add("servlet/jsp");
		set.add("java");		// �ߺ� �߻� [set�� �ڵ������� �ߺ� ����]
		set.add("ibatis");
		
		// 3. set ��� [��¼����� ����]
		System.out.println(set);
		System.out.println(set.size());
		
		// 4. Iterator �������̽��� �̿��� set�� ��ü ȣ�� []
			// Iterator : set�� ��ü �ϳ��� ��ȸ�ϴ� �ݺ���
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext() ) {
				// .hasNext() : ���� ��ü�� �����ϸ� true, �ƴϸ� false
				String elements = iterator.next();	 // ���� ��ü ��������
				System.out.println("\t" + elements );
		}
		
		// 4.
		for (String temp : set) {
			System.out.println("\t" + temp);
		}
		
		set.remove("jabc");
		set.remove("ibatis");
		System.out.println(set);
		
		set.clear();
		System.out.println(set);
		
		
		
		
	}	// m e
}
  