
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
			Logger log = Logger.getLoggerInstance();
			log.logMessage("Inside Log");
            System.out.println("\n***  Hungry? Order the food you love! ***\n");
            
            System.out.println("\n--- Creating stacked Meals using Factory Design Pattern ---\n");
            
            
            // Breakfast
            //
            FoodCategory bf = MealFactory.getMealType(MealType.breakfast);
            System.out.println('\n'+bf.getMealConfiguration());
            System.out.println(bf.toString());

            
            // Lunch
            //
            FoodCategory lunch = MealFactory.getMealType(MealType.lunch);
            System.out.println('\n'+lunch.getMealConfiguration());
            System.out.println(lunch.toString());

            
            // Dinner
            //
            FoodCategory dinner = MealFactory.getMealType(MealType.dinner);
            System.out.println('\n'+dinner.getMealConfiguration());
            System.out.println(dinner.toString());
         
            
            System.out.println("\n\n\n--- Creating Custom Food Item using Builder Design Pattern ---\n\n\n");
            
            FoodItem fib1 = new FoodItem.FoodItemBuilder(Integer.valueOf("1"),"Ham Sandwhich","Sides",Double.valueOf("10.88"),"Breakfast")
            		.addCheese()
            		.addFrenchFries()
            		.addCoke()
            		.build();
            
            
            FoodItem fil1 = new FoodItem.FoodItemBuilder(Integer.valueOf("56"),"Noodles","Maindish",Double.valueOf("19.88"),"Lunch")
            		.addGarlicBread()
            		.addSauce()
            		.addVeggies()
            		.build();
            		;
            FoodItem fid1 = new FoodItem.FoodItemBuilder(Integer.valueOf("105"),"Onion Fritters","Sides",Double.valueOf("3.88"),"Dinner")
            		.addCoke()
            		.addSpices()
            		.addFrenchFries()
            		.build();
            
            
	}

}
