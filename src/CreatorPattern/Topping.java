package CreatorPattern;


public class Topping {
	
	private Integer id;
	private String name;
	private String description;
	
	public Topping(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
}