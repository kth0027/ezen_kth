package Day12;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Day12_3 {
	
	public static void main(String[] args) {
		// p.539
		// Date 클래스 : 시스템 날짜/시간
		
		
		// p.540
		// Calender 클래스 : 운영체제 시간대의 날짜/시간에 대한 정보
		
		Calendar now = Calendar.getInstance(); // 기존에 있는 객체를 가져오기
		System.out.println(" 연도 : " + now.get(Calendar.YEAR) );
		System.out.println(" 월 : " + (now.get(Calendar.MONTH) + 1) ); // 0 ~ 11이므로 +1
								// 연결연산자 +					// 더하기연산자 +
		System.out.println(" 일 : " + now.get(Calendar.DAY_OF_MONTH) );
		System.out.println(" 요일 : " + now.get(Calendar.DAY_OF_WEEK) );
							// 1:일 ~ 7:토
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.SUNDAY : strWeek ="일"; break;
			case Calendar.MONDAY : strWeek ="월"; break;
			case Calendar.TUESDAY : strWeek ="화"; break;
			case Calendar.WEDNESDAY : strWeek ="수"; break;
			case Calendar.THURSDAY : strWeek ="목"; break;
			case Calendar.FRIDAY : strWeek ="금"; break;
			case Calendar.SATURDAY : strWeek ="토"; break;
		}
		
		System.out.println(" 요일 : " + strWeek);
		
		System.out.println("오전/오후 : " + now.get(Calendar.AM_PM) ); // 0:오전 1:오후

		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		
		if (ampm == Calendar.AM_PM ) {strampm = "오전";}
		else  {strampm = "오후";}
		System.out.println("오전/오후 :" + strampm);
		
		System.out.println("시 : " + now.get(Calendar.HOUR) );
		System.out.println("분 : " + now.get(Calendar.MINUTE) );
		System.out.println("초 : " + now.get(Calendar.SECOND) );
		

		// ZonedDateTime 클래스 : 협정시계
		ZonedDateTime zonedDateTime = ZonedDateTime.now (ZoneId.of("UTC") );

		System.out.println(" 협정시계 시간 : " + zonedDateTime );
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

		System.out.println(" 서울 시간 : " + zonedDateTime );

		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(" 뉴욕 시간 : " + zonedDateTime );
		
		
		
	}

}
