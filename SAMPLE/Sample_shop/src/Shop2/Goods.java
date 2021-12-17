package Shop2;

import java.util.ArrayList;

public class Goods {
	int goodsNo; // 상품코드
	String gName; // 상품명
	int danga; // 단가

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

// 상품리스트 출력할 메서드
	public String toString() {
		return getGoodsNo() + "\t" + getgName() + "\t" + getDanga();
	}
}
