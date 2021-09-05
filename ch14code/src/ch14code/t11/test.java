package ch14code.t11;

import java.sql.*;

public class test {
    public static void main(String[] args){

        try {
            //链接数据库

            // 注册 JDBC 驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stu","root","123456");
            Statement s = conn.createStatement();

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
