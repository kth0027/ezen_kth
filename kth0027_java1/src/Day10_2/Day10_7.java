package Day10_2;

public class Day10_7 {

	public static void main(String[] args) {
		
		// 예외처리 : 1.일반예외, 2. 실행예외
			// 목적 : 다양한 오류 발생 시 => 프로그램 정상화
			// *try{} 안에서 예외발생하면 catch 내 예외클래스 객체에 오류발생정보를 저장하고 catch 실행
			// *단 예외가 없을경우 try {} 정상실행후 catch{}는 실행 안함
		
			// try { 예외가 발생 가능 코드 }
			// catch( 예외클래스명 변수명 ){ 예외 발생시 실행되는 코드 }
			// finally{ 예외 있든 없든 무조건 실행되는 코드 }
		
		// 예외클래스 
		// * Exception : 예외 슈퍼클래스 : 모든 예외 저장 가능  
		// 1. NullPointerException 
		// 2. ArrayIndexOutOfBoundsException
		// 3. NumberFormatException
		// ~~~~~ 등등 
	// 예외 던지기 
		// 목적 : 메소드내에서 발생한 예외를 호출한곳으로 이동 [ 예외 통일성 ] 
		
		// 예1 .423 : NullPointerException 예외
//		String data = null;
////		String data = "유재석";
//		System.out.println( data.toString() ); // toString() : 객체정보 반환
		
		try { String data = null;
		System.out.println( data.toString() );
		} catch (Exception e ){
				// NullPointerException
			System.out.println("예외가 발생 했습니다. [ 관리자에게 문의 ]");
			System.out.println("예외정보 : " + e );
		} finally {
			System.out.println( " **무조건 실행되는 위치 ");
		}
		
		// 예2 p.424 : ArrayIndexOutOfBoundsException 예외
//		String[] 문자열배열 = new String [2]; // String 2개를 저장하는 배열 선언
//		문자열배열[0] = "유재석";
//		문자열배열[1] = "강호동";
//		문자열배열[3] = "신동엽";
		
		try {
			String[] 문자열배열 = new String [2];
			문자열배열[0] = "유재석";
			문자열배열[1] = "강호동";
			문자열배열[3] = "신동엽";
		}
		catch (Exception e) {
			// ArrayIndexOutOfBoundsException
			System.out.println("배열내 자리가 부족합니다. [ 관리자에게 문의 ]");
			System.out.println("예외정보 : " + e);
		} finally {
			System.out.println( " **무조건 실행되는 위치 ");
		}
		
		// 예3 p.426 : NumberFormatException 예외
//		String data1 = "100"; // "100" -> 100 [가능]
//		String data2 = "a100"; // "a100" -> a100 [불가능]
//		System.out.println( Integer.parseInt(data1) );
//		System.out.println( Integer.parseInt(data2) );
//				// Integer : 정수 관련 클래스 [ 정수 관련 메소드 제공 ]
//					// .parseInt (문자) : 문자를 정수형으로 변환해주는 메소드
		
		try { String data1 = "100";
			String data2 = "a100";
			System.out.println( Integer.parseInt(data1) );
			System.out.println( Integer.parseInt(data2) );
		} catch (Exception e ){
				// NumberFormatExceptio
			System.out.println("예외가 발생 했습니다. [ 관리자에게 문의 ]");
			System.out.println("예외정보 : " + e );
		} finally {
			System.out.println( " **무조건 실행되는 위치 ");
		}
		
		
		
	
	}
}
