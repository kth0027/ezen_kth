package Day08_TF_1011;

import java.util.Scanner;

public class Goods {

	// 1. 필드 [상품번호, 상품이름, 상품수량, 상품가격]
	private int g_numer;
	private String g_name;
	private int g_price;
	private int g_remain;

	// 2. 생성자

	// 2-1. 제품 등록
	public Goods(int g_numer, String g_name, int g_price, int g_remain) {
		this.g_numer = g_numer;
		this.g_name = g_name;
		this.g_price = g_price;
		this.g_remain = g_remain;
	}

	// 2-2. 빈생성자
	public Goods() {

	}

	// 3. 메소드
	
	// 3-2. 물건등록 메소드
	
	// 3-3. 물건목록 메소드
	
	// 3-4. 물건판매 메소드
	
	// 3-5. 물건환불 메소드

	// 3-1. 필드가 private 사용시 => get ,set 메소드
	public int getG_numer() {
		return g_numer;
	}

	public void setG_numer(int g_numer) {
		this.g_numer = g_numer;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public int getG_price() {
		return g_price;
	}

	public void setG_price(int g_price) {
		this.g_price = g_price;
	}

	public int getG_remain() {
		return g_remain;
	}

	public void setG_remain(int g_remain) {
		this.g_remain = g_remain;
	}

}
