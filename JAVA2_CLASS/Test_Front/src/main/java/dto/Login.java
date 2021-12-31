package dto;

public class Login {

	private int test_num;
	private String test_id;

	public Login(int test_num, String test_id) {
		this.test_num = test_num;
		this.test_id = test_id;
	}

	public int gettest_num() {
		return test_num;
	}

	public void settest_num(int test_num) {
		this.test_num = test_num;
	}

	public String gettest_id() {
		return test_id;
	}

	public void settest_id(String test_id) {
		this.test_id = test_id;
	}
}