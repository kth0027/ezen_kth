package Day09_3TF;

public class Day09_6 {

	// ���θ� ���α׷� [ ���, �������̽� ]
	// ORDER & CART [�������̽�]
	// �߻� �޼ҵ� : ��ǰ���, ��ǰ����Ʈ, ��ٱ���, ��ǰ����, ȯ��

	// 1. ���θ� [����Ŭ����]
		// �ʵ�(�Ӽ�) : ��ǰ��ȣ, ��ǰ���Ű���
	
	// 2. 11���� [����Ŭ����]
	// 3. ���� [����Ŭ����]
	
	public static ���θ�[] shoplist = new ���θ�[100];
	
	public static void main(String[] args) {
		// 1. �������̽� ����
		ShopManager shop;
		
		// 2. �������̽� Ŭ���� ����
		shop = new ����();
		
		// 3. �������̽��κ��� Ŭ����
		shop.��ǰ���();
		shop.��ǰ����Ʈ();
		shop.��ٱ���();
		shop.��ǰ����();
		shop.ȯ��();
		
		// 4. �������̽� �� Ŭ���� ����
		shop = new ���Ϲ���();
		shop.��ǰ���();
		
		// 5. ������ ����Ŭ�����κ��� ���� �ٸ� ����Ŭ������ �迭�� ���
		// ����Ŭ������ �迭 ����
		
		���θ� productadd1 = new ���θ�();
		shoplist[0] = productadd1;
		
		���� productadd2 = new ����();
		shoplist[0] = productadd1;
		
		���Ϲ��� productadd3 = new ���Ϲ���();
		shoplist[0] = productadd1;
	}
}
