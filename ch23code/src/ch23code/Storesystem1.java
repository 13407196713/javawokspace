package ch23code;

import java.sql.*;
import java.util.Vector;

public class Storesystem1 {
    public Vector<Teacher> getteacher(Connection con, String sql) {
        Vector<Teacher> v = new Vector<Teacher>();         			//创建容器对象v
        try {
            //创建会话对象st
            Statement st = con.createStatement();
            //创建结果集对象rs
            ResultSet rs = st.executeQuery(sql);
            //遍历结果集
            while (rs.next()) {
                //通过结果集中的getString()方法从数据库中表中提取表字段的数据
                String name = rs.getString(1);
                String code = rs.getString(2);
                String sexy = rs.getString(3);
                String age = rs.getString(4);
                String address = rs.getString(5);
                String birthday = rs.getString(6);
                String salary = rs.getString(7);
                String major = rs.getString(8);
                String duty = rs.getString(9);
                //把提取出来的数据赋值给教师对象。
                Teacher ss = new Teacher(name, code);
                ss.setsexy(sexy);
                ss.setmajor(major);
                ss.setbirthday(birthday);
                ss.setaddress(address);
                ss.setage(age);
                ss.setsalary(salary);
                ss.setduty(duty);
                v.add(ss);       				//将学生对象存储到Vector数据结构中

            }
            rs.close();                  				//关闭结果集
        } catch (Exception e) {
            e.printStackTrace();
        }
        return v;                                  		//返回结果集对象
    }

    //查找名为stname的领导对象
    public Teacher getobject(Connection con, String stname) {
        Teacher sst = null;          				//创建教师变量
        try {
            Statement st = con.createStatement();	//创建会话对象st
            //创建关于查询教师的SQL语句
            String sql = "select * from teacherinfo where stname='" + stname + "'";
            ResultSet rs = st.executeQuery(sql);	//获取结果集对象rs
            //遍历结果集rs，获取教师的相关信息
            while (rs.next()) {
                //通过结果集中的getString()方法从数据库中表中提取表字段的数据
                String code = rs.getString(2);
                String sexy = rs.getString(3);
                String age = rs.getString(4);
                String address = rs.getString(5);
                String birthday = rs.getString(6);
                String salary = rs.getString(7);
                String major = rs.getString(8);
                String duty = rs.getString(9);
                //将获取到的数据赋值给领导对象sst
                sst = new Teacher(stname, code);
                sst.setsexy(sexy);
                sst.setmajor(major);
                sst.setbirthday(birthday);
                sst.setaddress(address);
                sst.setage(age);
                sst.setsalary(salary);
                sst.setduty(duty);
            }
            rs.close();                      			//关闭结果集对象
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sst;                         			//返回教师对象
    }

    //通过设置数据库的URL、密码、用户名来建立与数据库的连接
    public Connection getConnection() {
        //创建数据库各种连接对象

        Connection con = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取数据库连接对象con
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
