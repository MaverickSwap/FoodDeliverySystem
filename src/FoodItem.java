import java.util.ArrayList;
import java.util.List;


public class FoodItem {
	
	private final Integer id;
	private final String name;
	private final String description;
	private final String imageUrl;
	private final Double price;
	private final String category;
	private List<Topping> toppings;
	private List<SideDish> sides;
	
	private FoodItem(FoodItemBuilder foodItemBuilder) {
		
		this.id = foodItemBuilder.id;
		this.name = foodItemBuilder.name;
		this.description = foodItemBuilder.description;
		this.imageUrl = "";
		this.price = foodItemBuilder.price;
		this.category = foodItemBuilder.category;
	}
	
        public FoodItem(Integer id, String name, String description, String imageUrl, Double price, String category){
            this.id = id;
            this.description = description;
            this.name = name;
            this.imageUrl = imageUrl;
            this.price = price;
            this.category = category;
        }
        
        public FoodItem(Integer id, String name, String description, Double price, String category){
            this.id = id;
            this.name = name;
            this.description = description;
			this.imageUrl = "";
            this.price = price;
            this.category = category;
        }

        @Override
        public String toString() {
            return "FoodItem{" + "id=" + id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl + ", price=" + price + ", Category=" + category + '}';
        }
        
        
	
	public String getDescription() {
		
		System.out.println("Printing Food Item Description");
		return description;
	}

	//
	//  This class implements the Builder Pattern. Adds extra variants, Sides / Toppings.
	// 
	//
	public static class FoodItemBuilder {
		
		private Integer id;
		private String name;
		private String description;
		private String imageUrl;
		private Double price;
		private String category;
		private List<Topping> toppings;
		private List<SideDish> sides;
		
		public FoodItemBuilder(Integer id, String name, String description, Double price, String category) { 
			this.id = id;
			this.name = name;
			this.description = description;
			this.price = price;
			this.category = category;	
			this.toppings = new ArrayList();
			this.sides= new ArrayList(); 
		}
		
		//
		// Add Toppings
		//
		
		public FoodItemBuilder addCheese() {
			System.out.println("Added Cheese");
			Topping topping = new Topping(1, "cheese", "Cheddar Cheese");
			this.toppings.add(topping);
			return this;
		}
		
		public FoodItemBuilder addSauce() {
			System.out.println("Added Sauce");
			Topping topping = new Topping(2, "sauce", "Tomato Sauce");
			this.toppings.add(topping);
			return this;
		}
		
		public FoodItemBuilder addVeggies() {
			System.out.println("Added Roman Lettuce");
			Topping topping = new Topping(3, "lettuce", "Roman Lettuce");
			this.toppings.add(topping);
			return this;
		}
		
		public FoodItemBuilder addSpices() {
			System.out.println("Added Spices");
			Topping topping = new Topping(4, "pepperChilly", "Pepper and Chilli flakes");
			this.toppings.add(topping);
			return this;
		}
		
		//
		// Add Sides
		//
		
		public FoodItemBuilder addGarlicBread() {
			System.out.println("Added Garlic Bread");
			SideDish side= new SideDish(1, "garlicBread", "Garlic Bread");
			this.sides.add(side);
			return this;
		}
		
		public FoodItemBuilder addSeasonedRice() {
			System.out.println("Added Seasoned Rice");
			SideDish side= new SideDish(2, "seasonedRice", "Seasoned Rice");
			this.sides.add(side);
			return this;
		}
		
		public FoodItemBuilder addFrenchFries() {
			System.out.println("Added French Fired");
			SideDish side= new SideDish(3, "fries", "French Fries");
			this.sides.add(side);
			return this;
		}
		
		public FoodItemBuilder addCoke() {
			System.out.println("Added Coke");
			SideDish side= new SideDish(4, "coke", "Coca Cola");
			this.sides.add(side);
			return this;
		}
		
		public FoodItem build() {
			System.out.println("Builder pattern built item " +  this.name);
			System.out.println("\n");
			FoodItem foodItem =  new FoodItem(this);			
			return foodItem;
		}

	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
}

