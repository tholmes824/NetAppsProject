package model;

public class Products {
	
	private int prodID;
	private String prodName;
	private String prodType;
	private int numStock;
	private double price;
	
	
	public Products(int prodID, String prodName, String prodType, int numStock, double price) {
		this.prodID = prodID;
		this.prodName = prodName;
		this.prodType = prodType;
		this.numStock = numStock;
		this.price = price;
	}
	
	public Products() {
		this.prodID = 0;
		this.prodName = "No Name";
		this.prodType = "No Type";
		this.numStock = 0;
		this.price = 0.0;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public int getNumStock() {
		return numStock;
	}

	public void setNumStock(int numStock) {
		this.numStock = numStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [prodID=" + prodID + ", prodName=" + prodName + ", prodType=" + prodType + ", numStock="
				+ numStock + ", price=" + price + "]";
	}
	
	
	
	

}
