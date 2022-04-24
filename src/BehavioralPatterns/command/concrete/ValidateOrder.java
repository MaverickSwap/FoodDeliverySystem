package BehavioralPatterns.command.concrete;

import BehavioralPatterns.command.Command;
import BehavioralPatterns.command.receiver.Order;

//Concrete Command
public class ValidateOrder implements Command {

	private Order order;
	
	public ValidateOrder(Order order) {
		this.order = order;
	}
	
	@Override
	public void execute() {
		this.order.setOrderValidated(true);
		System.out.println(this.order);
	}
	
}
