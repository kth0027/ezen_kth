package member;

public interface Member {
	public void regMember (MemberVo vo); // ȸ����� �޼ҵ�
	public String viewMember (MemberVo vo); // ȸ������ ��ȸ �޼ҵ�
	public void modMember (MemberVo vo); // ����ȸ������ ���� �޼ҵ�
	public void delMember (MemberVo vo); // ����ȸ�� ���� ���� �޼ҵ�
}
