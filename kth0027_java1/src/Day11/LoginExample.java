package Day11;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("write", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) throws Exception {
		// id가 "blue"가 아니라면 NoExistIdException 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}

		// password가 "12345"가 아니라면 WrongPasswordException을 발생시킴
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
