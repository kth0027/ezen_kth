package Shop2;

public class Cart {
	Goods goods;
	int count;
	int sum;

	public Goods getGoods() {
		return goods;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public Cart(Goods goods, int count) {
		// TODO Auto-generated constructor stub
		this.goods = goods;
		this.count = count;
		sum = count * goods.danga;
	}

	@Override
	public String toString() {
		return "Cart [Goods=" + goods + ", count=" + count + ", sum=" + sum + "]";
	}
}
