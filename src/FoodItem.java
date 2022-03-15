
public class FoodItem {
	
	private Integer id;
	private String name;
	private String description;
	private String imageUrl;
	private Float price;
	private String Category;
	
	public FoodItem() {
		
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