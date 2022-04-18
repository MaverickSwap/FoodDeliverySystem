package StructuralPattern.CompositePattern;

import java.util.List;

public class ComboMeal implements Meal {
	
	private List<Meal> meals;
	
	public ComboMeal(List<Meal> meals) {
		this.meals = meals;
	}
		
	public List<Meal> getMeals() {
		return this.meals;
	}
	
	
	public void addMeal(Meal meal) {
		this.meals.add(meal);
	}

	@Override
	public Double getTotalCalories() {
		
		Double totalCalories = 0.0;
		
		for(int i=0; i<meals.size(); i++) {
			totalCalories += meals.get(i).getTotalCalories();
		}
		
		return totalCalories;
	}

	@Override
	public String getMealDescription() {
		
		return null;
	}

	@Override
	public Double getMealPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printMealItems() {
		// TODO Auto-generated method stub
		
	}
		
}