package Day10;

public class Day10_3 { // C S

	public static void main(String[] args) { // M S
		
		// p. 394 : ��øŬ����
		A a = new A(); // AŬ������ �޸� �Ҵ�� �� ��ø�� Ŭ���� ���� �޸� �Ҵ�X
//		System.out.println( " a.B ");
			
		
		// 2. �ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B(); // �ν��Ͻ� Ŭ����
//		A.B b2 = new A.B(); // ���� Ŭ����
		b.field1 = 3;
		b.method1();
			
		// 3. ���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
			
			A.C.field2 = 3; // static : ��ü �������� ���� ����
			A.C.method2();
			
		// 4. ���� Ŭ���� ��ü ����
		a.method();
		
		
	} // M E
} // C E
