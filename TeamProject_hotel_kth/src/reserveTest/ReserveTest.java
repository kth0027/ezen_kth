package reserveTest;

import java.util.Scanner;

import member.MemberVo;
import member.Member;
import member.MemberImpl;

public class ReserveTest {

	public static void main(String[] args) {
		String memInfo;
		String roomInfo;
		String resInfo;
		
		Scanner scanner = new Scanner(System.in);
		
		// 회원가입하기

		MemberVo memVo = new MemberVo("hong", "1234", "서울시 구로구", "010-1111-2222");
		Member member = new MemberImpl(); //업캐스팅
		member.regMember(memVo);

		memInfo=member.viewMember(memVo);
		((Base)member).displayData(memInfo);
		
		
	}
}
