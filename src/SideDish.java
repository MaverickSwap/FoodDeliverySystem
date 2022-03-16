
public class SideDish {
	private Integer id;
	private String name;
	private String description;
	
	public SideDish (Integer id, String name, String description) {
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