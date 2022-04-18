import java.util.List;

import StructuralPattern.CompositePattern.Meal;

public class Menu {
	
	private List<FoodCategory> categories;
	private List<Meal> meals;
	
	
	public Menu(List<Meal> meals) {
		this.meals = meals;
	}


	public List<FoodCategory> getCategories() {
		return categories;
	}


	public void setCategories(List<FoodCategory> categories) {
		this.categories = categories;
	}
	
	public void setMeals(List<Meal> meals) {
		this.meals = meals;
	}
	
	
	public void printMeals() {
		
		for(int i = 0; i < this.meals.size(); i++) {
			
			System.out.println("\n\nMeal name: " + this.meals.get(i).getMealDescription());
			
			System.out.println("Meal includes following items: ");
			
			// Print meals description
			this.meals.get(i).printMealItems();
			
			System.out.println("Total Calories in this meal: " + this.meals.get(i).getTotalCalories());
			
			System.out.println("Total Price: " + this.meals.get(i).getMealPrice());
		}
	}
}
