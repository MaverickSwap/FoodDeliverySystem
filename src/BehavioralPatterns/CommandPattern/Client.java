package BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

import CreatorPattern.FoodItem;

public class Client {
	
	public static void main(String[] args) {
				
		CartManager cartManager = new CartManager();
		
		FoodItem f1 = new FoodItem(1001, "CheeseBurger", "American Burger", 4.99, "Fastfood");
		FoodItem f2 = new FoodItem(1002, "Fries", "Potato Snack", 2.99, "Fastfood");
		
		List<FoodItem> foodList = new ArrayList<FoodItem>();
		foodList.add(f1);
		foodList.add(f2);
		
		Cart cart1 = new Cart(9001, foodList);
		Cart cart2 = new Cart(1002, foodList);
		
		CheckoutCart c1 = new CheckoutCart(cart1);
		DiscardCart d1 = new DiscardCart(cart2);
		
		
		cartManager.addOrder(c1);
		cartManager.addOrder(d1);		
		
		cartManager.executeOrders();		
	}

}
