package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Products;
import model.Cart;

public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Products products = new Products();
	private String prodID;
	
	private Cart cart = new Cart();
	private String cartID;
	
	public ReadRecord(String dbName, String uname, String pwd, String cartID){
		
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
		String query = "select * from cart where cartID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.cartID);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			product.setSku(this.results.getString("sku"));
			product.setProductType(this.results.getString("productType"));
			product.setFlavor(this.results.getString("flavor"));
			product.setCost(this.results.getDouble("cost"));
			product.setPrice(this.results.getDouble("price"));
			product.setQuantity(this.results.getInt("quantity"));
			
			products.setProdID(this.results.getInt("prodID"));
			products.setProdType(this.results.getString("prodType"));
			products.setProdName(this.results.getString("prodName"));
			
			cart.setCartID(this.results.getInt("cartID"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Product getProduct(){
		return this.product;
	}
	
	

}
