package login.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connection.DBConnection;
import login.pojo.LoginEncap;

//data access

public class LoginDAO {

	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;

	
		// Validates
	//Username & password
	public LoginEncap retrieveUserName (String userName){
		boolean success = false;
		//Customer
		LoginEncap le = null;
		ResultSet rs = null;
		DBConnection db = new DBConnection();
		String dbQuery;
		PreparedStatement ps;

		// step 1 - connect to database db.getConnection();
		//DBConnection.myConnection();
		DBConnection.myConnect();
		
		// step 2 - declare the SQL statement
		dbQuery = "SELECT * FROM login WHERE userName = ?";
		ps = db.getPreparedStatement(dbQuery);

		// step 3 - execute query
		try {
			ps.setString(1, userName);
			rs = ps.executeQuery();
			if (rs.next()) { // first record found
				le = convertToLogin(rs);
				success = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		// step 4 - close connection
		db.terminate();
		return le;
	}
	
	//convert resultset to usable Java data type
	private LoginEncap convertToLogin(ResultSet rs) throws SQLException{
		
		LoginEncap le;
		
		String userName = rs.getString("userName");
		String pw = rs.getString("userPassword");
		int empID = rs.getInt("empID");

		le = new LoginEncap(userName,pw,empID);
		
		return le;
	}
	
	public void createData() throws SQLException{
		
		con = DBConnection.myConnect();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from login");
		
		Scanner sc = new Scanner(System.in);
		while(rs.next())
		System.out.println(rs.getInt(1)+ " "+rs.getString(2));
		con.close();
		
		System.out.println("Register userName :");
		String userName = sc.nextLine();
		
		
	}
	
	void insertData() throws SQLException{ 
		con = DBConnection.myConnect();
		ps=con.prepareStatement("insert into employee values(?,?)");
		//ps.setInt(2,); // 1 specifies the first parameter in the query
		ps.setString(2,"Daryl");
		ps.setString(3, "Bedok");
		
		int i=ps.executeUpdate();
		System.out.println(i+" records inserted");
	}
	
}


