package domain;

public class Board {
	
	// 1. �ʵ����
	private int b_no;
	private String b_title;
	private String b_contents;
	private String b_write;
	private String b_date;
	private int view;
	
	
	// 2. ������
	
	public Board() {
		// TODO Auto-generated constructor stub
	}
	
	public Board(int b_no, String b_title, String b_contents, String b_write, String b_date, int view) {
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.b_write = b_write;
		this.b_date = b_date;
		this.view = view;
	}
	
	// �Խù� ��� ������
	public Board(String b_title, String b_contents, String b_write) {
		this.b_title = b_title;
		this.b_contents = b_contents;
		this.b_write = b_write;
	}

	
	


	
	
	
	// 3. �޼ҵ� ���� ( gitter / setter )
	
	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public String getB_contents() {
		return b_contents;
	}

	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}

	public String getB_write() {
		return b_write;
	}

	public void setB_write(String b_write) {
		this.b_write = b_write;
	}

	public String getB_date() {
		return b_date;
	}

	public void setB_date(String b_date) {
		this.b_date = b_date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
	
	
}