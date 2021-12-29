package dto;

public class Member {
// 필드생성
	private int m_num;
	private String m_id;
	private String m_password;
	private String m_name;
	private String m_email;
	private String m_address;
	private String m_phone;
	private String m_sdate;

// 빈생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}

	// 자동생성자
	public Member(int m_num, String m_id, String m_password, String m_name, String m_email, String m_address,
			String m_phone, String m_sdate) {
		super();
		this.m_num = m_num;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_address = m_address;
		this.m_phone = m_phone;
		this.m_sdate = m_sdate;
	}

	// 회원가입 생성자
	public Member(String m_id, String m_password, String m_name, String m_email, String m_address, String m_phone) {
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_name = m_name;
		this.m_email = m_email;
		this.m_address = m_address;
		this.m_phone = m_phone;
	}

	// get / set 생성자
	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String getM_sdate() {
		return m_sdate;
	}

	public void setM_sdate(String m_sdate) {
		this.m_sdate = m_sdate;
	}

}
