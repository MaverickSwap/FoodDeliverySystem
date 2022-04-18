
import java.util.ArrayList;
import java.util.List;

import StructuralPattern.CompositePattern.ComboMeal;
import StructuralPattern.CompositePattern.Meal;

public class Main {

	public static void main(String[] args) {
		
			Logger log = Logger.getLoggerInstance();
			log.logMessage("Inside Log");
            System.out.println("\n***  Hungry? Order the food you love! ***\n");
            
            
            System.out.println("\n\n ---- COMPOSITE PATTERN ----");
            
            // 
            // COMPOSITE PATTERN IMPLEMENTATION
            // 
            
            // Meal is the Base Component ~ Interface            
            // Lunch / Dinner / Breakfast is the Leaf Component
            // ComboMeal is the Composite Element
            
            List<Meal> paradise_meals = new ArrayList<Meal>();                                   
            
            ComboMeal paradiseComboMeal = new ComboMeal(paradise_meals);
            paradiseComboMeal.addMeal(MealFactory.getMealType(MealType.breakfast));
            paradiseComboMeal.addMeal(MealFactory.getMealType(MealType.lunch));
            paradiseComboMeal.addMeal(MealFactory.getMealType(MealType.dinner));
            
            Menu paradise_menu = new Menu(paradiseComboMeal);
                        
            
            Restaurant paradise = new Restaurant(1, "Paradise Restaurant" , paradise_menu);
            
            //
            // Displaying the Meals menu
            //            
            System.out.println("\nDISPLAYING THE MEALS MENU OF PARADISE RESTAURANT");
            paradise.getMenu().printMeals();            
            
            
            //
            //
            /* FACTORY DESIGN PATTERN
            //
            //   
             
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
         
         
         	*/
                                                                          
            
            //
            //--- Creating Custom Food Item using Builder Design Pattern ---
            //
            
            /* 
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
            */
            
	}

}
