package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {

	private static Connection connection = null;
	
	public static Connection myConnect(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} try {
			
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment6","root","123456");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return connection;
	}
//prepare SQL statement for select *
	public PreparedStatement getPreparedStatement(String dbQuery) {
		PreparedStatement pstmt = null;		
		try {
			// create a statement object
			pstmt = connection.prepareStatement(dbQuery);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return pstmt;
	}
	
	public void terminate() {
		// close connection
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
