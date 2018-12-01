package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cart;
import model.CartItems;

public class ReadCart {
	
	private Connection connection;
	private ResultSet results;
	private CartItems cartItems = new CartItems();
	private int cartID;
	private int quantity;
	private int prodID;
	
	
	public ReadCart(String dbName, String uname, String pwd){
		
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
	
	public void doRead(Cart c){
//		String query = "select * from CartItems where cartID = ?";
//		
//		try {
//			PreparedStatement ps = connection.prepareStatement(query);
//			
//			ps.setInt(1, this.cartID);
//			
//			this.results = ps.executeQuery();
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	public String getHTMLTable(Cart c) {
		String table = "";
		table += "<table border = 1>";
		
		ArrayList<CartItems> stuff = c.getArray();
		
			for (int i = 0; i < stuff.size(); i++) {
				table += "<tr>";
				table += "<td>";
					table += stuff.get(i).getCartID();
				table += "</td>";
				table += "<td>";
					table += stuff.get(i).getProdID();
				table += "</td>";
				table += "<td>";
					table += stuff.get(i).getQuantity();
				table += "</td>";
					table += "<a href=update?quantity=" + stuff.get(i).getQuantity() + ">Update</a> <a href=delete?prodID=" + stuff.get(i).getProdID() + ">Delete</a>";
				table += "</tr>";
			}
		
		table += "</table>";
		return table;
		}

	
	public CartItems getCartItems(){
		return this.cartItems;
	}
	

}
