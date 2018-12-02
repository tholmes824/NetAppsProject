package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import model.Customer;

public class ReturnCust {
	
	private Connection connection;
	private ResultSet results;
	
	private Customer customer = new Customer();
	private String email;
	private String password;

	
	public ReturnCust(String dbName, String uname, String pwd, String email, String password){
		
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		this.email = email;
		this.password = password;
		
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
		String query = "select * from Customer where email = ? and password = ?";
		
		//sets default email to 999
		customer.setEmail("999");
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.email);
			ps.setString(2, this.password);
			
			this.results = ps.executeQuery();
			
			if (this.results.next()) {
				customer.setEmail(this.results.getString(1));
				customer.setPassword(this.results.getString(2));
				customer.setfName(this.results.getString("fName"));
				customer.setCustID((this.results.getInt("custID")));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Customer getCustomer(){
		return this.customer;
	}

}
