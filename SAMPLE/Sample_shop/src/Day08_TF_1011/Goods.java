package Day08_TF_1011;

import java.util.Scanner;

public class Goods {

	// 1. �ʵ� [��ǰ��ȣ, ��ǰ�̸�, ��ǰ����, ��ǰ����]
	private int g_numer;
	private String g_name;
	private int g_price;
	private int g_remain;

	// 2. ������

	// 2-1. ��ǰ ���
	public Goods(int g_numer, String g_name, int g_price, int g_remain) {
		this.g_numer = g_numer;
		this.g_name = g_name;
		this.g_price = g_price;
		this.g_remain = g_remain;
	}

	// 2-2. �������
	public Goods() {

	}

	// 3. �޼ҵ�
	
	// 3-2. ���ǵ�� �޼ҵ�
	
	// 3-3. ���Ǹ�� �޼ҵ�
	
	// 3-4. �����Ǹ� �޼ҵ�
	
	// 3-5. ����ȯ�� �޼ҵ�

	// 3-1. �ʵ尡 private ���� => get ,set �޼ҵ�
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
