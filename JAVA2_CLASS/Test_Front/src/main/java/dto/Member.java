package dto;

public class Member {
// 필드생성
	private int test_num;
	private String test_id;
	private String test_password;
	private String test_name;
	private String test_email;
	private String test_address;
	private String test_phone;
	private String test_sdate;

// 빈생성자
	public Member() {
		// TODO Auto-generated constructor stub
	}

	// 자동생성자
	public Member(int test_num, String test_id, String test_password, String test_name, String test_email, String test_address,
			String test_phone, String test_sdate) {
		super();
		this.test_num = test_num;
		this.test_id = test_id;
		this.test_password = test_password;
		this.test_name = test_name;
		this.test_email = test_email;
		this.test_address = test_address;
		this.test_phone = test_phone;
		this.test_sdate = test_sdate;
	}

	// 회원가입 생성자
	
	public Member(String test_id, String test_password, String test_name, String test_email, String test_address,
			String test_phone) {
		super();
		this.test_id = test_id;
		this.test_password = test_password;
		this.test_name = test_name;
		this.test_email = test_email;
		this.test_address = test_address;
		this.test_phone = test_phone;
	}

	// get / set 생성자
	public int gettest_num() {
		return test_num;
	}



	public int getTest_num() {
		return test_num;
	}

	public void setTest_num(int test_num) {
		this.test_num = test_num;
	}

	public String getTest_id() {
		return test_id;
	}

	public void setTest_id(String test_id) {
		this.test_id = test_id;
	}

	public String getTest_password() {
		return test_password;
	}

	public void setTest_password(String test_password) {
		this.test_password = test_password;
	}

	public String getTest_name() {
		return test_name;
	}

	public void setTest_name(String test_name) {
		this.test_name = test_name;
	}

	public String getTest_email() {
		return test_email;
	}

	public void setTest_email(String test_email) {
		this.test_email = test_email;
	}

	public String getTest_address() {
		return test_address;
	}

	public void setTest_address(String test_address) {
		this.test_address = test_address;
	}

	public String getTest_phone() {
		return test_phone;
	}

	public void setTest_phone(String test_phone) {
		this.test_phone = test_phone;
	}

	public String getTest_sdate() {
		return test_sdate;
	}

	public void setTest_sdate(String test_sdate) {
		this.test_sdate = test_sdate;
	}

	

}
