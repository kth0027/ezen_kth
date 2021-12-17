package Test2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	static // creates arraylist for cart
    List<CartItem> items = new ArrayList<CartItem>();

    public void AddItem(CartItem store)
    {
        items.add(store);
    }

    public static void main(String[] args)
    {
        System.out.println(items.get(0));
    }

}
