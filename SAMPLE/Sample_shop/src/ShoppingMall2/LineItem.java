package ShoppingMall2;

import java.util.*;

public class LineItem {
	private int[] itemCost = { 50, 25, 75, 100, 10 };
	private String[] productNames = { "Bananas", "Apples", "Oranges", "Grapefruits", "Cherries" };
	private int[] shoppingCartQuantity = new int[5];

	public lineItem(string[] productNames, int[] itemCost, int[] shoppingCartQuantity){
		this.itemCost = itemCost;
		this.productNames = productNames;
		this.shoppingCartQuantity = shoppingCartQuantity;
	}

	public int[] getShoppingCartQuantity() {
		return shoppingCartQuantity;
	}

	public int[] getItemCost() {
		return itemCost;
	}

	public String[] getProductNames() {
		return productNames;
	}
}
