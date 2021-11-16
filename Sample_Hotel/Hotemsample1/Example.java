package Hotemsample1;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Example {
	public static void main(String[] args) throws Exception {
		File file = new File("../room.txt");

		if (file.canRead() && file.exists()) {
			FileReader reader = new FileReader(file);
			int len = reader.read() - '0';
			char[] data = new char[200];
			int idx = 2;
			int start;
			Room[] rooms = new Room[len];
			String temp = null;
			StringTokenizer st = null;
			String keyword;
			Scanner scanner = new Scanner(System.in);
			List<Room> result = new ArrayList<Room>();

			while (reader.read(data) != -1)
				;

			for (int i = 0; i < len; i++) {
				temp = null;

				start = idx;
				while ((data[idx++] != '\r'))
					;

				temp = new String(data, start, (--idx - start));
				idx += 2;

				st = new StringTokenizer(temp, " ");
				while (st.hasMoreTokens()) {
					rooms[i] = new Room(Room.colors[Integer.parseInt(st.nextToken())], st.nextToken() + "원",
							st.nextToken() + "평", st.nextToken() + "명", st.nextToken() + "개", st.nextToken() + "개",
							st.nextToken() + "개", Room.infoes[Integer.parseInt(st.nextToken())]);
				}

				System.out.println(rooms[i].getColor() + " " + rooms[i].getPrice() + " (" + rooms[i].getArea()
						+ ") 최대인원 " + rooms[i].getMax() + ", 방 " + rooms[i].getRooms() + " 침대 " + rooms[i].getBeds()
						+ " 화장실 " + rooms[i].getBathrooms() + "\n\t" + rooms[i].getInfo());

			}

			do {
				System.out.print(">> ");
				keyword = scanner.nextLine();
			} while (keyword.contains("end"));

			st = new StringTokenizer(keyword, " ");
			while (st.hasMoreTokens()) {
				keyword = st.nextToken();

				for (int i = 0; i < len; i++) {
					if (keyword.equals(rooms[i].getColor()) || keyword.equals(rooms[i].getPrice())
							|| keyword.equals(rooms[i].getArea()) || keyword.equals(rooms[i].getMax())
							|| keyword.equals(rooms[i].getRooms()) || keyword.equals(rooms[i].getBeds())
							|| keyword.equals(rooms[i].getBathrooms()) || rooms[i].getInfo().contains(keyword)) {
						if (!result.contains(rooms[i])) {
							result.add(rooms[i]);
						}
					}
				}
			}

			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i).getColor() + " " + result.get(i).getPrice() + " ("
						+ result.get(i).getArea() + ") 최대인원 " + result.get(i).getMax() + ", 방 "
						+ result.get(i).getRooms() + " 침대 " + result.get(i).getBeds() + " 화장실 "
						+ result.get(i).getBathrooms() + "\n\t" + result.get(i).getInfo());
			}

			reader.close();
			scanner.close();
		}
	}
}
