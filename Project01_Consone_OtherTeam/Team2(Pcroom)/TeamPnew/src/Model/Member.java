package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Member {
	private String id;
	private String pw;
	private String name;
	private String email;
	private int time ;
	private int money ;
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public Member(String id, String pw, String name, String email, int time, int money) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.time = time;
		this.money = money;
	}
	// �����͸� �о���� ���� ������(Date������ �о�� �� ���� �߻�)
	public Member(String id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}
	
	// �ð��� �ݾ��� ��Ÿ���� ���� ������
	public Member(int time, int money) {
		this.time = time;
		this.money = money;
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
}
