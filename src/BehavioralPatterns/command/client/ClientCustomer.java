package BehavioralPatterns.command.client;

import BehavioralPatterns.command.concrete.PlaceOrder;
import BehavioralPatterns.command.concrete.ValidateOrder;
import BehavioralPatterns.command.concrete.PrepareOrder;
import BehavioralPatterns.command.concrete.DeliverOrder;
import BehavioralPatterns.command.invoker.Manager;
import BehavioralPatterns.command.receiver.Order;

public class ClientCustomer {

    public ClientCustomer() {
    	
    	/*
         *  PLACING ORDER
         */
    	System.out.println("\nRestaurant Placing Order -- In Progress\n");
        Order myOrder = new Order("Cheese Burger", 2);
        Manager manager = new Manager();

        /*
         *  PREPARING ORDER
         */
        
        PlaceOrder placeOrder = new PlaceOrder(myOrder);
        manager.setCommand(placeOrder);
        manager.invokeCommand();

        
        /*
         *  VALIDATING ORDER
         */
        
        System.out.println("\nRestaurant Validating Order -- In Progress\n");        
        ValidateOrder validateOrder = new ValidateOrder(myOrder);
        manager.setCommand(validateOrder);
        manager.invokeCommand();

        /*
         *  PREPARING ORDER
         */
        
        System.out.println("\nRestaurant Preparing Order -- In Progress\n");
        PrepareOrder prepareOrder = new PrepareOrder(myOrder);
        manager.setCommand(prepareOrder);
        manager.invokeCommand();

        /*
         *  DELIVERING ORDER
         */
        
        System.out.println("\nRestaurant Delivering Order -- In Progress\n");
        DeliverOrder deliverOrder = new DeliverOrder(myOrder);
        manager.setCommand(deliverOrder);
        manager.invokeCommand();
        
        /*
         *  ORDER COMPLETE
         */
        System.out.println("\nDelivery Complete! Thanks for Ordering.\n");

    }

}
