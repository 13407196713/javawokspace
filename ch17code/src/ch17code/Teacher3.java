package ch17code;

public class Teacher3 {
	//创建成员变量
	private String schoolname;          	 //关于教师所在学校名称属性
	private String classname;           	 //关于教师所教班级名称属性
	private String teachername;              //关于教师姓名属性
	private int teachercode;                 //关于教师工号属性
	private String teachersexy;              //关于教师性别属性
	private String teacherbirthday;          //关于教师出生年月属性
	private String familyaddress;            //关于教师家庭地址属性
	//带参构造函数
	public Teacher3(String teachername, int teachercode, String teachersexy,String teacherbirthday) {
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teacherbirthday = teacherbirthday;
	}
	public int compareTo(Object o) {     	                //实现方法compareTo
		Teacher3 t = (Teacher3) o;           	            //转换成teacher3对象
		return (this.teachercode - t.teachercode);

	}
	//关于各个属性的访问器和设置器
	public String getname() {
		return teachername;
	}
	public int getcode() {
		return teachercode;
	}
	public String getsexy() {
		return teachersexy;
	}
	public String getbirthday() {
		return teacherbirthday;
	}
	public void setschoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public void setclassname(String classname) {
		this.classname = classname;
	}
	public void setfamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}
	public String getschoolname() {
		return schoolname;
	}
	public String getclassname() {
		return classname;
	}
	public String getfamilyaddress() {
		return familyaddress;
	}
	//重写toString()方法以使得对象能够以字符串形式输出的方法
	public String toString() {
		String infor = "学校名称：" + schoolname + "  " + "班级名称：" + classname + "  "
				+ "教师姓名：" + teachername + "  " + "教师工号：" + teachercode + "  "
				+ "性别：" + teachersexy + "  " + "出生年月：" + teacherbirthday + "  "
				+ "家庭地址：" + familyaddress;
		return infor;             		//返回字符串对象infor
	}


}
