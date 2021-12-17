package Day13_멀티스레드;

public class Product<T , M > {
	private T kind; 	// TV
	private M model;	// String

	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	
}
