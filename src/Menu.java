import java.util.List;

import StructuralPattern.CompositePattern.ComboMeal;
import StructuralPattern.CompositePattern.Meal;

public class Menu {
	
	private List<FoodCategory> categories;
//	private List<Meal> meals;
	private ComboMeal comboMeals;
	
	
	public Menu(ComboMeal comboMeals) {
		this.comboMeals = comboMeals;
	}


	public List<FoodCategory> getCategories() {
		return categories;
	}


	public void setCategories(List<FoodCategory> categories) {
		this.categories = categories;
	}
	
//	public void setMeals(List<Meal> meals) {
//		this.meals = meals;
//	}
	
	
	public void printMeals() {
		
		for(int i = 0; i < this.comboMeals.getMeals().size(); i++) {
			
			System.out.println("\n\nMeal name: " + this.comboMeals.getMeals().get(i).getMealDescription());
			
			System.out.println("Meal includes following items: ");
			
			// Print meals description
			this.comboMeals.getMeals().get(i).printMealItems();
			
			System.out.println("Total Calories in this meal: " + this.comboMeals.getMeals().get(i).getTotalCalories());
			
			System.out.println("Total Price: " + this.comboMeals.getMeals().get(i).getMealPrice());
		}
	}
}
