package Hotemsample5;

public class main {
	public static void main(String[] args) throws Exception {
		Guest mike = new Guest("mike");
		Room one_bedroom1 = new Room(1001, 100.00, Room.roomType.ONE_BEDRM);
		Room two_bedroom1 = new Room(2001, 200.00, Room.roomType.TWO_BEDRM);
		one_bedroom1.setAvailable(true);
		two_bedroom1.setAvailable(true);
		System.out.println(one_bedroom1.isAvailable());
		mike.checkIn(one_bedroom1);
		one_bedroom1.setGuest(mike);
		mike.getRoomInfo(one_bedroom1);
	}
}
