package Day06_클래스1;



public class Day06_2 {	// c s

	public static void main(String[] args) {	// m s
		
		// 221.
		Car3 car1 = new Car3();
//		System.out.println("car1.company:" + car1.company);
//		System.out.println("car1.model:" + car1.model);
//		System.out.println();
		
		Car3 car2 = new Car3("자가용");
//		System.out.println("car2.company:" + car2.company);
//		System.out.println("car2.model:" + car2.model);
//		System.out.println("car2.color:" + car2.color);
//		System.out.println();
		
		Car3 car3 = new Car3("자가용", "빨강");
//		System.out.println("car3.company:" + car3.company);
//		System.out.println("car3.model:" + car3.model);
//		System.out.println("car3.color:" + car3.color);
//		System.out.println("car3.maxSpeed:" + car3.maxSpeed);
//		System.out.println();
		
		Car3 car4 = new Car3("택시", "검정", 200);
//		System.out.println("car4.company:" + car4.company);
//		System.out.println("car4.model:" + car4.model);
//		System.out.println("car4.color:" + car4.color);
//		System.out.println("car4.maxSpeed:" + car4.maxSpeed);
//		System.out.println();
		
		함수( car1 );
		함수( car2 );
		함수( car3 );
		함수( car4 );

	}	// m e	 
	
	public static int 함수 ( Car3 car) {
		int 변수 = 0;

		System.out.println("car3.company:" + car.company);
		System.out.println("car3.model:" + car.model);
		System.out.println("car3.color:" + car.color);
		System.out.println("car3.maxSpeed:" + car.maxSpeed);
		System.out.println();
		
		return 변수 ; 
	}
	
}	// c e
