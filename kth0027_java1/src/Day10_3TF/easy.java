package Day10_3TF;

public class easy {
	public static void main(String[] args) {
		// 로그인하기 , 예외사항이 있으므로 try,catch,finally

		try {
			// 로그인 시도하기
			boolean loginResult = login("dalso", "11112");
			// 예외사항없이 true값을 받을 시에는
			if (loginResult)
				System.out.println("로그인 되었습니다");
		} catch (Exception e) {
			// 예외사항이 발생한 경우
			System.out.println("Error Message");
			// 예외사항 메세지를 출력
			System.out.println(e.getMessage());
		} finally {
			// 예외사항이 발생하든 안하든 실행
			System.out.println("귀여운 달소네 집");
		}
	}

	// 로그인 메소드
	static boolean login(String id, String password) throws Exception {

		// 서버로 정보 보내기를 안배웠으므로 밑에 변수로 환경설정

		// 여러가지 예외사항 설정
		// false 일 경우 Pass이므로 로그인 성공
		boolean networkFailed = false;
		boolean wrongId = false;
		boolean wrongPassword = false;
		boolean passwordExpired = false;
		// true에 걸릴 경우 각각의 변수에 맞추어서 예외메세지 설정
		if (networkFailed)
			throw new Exception("네트워크가 연결되지 않았습니다");
		else if (wrongId)
			throw new Exception("아이디가 존재하지 않습니다");
		else if (wrongPassword)
			throw new Exception("비밀번호가 잘못되었습니다");
		else if (passwordExpired)
			throw new Exception("비밀번호가 만기되었습니다");

		// 위에 모두 false여서 정보가 server에 모두 보내질 경우 true 값 반환
		return true;

	}

}
