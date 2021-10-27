package 보완할점;

public class rooms {
	
	String 방타입;
	private String 예약자ID;
	public rooms(String 방타입) {
		
		this.방타입 = 방타입;
		this.예약자ID = null;
		
	}
	public String get방타입() {
		return 방타입;
	}
	public void set방타입(String 방타입) {
		this.방타입 = 방타입;
	}
	public String get예약자ID() {
		return 예약자ID;
	}
	public void set예약자ID(String 예약자id) {
		예약자ID = 예약자id;
	}
	
	
	
	
	
	
	
}
