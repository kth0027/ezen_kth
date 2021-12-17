package Day15_컬렉션프레임워크;

import java.util.Iterator;
import java.util.TreeSet;

public class Day15_9 {
	
	public static void main(String[] args) {
		
		// 1. tree 컬렉선  선언
		TreeSet<Person> treeSet = new TreeSet<>();
		
		// 2. tree 객체 넣기
		treeSet.add(new Person("홍길동", 45) );
		treeSet.add(new Person("김자바", 25) );
		treeSet.add(new Person("박지원", 31) );
		
		// 3. 나이 기준으로 오름차순
		Iterator<Person> iteratro = treeSet.iterator();
		while (iteratro.hasNext() ) {
						// hasNext() : 다음 객체가 있는지 확인
			Person person = iteratro.next();
						// next() : 객체 가져오기
			System.out.println( person.name + "\t" + person.age );
		}
		
		// 3. for
		for ( Person person : treeSet) {
			System.out.println( person.name + "\t" + person.age );
		}
		
		
		
	} // m e
	

}
