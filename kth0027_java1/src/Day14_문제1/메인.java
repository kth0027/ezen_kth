package Day14_문제1;

import java.util.Arrays;
import java.util.Scanner;

public class 메인 {
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		명단<사람> 사람명단 = new 명단<>("전체", 10);
		명단<성인> 성인명단 = new 명단<>("성인", 10);
		명단<청소년> 청소년명단 = new 명단<>("청소년",10);
		명단<유아> 유아명단 = new 명단<>("유아", 10);
		


		while (true) {
			System.out.println("  ");
			System.out.println(" ---------------- 명단관리 프로그램 ");
			System.out.println("이름 : "); String name = scanner.next();
			System.out.println("나이 : "); int age = scanner.nextInt();
			
			
			if (age < 8) {
				유아명단.add(new 유아(name, age));
			} else if (8 <= age && age < 20) {
				청소년명단.add(new 청소년(name, age));
			} else {
				성인명단.add(new 성인(name, age));
			}
			
			if (age > 0) {
				사람명단.add(new 성인(name, age));
			}


			// 사람 클래스로 배열 생성
			System.out.println(" ");
				System.out.println(" ---------------- 명단<?> : 전체 명단 ");
			  	레지스터(사람명단);
			  	레지스터(성인명단);
			  	레지스터(청소년명단);
			  	레지스터(유아명단);
		}
			
	} // 메인
	
	public static void 레지스터 ( 명단 <?> 명단) {
		System.out.println( 명단.getName() + " 명단 : " 
	+ Arrays.toString( 명단.getPeople() ));
	}
}

