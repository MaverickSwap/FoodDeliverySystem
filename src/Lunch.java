
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
public class Lunch extends FoodCategory{
        private String name;
	private String description;
	private List<FoodItem> foodItems; 
        
    @Override
    public String getMealConfiguration() {
        return "Meal Category selected is Lunch.";
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
        return "Lunch{" + "name=" + name + ", description=" + description + ", foodItems=" + getListItems(foodItems) + '}';
    }
        
    public Lunch(String name,String description, List <FoodItem> foodItems ){
       this.name = name;
       this.description = description;
       this.foodItems = foodItems;
    }   
    
    public String getListItems(List <FoodItem> list){
        StringBuilder sb = new StringBuilder();
        for(FoodItem s : list){
            sb.append(s.getName());
            sb.append('|');
        }
        return sb.toString();
    }
    
}
