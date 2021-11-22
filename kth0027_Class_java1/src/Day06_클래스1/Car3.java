package Day06_클래스1;

public class Car3 {

	// 1. 필드
	String company = "현대자동차";
	String model; String color; int maxSpeed;		
		
	// 2. 생성자
		// 1. 
		public Car3() {
			// TODO Auto-generated constructor stub
		}
		
		// 2. 생성자 > 1개의 필드를 받는 생성자 
		public Car3 ( String model ) {
			this.model = model;
		}
		
		// 3. > 2개의 필드를 받는 생성자 
		public Car3 ( String model, String color ) {
			this.model = model;
			this.color = color;
		}
		
		// 4. > 3개의 필드를 받는 생성자
		public Car3 ( String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed; 
			
			
		}
		
	// 3. 메소드
}
