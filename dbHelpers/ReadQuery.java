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
	
	public ReadQuery(String dbName, String uname, String pwd){
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
		String query = "select * from customer";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getHTMLTable(){
		String table ="";
		table += "<table>";
		
		try {
			while(this.results.next()){
				Customer customer = new Customer();
				customer.setCustID(this.results.getInt("custID"));
				customer.setfName(this.results.getString("fName"));
				customer.setlName(this.results.getString("lName"));
				customer.setEmail(this.results.getString("email"));
				customer.setPhone(this.results.getInt("phone"));
				customer.setAddress1(this.results.getString("address1"));
				customer.setAddress2(this.results.getString("address2"));
				customer.setCity(this.results.getString("city"));
				customer.setState(this.results.getString("state"));
				customer.setZip(this.results.getInt("zip"));
				
				table +="<tr>";
				table +="<td>";
				table += customer.getCustID();
				table +="</td>";
				table +="<td>";
				table += customer.getfName();
				table +="</td>";
				table +="<td>";
				table += customer.getlName();
				table +="</td>";
				table +="<td>";
				table += customer.getEmail();
				table +="</td>";
				table +="<td>";
				table += customer.getPhone();
				table +="</td>";
				table +="<td>";
				table += customer.getAddress1();
				table +="</td>";
				table +="<td>";
				table += customer.getAddress2();
				table +="</td>";
				table +="<td>";
				table += customer.getCity();
				table +="</td>";
				table +="<td>";
				table += customer.getState();
				table +="</td>";
				table +="<td>";
				table += customer.getZip();
				table +="</td>";
				table +="<td>";
				   table += "<a href=update?custID=" + customer.getCustID() + " >update</a> <a href=delete?custID=" + customer.getCustID() + " >delete</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";
		return table;
	}
	
}
