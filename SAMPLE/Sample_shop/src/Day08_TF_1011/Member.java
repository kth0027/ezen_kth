package Day08_TF_1011;

import java.util.Scanner;

public class Member {
	
	// 1. �ʵ� [���̵�, ��й�ȣ, �̸�, ����ó]
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String cart;
	
	// 2. ������
		// 2-1. ������ : �ڵ��ϼ�
	public Member(String id, String pw, String name, String tel, String cart) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.cart = cart;
	}
	
		// 2-2. �������
	public Member() {

	}

	
	
	// 3. �޼ҵ�
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCart() {
		return cart;
	}

	public void setCart(String cart) {
		this.cart = cart;
	}
	


	
	

}
