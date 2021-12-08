package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

import dao.MemberDao;

public class Reply {
	// 필드
	private int r_num;
	private String r_contents;
	private String r_date;
	private int m_num;
	private int b_num;

	private String r_writer;

	// 생성자
	// 1 빈생성자
	public Reply() {

	}

	// 2 자동생성자 : 2-1. DB 꺼내올때
	public Reply(int r_num, String r_contents, String r_date, int m_num, int b_num) {
		super();
		this.r_num = r_num;
		this.r_contents = r_contents;
		this.m_num = m_num;
		this.b_num = b_num;

		// 작성자 = 회원 번호를 이용한 아이디 찾아서 대입
		this.r_writer = MemberDao.getmemberDao().getmemberid(m_num);

		// date
		Date today = new Date(); // 1. 오늘날짜
		SimpleDateFormat datetimeformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); // 날짜,시간형식
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // 날짜 형식
		SimpleDateFormat timeformat = new SimpleDateFormat("a hh:mm"); // 시간 형식

		try {
			Date date = datetimeformat.parse(r_date); // [문자열]DB -> 날짜/시간 형식 변환
			if (dateFormat.format(date).equals(dateFormat.format(today))) { // 등록날짜 = 오늘날짜 비교
				this.r_date = timeformat.format(date); // 날짜가 동일하면 시간형식 적용
			} else {
				this.r_date = dateFormat.format(date); // 날짜가 동일하지 않으면 날짜형식 적용
			}
		} catch (Exception e) {
		}

	}

	// 등록 생성자 : 2-2. DB 넣을때
	public Reply(String r_contents, int m_num, int b_num) {
		super();
		this.r_contents = r_contents;
		this.m_num = m_num;
		this.b_num = b_num;
	}

	// GIT / SET
	public int getR_num() {
		return r_num;
	}

	public void setR_num(int r_num) {
		this.r_num = r_num;
	}

	public String getR_contents() {
		return r_contents;
	}

	public void setR_contents(String r_contents) {
		this.r_contents = r_contents;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public int getB_num() {
		return b_num;
	}

	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	
	public String getR_writer() {
		return r_writer;
	}
	public void setR_writer(String r_writer) {
		this.r_writer = r_writer;
	}

}
