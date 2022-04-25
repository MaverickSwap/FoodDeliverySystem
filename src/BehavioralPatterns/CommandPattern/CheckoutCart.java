package BehavioralPatterns.CommandPattern;

public class CheckoutCart implements Order {

	
	private Cart cartItem;
	
	
	public CheckoutCart(Cart cartItem) {
		this.cartItem = cartItem;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cartItem.proceedToCheckOut();
		
	}	
	
}

