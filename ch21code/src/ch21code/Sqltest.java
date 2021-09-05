package ch21code;
import java.sql.*; 
public class Sqltest {
	 private Connection con;                     	   
     public static void main(String[] args)  		
    {
         Sqltest test=new Sqltest();        		
 	     Connection con=test.getConnection();   	
 	     String sql="select * from teacherinfo"; 	
         test.getStudent(con,sql);
 	    }
    public void getStudent(Connection con,String sql) 	
 	    {
 	        try
 	        {
	            Statement st=con.createStatement(); 	
 	            ResultSet rs=st.executeQuery(sql);
            while(rs.next())
	            {
 	                String name1=rs.getString(1);
	                String code1=rs.getString(2);
 	                String sexy1=rs.getString(3);
                    String age1=rs.getString(4);
	                System.out.println("\n姓名："+name1+"\t学号："+code1+"\t性别："+sexy1+"\t年龄："+age1);
	            }
 	            st.close();                        		
                con.close();                      		
 	        }
	        catch(Exception e){e.printStackTrace();}
     }
     public Connection getConnection()      		
	    {
         String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
         String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=schoolmanage";
         String userName="sa";
         String userPwd="123";
 	        try
 	        {
             Class.forName(driverName);
             con=DriverManager.getConnection(dbURL,userName,userPwd);
             System.out.println("success!");
 	        }catch(Exception e) {
 		        e.printStackTrace();
 		       System.out.print("fail!");
 		    }
 	        return con;                			
 	    }
}
