package Day09_2;

public interface ATM {

	
	// 1. ����ʵ�
	
	// 2. �߻� �޼ҵ�
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();

	// 3. ����Ʈ �޼ҵ�
	default void ����() {System.out.println(" ATM �������Դϴ� ");}

	// 4. ���� �޼ҵ�
		
}
