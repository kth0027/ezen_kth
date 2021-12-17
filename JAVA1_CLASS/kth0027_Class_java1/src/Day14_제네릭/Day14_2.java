package Day14_제네릭;

import java.util.Arrays;

public class Day14_2 {

	// p.666
	public static void main(String[] args) {
		
		// 제네릭
			// 1. 자체적으로 new 연산자 불가
			
		// 19번줄
		Course<Person> personCourse = new Course<>("일반인과정", 5);
		
		// person 클래스로 배열이 생성
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
			//	해당 배열에 add는 일반인, 직장인, 학생, 고등학생
		
		Course<Worker> workerCourse = new Course<>("직장인과정", 5);
		workerCourse.add(new Worker("직장인") );
		//Worker 클래스로 배열이 생성
		//	해당 배열에 add는 직장인
		
		Course<Student> studentCourse = new Course<>("학생과정", 5);
		studentCourse.add(new Student("학생") );
		studentCourse.add(new HighStudent("고등학생"));
		//	Student 클래스로 배열이 생성
		//	해당 배열에 add는 학생, 고등학생
		
		Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 5);
		highStudentCourse.add(new HighStudent("고등학생") );
		//	HighStudent 클래스로 배열이 생성
		//	해당 배열에 add는 고등학생
		
		
		System.out.println(" --------------------------- Course<?> : 모든 코스 가능 ------");
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		

	} // 메인
	
	// 코스 인원 명단 출력 메소드 // ? : 와일드카드 [모든 클래스 대응]
	public static void registerCourse (Course<?> course) {
		System.out.println( course.getName() + " 수강생 명단 : " 
		+ Arrays.toString( course.getStudents()) );
								// 코스내 배열 호출
	}
	
	
}
