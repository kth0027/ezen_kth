package controller;

import model.Reply;

public class ReplyController {
	
	// �޼ҵ�
	
	// 1. ��� ����
	public static boolean add (int index, Reply reply) {
								// �Խù���ȣ, ��ۻ���
								// � �Խù��� ����� �߰��Ҳ���
		
		try {
			BoardController.boardlist.get(index).getReplylist().add(reply);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
