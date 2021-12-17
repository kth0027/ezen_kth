package Day08_TF_1011;

import java.util.Scanner;

public class Member {
	
	// 1. 필드 [아이디, 비밀번호, 이름, 연락처]
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String cart;
	
	// 2. 생성자
		// 2-1. 생성자 : 자동완성
	public Member(String id, String pw, String name, String tel, String cart) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.cart = cart;
	}
	
		// 2-2. 빈생성자
	public Member() {

	}

	
	
	// 3. 메소드
	
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
