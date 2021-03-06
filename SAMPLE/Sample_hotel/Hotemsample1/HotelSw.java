package Hotemsample1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelSw {

	String[] room;
	
	int ho;
	int name;
	
	//방 만들기 or 객실수 입력하기
	public void CreateRoom(int cr)
	{
		room = new String[cr];
	}
	
	//호실 예약하기 or 입실하기
	public void JoinRoom(int jr,String name)
	{	
		 Pattern pt = Pattern.compile("^[갛-핳-깋-힣-궇-핳-겧-헿-곻-홓-괗-홯-겋-홓-곟-혷]*$");
		 Matcher match = pt.matcher(name);
		
		 if(name.trim().equals("") || !match.matches())
		 {
			 System.out.println("이름을 입력해주셔야 예약이 가능합니다.");
   			 return;
		 }
		 else if(room[jr-1] != null) 
		 {
			System.out.println("현재 예약된 객실입니다. 확인 후 다시 예약 부탁드립니다.");
			return;
		 }
		 room[jr-1] = name + "님이 예약하셨습니다.";
		 System.out.println(name + "님  "+ jr + "호실에 " + "예약되셨습니다.");
	}

	//예약 취소하기 or 퇴실하기
	public void OutRoom(int or)
	{
		if(room[or - 1] == null)
		{
			System.out.println("현재 방이 예약되있지 않습니다.");
			return;
		}
		room[or-1] = null;
		System.out.println("예약 취소 되셨습니다.");
	}
	
	//방 목록 보여주기
	public void LookRoom()
	{
		for(int cr = 0; cr < room.length; cr++) {
			if (room[cr] == null)
				System.out.println((cr+1) + "호실 ----> " + "비어있음");
			else
				System.out.println((cr + 1) + "호실 ----> " + room[cr]);
		}
	}
	
	
}
