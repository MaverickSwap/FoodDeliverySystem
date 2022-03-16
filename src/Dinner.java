
import java.util.Arrays;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tejas Kale
 */
public class Dinner extends FoodCategory{
        private String name;
	private String description;
	private List<FoodItem> foodItems; 
        private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
        
    @Override
    public String getMealConfiguration() {
        return "Meal Category selected is Dinner.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(List<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    @Override
    public String toString() {
        return "Dinner{" + "name = " + name + ", description = " + description +", typeOfFood = " + typeOfFood +  ", foodItems=" + getListItems(foodItems) + '}';
    }

    
        
    public Dinner(String name,String description, List <FoodItem> foodItems , String typeOfFood){
       this.name = name;
       this.description = description;
       this.foodItems = foodItems;
       this.typeOfFood = typeOfFood;
    }  
    
    public String getListItems(List <FoodItem> list){
        StringBuilder sb = new StringBuilder();
        for(FoodItem s : list){
            sb.append(s.getName());
            sb.append(" | ");
        }
        return sb.toString();
    } 
}
