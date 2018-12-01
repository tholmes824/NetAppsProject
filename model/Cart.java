package model;

import java.util.ArrayList;

import model.CartItems;

public class Cart {
	
	private int cartID;
	private int custID;
	private ArrayList<CartItems> cartStuff = new ArrayList<CartItems>();
	
	
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

	public void addToCart(CartItems cartItems) {
		cartStuff.add(cartItems);
	}
	
	public ArrayList<CartItems> getArray() {
		return this.cartStuff;
	}

}
