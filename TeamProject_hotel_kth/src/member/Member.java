package member;

public interface Member {
	public void regMember (MemberVo vo); // 회원등록 메소드
	public String viewMember (MemberVo vo); // 회원정보 조회 메소드
	public void modMember (MemberVo vo); // 기존회원정보 수정 메소드
	public void delMember (MemberVo vo); // 기존회원 정보 삭제 메소드
}
