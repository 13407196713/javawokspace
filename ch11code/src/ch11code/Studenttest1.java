package ch11code;

public class Studenttest1 {
	public static void main(String[] args)			       //主方法
	    {
	        Student st=new Student("张杰","200111","20","男");  //创建对象st
	    }
}

class Student {
    String name;                          			//创建成员变量name
    String code;                           			//创建成员变量code
    String age;                          			//创建成员变量age
    String sexy;                          			//创建成员变量sexy
    public Student(String name,String code,String age,String sexy)    //定义一个方法student

    {
        this.name=name;                                 //将参数值赋给类中的成员变量
        this.code=code;
        this.age=age;
        this.sexy=sexy;
        System.out.println("这个学生的学生姓名："+name+" "+"学号:"+code+" "+"年龄："+age+" "+"性别："+sexy);                             //输出学生信息
    }
}