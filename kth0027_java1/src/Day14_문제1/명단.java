package Day14_문제1;

public class 명단<T> {

	// 필드
	private String name;
	private T[] people;

	// 생성자
	public 명단(String name, int capacity) {
		this.name = name;
		people = (T[]) new Object[capacity];
	}

	
	
	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getPeople() {
		return people;
	}

	public void setPeople(T[] people) {
		this.people = people;
	}
	
	public void add (T t) {
		for ( int i = 0; i<people.length; i++) {
			if ( people[i]==null) {
				people[i]=t; break;
			}
		}
	}
	
	
	

}
