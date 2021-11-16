package Hotemsample1;

public class Room {
	private String color;
	private String price;
	private String area;
	private String max;
	private String rooms;
	private String beds;
	private String bathrooms;
	private String info;

	public static String[] colors = { "블루", "퍼플", "레드", "그린", "브라운", "화이트" };
	public static String[] infoes = { "온돌과 욕실 / 바다뷰", "침대방 욕실 / 마운틴뷰", "방 2개, 침실 3개, 넉넉한 공간 / 마운틴뷰",
			"다락방이 있는 아늑한 분위기 / 바다뷰", "거실, 방, 욕실 2개, 다락방, 넓은 스위트룸 / 바다뷰", };

	public Room(String color, String price, String area, String max, String rooms, String beds, String bathrooms,
			String info) {
		this.color = color;
		this.price = price;
		this.area = area;
		this.max = max;
		this.rooms = rooms;
		this.beds = beds;
		this.bathrooms = bathrooms;
		this.info = info;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getBeds() {
		return beds;
	}

	public void setBed(String beds) {
		this.beds = beds;
	}

	public String getBathrooms() {
		return bathrooms;
	}

	public void setBathrooms(String bathrooms) {
		this.bathrooms = bathrooms;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
