package ShoppingMall3;

import java.text.NumberFormat;

public class Item6k {
	private String name;
	private double price;
	private int quantity;

	// -------------------------------------------------------
	// Create a new item with the given attributes.
	// -------------------------------------------------------
	public Item6k(String itemName, double itemPrice, int numPurchased) {
		name = itemName;
		price = itemPrice;
		quantity = numPurchased;
	}

	// -------------------------------------------------
	// Returns the name of the item
	// -------------------------------------------------
	public String getName() {
		return name;
	}

	// -------------------------------------------------
	// Returns the unit price of the item
	// -------------------------------------------------
	public double getPrice() {
		return price;
	}

	// -------------------------------------------------
	// Returns the quantity of the item
	// -------------------------------------------------
	public int getQuantity() {
		return quantity;
	}

	// -------------------------------------------------------
	// Return a string with the information about the item
	// -------------------------------------------------------
	@Override
	public String toString() {
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String strTab = name.length() > 8 ? "\t" : "\t\t";
		return name + strTab + fmt.format(price) + "\t\t" + quantity + "\t\t" + fmt.format(price * quantity);
	}

}
