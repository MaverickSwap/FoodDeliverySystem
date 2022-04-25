/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tejas Kale
 */
 
package BehavioralPatterns.commandPattern;

import java.util.List;

import java.util.ArrayList;

/**
 *
 * @author Tejas Kale
 */
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

