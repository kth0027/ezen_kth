package member;

import base.Base;

public class MemberImpl extends Base implements Member{

	String memData;

	
	
	@Override
	public void regMember(MemberVo vo) {
//		memData = vo.id+","+
//				vo.name+","+
//				vo.password+","+
//				vo.phoneNum;
		
		memData = "ȸ�� ���̵�" + vo.id + ","+
				"ȸ�� ���" + vo.password + ","+
				"ȸ�� �̸�" + vo.name + ","+
				"ȸ�� ��ȭ��ȣ" + vo.phoneNum;
		
		DataUtill.encodeData(memData);
		
		System.out.println("ȸ�� ��� �ð�:" + showTime() );
		System.out.println("ȸ�� �����մϴ�.");
		
		
	}

	@Override
	public String viewMember(MemberVo vo) {
			memData = "ȸ�� ���̵�:" + vo.id+","
					"ȸ�� ���:" + vo.password+","
					"ȸ�� �̸�:" + vo.name+","
					"ȸ�� ��ȭ��ȣ:" + vo.phoneNum;
			DataUtill.decodeDate(memdata);
			System.out.println("ȸ�� ��ȸ�ð�:" + showTime() );
		return memData;
	}

	@Override
	public void modMember(MemberVo vo) {
		memData = "ȸ�� ���̵�:" + vo.id+","
				"ȸ�� ���:" + vo.password+","
				"ȸ�� �̸�:" + vo.name+","
				"ȸ�� ��ȭ��ȣ:" + vo.phoneNum;
		DataUtill.decodeDate(memdata);
		System.out.println("ȸ�� �����ð�:" + showTime() );
		System.out.println("ȸ�� ������ �����մϴ�.");
		
	}

	@Override
	public void delMember(MemberVo vo) {
		memData = "ȸ�� ���̵�:" + vo.id+","
				"ȸ�� ���:" + vo.password+","
				"ȸ�� �̸�:" + vo.name+","
				"ȸ�� ��ȭ��ȣ:" + vo.phoneNum;
		DataUtill.decodeDate(memdata);
		System.out.println("ȸ�� �����ð�:" + showTime() );
		System.out.println("ȸ�� ������ �����մϴ�.");
		
	}
	
	
}
