package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import controller.BoardController;
import controller.MemberController;
import model.Member;
import model.Board;

public class File {

		// �ʵ�
			// 1. ȸ�������� �����ϴ������� ���
		private static String memberpath 
		= "C:/Users/505/git/ezen_kth/Member_Board_Project/src/database/memberlist.txt";
		
		private static String boardpath 
		= "C:/Users/505/git/ezen_kth/Member_Board_Project/src/database/boardlist.txt";
		
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		// ���� �޼ҵ�
		public static boolean filesave(int type) {
			// static �� ���ָ� ��ü ȣ�� ���� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
			// type : 1.ȸ������ 2. �Խù����� 3. �������

			try { // ����ó��
				FileOutputStream fileOutputStream = null; // ����
				if (type == 1) { // ȸ������
					// 1. ���ϰ�ü�� ��� ����
					fileOutputStream = new FileOutputStream(memberpath);
					// 2. �ݸ��� �̿��� ȸ������Ʈ���� �ϳ��� ȸ�� ��������
					for (Member member : MemberController.memberlist) {
						// 3. �� ȸ������ �ʵ�[,]�� ȸ��[/n] ����
						String outstring = member.getId() + "," + member.getPassword() + "," + member.getName() + ","
								+ member.getEmail() + "," + member.getPoint() + "\n";

						// 4. ����Ʈ�� ��������
						fileOutputStream.write(outstring.getBytes());
					} // for�� ����

					// 5. ��Ʈ�� ����� �ʱ�ȭ
					fileOutputStream.flush(); // ���ϸ���Ʈ �� �����ϴ� ����Ʈ ����
					fileOutputStream.close(); // ���Ͻ�Ʈ�� �ݱ�

					return true; // ���� ó�� ����
				}
				
				if( type == 2 ) {
					
					fileOutputStream = new FileOutputStream( boardpath );
					for( Board board : BoardController.boardlist ) {
						String outstring = board.getTitle()+","+board.getContents()+","+
											board.getWriter()+","+board.getDate()+","+
											board.getView()+"\n";
						fileOutputStream.write( outstring.getBytes() );
					}
					fileOutputStream.flush();
					fileOutputStream.close(); 
					return true;
			
				}
				
				if( type == 3 ) {}

			} catch (Exception e) {
				System.out.println(" [�˸�] : ���� ���� ���� �߻� [�����ڿ��� ����] ");
			}

			return false; // ����ó�� ����
		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		// �ڡڡڡڡڡڡڡڡڡ� ��Ʈ���� byte ������ �ۼ����Ѵ�!!!!
		
		// �ҷ����� �޼ҵ�
		public static boolean fileload (int type) {
				// fileload ��ü�������� ȣ���ϱ� ���� static 
			
				try { // t s // ����ó�� �ϴ� ����???

					FileInputStream fileInputStream = null;

					if (type == 1) {
						// 1. �Է½�Ʈ�� ��� ����
						fileInputStream = new FileInputStream(memberpath);

						// 2. ��Ʈ�� (����:����Ʈ) ����Ʈ�迭 ����
						byte[] bytes = new byte[10000]; // 10kb ����

						// 3. �Է½�Ʈ������ ����Ʈ �о�ͼ� �迭�� ����
						fileInputStream.read(bytes);

						// 4. ����Ʈ �迭 -> ���ڿ� ��ȯ
						String insString = new String(bytes);

						// 5. ȸ�� �и��ϱ� \n
						String[] members = insString.split("\n"); // \n ���н� ����ȸ�� �߰�

						// 6. �ݺ����� �̿��� ȸ���� �ʵ� �и��ϱ� ,
						for (int i = 0; i < members.length - 1; i++) { // -1 : ����ȸ�� ����
							// 7. ȸ���� �ʵ� �и�
							String[] field = members[i].split(",");
							// 8. �и��� �ʵ带 ��üȭ [ point�ʵ�� int������ ��ȯ : String -> Int ( Integer.parseInt ) ]
							Member member = new Member(field[0], field[1], field[2], field[3],
									Integer.parseInt(field[4]));
							// 9. �� ��ü�� ����Ʈ�� ����
							MemberController.memberlist.add(member);
						}
						fileInputStream.close(); // ��Ʈ�� �ݱ�
						return true; // ���� �ҷ����� ����
					}

					if (type == 2) {
						fileInputStream = new FileInputStream(boardpath); // 1. ���ϰ��
						byte[] bytes = new byte[10000]; // 10kb ���� // 2. ���Ͽ뷮
						fileInputStream.read(bytes); // 3. ���� �б�
						String instring = new String(bytes); // 4. ���ڿ� ��ȯ
						String[] boards = instring.split("\n"); // 5. �Խù� \n ����

						for (int i = 0; i < boards.length - 1; i++) { // 6. -1 : ������ �Խù� ����
							String[] field = boards[i].split(",");
							Board board = new Board(field[0], field[1], field[2], field[3], Integer.parseInt(field[4]));
							BoardController.boardlist.add(board);
						}

						fileInputStream.close(); // ��Ʈ�� �ݱ�
						return true; // ���� �ҷ����� ����

					}
					if (type == 3) {
					}

				} catch (Exception e) {
					System.out.println( " [�˸�] : ���� �ҷ����� ���� �߻� [ �����ڿ��� ���� ] " + e );
			} // t e

			return false; // �ε� ���� ��	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
} // C E 
