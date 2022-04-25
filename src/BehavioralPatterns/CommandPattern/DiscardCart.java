package BehavioralPatterns.CommandPattern;

public class DiscardCart implements Order {

	
	private Cart cartItem;
	
	
	public DiscardCart(Cart cartItem) {
		this.cartItem = cartItem;
	}
	
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		cartItem.discardCart();
		
	}	
	
}
