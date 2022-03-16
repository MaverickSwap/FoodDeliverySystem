
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Hungry? Order the food you love!");
            FoodCategory bf = MealFactory.getMealType(MealType.breakfast);
            System.out.println('\n'+bf.getMealConfiguration());
            System.out.println(bf.toString());

            FoodCategory lunch = MealFactory.getMealType(MealType.lunch);
            System.out.println('\n'+lunch.getMealConfiguration());
            System.out.println(lunch.toString());

            FoodCategory dinner = MealFactory.getMealType(MealType.dinner);
            System.out.println('\n'+dinner.getMealConfiguration());
            System.out.println(dinner.toString());
         
	}

}
