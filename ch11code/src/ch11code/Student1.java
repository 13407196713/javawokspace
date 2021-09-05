package ch11code;

public class Student1 extends School {
	String studentname;              			//创建学生姓名
	String studentcode;               			//创建学生学号
	String studentsexy;                 			//创建学生性别
	String studentbirthday;            			//创建学生出生年月
	String studentaddress;                		//创建学生家庭地址
	//设置各属性的设置器和访问器
	void setlocation(String location) {
		this.location = location;
	}
	String getlocation() {
		return location;
	}
	void setstudentname(String studentname) {
		this.studentname = studentname;
	}
	void setstudentcode(String studentcode) {
		this.studentcode = studentcode;
	}
	void setstudentsexy(String studentsexy) {
		this.studentsexy = studentsexy;
	}
	void setstudentbirthday(String studentbirthday) {
		this.studentbirthday = studentbirthday;
	}
	void setstudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	String getstudentname() {
		return studentname;
	}
	String getstudentcode() {
		return studentcode;
	}
	String getstudentsexy() {
		return studentsexy;
	}
	String getstudentbirthday() {
		return studentbirthday;
	}
	String getstudentaddress() {
		return studentaddress;
	}
	//重写tostring()方法
	public String tostring() {
		String infor = super.tostring() + "学校地址：" + location + ";" + "  " + " 学生姓名：" + studentname + ";" + "  " + "学号：" + studentcode + ";" + "  "
				+ "性别：" + studentsexy + ";" + "  " + "出生日期：" + studentbirthday
				+ ";" + "  " + "家庭地址：" + studentaddress;
		return infor;               //返回infor的内容
	}


}
