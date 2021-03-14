package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection con = null;
	
	public Connection getConncetion() throws ClassNotFoundException, SQLException {
		String url = "localhost";
		String userName = "SYSTEM";
		String password = "root";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		if(con==null) {
			con = DriverManager.getConnection(url,userName,password);
			
		}
		
		return con;
		
	}
}
