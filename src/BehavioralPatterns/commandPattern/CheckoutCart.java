
package BehavioralPatterns.CommandPattern;
import CreatorPattern.FoodItem;
import java.util.List;


public class CheckoutCart implements Order{

    private Cart cart;
    
    public CheckoutCart(Cart inputCart){
        this.cart = inputCart;
    }
    
    @Override
    public void execute() {
        cart.proceedToCheckoutTheCart();
    }
}
