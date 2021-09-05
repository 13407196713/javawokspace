package ch09code;

public class StudentMen extends StudentClass{
	String  post;                            //创建成员变量post
    public void set(String post) {           //定义一个方法set()
        this.post= post;                     //将参数值赋给类中的成员变量
      }
      public String toString(){              //通过toString方法可以让对象以字符串形式输出
          String infor="学生姓名：" + name + "  " + "学号：" + code + "  " + "性别："+ sexy + "  " +"职务：" + post + "  " + "成绩：" + achievement;
          return infor;                      //返回字符串对象infor
      }

}
