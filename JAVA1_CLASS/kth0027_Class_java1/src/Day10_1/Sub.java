package Day10_1;

public class Sub extends Person {

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
}
