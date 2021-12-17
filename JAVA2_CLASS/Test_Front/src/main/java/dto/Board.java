package dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Board {
	// 필드
	private int b_num;
	private String b_title;
	private String b_contents;
	private String b_date;
	private String b_file;
	private int b_view;
	private int b_activation;

	// 자동생성자
	public Board() {
		// TODO Auto-generated constructor stub
	}

	// 전체생성자
	public Board(int b_num, String b_title, String b_contents, String b_date, String b_file, int b_view,
			int b_activation) {
		super();
		this.b_num = b_num;
		this.b_title = b_title;
		this.b_contents = b_contents;
		Date today = new Date(); // 1. 오늘날짜
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 날짜,시간형식
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식
		SimpleDateFormat timeformat = new SimpleDateFormat("a hh:mm"); // 시간 형식
		try {
			Date date = datetimeformat.parse(b_date); // [문자열]DB -> 날짜/시간 형식 변환
			if (dateFormat.format(date).equals(dateFormat.format(today))) { // 등록날짜 = 오늘날짜 비교
				this.b_date = timeformat.format(date); // 날짜가 동일하면 시간형식 적용
			} else {
				this.b_date = dateFormat.format(date); // 날짜가 동일하지 않으면 날짜형식 적용
			}
		} catch (Exception e) {
		}
		this.b_file = b_file;
		this.b_view = b_view;
		this.b_activation = b_activation;

	}
	
	// 글등록 생성자

	public Board(String b_title, String b_contents, String b_file) {
		super();
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.b_file = b_file;
	}
	
	
	
	// get / set

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_contents() {
		return b_contents;
	}

	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public String getB_file() {
		return b_file;
	}

	public void setB_file(String b_file) {
		this.b_file = b_file;
	}

	public int getB_view() {
		return b_view;
	}

	public void setB_view(int b_view) {
		this.b_view = b_view;
	}

	public int getB_activation() {
		return b_activation;
	}

	public void setB_activation(int b_activation) {
		this.b_activation = b_activation;
	}

	
	

}
