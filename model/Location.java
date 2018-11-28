package model;

public class Location {
	
	private int locationID;
	private int zip;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String name;
	
	public Location(int locationID, int zip, String address1, String address2, String city, String state, String name) {
		this.locationID = locationID;
		this.zip = zip;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.name = name;
	}
	
	public Location(){
		name = "none selected";
	}
	
	public int getLocationID() {
		return locationID;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

