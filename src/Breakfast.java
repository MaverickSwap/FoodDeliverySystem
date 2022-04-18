
import java.util.Arrays;
import java.util.List;
import StructuralPattern.CompositePattern.Meal;



public class Breakfast extends FoodCategory implements Meal {
	
	
    private String name;
	private String description;
	private List<FoodItem> foodItems; 


    @Override
    public String getMealConfiguration() {
        return "Meal Category selected is Breakfast.";
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
        return "Breakfast { " + "name = " + name + ", description = " + description + ", foodItems = " + getListItems(foodItems) + " } ";
    }
        
    public Breakfast(String name,String description, List <FoodItem> foodItems ){
       this.name = name;
       this.description = description;
       this.foodItems = foodItems;
    }  
     
    public String getListItems(List <FoodItem> list){
        StringBuilder sb = new StringBuilder();
        for(FoodItem s : list){
            sb.append(s.getName());
            sb.append(" | ");
        }
        return sb.toString();
    }
    
    @Override
	public Double getTotalCalories() {
		
		Double totalCalories = 0.0;
		
		for (int i = 0; i < this.foodItems.size(); i++) {
			
			totalCalories += this.foodItems.get(i).getCalories().getTotalCalories();
		}
				
		return  totalCalories;
	}

    
	@Override
	public String getMealDescription() {
		
		return this.description;
	}

	
	@Override
	public Double getMealPrice() {
		
		Double totalPrice = 0.0;
		
		for (int i = 0; i < this.foodItems.size(); i++) {
					
			totalPrice += this.foodItems.get(i).getPrice();
		}
		return  totalPrice;
	}
	
	@Override
	public void printMealItems() {
		
		for (int i = 0; i < this.foodItems.size(); i++) {
			
			System.out.println("  - " + this.foodItems.get(i).getName());
		}
	}
    
}
