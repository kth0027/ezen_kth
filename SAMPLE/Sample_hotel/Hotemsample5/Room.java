package Hotemsample5;

public class Room {
	public enum roomType {
		ONE_BEDRM, TWO_BEDRM, THREE_BEDRM, PENTHOUSE
	}

	private boolean available;
	private Guest occupant;
	private int roomNum;
	private double price;
	private roomType type;

	public Room(int roomNum, double price, roomType type) {
		this.roomNum = roomNum;
		this.price = price;
		this.type = type;
	}

	public boolean isAvailable() {
		return this.available;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public roomType getRoomType() {
		return type;
	}

	public void setRoomType(roomType type) {
		this.type = type;
	}

	public int getRoomNumber() {
		return roomNum;
	}

	public void setRoomNumber(int roomNum) {
		this.roomNum = roomNum;
	}

	public Guest getGuest() {
		return occupant;
	}

	public void setGuest(Guest occupant) {
		this.occupant = occupant;
	}
}
