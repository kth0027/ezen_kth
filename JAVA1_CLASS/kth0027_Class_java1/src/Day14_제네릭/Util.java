package Day14_제네릭;

public class Util {

	public static <T> Box<T> boxing(T t){
					// <제네릭> 변환타입 메소드명(인수)
		Box<T>box = new Box<>();
		box.setT(t);
		return box;
		
	}
}
