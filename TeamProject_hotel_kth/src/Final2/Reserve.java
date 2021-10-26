package Final2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Reserve {

	// 1. 필드 
	private String h_id;
	private String h_phone;
	private String date;
	

	// 2. 생성자 
	public Reserve() { // 빈생성자 : 1.메소드호출용시 2. 빈 객체 생성후 추후에 필드 값 대입 
		
	}
	// 게시물 등록시 사용되는 생성자 
		public Reserve(String h_id, String h_phone, String date, SimpleDateFormat simpleDateFormat) {
		
		this.h_id = h_id;
		this.h_phone = h_phone;
		
		Date date = new Date(); // 현재시간 클래스
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
		this.date =simpleDateFormat.format(date );
	}
		
		public Reserve(String h_id, String h_phone, String date) {
			this.h_id = h_id;
			this.h_phone = h_phone;
			this.date = date;

		}

		public String getH_id() {
			return h_id;
		}
		public void setH_id(String h_id) {
			this.h_id = h_id;
		}
		public String getH_phone() {
			return h_phone;
		}
		public void setH_phone(String h_phone) {
			this.h_phone = h_phone;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		
		
	
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
