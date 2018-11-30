package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cart;
import model.Customer;
import model.Login;
import model.Products;


public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	private Customer customer = new Customer();
	private String email;
	
	public ReadQuery(String dbName, String uname, String pwd, String email){
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead(){
		String query = "select * from Customer where email=?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, email);
			this.results = ps.executeQuery();
			this.results.next(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String emailCheck() {
		
		String checkEmail = "";
		
		try {
			Customer customer = new Customer();
			customer.setEmail(this.results.getString("email"));
			checkEmail = customer.getEmail();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return checkEmail;
		
	}
	
	public String passwordCheck() {
		
		String checkPassword = "";
		
		try {
			Customer customer = new Customer();
			customer.setPassword(this.results.getString("password"));
			checkPassword = customer.getPassword();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return checkPassword;
		
	}
	
}
