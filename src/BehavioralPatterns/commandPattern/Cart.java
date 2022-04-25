
package BehavioralPatterns.CommandPattern;

import CreatorPattern.FoodItem;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    List <CreatorPattern.FoodItem> foodItems = new ArrayList<CreatorPattern.FoodItem>();
    
    public Cart(List<CreatorPattern.FoodItem> inputList){
        this.foodItems = inputList;
    }
    
    public void proceedToCheckoutTheCart(){
        System.out.println("\nCart proceeding to checkout with following items : ");
        for(FoodItem e : foodItems){
            System.out.println("+ Name:"+e.getName()+", Price:"+e.getPrice());
        }
    }
    
    public void proceedToDiscardTheCart(){
        System.out.println("\nCart proceeding to discard with following items : ");
        for(FoodItem e : foodItems){
            System.out.println("- Name:"+e.getName()+", Price:"+e.getPrice());
        }
    }
    
}
