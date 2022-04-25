/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BehavioralPatterns.commandPattern;

import CreatorPattern.FoodItem;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tejas Kale
 */
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
