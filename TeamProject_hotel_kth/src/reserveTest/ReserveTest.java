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
		
		// ȸ�������ϱ�

		MemberVo memVo = new MemberVo("hong", "1234", "����� ���α�", "010-1111-2222");
		Member member = new MemberImpl(); //��ĳ����
		member.regMember(memVo);

		memInfo=member.viewMember(memVo);
		((Base)member).displayData(memInfo);
		
		
	}
}
