

package BehavioralPatterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;


public class User {
    public static void main(String arg[]){
    
        System.out.println("----- Command pattern in food ordering system -----");
        CreatorPattern.FoodItem cf1 = new CreatorPattern.FoodItem(Integer.valueOf("46"),"Enchiliada","Main Dish",Double.valueOf("12.88"),"Lunch");
        CreatorPattern.FoodItem cf2 = new CreatorPattern.FoodItem(Integer.valueOf("23"),"Orange Juice","Drinks",Double.valueOf("3.49"),"Lunch");
        CreatorPattern.FoodItem cf3 = new CreatorPattern.FoodItem(Integer.valueOf("18"),"Red Velvet Cake","Dessert",Double.valueOf("5.49"),"Lunch");
        List<CreatorPattern.FoodItem> list  = new ArrayList<CreatorPattern.FoodItem>();
        list.add(cf1);
        list.add(cf2);
        list.add(cf3);
        Cart newCart = new Cart(list);
        CheckoutCart checkoutCart = new CheckoutCart(newCart);
        DiscardCart discardCart = new DiscardCart(newCart);
        CartManager cm = new CartManager();
        cm.fillCart(checkoutCart);
        cm.fillCart(discardCart);
        
        cm.placeOrderForCart();
        
    }
}
