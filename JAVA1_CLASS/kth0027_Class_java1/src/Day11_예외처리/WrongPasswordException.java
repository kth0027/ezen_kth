package Day11_예외처리;

//|| 확인문제 7

public class WrongPasswordException extends Exception {

	public WrongPasswordException() {}
	public WrongPasswordException(String message) {
		super(message);
	}
	
}
