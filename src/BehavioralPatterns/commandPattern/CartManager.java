
package BehavioralPatterns.CommandPattern;

import java.util.List;

import java.util.ArrayList;


public class CartManager {
    private List <Order> cartList = new ArrayList<Order>();
    
    public void fillCart(Order order){
        cartList.add(order);
    }
    
    public void placeOrderForCart(){
        for(Order ol : cartList){
            ol.execute();
        }
        cartList.clear();
    }
}

