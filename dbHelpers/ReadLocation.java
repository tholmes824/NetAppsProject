package dbHelpers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Location;

public class ReadLocation {
	private Connection connection;
	private ResultSet results;
	private Location location = new Location();
	private String state;
		
	public ReadLocation(String dbName, String username, String pwd, String state) {
		String url = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		this.state= state;
			
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, username, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
		public void doRead() {
			String query = "select * from Location where state = ?";
			
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, this.state);
				this.results = ps.executeQuery();
				if(this.results.next()) {
				  location.setLocationID(this.results.getInt("locationID"));
				location.setName(this.results.getString("locationName"));
				location.setAddress1(this.results.getString("streetLine1"));
				location.setAddress2(this.results.getString("streetLine2"));
				location.setCity(this.results.getString("city"));
				location.setState(this.results.getString("state"));
				location.setZip(this.results.getInt("zip"));
				} 
				
				
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
					Location location = new Location();
					location.setLocationID(this.results.getInt("locationID"));
					location.setName(this.results.getString("locationName"));
					location.setAddress1(this.results.getString("streetLine1"));
					location.setAddress2(this.results.getString("streetLine2"));
					location.setCity(this.results.getString("city"));
					location.setState(this.results.getString("state"));
					location.setZip(this.results.getInt("zip"));
					
					table += "<tr>";
					table += "<td>";
						table += location.getName();
					table += "</td>";
					table += "<td>";
						table += location.getAddress1();
					table += "</td>";
					table += "<td>";
						table += location.getAddress2();
					table += "</td>";
					table += "<td>";
						table += location.getCity();
					table += "</td>";
					table += "<td>";
						table += location.getState();
					table += "</td>";
					table += "<td>";
						table += location.getZip();
					table += "</td>";
					table += "</tr>";
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			table += "</table>";
			
			return table;
			}

		
		public Location getLocation() {
			return this.location;
		}
	}
		
