package BehavioralPatterns.IteratorPattern;
import java.util.ArrayList;
import java.util.List;

import CreatorPattern.FoodCategory;
import CreatorPattern.FoodItem;
import CreatorPattern.MealFactory;
import CreatorPattern.MealType;

public class Client {

	
	public static void main(String args[]) {
		
		
		List<FoodCategory> categories = new ArrayList<FoodCategory>();			
		
		MealFactory mf = new MealFactory();
		categories.add(MealFactory.getMealType(MealType.breakfast));
		categories.add(MealFactory.getMealType(MealType.lunch));
		categories.add(MealFactory.getMealType(MealType.dinner));
		
		System.out.println("\nIterating Over FoodCategories and FoodItems in Menu using Iterator Pattern");
		
		
		FoodList cat = new FoodList<FoodCategory>(categories);
		FoodIterator fi = cat.iterator();
		
		while(fi.hasNext()) {
			
			FoodCategory currentFoodCategory = (FoodCategory)fi.getNextItem();
			
			System.out.println("\n");
			System.out.println(currentFoodCategory.getName());
			
			FoodList foodItem = new FoodList(currentFoodCategory.getFoodItems());
			FoodIterator fItemIterator = foodItem.iterator();
			
			
			
			while(fItemIterator.hasNext()) {
				
				FoodItem currentFoodItem = (FoodItem)fItemIterator.getNextItem();
				
				
				
				System.out.println("\t" + currentFoodItem.getName());
			}		
			
		}		
		
	}
}



