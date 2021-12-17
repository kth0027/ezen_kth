package Day10_1;

public class Anonymous {

	// 1. 필드
	Person person = new Person(); /// 객체생성

	// 익명객체 : 1회성
	Person field = new Person() {

		// 메소드
		void work() {
			System.out.println("출근합니다");
		}

		// 메소드 : 오버라이딩
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		}
	}; // 익명객체 구현 끝

	// 2. 생성자

	// 3. 메소드
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책을 합니다");
			}

			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}			
		};
		localVar.wake();
	}
	void method2( Person person ) {
		person.wake();
	}

}
