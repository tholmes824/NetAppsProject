package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cart;
import model.Customer;
import model.Login;
import model.Products;

public class AddQuery {
	
	public Connection connection;
	
	public AddQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd); 
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doAdd(Customer customer){
		String query = "insert into customer (fName, lName, email, phone, address1, address2, city, state, zip, custID) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, customer.getfName());
			ps.setString(2, customer.getlName());
			ps.setString(3, customer.getEmail());
			ps.setInt(4, customer.getPhone());
			ps.setString(5, customer.getAddress1());
			ps.setString(6, customer.getAddress2());
			ps.setString(7, customer.getCity());
			ps.setString(8, customer.getState());
			ps.setInt(9, customer.getZip());
			ps.setInt(10, customer.getCustID());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}