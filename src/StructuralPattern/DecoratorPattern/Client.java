package StructuralPattern.DecoratorPattern;
import java.text.DecimalFormat; 
public class Client {

public static void main(String[] args) {
DecimalFormat df = new DecimalFormat("#.00"); 

// Order Cheese Burger
OrderFood food = new CheeseBurger();
float price = Float.valueOf(df.format(food.cost())); 
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("===================");
// Add Onions
food = new Onion(food);
price = Float.valueOf(df.format(food.cost())); 
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("===================");             
// Add Extra Thousand Island Sauce                     
food = new ThousandIslandSauce(food);                  
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("===================");             
// Add Coke                   
food = new Coke(food);         
price = Float.valueOf(df.format(food.cost()));          
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("===================");   

food = new Fries(food);    
price = Float.valueOf(df.format(food.cost()));              
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("===================");  

//Return SubTotal
food = new SubTotal(food);    
price = Float.valueOf(df.format(food.cost()));              
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("==================="); 


//Add tax and show Total
food = new TaxTotal(food);    
price = Float.valueOf(df.format(food.cost()));              
System.out.println(food.getDesc() + " " + price + "$");
System.out.println("===================");  
System.out.println("End of Order, Check Closed.");
}
}