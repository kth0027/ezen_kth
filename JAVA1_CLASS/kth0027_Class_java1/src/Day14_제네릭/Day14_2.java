package Day14_���׸�;

import java.util.Arrays;

public class Day14_2 {

	// p.666
	public static void main(String[] args) {
		
		// ���׸�
			// 1. ��ü������ new ������ �Ұ�
			
		// 19����
		Course<Person> personCourse = new Course<>("�Ϲ��ΰ���", 5);
		
		// person Ŭ������ �迭�� ����
		personCourse.add(new Person("�Ϲ���"));
		personCourse.add(new Person("������"));
		personCourse.add(new Person("�л�"));
		personCourse.add(new Person("����л�"));
		
			//	�ش� �迭�� add�� �Ϲ���, ������, �л�, ����л�
		
		Course<Worker> workerCourse = new Course<>("�����ΰ���", 5);
		workerCourse.add(new Worker("������") );
		//Worker Ŭ������ �迭�� ����
		//	�ش� �迭�� add�� ������
		
		Course<Student> studentCourse = new Course<>("�л�����", 5);
		studentCourse.add(new Student("�л�") );
		studentCourse.add(new HighStudent("����л�"));
		//	Student Ŭ������ �迭�� ����
		//	�ش� �迭�� add�� �л�, ����л�
		
		Course<HighStudent> highStudentCourse = new Course<>("����л�����", 5);
		highStudentCourse.add(new HighStudent("����л�") );
		//	HighStudent Ŭ������ �迭�� ����
		//	�ش� �迭�� add�� ����л�
		
		
		System.out.println(" --------------------------- Course<?> : ��� �ڽ� ���� ------");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		

	} // ����
	
	// �ڽ� �ο� ��� ��� �޼ҵ� // ? : ���ϵ�ī�� [��� Ŭ���� ����]
	public static void registerCourse (Course<?> course) {
		System.out.println( course.getName() + " ������ ��� : " 
		+ Arrays.toString( course.getStudents()) );
								// �ڽ��� �迭 ȣ��
	}
	
	
}
