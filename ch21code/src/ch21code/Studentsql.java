package ch21code;
import java.sql.*;
import java.util.Vector;
public class Studentsql {
	public static void main(String[] args) {  		
		try {
			Dbconnection db = new Dbconnection();	
			Connection con1 = db.getConnection();
			Querytable query = new Querytable();
			Vector<Student1> v1 = query.getteacher(con1);	
			System.out.println("目前vector中的学生个数为：" + v1.size());
			for (int i = 0; i < (v1.size()); i++) {
				System.out.println((Student1) v1.get(i)); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
