package ch23code;

import java.sql.*;

public class Sqltest {
	private Connection con;             //创建关于数据库连接对象
	public Sqltest(Connection con) { //构造函数
		try {
			con=this.getConnection();       			//调用方法返回数据库连接对象
		}catch(Exception e) {
			e.printStackTrace();}
		}

		public Connection getConnection()         		//返回数据库连接对象
		{
			String drivername="com.microsoft.sqlserver.jdbc.SQLServerDriver";
			String url1="jdbc:sqlserver://localhost:1433;DatabaseName=schoolmanage";  		   //关于数据库url地址
			String username="root";                     			//关于用户名变量
			String password="123456";                       		//关于密码变量
			try                                     			//加载数据库驱动
			{
				Class.forName(drivername);
				con=DriverManager.getConnection(url1,username,password);
			}
			catch(SQLException e){e.printStackTrace();}
			catch(ClassNotFoundException ex){ex.printStackTrace();}
			return con;                         				//返回数据库连接
	}

}
