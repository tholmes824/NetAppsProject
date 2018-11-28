package model;

public class Inventory {
	
	private int locationID;
	private int prodID;
	private int numStock;
	
	public Inventory(int locationID, int prodID, int numStock) {
		this.locationID = locationID;
		this.prodID = prodID;
		this.numStock = numStock;
	}

	public Inventory() {
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public int getNumStock() {
		return numStock;
	}

	public void setNumStock(int numStock) {
		this.numStock = numStock;
	}

}
