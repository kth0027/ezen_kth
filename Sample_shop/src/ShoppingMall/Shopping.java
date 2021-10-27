package ShoppingMall;

import java.util.Scanner;

public class Shopping {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String[][] Jang = {
					{"임세향", "꿀꽈배기"},
					{"임세세", "빈츠"},
			};
			
			int x = 0;
			while (x==0) {
				System.out.println( " 1.추가 2.삭제 3.장바구니 4.전체출력 " );
				int sel = scan.nextInt();
			}
		}
}
