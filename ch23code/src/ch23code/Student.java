package ch23code;

public class Student {
	private String name;             			//关于学生的姓名
	private String code;               			//关于学生的编号
	private String sexy;             			//关于学生的性别
	private String birthday;           			//关于学生的生日
	private String address;           			//关于学生的地址
	private String age;                 			//关于学生的年龄
	private String grade;              			//关于学生的班级
	private String major;             			//关于学生的专业

	//构造函数
	Student(String name, String code) { 		//带参构造函数
		this.name = name;
		this.code = code;
	}

	//设置属性的getter方法和setter方法
	public String getname() {
		return name;
	}
	public String getcode() {
		return code;
	}
	public void setsexy(String sexy) {
		this.sexy = sexy;
	}
	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setage(String age) {
		this.age = age;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public void setgrade(String grade) {
		this.grade = grade;
	}
	public void setmajor(String major) {
		this.major = major;
	}
	public String getsexy() {
		return sexy;
	}
	public String getbirthday() {
		return birthday;
	}
	public String getage() {
		return age;
	}
	public String getaddress() {
		return address;
	}
	public String getgrade() {
		return grade;
	}
	public String getmajor() {
		return major;
	}
	public String toString() {            		//重写toString()方法
	String information = "学生姓名：" + name + "学号：" + code + "年龄：" + age
			+ "出生年月：" + birthday + "家庭地址：" + address + "班级：" + grade
			+ "专业：" + major;
	return information;
	}
}
