package Day10_1;

public class Sub extends Person {

	// �޼ҵ�
	void work() {
		System.out.println("����մϴ�");
	}
	
	// �޼ҵ� : �������̵�
	@Override
	void wake() {
		System.out.println("6�ÿ� �Ͼ�ϴ�");
		work();
	}
}
