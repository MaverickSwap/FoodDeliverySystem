package CreatorPattern;
import java.util.Date;
import java.util.List;



public class Restaurant {
	
	private Integer id;
	private String name;	
	private Menu menu;
	private String description;
	private String imageUrl;
	private Float ratings;
	private Address address;
	private List<OperatingHour> operatingHours;
	
	

	public Restaurant(Integer id, String name, Menu menu) {
		
		this.id = id;
		this.name = name;
		this.menu = menu;
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




	public Menu getMenu() {
		return menu;
	}




	public void setMenu(Menu menu) {
		this.menu = menu;
	}




	public String getImageUrl() {
		return imageUrl;
	}




	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}




	public Float getRatings() {
		return ratings;
	}




	public void setRatings(Float ratings) {
		this.ratings = ratings;
	}




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public List<OperatingHour> getOperatingHours() {
		return operatingHours;
	}




	public void setOperatingHours(List<OperatingHour> operatingHours) {
		this.operatingHours = operatingHours;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public String getDescription() {
		System.out.println("Printing Restaurant Description");
		return description;
	}

}
