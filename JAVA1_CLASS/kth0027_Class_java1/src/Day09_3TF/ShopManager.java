package Day09_3TF;

public interface ShopManager {


	
	// 1. ����ʵ�
	
	// 2. �߻� �޼ҵ�
		public void ��ǰ���();
		public void ��ǰ����Ʈ();
		public void ��ٱ���();
		public void ��ǰ����();
		public void ȯ��();

	// 3. ����Ʈ �޼ҵ�
		default void ����() {System.out.println(" ���θ� ����Դϴ� ");}

	// 4. ���� �޼ҵ�
}

	