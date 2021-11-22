package Day10_인터페이스;

public class SmartPhone extends Phone {
			// 추상클래스 : 상송 extends
	public SmartPhone ( String owner ) {
		super(owner);
		// super() : 슈퍼클래스의 생성자 호출
	} 
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
	
	@Override
	public void sound() {
	// TODO Auto-generated method stub
			
	}
	

}
