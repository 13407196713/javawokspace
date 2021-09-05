package ch21code;
import java.util.Vector;
import java.sql.*;
public class Querytable {
	public Vector<Student1> getteacher(Connection con) { 		
		Vector<Student1> v = new Vector<Student1>();              		
		try {
			Statement st = con.createStatement();	
			String sql = "select * from teacherinfo";	
			ResultSet rs = st.executeQuery(sql);	
			while (rs.next()) {                		
				String name = rs.getString(1);
				String code = rs.getString(2);
				String sexy = rs.getString(3);
				String major1 = rs.getString(4);
				String birthday = rs.getString(5);
				Student1 ss = new Student1(name, code);
				ss.setteachersex(sexy);
				ss.setteachermajor(major1);
				ss.setteacherbirthday(birthday);
				v.add(ss);                   
			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;                   					
	}
}
