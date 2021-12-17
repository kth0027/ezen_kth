package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import controller.boardcontroller.ReplywriteController;
import domain.Board;
import domain.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;

public class BoardDao {

	// 1. �ʵ� /
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	//��ü 
	private static BoardDao boardDao = new BoardDao();
	
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://goldcon2.hopto.org:3309/ezen?serverTimezone=UTC",  
					"root" , "1234");
			System.out.println(" db ���� ����");
		}
		catch (Exception e) {
			System.out.println(" * DB ���� ���� : " + e);
		}
	}
	// ��ü ��ȯ �޼ҵ� 
	public static BoardDao getboardDao() {return boardDao;}
	
	// Q&A(board2) �Խù� ��� �޼ҵ�
	public boolean board2write(Board board) {
		String sql = "insert into Board(b_title, b_contents, m_num, b_type, c_num) values(?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contents());
			preparedStatement.setInt(3, board.getM_num());  // ��� �ѹ��� ��ȸ�� ���̵� ã�ƾߵ� 
			preparedStatement.setString(4, "2");
			preparedStatement.setInt(5, 1);
			preparedStatement.executeUpdate();
			return true;
			
		}catch (Exception e) {System.out.println("�������");	}
		return false;
	}
	
	
	// ��������(board1) �Խù� ��� �޼ҵ�
	public boolean board1write(Board board) {
		String sql = "insert into Board(b_title, b_contents, m_num, b_type, c_num) values(?,?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contents());
			preparedStatement.setInt(3, board.getM_num());  // ��� �ѹ��� ��ȸ�� ���̵� ã�ƾߵ� 
			preparedStatement.setString(4, "1");
			preparedStatement.setInt(5, 1);
			preparedStatement.executeUpdate();
			return true;
			
		}catch (Exception e) {
			
		}
		return false;
	}
	
		//  �Խù� ��� �޼ҵ� 
	public boolean write(Board board) {
		String sql = "insert into Board(b_title, b_contents, b_num, c_num) values(?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contents());
			preparedStatement.setInt(3, board.getM_num());  // ��� �ѹ��� ��ȸ�� ���̵� ã�ƾߵ� 
			preparedStatement.setInt(4, board.getC_num());  // ī �ѹ��� ��ȸ �� �ڵ��� ��ƾߵ� 
			preparedStatement.executeUpdate();
			return true;
			
		}catch (Exception e) {
			
		}
		return false;
	}
	// ��������(borad1) �Խù� ��ȸ 
	public ObservableList<Board> board1list(){
		ObservableList<Board> boards1 = FXCollections.observableArrayList();
		
		String sql = "select * from Board where b_type = 1 order by b_num desc";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			
			while( resultSet.next()) {
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getInt(5));
				
				boards1.add(board);
			}
			return boards1;
		} catch (Exception e) {} return boards1;
		
	}
	// Q&A(borad2) �Խù� ��ȸ 
		public ObservableList<Board> board2list(){
			ObservableList<Board> boards2 = FXCollections.observableArrayList();
			
			String sql = "select * from Board where b_type = 2 order by b_num desc";
			
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				
				while( resultSet.next()) {
					Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)
							, resultSet.getInt(5), resultSet.getString(6),resultSet.getInt(7),resultSet.getInt(8));
					boards2.add(board);
				}
				return boards2;
			} catch (Exception e) {} return boards2;
			
		}
	
		// �Խù� ��ȸ �޼ҵ� 
	public ObservableList<Board> boardlist( ){
		
		ObservableList<Board> boards = FXCollections.observableArrayList();
		
		// 0 . ����Ʈ ���� 
		ArrayList<Board> arrayList = new ArrayList<Board>();
		
		// 1. ���� ���� ��� �������� 
		/*int b_num, String b_title, String b_contents, String b_date, int b_view, int b_type, int m_num, int c_num)*/
		String sql = "select * from Board order by b_no desc"; // ���� ������ �ش� ���� desc �� ������������ �������°�
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			// 2. 
			while(resultSet.next()){
				// ���� ����� ���ڵ尡 ������ ���� �ݺ� 
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)
						, resultSet.getInt(5), resultSet.getString(6),resultSet.getInt(7),resultSet.getInt(8));
				// ��ü�� ����Ʈ�� ��� 
				boards.add(board);	
			}
			return boards;
		}catch (Exception e) {} return boards;    //��ü���� board���� ������ boards�� ��ȯ 
	}

	// �Խù� ���� �޼ҵ�  // �μ����� no�� �ִ� ���� ? sql ���ǹ��� no�� ��ȸ�� �Ͽ� �����ϱ� ����
	public boolean viewdelete( int b_no ) {
		// ������ �� Ȯ���ؾߵ� ????????????????????????????????????????????????????????????????????????????????!!
		// �Խù� ������ ��ۿ� ���� ���� ���� db�� ��������ߵ� ������� ������ �� ���ٰ�!!(11_15���� �������� �ȵǾ����� 16�� ���ͽ� �ۼ��� ��)
		String sql = "delete from Board where b_no = ?";  
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_no); 
			preparedStatement.executeUpdate(); // sql ����
			return true;
		} catch (Exception e) {
			
		}return false;
		
	}
	
	// �Խù� ���� �޼ҵ� 
	public boolean update(int b_no, String b_title, String b_contents) {
		
		// board ���̺� ��ȣ�� ���� �������� ã�Ƽ� ������Ʈ�� �ϴ� ���� 
		String sql = "update Board set b_title =?, b_contents =? where b_no = ?"; // ������Ʈ 
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(3, b_no);
			preparedStatement.setString(1, b_title);
			preparedStatement.setString(2, b_contents);
			preparedStatement.executeUpdate(); // sql ����
			return true;
		} catch (Exception e) {
			
		}return false;
	}
	
	public String getmid (int m_num) {
		String sql = "select m_id from Member where m_num = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, m_num);
			resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				
				return resultSet.getString(1);
			}else {
				return "";
			}
		} catch (Exception e) {} return "";
	}
	
	// ��۵�� �޼ҵ�
	public boolean replywrite( Reply reply ) {
		
		String sql = "insert into Reply(br_contents, b_num, m_num) values(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, reply.getBr_contents());
			preparedStatement.setInt(2, reply.getb_num());
			preparedStatement.setInt(3, reply.getM_num());
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {}return false;
	}
	
	//��� ����Ʈ
	public ObservableList<Reply> replylist(int b_num) {
		
		ObservableList<Reply> replys = FXCollections.observableArrayList();
		String sql = "select * from Reply where b_num = ? order by br_num desc";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_num);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				
				Reply reply = new Reply(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4), resultSet.getInt(5));
				replys.add(reply);
			}
			return replys;
		} catch (Exception e) {} return replys;
	}
	// ��ȸ�� ������Ʈ
	public boolean viewupdate( int b_num) {
		
		String sql = "update Board set b_view = b_view+1 where b_num = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_num);
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return false;
	}
	// �Խ���2 ����
	public boolean board2update(int b_num, String b_title, String b_contents) {
		
		String sql = "update Board set b_title = ?, b_contents = ?, where b_num = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, b_title);
			preparedStatement.setString(2, b_contents);
			preparedStatement.setInt(3, b_num);
			return true;
		} catch (Exception e) {} return false;
		
	}
	// �Խ���2 ����
	public boolean boarddelete(int b_num) {
		
		String sql = "delete from Board where b_num = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_num);
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {} return false;
	}
	// ������ ���� ���� �ѹ� �� ����� ������ �ѹ� ��ȸ 
	public ObservableList<Board> write3( int m_num ) {
		
		ObservableList<Board> boards = FXCollections.observableArrayList();
		
		String sql = "select Resevation.r_num, Car.c_name"
				+ " from Resevation join Car "
				+ "on Resevation.c_num = Car.c_num where m_num = ?";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, m_num);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				// ���� ����� ���ڵ尡 ������ ���� �ݺ� 
				Board board = new Board(resultSet.getInt(1), 
								  resultSet.getString(2)
				);
				System.out.println( board );
				boards.add(board);
			}
			System.out.println("����� �ǽó���??1");
			return boards;
		}
		catch (Exception e) {
			
		} return boards;
		
		
	}
	

	//myinfo QnA ���
	public ObservableList<Board> myinfoboard2list(int m_num){
		ObservableList<Board> boards2 = FXCollections.observableArrayList();
		
		String sql = "select * from Board where b_type = 2 and m_num = ? order by b_num desc";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, m_num);
			resultSet = preparedStatement.executeQuery();
			
			while( resultSet.next()) {
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)
						, resultSet.getInt(5), resultSet.getString(6),resultSet.getInt(7),resultSet.getInt(8));
				boards2.add(board);
			}
			return boards2;
			
		} catch (Exception e) {
			System.out.println(e.toString());
		} return boards2;
	}
	
	public int b_numcount() {

		String sql = "SELECT count(*) FROM ezen.Board;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				return resultSet.getInt(1);
			}
		} catch (Exception e) {
		}
		return 0;

	}
	
	
	
}
