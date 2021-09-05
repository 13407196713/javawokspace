package ch10code;

public class Student2 implements school3{
	private String schoolname;
	private String classname;
	private String studentname;
	private String studentcode;
	private String studentsexy;
	private String studentbirthday;
	private String familyaddress;
	//通过设置器来设置各个参数
	public void setschoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public void setclassname(String classname) {
		this.classname = classname;
	}
	public void setname(String studentname) {
		this.studentname = studentname;
	}
	public void setcode(String studentcode) {
		this.studentcode = studentcode;
	}
	public void setsexy(String studentsexy) {
		this.studentsexy = studentsexy;
	}
	public void setbirthday(String studentbirthday) {
		this.studentbirthday = studentbirthday;
	}
	public void setfamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}
	//通过访问器来获得对象的参数
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	public String getname() {
		return studentname;
	}
	public String getcode() {
		return studentcode;
	}
	public String getsexy() {
		return studentsexy;
	}
	public String getbirthday() {
		return studentbirthday;
	}
	public String getfamilyaddress() {
		return familyaddress;
	}
	//通过tostring方法来让对象以字符串形式输出
	public String tostring() {
		String infor = "学校名称：" + schoolname + "  " + "班级名称：" + classname + "  "
				+ "学生姓名：" + studentname + "  " + "学号：" + studentcode + "  "
				+ "性别：" + studentsexy + "  " + "出生年月：" + studentbirthday + "  "
				+ "家庭地址：" + familyaddress;
	 return infor;       //返回字符串对象infor
}

}
