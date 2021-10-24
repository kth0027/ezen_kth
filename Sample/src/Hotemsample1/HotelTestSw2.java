package Hotemsample1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HotelTestSw2 {
	public static void main(String[] args){
		
		int join; //객실 입력 값
		int choice; // 번호 입력값
		
		Scanner sc = new Scanner(System.in);
		HotelSw hsw = new HotelSw();
		
		System.out.println("호텔의 전체 객실수를 입력해주세요");
		join = sc.nextInt();
		
		hsw.CreateRoom(join);
		System.out.println("호텔의 객실수가 저장 됬습니다");
		
		while(true)
		{	
			System.out.println("1.입실예약    2.예약취소    3.객실 현황    4.종료");
			choice = sc.nextInt();
			
			switch(choice){
			case 1: // 예약(입실)
			{
				System.out.print("예약 하실 방을 입력해주세요 :");
				int jrc = sc.nextInt(); // 방 입력값 (Join Room Choice)
				
				System.out.print("예약하실 고객님의 이름을 입력하세요 :");
				String name = sc.next();
				hsw.JoinRoom(jrc, name);// 이름 입력값
				
				Scanner scan = new Scanner(System.in);
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				int otw = scan.nextInt();
				
				if(otw==2)
				{
					System.out.println("안녕히계십시오");
					return;
				}
				break;
			}
			case 2:
			{	
				System.out.print("예약 취소 하실 방을 입력해주세요 :");
				int orc = sc.nextInt(); //방 입력값(Out Room Choice)
				
				hsw.OutRoom(orc);
				
				Scanner scan1 = new Scanner(System.in);
				System.out.println("다른 업무를 보시겠습니까? 1.예   2.아니요");
				int otw1 = scan1.nextInt();
				
				if(otw1==2)
				{
					System.out.println("안녕히계십시오");
					return;
				}
				break;
			}
			case 3:
			{
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ 방 목록ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				hsw.LookRoom();
				break;
			}
			default :
			{
				if(choice == 4)
				{
					System.out.println("안녕히계십시오");
					return;
				}
			}
			}	
		}
	}	
}