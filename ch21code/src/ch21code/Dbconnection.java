package ch21code;
import java.sql.*;
public class Dbconnection {
	private Connection con;         					
	public Connection getConnection() {			
         String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
         String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=schoolmanage";
         String userName="sa";
         String userPwd="123";                        
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(dbURL, userName, userPwd);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
		ex.printStackTrace();
	}
		return con;                 				
	}
}
