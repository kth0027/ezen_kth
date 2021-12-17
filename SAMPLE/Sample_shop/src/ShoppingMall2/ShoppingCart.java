package ShoppingMall2;
import java.util.*;
public class ShoppingCart {
	private int totalCost = 0;

	public ShoppingCart(int totalCost){
		this.totalCost = totalCost;
	}
	//Method to display the contents and quantity of the cart
	public void getCartDisplay(int[] shoppingCartQuantity, String[] productNames){
		for (int x = 0; x < shoppingCartQuanitity.length; x++){
			System.out.println("Your cart has " + shoppingCartQuantity[x] + productNames[x]);
		}
	}
	//Method to display the total Cost
	public int getTotalCost(int[] shoppingCartQuantity, int[] itemcost, int totalCost){
		for(int i = 0; i < shoppingCartQuantity.length; i++){
			int lineItemCost = itemCost[i] * shoppingCartQuantity[i];
			totalCost = totalCost + lineItemCost;
		}
		System.out.println("The total Shopping Cart cost is: $" + totalCost);
		return totalCost;
	}
}
