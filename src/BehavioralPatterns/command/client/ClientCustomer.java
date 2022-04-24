package BehavioralPatterns.command.client;

import BehavioralPatterns.command.concrete.PlaceOrder;
import BehavioralPatterns.command.concrete.ValidateOrder;
import BehavioralPatterns.command.concrete.CookOrder;
import BehavioralPatterns.command.concrete.DeliverOrder;
import BehavioralPatterns.command.invoker.Cook;
import BehavioralPatterns.command.invoker.Manager;
import BehavioralPatterns.command.invoker.DeliveryAgent;
import BehavioralPatterns.command.receiver.Order;

public class ClientCustomer {
	
	public ClientCustomer() {

		Order myOrder = new Order("Cheese Burger", 2);
		
		
		PlaceOrder po = new PlaceOrder(myOrder);
		
		DeliveryAgent da = new DeliveryAgent();
		da.setCommand(po);
		da.takeOrder();
		
	
		ValidateOrder vo = new ValidateOrder(myOrder);
		
		Manager manager = new Manager();
		manager.setCommand(vo);
		manager.validateOrder();
		
		CookOrder co = new CookOrder(myOrder);
		
		Cook cook = new Cook();
		cook.setCommand(co);
		cook.prepareOrder();
		

		DeliverOrder so = new DeliverOrder(myOrder);
		
		da.setCommand(so);
		da.serveOrder();
	}

}
