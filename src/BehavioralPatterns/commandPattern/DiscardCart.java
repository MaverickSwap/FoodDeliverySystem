
package BehavioralPatterns.CommandPattern;
import CreatorPattern.FoodItem;
import java.util.List;


public class DiscardCart implements Order{

    private Cart cart;
    
    public DiscardCart(Cart inputCart){
        this.cart = inputCart;
    }
    
    @Override
    public void execute() {
        cart.proceedToDiscardTheCart();
    }
}
