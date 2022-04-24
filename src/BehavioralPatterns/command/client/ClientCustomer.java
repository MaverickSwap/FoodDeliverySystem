package BehavioralPatterns.command.client;

import BehavioralPatterns.command.concrete.PlaceOrder;
import BehavioralPatterns.command.concrete.ValidateOrder;
import BehavioralPatterns.command.concrete.PrepareOrder;
import BehavioralPatterns.command.concrete.DeliverOrder;
import BehavioralPatterns.command.invoker.Manager;
import BehavioralPatterns.command.receiver.Order;

public class ClientCustomer {

    public ClientCustomer() {

        Order myOrder = new Order("Cheese Burger", 2);

        Manager manager1 = new Manager();

        PlaceOrder placeOrder = new PlaceOrder(myOrder);
        manager1.setCommand(placeOrder);
        manager1.invokeCommand();

        ValidateOrder validateOrder = new ValidateOrder(myOrder);
        manager1.setCommand(validateOrder);
        manager1.invokeCommand();

        PrepareOrder prepareOrder = new PrepareOrder(myOrder);
        manager1.setCommand(prepareOrder);
        manager1.invokeCommand();

        DeliverOrder deliverOrder = new DeliverOrder(myOrder);
        manager1.setCommand(deliverOrder);
        manager1.invokeCommand();

    }

}
