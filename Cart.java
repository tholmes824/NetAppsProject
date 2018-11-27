package model;

public class Cart {
	
	private int cartID;
	private int custID;
	
	
	public Cart(int cartID, int custID) {
		this.cartID = cartID;
		this.custID = custID;
	}
	
	public Cart() {
		
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}


	
	

}
