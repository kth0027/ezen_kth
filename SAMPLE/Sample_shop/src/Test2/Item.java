package Test2;

import java.util.ArrayList;
import java.util.List;

public class Item {
	ShoppingCart cart;

	public void CartSelection() {
		CartItem items = new CartItem("Parcel", 12, "Italy", true, 10.00);
		cart.AddItem(items);
	}
}
