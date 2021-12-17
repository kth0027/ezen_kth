package Test5;

public class Container {
	int goodscode;
	String goodsname;
	int cnt;
	int amt;
	int totAmt;
	// 변수값 설정

	public Container(String goodsname, int goodscode, int cnt, int amt) {
		this.goodsname = goodsname;
		this.goodscode = goodscode;
		this.cnt = cnt;
		this.amt = amt;
		this.totAmt = cnt * amt;
	}

	Container() {
	} // 상품목록 작성 메소드 생성

	public int getGoodsCode() {
		return goodscode;
	}

	public void setGoodsCode(int goodscode) {
		this.goodscode = goodscode;
	}

	public String getGoodsName() {
		return goodsname;
	}

	public void setGoodsNmae(String goodsname) {
		this.goodsname = goodsname;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	public int getTotAmt() {
		return totAmt;
	}

	public void setTotAmt(int totAmt) {
		this.totAmt = totAmt;
	}
	// 각 인자에 대한 get,set 메소드 생성함.
}
