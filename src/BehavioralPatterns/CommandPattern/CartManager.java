package BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
	
	private List<Order> orders;
	
	CartManager() {		
		
		this.orders = new ArrayList<Order>();
	}
	
	CartManager(List<Order> orders) {
		
		this.orders = orders;
	}
	
	public void addOrder(Order order) {
		
		this.orders.add(order);
	}
	
	public void executeOrders() {
		
		for(int i = 0; i < this.orders.size(); i++) {
			
			this.orders.get(i).execute();
		}
	}
	
}