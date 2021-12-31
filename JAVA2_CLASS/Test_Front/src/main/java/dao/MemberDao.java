package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Member;

public class MemberDao {

	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;

	// 2. 생성자
	public MemberDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testmember?serverTimezone=UTC", "root", "1234");

		} catch (Exception e) {
			System.out.println("[연동 실패]");
		}
	}

	public static MemberDao memberDao = new MemberDao(); 

	public static MemberDao getmemberDao() {
		return memberDao;
	} //


	// 1. 회원가입 메소드
	public boolean membersignup(Member member) {

		String sql = "insert into member (test_id, test_password, test_name, test_email, test_address, test_phone) values (?, ?, ?, ?, ?, ?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getTest_id());
			ps.setString(2, member.getTest_password());
			ps.setString(3, member.getTest_name());
			ps.setString(4, member.getTest_email());
			ps.setString(5, member.getTest_address());
			ps.setString(6, member.getTest_phone());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

	// 아이디 체크 메소드
	public boolean idcheck(String userid) {

		String sql = "select test_id from member where test_id = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, userid);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			} // 아이디 존재함
		} catch (Exception e) {
		}
		return false; // 아이디 존재하지 않음
	}

	// 로그인 체크 메소드
	public boolean login(String id, String password) {
		String sql = "select * from member where test_id =? and test_password = ? ";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}

	// 회원번호 검색 메소드
	public int getmembernum(String id) {

		String sql = "select test_num from member where test_id=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (Exception e) {
		}
		return 0;
	}

}
