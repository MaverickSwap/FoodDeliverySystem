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
		}
		
		//
		// Add Toppings
		//
		
		public FoodItemBuilder addCheese() {
			Topping topping = new Topping(1, "cheese", "Cheddar Cheese");
			this.toppings.add(topping);
			return this;
		}
		
		public FoodItemBuilder addSauce() {
			Topping topping = new Topping(2, "sauce", "Tomato Sauce");
			this.toppings.add(topping);
			return this;
		}
		
		public FoodItemBuilder addVeggies() {
			Topping topping = new Topping(3, "lettuce", "Roman Lettuce");
			this.toppings.add(topping);
			return this;
		}
		
		public FoodItemBuilder addSpices() {
			Topping topping = new Topping(4, "pepperChilly", "Pepper and Chilli flakes");
			this.toppings.add(topping);
			return this;
		}
		
		//
		// Add Sides
		//
		
		public FoodItemBuilder addGarlicBread() {
			SideDish side= new SideDish(1, "garlicBread", "Garlic Bread");
			this.sides.add(side);
			return this;
		}
		
		public FoodItemBuilder addSeasonedRice() {
			SideDish side= new SideDish(2, "seasonedRice", "Seasoned Rice");
			this.sides.add(side);
			return this;
		}
		
		public FoodItemBuilder addFrenchFries() {
			SideDish side= new SideDish(3, "fries", "French Fries");
			this.sides.add(side);
			return this;
		}
		
		public FoodItemBuilder addCoke() {
			SideDish side= new SideDish(4, "coke", "Coca Cola");
			this.sides.add(side);
			return this;
		}
		
		public FoodItem build() {
			FoodItem foodItem =  new FoodItem(this);			
			return foodItem;
		}

	}
}

