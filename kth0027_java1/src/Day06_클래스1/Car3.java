package Day06_Ŭ����1;

public class Car3 {

	// 1. �ʵ�
	String company = "�����ڵ���";
	String model; String color; int maxSpeed;		
		
	// 2. ������
		// 1. 
		public Car3() {
			// TODO Auto-generated constructor stub
		}
		
		// 2. ������ > 1���� �ʵ带 �޴� ������ 
		public Car3 ( String model ) {
			this.model = model;
		}
		
		// 3. > 2���� �ʵ带 �޴� ������ 
		public Car3 ( String model, String color ) {
			this.model = model;
			this.color = color;
		}
		
		// 4. > 3���� �ʵ带 �޴� ������
		public Car3 ( String model, String color, int maxSpeed) {
			this.model = model;
			this.color = color;
			this.maxSpeed = maxSpeed; 
			
			
		}
		
	// 3. �޼ҵ�
}
