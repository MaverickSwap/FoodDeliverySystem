

public class Address {

	private String description;
	private String street;
	private String city;
	private Integer postalCode;
	private String apartment;
	private String phone;
	private Boolean isDefault;
	
	
	public Address() {
		
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Integer getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}


	public String getApartment() {
		return apartment;
	}


	public void setApartment(String apartment) {
		this.apartment = apartment;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Boolean getIsDefault() {
		return isDefault;
	}


	public void setIsDefault(Boolean isDefault) {
		this.isDefault = isDefault;
	}
	
	
}