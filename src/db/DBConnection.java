package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection con=null;
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String userName="SYSTEM";
		String password="root";
		if(con==null) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, userName, password);
		}
		return con;
			
	}
	
}
