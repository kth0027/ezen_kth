package Day11_TF_LIBRARY;

import java.io.IOException;

public class Day11_6 {
	public static void main(String[] args) throws IOException {
		 String [] 도서목록 = {
				 "된다! 네이버 블로그 & 포스트" ,
				 "스프링 부트 실전활용 마스터" ,
				 "Tucker의 Go 언어 프로그래밍" , 
				 "혼자 공부하는 C언어"};
		 
		 // 키보드로부터 바이트를 읽어올때 /r/n 포함 
		 
		 while(true) {
			 System.out.println("1.검색 2.수정");
			 byte[] b = new byte[100];  // 키보드로부터 받을 바이트 배열 선언 
			 int count = System.in.read(b);	
			 	// 입력문자수 + 2[\n , \r ]
			 	// 키보드로부터 바이트르 받아 배열에 저장
			 String ch = new String( b ,0, count-2 ); // 바이트 -> 문자열
			 					// 0부터 입력한 문자수까지 변환
			 if( ch.equals("1") ) {
				 System.out.println(" 검색 도서 : "); 
				 int count2 = System.in.read(b);
				 	// 입력문자수 + 2[\n , \r ]
				 	// 키보드로부터 바이트르 받아 배열에 저장
				 String book = new String(b , 0 , count2-2); // 바이트 -> 문자열
				 					// 0부터 입력한 문자수까지 변환
				 // 도서검색[책장=배열] => 모든 책장 검색 => for
				 for( int i = 0 ; i<도서목록.length; i++ ) {
					 if( 도서목록[i].contains( book ) ) {
						System.out.println( i +"번  "+ 도서목록[i]); 
					 }
				 }
				 
				 
			 }else if( ch.equals("2") ) {
				 System.out.println(" 검색 도서 : "); 
				 int count2 = System.in.read(b);
				 	// 입력문자수 + 2[\n , \r ]
				 	// 키보드로부터 바이트르 받아 배열에 저장
				 String book = new String(b , 0 , count2-2); // 바이트 -> 문자열
				 					// 0부터 입력한 문자수까지 변환
				 // 도서검색[책장=배열] => 모든 책장 검색 => for
				 for( int i = 0 ; i<도서목록.length; i++ ) {
					 if( 도서목록[i].contains( book ) ) {
						System.out.println( i +"번  "+ 도서목록[i]); 
					 }
				 }
				 
				 // 수정할 도서번호 [ 인덱스 ]  
				 System.out.println(" 수정할 도서번호 : "); 

				 int count3 = System.in.read(b);
				 int index = Integer.parseInt(new String( b , 0 , count3-2 ) );
				 
				 System.out.println("변경할 문자 : ");
				 count3 = System.in.read(b);
				 String oldbook = new String(b , 0 , count3-2); // 바이트 -> 문자열
				 
				 System.out.println("새로운 문자 : ");
				 count3 = System.in.read(b);
				 String newbook = new String(b , 0 , count3-2); // 바이트 -> 문자열
				 
				 // 치환
				 도서목록[index] = 도서목록[index].replace(oldbook, newbook);
				 
			 }
		 }
	}
}