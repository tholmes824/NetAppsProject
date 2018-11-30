package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.CartItems;
import model.Customer;
import model.Location;
import model.Cart;

public class ReadCart {
	
	private Connection connection;
	private ResultSet results;
	private CartItems cartItems = new CartItems();
	private Customer cust = new Customer();
	private String cartID;
	
	
	public ReadCart(String dbName, String uname, String pwd, String cartID){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		this.cartID = cartID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRead(){
		String query = "select * from CartItems where cartID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, this.cartID);
			this.results = ps.executeQuery();
			this.results.next();
			
			cartItems.setCartID(this.results.getInt("cartID"));
			cartItems.setProdID(this.results.getInt("prodID"));
			cartItems.setQuantity(this.results.getInt("quantity"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable() {
		String table = "";
		table += "<table border = 1>";
		
		try {
			results.beforeFirst();
			while(this.results.next()) {
				CartItems cartItems = new CartItems();
				cartItems.setCartID(this.results.getInt("cartID"));
				cartItems.setProdID(this.results.getInt("prodID"));
				cartItems.setQuantity(this.results.getInt("quantity"));

				table += "<tr>";
				table += "<td>";
					table += cartItems.getCartID();
				table += "</td>";
				table += "<td>";
					table += cartItems.getProdID();
				table += "</td>";
				table += "<td>";
					table += cartItems.getQuantity();
				table += "</td>";
					table += "<a href=update?quantity=" + cartItems.getQuantity() + ">Update</a> <a href=delete?prodID=" + cartItems.getProdID() + ">Delete</a>";
				table += "</tr>";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		
		return table;
		}

	
	public CartItems getCartItems(){
		return this.cartItems;
	}
	

}
