package ch23code;
import java.util.Vector;
import java.sql.*;

public class Storesystem {

	public Vector<Student> getstudent(Connection con, String sql) {   
		Vector<Student> v = new Vector<Student>();
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString(1);
				String code = rs.getString(2);
				String sexy = rs.getString(3);
				String age = rs.getString(4);
				String address = rs.getString(5);
				String birthday = rs.getString(6);
				String grade = rs.getString(7);
				String major = rs.getString(8);

				Student ss = new Student(name, code);
				ss.setsexy(sexy);
				ss.setmajor(major);
				ss.setbirthday(birthday);
				ss.setaddress(address);
				ss.setage(age);
				ss.setgrade(grade);
				v.add(ss);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}

	// 查找
	public Student getobject(Connection con, String stname) {
		Student sst = null;
		try {
			Statement st = con.createStatement();
			String sql = "select * from studentinfo where stname='" + stname + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String code = rs.getString(2);
				String sexy = rs.getString(3);
				String age = rs.getString(4);
				String address = rs.getString(5);
				String birthday = rs.getString(6);
				String grade = rs.getString(7);
				String major = rs.getString(8);

				sst = new Student(stname, code);
				sst.setsexy(sexy);
				sst.setmajor(major);
				sst.setbirthday(birthday);
				sst.setaddress(address);
				sst.setage(age);
				sst.setgrade(grade);
		}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sst;
	}

	// 链接数据库
	public Connection getConnection() {
		Connection con = null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
