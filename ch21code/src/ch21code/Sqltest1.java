package ch21code;
import java.sql.*;
public class Sqltest1 {
	private Connection con;             				
	public static void main(String[] args) {		               
		try {
			Sqltest1 test = new Sqltest1();   		
			Connection con = test.getConnection();	
		    con.setAutoCommit(false);    			
			//创建关于SQL语句字符串
			String sql = "select * from teacherinfo";
			String sql1 = "insert into teacherinfo values('朱雪莲','674322','女','24','1981-1-6', '上海市','5000')";
			//输出相应信息
			System.out.println("插入数据后的数据是：");
			//获取相关学生信息
			test.getStudent1(sql1);
			test.getStudent(con, sql);
			con.rollback();             				     
			System.out.println("回滚数据后的数据是：");
			test.getStudent(con, sql);    			
		} catch (Exception e) {
		}
	}
	public void getStudent1(String sql) {    		               
		try {
			Statement st = con.createStatement(); 	
			st.executeUpdate(sql);        			
			st.close();
			con.close();
		} catch (Exception e) {
		}
	}
	public void getStudent(Connection con, String sql) {                
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {                 		
				String name1 = rs.getString(1);
				String code1 = rs.getString(2);
				String sexy1 = rs.getString(3);
				String age1 = rs.getString(4);
				System.out.println("\n姓名：" + name1 + "\t学号：" + code1 + "\t性别："+ sexy1 + "\t年龄：" + age1);
			}
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Connection getConnection() {    				
        String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
		String url1 = "jdbc:sqlserver://localhost:1433;DatabaseName=schoolmanage"; 		
		String username = "sa";                    	
		String password = "123";                  			
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url1, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		return con;                          			
	}

}
