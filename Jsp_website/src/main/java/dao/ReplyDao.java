package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Reply;

public class ReplyDao { // C S
	// 1. 자주 사용하는 인터페이스
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;

	// 2. 생성자
	public ReplyDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp?serverTimezone=UTC", "root", "1234");

		} catch (Exception e) {
			System.out.println("[연동 실패]");
		}
	}

	public static ReplyDao replyDao = new ReplyDao(); // 3. Dao 객체 생성

	public static ReplyDao getreplydao() {
		return replyDao;
	} // 4. Dao 객체 반환

	// 댓글 작성 메소드

	public boolean replywrite(Reply reply) {
		String sql = " insert into reply (r_contents, m_num, b_num) values(? , ? , ?)";

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, reply.getR_contents() );
			ps.setInt(2, reply.getM_num() );
			ps.setInt(3, reply.getB_num() );
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
	
	// 댓글 삭제 메소드

} // C E
