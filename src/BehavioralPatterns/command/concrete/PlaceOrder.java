package BehavioralPatterns.command.concrete;

import BehavioralPatterns.command.Command;
import BehavioralPatterns.command.receiver.Order;

public class PlaceOrder implements Command {

    private Order order;

    public PlaceOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.setOrderPlaced(true);
        System.out.println(this.order);
    }

}
