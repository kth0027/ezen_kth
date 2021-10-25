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
		
		memData = "회원 아이디" + vo.id + ","+
				"회원 비번" + vo.password + ","+
				"회원 이름" + vo.name + ","+
				"회원 전화번호" + vo.phoneNum;
		
		DataUtill.encodeData(memData);
		
		System.out.println("회원 등록 시간:" + showTime() );
		System.out.println("회원 가입합니다.");
		
		
	}

	@Override
	public String viewMember(MemberVo vo) {
			memData = "회원 아이디:" + vo.id+","
					"회원 비번:" + vo.password+","
					"회원 이름:" + vo.name+","
					"회원 전화번호:" + vo.phoneNum;
			DataUtill.decodeDate(memdata);
			System.out.println("회원 조회시간:" + showTime() );
		return memData;
	}

	@Override
	public void modMember(MemberVo vo) {
		memData = "회원 아이디:" + vo.id+","
				"회원 비번:" + vo.password+","
				"회원 이름:" + vo.name+","
				"회원 전화번호:" + vo.phoneNum;
		DataUtill.decodeDate(memdata);
		System.out.println("회원 수정시간:" + showTime() );
		System.out.println("회원 정보를 수정합니다.");
		
	}

	@Override
	public void delMember(MemberVo vo) {
		memData = "회원 아이디:" + vo.id+","
				"회원 비번:" + vo.password+","
				"회원 이름:" + vo.name+","
				"회원 전화번호:" + vo.phoneNum;
		DataUtill.decodeDate(memdata);
		System.out.println("회원 삭제시간:" + showTime() );
		System.out.println("회원 정보를 삭제합니다.");
		
	}
	
	
}
