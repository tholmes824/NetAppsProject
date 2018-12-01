package model;

public class CartItems {
	
	private int cartID;
	private int prodID;
	private int quantity;
	
	
	public CartItems(int cartID, int prodID, int quantity) {
		this.cartID = cartID;
		this.prodID = prodID;
		this.quantity = quantity;
	}
	
	public CartItems () {
		
	}

	public int getCartID() {
		return cartID;
	}

	public void setCartID(int cartID) {
		this.cartID = cartID;
	}

	public int getProdID() {
		return prodID;
	}

	public void setProdID(int prodID) {
		this.prodID = prodID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CartItems [cartID=" + cartID + ", prodID=" + prodID + ", quantity=" + quantity + "]";
	}
	
	
	
	
	

}
