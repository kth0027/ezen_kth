package Day14_����1;

public class ���<T> {

	// �ʵ�
	private String name;
	private T[] people;

	// ������
	public ���(String name, int capacity) {
		this.name = name;
		people = (T[]) new Object[capacity];
	}

	
	
	// �޼ҵ�
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
