package ch09code;

public class StudentClass {
	String name;                                     	//关于学生的姓名属性
			String code;                                //关于学生的编号属性
			String sexy;                                //关于学生的性别属性
			double achievement;                         //关于学生的成绩属性
			//通过方法set()设置了姓名、学号、性别、成绩等参数
			public void set(String name, String code, String sexy) {
				this.name = name;
				this.code = code;
				this.sexy = sexy;
			}
			//关于方法set()的多态
			public void set(double achievement) {      //定义一个设置成绩的方法set()
				this.achievement = achievement;        //将参数值赋给类中的成员变量
			}
			public String getname() {        		   //定义一个获取姓名的方法getname()
				return name;                           //返回name的值
			}
			public String getcode() {            	   //定义一个获取学号的方法getcode()获取属性code的值
				return code;                           //返回code的值
			}
			public String getsexy() {                  //定义一个获取性别的方法getsexy()获取属性sex的值
				return sexy;                           //返回sexy的值
			}
			public double getachi() {            	   //定义一个获取成绩的方法getachi()获取属性achievement的值
				return achievement;                    //返回achievement的值
			}
			public String toString() {     		       //通过toString方法可以让对象以字符串形式输出
				String infor = "学生姓名：" + name + "  " + "学号：" + code + "  " + "性别："
						+ sexy + "  " + "成绩：" + achievement;
				return infor;                           //返回字符串对象infor
			}

}
