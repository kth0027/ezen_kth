package Day12_API;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Day12_3 {
	
	public static void main(String[] args) {
		// p.539
		// Date Ŭ���� : �ý��� ��¥/�ð�
		
		
		// p.540
		// Calender Ŭ���� : �ü�� �ð����� ��¥/�ð��� ���� ����
		
		Calendar now = Calendar.getInstance(); // ������ �ִ� ��ü�� ��������
		System.out.println(" ���� : " + now.get(Calendar.YEAR) );
		System.out.println(" �� : " + (now.get(Calendar.MONTH) + 1) ); // 0 ~ 11�̹Ƿ� +1
								// ���Ῥ���� +					// ���ϱ⿬���� +
		System.out.println(" �� : " + now.get(Calendar.DAY_OF_MONTH) );
		System.out.println(" ���� : " + now.get(Calendar.DAY_OF_WEEK) );
							// 1:�� ~ 7:��
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
			case Calendar.SUNDAY : strWeek ="��"; break;
			case Calendar.MONDAY : strWeek ="��"; break;
			case Calendar.TUESDAY : strWeek ="ȭ"; break;
			case Calendar.WEDNESDAY : strWeek ="��"; break;
			case Calendar.THURSDAY : strWeek ="��"; break;
			case Calendar.FRIDAY : strWeek ="��"; break;
			case Calendar.SATURDAY : strWeek ="��"; break;
		}
		
		System.out.println(" ���� : " + strWeek);
		
		System.out.println("����/���� : " + now.get(Calendar.AM_PM) ); // 0:���� 1:����

		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		
		if (ampm == Calendar.AM_PM ) {strampm = "����";}
		else  {strampm = "����";}
		System.out.println("����/���� :" + strampm);
		
		System.out.println("�� : " + now.get(Calendar.HOUR) );
		System.out.println("�� : " + now.get(Calendar.MINUTE) );
		System.out.println("�� : " + now.get(Calendar.SECOND) );
		

		// ZonedDateTime Ŭ���� : �����ð�
		ZonedDateTime zonedDateTime = ZonedDateTime.now (ZoneId.of("UTC") );

		System.out.println(" �����ð� �ð� : " + zonedDateTime );
		zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

		System.out.println(" ���� �ð� : " + zonedDateTime );

		zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(" ���� �ð� : " + zonedDateTime );
		
		
		
	}

}