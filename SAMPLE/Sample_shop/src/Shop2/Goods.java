package Shop2;

import java.util.ArrayList;

public class Goods {
	int goodsNo; // ��ǰ�ڵ�
	String gName; // ��ǰ��
	int danga; // �ܰ�

	public int getGoodsNo() {
		return goodsNo;
	}

	public String getgName() {
		return gName;
	}

	public int getDanga() {
		return danga;
	}

	Goods(int goodsNo, String gName, int danga) {
		this.goodsNo = goodsNo;
		this.gName = gName;
		this.danga = danga;
	}

// ��ǰ����Ʈ ����� �޼���
	public String toString() {
		return getGoodsNo() + "\t" + getgName() + "\t" + getDanga();
	}
}
