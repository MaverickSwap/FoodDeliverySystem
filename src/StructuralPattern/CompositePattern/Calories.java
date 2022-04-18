package StructuralPattern.CompositePattern;

public class Calories {
	
	private Double totalCalories;
	// For future specialisation in calories
	private Double carbs;
	private Double fats;
	private Double proteins;
	
	
	public Calories(Double totalCalories) {
		this.totalCalories = totalCalories;
	}
	
	public Double getTotalCalories() {
		return this.totalCalories;
	}
}