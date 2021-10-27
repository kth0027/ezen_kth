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

	public static String[] colors = { "���", "����", "����", "�׸�", "����", "ȭ��Ʈ" };
	public static String[] infoes = { "�µ��� ��� / �ٴٺ�", "ħ��� ��� / ����ƾ��", "�� 2��, ħ�� 3��, �˳��� ���� / ����ƾ��",
			"�ٶ����� �ִ� �ƴ��� ������ / �ٴٺ�", "�Ž�, ��, ��� 2��, �ٶ���, ���� ����Ʈ�� / �ٴٺ�", };

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
