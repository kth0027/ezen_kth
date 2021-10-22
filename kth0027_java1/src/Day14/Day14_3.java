package Day14;

import java.util.ArrayList;

public class Day14_3 {
	
	public static void main(String[] args) { // 메인 시작
		
		// 컬렉션 프레임워크
			// 컬렉션 : 수집 [자료구조 : 데이터를 저장하는 방법]
			// 프레임워크 : 미리 만들어진 라이브러리의 사용방법 정의
		
		// 1. List : Arraylist, Vector, LinkedList
		// 2. Set :
		// 3. Map
		
		// p.728
		// 1. Arraylist : 배열과 유사
			// 1. 가변길이 [ 기본 10 이지만, 10이 넘으면 저장 용량 자동으로 늘어남 ]
			// 2. 객체가 삭제 [ 삭제된 인덱스 뒤로 한칸씩 당겨짐 ]
				// 예) 3번 인덱스 삭제시 [ 4번 인덱스가 당겨짐 -> 3번 인덱스 ]
		
			// 3. 메소드
				// 1. 리트스명.add(객체명) : 해당 객체를 리스트에 저장
		
		// 1. 리스트 생성
		ArrayList<String> list = new ArrayList<>();
				// <제네릭> : 제네릭은 넣은 타입으로 리스트 내 객체 사용
		
		// 2. 리스트에 객체 추가
		list.add("java");
		list.add("jabc");
		list.add("servlet/jsp");
		list.add(2, "Database");
		list.add("ibats");
		
		// 3. 리스트 출력
		System.out.println( list );
		System.out.println( "리스트 내 객체수 : " + list.size() );
		
		// 4. 리스트 내 객체 호출
		System.out.println("2번 인덱스 호출 : " + list.get(2) );
		
		// 5. 리스트 내 모든 객체 호출 [ 1: 반복문 사용 ]
		System.out.println(" -------------- 리스트 내 모든 객체 호출 --------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// 5. 리스트 내 모든 객체 호출 [ 1: 반복문 사용 ]
		System.out.println(" -------------- 리스트 내 모든 객체 호출 --------------");
		for (String temp : list) {
			// for (임시객체 : 리스트)
			// 리스트 내 모든 객체를 하나씩 임시 객체에 대입
			System.out.println(temp);
		}
		
		// 6. 리스트 내 객체 삭제
		list.remove(2); // Database 삭제 => 삭제 후 => servlet / jsp 객체가 2번 인덱스
		System.out.println( " 삭제 확인 : " + list );
		
		list.remove(2); // servlet / jsp 삭제
		System.out.println( " 삭제 확인 : " + list );
		
		// 7. 검색
		System.out.println( list.contains("java") );
		System.out.println( list.indexOf("java") );
		
		// 8. 리스트 초기화
		
		list.clear(); //
		  
		
		
		
	} // 메인 종료
}
