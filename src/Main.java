
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
            System.out.println("Hungry? Order the food you love!");
            
            
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
         
	}

}
