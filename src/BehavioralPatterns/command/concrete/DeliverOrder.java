package BehavioralPatterns.command.concrete;

import BehavioralPatterns.command.Command;
import BehavioralPatterns.command.receiver.Order;

//Concrete Command
public class DeliverOrder implements Command {

	private Order order;
	
	public DeliverOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderServed(true);
		System.out.println(this.order);
	}

}
