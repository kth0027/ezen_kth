package Day14_����1;

import java.util.Arrays;
import java.util.Scanner;

public class ���� {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		���<���> ������ = new ���<>("��ü", 10);
		���<����> ���θ�� = new ���<>("����", 10);
		���<û�ҳ�> û�ҳ��� = new ���<>("û�ҳ�",10);
		���<����> ���Ƹ�� = new ���<>("����", 10);
		


		while (true) {
			System.out.println("  ");
			System.out.println(" ---------------- ��ܰ��� ���α׷� ");
			System.out.println("�̸� : "); String name = scanner.next();
			System.out.println("���� : "); int age = scanner.nextInt();
			
			
			if (age < 8) {
				���Ƹ��.add(new ����(name, age));
			} else if (8 <= age && age < 20) {
				û�ҳ���.add(new û�ҳ�(name, age));
			} else {
				���θ��.add(new ����(name, age));
			}
			
			if (age > 0) {
				������.add(new ����(name, age));
			}


			// ��� Ŭ������ �迭 ����
			System.out.println(" ");
				System.out.println(" ---------------- ���<?> : ��ü ��� ");
			  	��������(������);
			  	��������(���θ��);
			  	��������(û�ҳ���);
			  	��������(���Ƹ��);
		}
			
	} // ����
	
	public static void �������� ( ��� <?> ���) {
		System.out.println( ���.getName() + " ��� : " 
	+ Arrays.toString( ���.getPeople() ));
	}
}

