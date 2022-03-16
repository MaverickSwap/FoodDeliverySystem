
import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
                
            System.out.println("Hungry? Order the food you love!");
            List <FoodItem> fib = new ArrayList<FoodItem>();
            FoodItem fib1 = new FoodItem(Integer.valueOf("1"),"Wedges","Sides",Float.valueOf("20.88"),"Breakfast");
            fib.add(fib1);
            FoodCategory bf = new Breakfast("Sunday breakfast","Handcrafted breakfast for sunday",fib);
            System.out.println(bf.getMealConfiguration());
            System.out.println(bf.toString());

            List <FoodItem> fil = new ArrayList<FoodItem>();
            FoodItem fil1 = new FoodItem(Integer.valueOf("56"),"Noodles","Maindish",Float.valueOf("19.88"),"Lunch");
            FoodItem fil2 = new FoodItem(Integer.valueOf("67"),"Chicken Rice","Maindish",Float.valueOf("20.12"),"Lunch");
            FoodItem fil3 = new FoodItem(Integer.valueOf("78"),"Tiramisu","Indian dessert",Float.valueOf("9.12"),"Lunch");
            fil.add(fil1);
            fil.add(fil2);
            fil.add(fil3);
            FoodCategory lunch = new Lunch("Sunday Lunch","Handcrafted lunch for filling meal",fil);
            System.out.println(lunch.getMealConfiguration());
            System.out.println(lunch.toString());

            List <FoodItem> fid = new ArrayList<FoodItem>();
            FoodItem fid1 = new FoodItem(Integer.valueOf("105"),"Onion Fritters","Sides",Float.valueOf("3.88"),"Dinner");
            FoodItem fid2 = new FoodItem(Integer.valueOf("122"),"Soya Garlic Rice","Maindish",Float.valueOf("10.12"),"Dinner");
            FoodItem fid3 = new FoodItem(Integer.valueOf("167"),"Yogurt Milk","Refreshment",Float.valueOf("7.82"),"Dinner");
            FoodItem fid4 = new FoodItem(Integer.valueOf("188"),"Mint ice cream","Dessert",Float.valueOf("1.12"),"Dinner");
            fid.add(fid1);
            fid.add(fid2);
            fid.add(fid3);
            fid.add(fid4);
            FoodCategory dinner = new Dinner("Sunday Dinner","Handcrafted dinner for sunday evening",fid);
            System.out.println(dinner.getMealConfiguration());
            System.out.println(dinner.toString());
         
	}

}
