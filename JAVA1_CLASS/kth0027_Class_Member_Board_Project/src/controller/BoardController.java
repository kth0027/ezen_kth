package controller;

import java.util.ArrayList;

import database.File;
import model.Board;

public class BoardController {

	// 1. �ʵ�
	public static ArrayList<Board> boardlist = new ArrayList<>();
	// static ������쿡 �ش� �ʵ� ȣ��� [ BoardController ��ü ���� ]
	// static ������� �ش� �ʵ� �ٷ�ȣ�� ����

	// 2. �޼ҵ�
	// �Խù� ��� �޼ҵ�
	public static boolean add(Board board) {
		
		// 1. ����Ʈ ��� 
		boardlist.add(board);
		// 2. ����ó�� 
		File.filesave(2);
		return true; // ��� ������
	}

	// �Խù� ��������[��ȸ] �޼ҵ�
	public static Board detail(int index) {

		Board board = boardlist.get(index);
		
		return board; // �˻��� �Խù� ��ȯ
	}

	// �Խù� ���� �޼ҵ�
	public static boolean delete(int index) {
		return true;
	}

	// �Խù� ���� �޼ҵ�
	public static boolean update(int index, String title, String contents) {
		return true;
	}

}
