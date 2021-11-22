package ShoppingMall;

import java.util.Scanner;

public class Shopping2 {

	Scanner scan = new Scanner(System.in);

	String[] item = { "지갑", "향수", "벨트", "시계", "가방", "반지" };
	String[] id = { "구찌", "샤넬", "발망" };
	String JangID[] = null;
	String JangItem[] = null;
	int count = 0;
	int log = -1;
	int x = 0;
	
	while (x==0) {
		if (log == -1) {
			System.out.println( "*** 로그인 하세요 ***");
		} else if (log != -1) {
			System.out.println("**" + id[log] +"로그인증 **");
		}
		
		System.out.println("1.로그인 2.로그아웃 5.쇼핑");
		System.out.println("3.개인 장바구니 4.전체 방바구니");
		int sel = scan.nextInt();
		if (sel==1) {
			if (log == -1) {
				System.out.println("ID를 입력하세요");
				String logid = scan.next();
				for ( int i = 0; i<id.length; i++) {
					if (logid.equals(id[i]) ) {
						log = i;
					}
				}
			} else if {
				System.out.println( " [이미로그인 중입니다] ");
			}
		
		}
	}

}
