package ch21code;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class OCITest {
	public static void main(String args[]){
		try{ 
			Class.forName("oracle.jdbc.driver.OracleDriver"); 	
			Connection conn = DriverManager.getConnection("jdbc:oracle:oci:@orcl","system","123");
			Statement stmt = conn.createStatement();     		
			ResultSet rs = stmt.executeQuery("select * from teacherinfo");
		    System.out.println("记录内容：");
			System.out.println("\tID号\t姓名\t电话号码" );
			while(rs.next()){
				System.out.print("\t" + rs.getInt(1));
				System.out.print("\t" + rs.getString(2));
				System.out.println("\t" + rs.getInt(3));
				System.out.println();
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
		    e.printStackTrace();
		}
	}

}
