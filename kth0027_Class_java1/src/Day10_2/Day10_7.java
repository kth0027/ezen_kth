package Day10_2;

public class Day10_7 {

	public static void main(String[] args) {
		
		// ����ó�� : 1.�Ϲݿ���, 2. ���࿹��
			// ���� : �پ��� ���� �߻� �� => ���α׷� ����ȭ
			// *try{} �ȿ��� ���ܹ߻��ϸ� catch �� ����Ŭ���� ��ü�� �����߻������� �����ϰ� catch ����
			// *�� ���ܰ� ������� try {} ��������� catch{}�� ���� ����
		
			// try { ���ܰ� �߻� ���� �ڵ� }
			// catch( ����Ŭ������ ������ ){ ���� �߻��� ����Ǵ� �ڵ� }
			// finally{ ���� �ֵ� ���� ������ ����Ǵ� �ڵ� }
		
		// ����Ŭ���� 
		// * Exception : ���� ����Ŭ���� : ��� ���� ���� ����  
		// 1. NullPointerException 
		// 2. ArrayIndexOutOfBoundsException
		// 3. NumberFormatException
		// ~~~~~ ��� 
	// ���� ������ 
		// ���� : �޼ҵ峻���� �߻��� ���ܸ� ȣ���Ѱ����� �̵� [ ���� ���ϼ� ] 
		
		// ��1 .423 : NullPointerException ����
//		String data = null;
////		String data = "���缮";
//		System.out.println( data.toString() ); // toString() : ��ü���� ��ȯ
		
		try { String data = null;
		System.out.println( data.toString() );
		} catch (Exception e ){
				// NullPointerException
			System.out.println("���ܰ� �߻� �߽��ϴ�. [ �����ڿ��� ���� ]");
			System.out.println("�������� : " + e );
		} finally {
			System.out.println( " **������ ����Ǵ� ��ġ ");
		}
		
		// ��2 p.424 : ArrayIndexOutOfBoundsException ����
//		String[] ���ڿ��迭 = new String [2]; // String 2���� �����ϴ� �迭 ����
//		���ڿ��迭[0] = "���缮";
//		���ڿ��迭[1] = "��ȣ��";
//		���ڿ��迭[3] = "�ŵ���";
		
		try {
			String[] ���ڿ��迭 = new String [2];
			���ڿ��迭[0] = "���缮";
			���ڿ��迭[1] = "��ȣ��";
			���ڿ��迭[3] = "�ŵ���";
		}
		catch (Exception e) {
			// ArrayIndexOutOfBoundsException
			System.out.println("�迭�� �ڸ��� �����մϴ�. [ �����ڿ��� ���� ]");
			System.out.println("�������� : " + e);
		} finally {
			System.out.println( " **������ ����Ǵ� ��ġ ");
		}
		
		// ��3 p.426 : NumberFormatException ����
//		String data1 = "100"; // "100" -> 100 [����]
//		String data2 = "a100"; // "a100" -> a100 [�Ұ���]
//		System.out.println( Integer.parseInt(data1) );
//		System.out.println( Integer.parseInt(data2) );
//				// Integer : ���� ���� Ŭ���� [ ���� ���� �޼ҵ� ���� ]
//					// .parseInt (����) : ���ڸ� ���������� ��ȯ���ִ� �޼ҵ�
		
		try { String data1 = "100";
			String data2 = "a100";
			System.out.println( Integer.parseInt(data1) );
			System.out.println( Integer.parseInt(data2) );
		} catch (Exception e ){
				// NumberFormatExceptio
			System.out.println("���ܰ� �߻� �߽��ϴ�. [ �����ڿ��� ���� ]");
			System.out.println("�������� : " + e );
		} finally {
			System.out.println( " **������ ����Ǵ� ��ġ ");
		}
		
		
		
	
	}
}
