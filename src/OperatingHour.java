
import java.util.Date;

public class OperatingHour {
	private Integer id;
	private String name;
	private Date openingHours;
	private Date closingHours;
	
	public OperatingHour() {
		
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

	public Date getOpeningHours() {
		return openingHours;
	}

	public void setOpeningHours(Date openingHours) {
		this.openingHours = openingHours;
	}

	public Date getClosingHours() {
		return closingHours;
	}

	public void setClosingHours(Date closingHours) {
		this.closingHours = closingHours;
	}
	
	
}