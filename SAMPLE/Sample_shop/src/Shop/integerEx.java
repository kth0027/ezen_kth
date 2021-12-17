package Shop;

import java.util.Scanner;

public class integerEx { // c s
	public static void main(String[] args) { // m s

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력해 주세요");
		String input = sc.next();
		System.out.println(input + 5);

		int num = Integer.parseInt(input);
		System.out.println(num + 5);

	} // m e

} // c e
