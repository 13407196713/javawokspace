package ch14code.t11;

import java.sql.*;

public class test1 {
    public static void main(String[] args){

        try {
            //链接数据库

            // 注册 JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","123456");

            String sql = "insert into websites(id, name, url, alexa, country) values (?,?,?,?,?)";
            PreparedStatement s = conn.prepareStatement(sql);
            s.setInt(1,7);
            s.setString(2,"asd");
            s.setString(3,"www.???.com");
            s.setInt(4, 4);
            s.setString(5, "china");
            s.executeUpdate();

            // 获取结果集
            ResultSet r = s.executeQuery("select * from websites");


            while(r.next()){
                System.out.println(r.getInt("id") + " " + r.getString("name") + " " + r.getString("url")  + "\n");
            }

            r.close();
            s.close();
            conn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
