package Hotemsample1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelSw {

	String[] room;
	
	int ho;
	int name;
	
	//πÊ ∏∏µÈ±‚ or ∞¥Ω«ºˆ ¿‘∑¬«œ±‚
	public void CreateRoom(int cr)
	{
		room = new String[cr];
	}
	
	//»£Ω« øπæ‡«œ±‚ or ¿‘Ω««œ±‚
	public void JoinRoom(int jr,String name)
	{	
		 Pattern pt = Pattern.compile("^[∞≤-¡K-Éâ-∆R-Ç†-¡K-Åπ-¬m-ÅÔ-√P-ÇD-√l-∞”-√P-Å‡-¬û]*$");
		 Matcher match = pt.matcher(name);
		
		 if(name.trim().equals("") || !match.matches())
		 {
			 System.out.println("¿Ã∏ß¿ª ¿‘∑¬«ÿ¡÷º≈æﬂ øπæ‡¿Ã ∞°¥…«’¥œ¥Ÿ.");
   			 return;
		 }
		 else if(room[jr-1] != null) 
		 {
			System.out.println("«ˆ¿Á øπæ‡µ» ∞¥Ω«¿‘¥œ¥Ÿ. »Æ¿Œ »ƒ ¥ŸΩ√ øπæ‡ ∫Œ≈πµÂ∏≥¥œ¥Ÿ.");
			return;
		 }
		 room[jr-1] = name + "¥‘¿Ã øπæ‡«œºÃΩ¿¥œ¥Ÿ.";
		 System.out.println(name + "¥‘  "+ jr + "»£Ω«ø° " + "øπæ‡µ«ºÃΩ¿¥œ¥Ÿ.");
	}

	//øπæ‡ √Îº“«œ±‚ or ≈Ω««œ±‚
	public void OutRoom(int or)
	{
		if(room[or - 1] == null)
		{
			System.out.println("«ˆ¿Á πÊ¿Ã øπæ‡µ«¿÷¡ˆ æ Ω¿¥œ¥Ÿ.");
			return;
		}
		room[or-1] = null;
		System.out.println("øπæ‡ √Îº“ µ«ºÃΩ¿¥œ¥Ÿ.");
	}
	
	//πÊ ∏Ò∑œ ∫∏ø©¡÷±‚
	public void LookRoom()
	{
		for(int cr = 0; cr < room.length; cr++) {
			if (room[cr] == null)
				System.out.println((cr+1) + "»£Ω« ----> " + "∫ÒæÓ¿÷¿Ω");
			else
				System.out.println((cr + 1) + "»£Ω« ----> " + room[cr]);
		}
	}
	
	
}
