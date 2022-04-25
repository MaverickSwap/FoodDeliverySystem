/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehavioralPatterns.commandPattern;
import CreatorPattern.FoodItem;
import java.util.List;
/**
 *
 * @author Tejas Kale
 */
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
