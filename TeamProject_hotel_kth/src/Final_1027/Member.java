package Final_1027;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Member {

	// 1. 필드
	private String h_id;
	private String h_pw;
	private String h_name;
	private String h_phone;

	// 2. 생성자
	public Member() {

	}

	public Member(String h_id, String h_pw, String h_name, String h_phone) {
		super();
		this.h_id = h_id;
		this.h_pw = h_pw;
		this.h_name = h_name;
		this.h_phone = h_phone;
	}

	// 3. 메소드

	public String getH_id() {
		return h_id;
	}

	public void setH_id(String h_id) {
		this.h_id = h_id;
	}

	public String getH_pw() {
		return h_pw;
	}

	public void setH_pw(String h_pw) {
		this.h_pw = h_pw;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getH_phone() {
		return h_phone;
	}

}