package Day15_�÷��������ӿ�ũ;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {
	
	public static void main(String[] args) {
		
		// 1. tree �÷���  ����
		TreeSet<Person> treeSet = new TreeSet<>();
		
		// 2. tree ��ü �ֱ�
		treeSet.add(new Person("ȫ�浿", 45) );
		treeSet.add(new Person("���ڹ�", 25) );
		treeSet.add(new Person("������", 31) );
		
		// 3. ���� �������� ��������
		Iterator<Person> iteratro = treeSet.iterator();
		while (iteratro.hasNext() ) {
						// hasNext() : ���� ��ü�� �ִ��� Ȯ��
			Person person = iteratro.next();
						// next() : ��ü ��������
			System.out.println( person.name + "\t" + person.age );
		}
		
		// 3. for
		for ( Person person : treeSet) {
			System.out.println( person.name + "\t" + person.age );
		}
		
		
		
	} // m e
	

}
