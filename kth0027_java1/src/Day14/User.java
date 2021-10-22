package Day14;

public class User {

	// 필드
	private String id;
	private String password;
	private String name;

	// 생성자

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String password, String name) {

		this.id = id;
		this.password = password;
		this.name = name;
	}

	// 메소드 겟 셋
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}

