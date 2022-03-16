
public class FoodItem {
	
	private Integer id;
	private String name;
	private String description;
	private String imageUrl;
	private Float price;
	private String Category;
	
	public FoodItem() {
		
	}
	
        public FoodItem(Integer id, String name, String description, String imageUrl, Float price, String Category){
            this.id = id;
            this.description = description;
            this.imageUrl = imageUrl;
            this.price = price;
            this.Category = Category;
        }
        
        public FoodItem(Integer id, String name, String description, Float price, String Category){
            this.id = id;
            this.name = name;
            this.description = description;
            this.price = price;
            this.Category = Category;
        }

        @Override
        public String toString() {
            return "FoodItem{" + "id=" + id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl + ", price=" + price + ", Category=" + Category + '}';
        }
        
        
	
	public String getDescription() {
		System.out.println("Printing Food Item Description");
		return description;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	public Float getPrice() {
		return price;
	}


	public void setPrice(Float price) {
		this.price = price;
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}