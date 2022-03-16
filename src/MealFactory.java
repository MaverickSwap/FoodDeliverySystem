
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tejas Kale
 */
public class MealFactory {
	
	private Logger log;
	
	public MealFactory() {
		log = Logger.getLoggerInstance();		
	}
	
    public static FoodCategory getMealType(MealType mealType){
    	
    Logger log =  Logger.getLoggerInstance();
    	
    switch (mealType){
    
        case breakfast:
        	
            List <FoodItem> fib = new ArrayList<FoodItem>();

            FoodItem fib1 = new FoodItem(Integer.valueOf("1"),"Ham Sandwhich","Sides",Double.valueOf("10.88"),"Breakfast");            		            
            FoodItem fib2 = new FoodItem(Integer.valueOf("2"),"Bacon Burger","Sides",Double.valueOf("10.88"),"Breakfast");
            FoodItem fib3 = new FoodItem(Integer.valueOf("3"),"Scrambled Eggs","Sides",Double.valueOf("10.88"),"Breakfast");            
            fib.add(fib1);
            fib.add(fib2);
            fib.add(fib3);
            log.logMessage("Returning Breakfast Meal Factory");
            return new Breakfast("Sunday breakfast","Handcrafted Breakfast for a bright day",fib);
            
        case lunch:
        	
            List <FoodItem> fil = new ArrayList<FoodItem>();
            
            FoodItem fil1 = new FoodItem(Integer.valueOf("56"),"Noodles","Maindish",Double.valueOf("19.88"),"Lunch");            
            FoodItem fil2 = new FoodItem(Integer.valueOf("67"),"Chicken Rice","Maindish",Double.valueOf("20.12"),"Lunch");
            FoodItem fil3 = new FoodItem(Integer.valueOf("78"),"Tiramisu","Indian dessert",Double.valueOf("9.12"),"Lunch");
            fil.add(fil1);
            fil.add(fil2);
            fil.add(fil3);
            log.logMessage("Returning Breakfast Meal Factory");
            return new Lunch("Sunday Lunch","Handcrafted Lunch for filling meal",fil);
            
        case dinner:
        	
            List <FoodItem> fid = new ArrayList<FoodItem>();
            
            FoodItem fid1 = new FoodItem(Integer.valueOf("105"),"Onion Fritters","Sides",Double.valueOf("3.88"),"Dinner");
            FoodItem fid2 = new FoodItem(Integer.valueOf("122"),"Soya Garlic Rice","Maindish",Double.valueOf("10.12"),"Dinner");
            FoodItem fid3 = new FoodItem(Integer.valueOf("167"),"Yogurt Milk","Refreshment",Double.valueOf("7.82"),"Dinner");
            FoodItem fid4 = new FoodItem(Integer.valueOf("188"),"Mint ice cream","Dessert",Double.valueOf("1.12"),"Dinner");
            fid.add(fid1);
            fid.add(fid2);
            fid.add(fid3);
            fid.add(fid4);
            log.logMessage("Returning Dinner Meal Factory");
            return new Dinner("Dinner Meal","Handcrafted Dinner for a delighted evening",fid, "Vegetarian");
        }
    return null;
    }
}
