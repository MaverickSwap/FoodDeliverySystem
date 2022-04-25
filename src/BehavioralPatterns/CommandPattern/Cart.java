package BehavioralPatterns.CommandPattern;

import java.util.List;

import CreatorPattern.FoodItem;




public class Cart {

	private int cartId;
	private List<FoodItem> foodItems;
	
	
	public Cart(int cartId, List<FoodItem> foodItems) {
		this.cartId = cartId;
		this.foodItems = foodItems;
	}
	
	
	public void discardCart() {
		
		System.out.println("Cart  with id - " + this.cartId + " Proceeding to Discard");
	}	
	
	
	public void proceedToCheckOut() {
		
		System.out.println("Cart  with id - " + this.cartId + " Proceeding to Checkout");
		
	}
	
	public void getFinalPriceOnCart() {
		
	}	
	
}








