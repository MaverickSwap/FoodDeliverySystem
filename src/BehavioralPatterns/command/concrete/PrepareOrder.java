package BehavioralPatterns.command.concrete;

import BehavioralPatterns.command.Command;
import BehavioralPatterns.command.receiver.Order;

public class PrepareOrder implements Command {

    private Order order;

    public PrepareOrder(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        this.order.setOrderPrepared(true);
        System.out.println(this.order);
    }

}
