package Test3;

public class Goods {
	long code;
	String name;
	double price;
	long count;

	Goods(long code, String name, double price, long count) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	

	public void setCount(long count) {
		this.count = count;
	}

	public double TotalPrice() {
		return price * count;
	}

	public String toString() {
		return this.code + "\t" + this.name + "\t" + this.price + "\t" + this.count + "\t" + this.TotalPrice();
	}
}
