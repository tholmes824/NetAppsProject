package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Location;

public class LocationQuery {
		private Connection connection;
		private ResultSet results;
		private String state;
		
		public LocationQuery(String dbName, String username, String pwd, String state) {
			String url = "jdbc:mysql://127.0.0.1:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				this.connection = DriverManager.getConnection(url, username, pwd);
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void doRead() {
			String query = "select * from Location = ?"; //need to edit logic to pull the right information
			
			try {
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setString(1, state);
				this.results = ps.executeQuery();
				this.results.next();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public String getHTMLTable() {
			String table = "";
			table += "<table border = 1>";
			
			try {
				while(this.results.next()) {
					Location location = new Location();
					location.setLocationID(this.results.getInt("locationID"));
					location.setName(this.results.getString("name"));
					location.setAddress1(this.results.getString("address1"));
					location.setAddress2(this.results.getString("address2"));
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
}
