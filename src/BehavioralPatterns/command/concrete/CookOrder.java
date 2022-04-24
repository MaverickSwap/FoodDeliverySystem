package BehavioralPatterns.command.concrete;

import BehavioralPatterns.command.Command;
import BehavioralPatterns.command.receiver.Order;

public class CookOrder implements Command {

	private Order order;
	
	public CookOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderPrepared(true);
		System.out.println(this.order);
	}

}
