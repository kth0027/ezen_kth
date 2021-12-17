package ShoppingMall2;

import.java.util.*;
public class TestShoppingCart {
public static void main(String [] args){
		

		//Create two shopping carts
		ShoppingCart newCartOne = new ShoppingCart(totalcost);
		ShoppingCart newCartTwo = new ShoppingCart(totalcost);
		//I think I need this to pull the product names when asking for input
		LineItem shoppingCartTest = new LineItem(productNames[], itemCost[], shoppingCartQuantity[]);

		//ask the user to select a cart (Not sure that I will need this 
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please select your shopping cart: \nFor cart 1 enter integer 1.\nFor cart 2 enter integer 2.");
		int userCart = userInput.nextInt();

		//Ask the user to input the contents of each cart
		for (int x = 0; x < shoppingCartQuantity.length; x++){
			System.out.println("How many " + productNames[x] + "Would you like? Enter an Integer: ");
			shoppingCartQuantity[x] = userInput.nextInt();
		}

		//Once they input the content, Display the contents of the cart, Quantity of each item and the total cost.
		newCartOne.getCartDisplay();	
		newCartOne.getTotalCost();
		newCartTwo.getCartDisplay();	
		newCartTwo.getTotalCost();
	}
}
