package ch15code;

public class Student  implements Comparable<Object> {
	//创建成员变量
	String name;                            		//关于学生的姓名
	int age;                               			//关于学生的年龄
	String sexy;                      				//关于学生的性别
	String code;                     				//关于学生的学号
	String school;                    			//关于学生所在学校的名称
	String grade;                         			//关于学生所在年级
	String major;                         			//关于学生的专业
	String address;                      			//关于学生家庭住址
	Student x;                            			//关于学生对象x
	Student y;                            			//关于学生对象y
	Student(String name) {             			          //带参构造函数
		this.name = name;                          //将参数值赋值给成员变量 
	}
	//关于各种参数的设置器
	public void set(int age, String sexy, String code, String school,
			String grade, String major, String address) {
		this.age = age;
		this.sexy = sexy;
		this.school = school;
		this.grade = grade;
		this.major = major;
		this.code = code;
		this.address = address;
	}
	//关于各种参数的访问器
	public String getname() {
		return name;
	}
	public String getcode() {
		return code;
	}
	public String getsexy() {
		return sexy;
	}
	public int getage() {
		return age;
	}
	public String getschool() {
		return school;
	}
	public String getmajor() {
		return major;
	}
	public String getgrade() {
		return grade;
	}
	public String getaddress() {
		return address;
	}
	public String toString() {                         //重写tostring()方法
		String information = "学生姓名：" + name + " " + "学号：" + code + " " + "性别"
				+ sexy + " " + "年龄：" + age + " " + "所在学校：" + school + " "
				+ "所学专业：" + major + " " + "所在年级：" + grade + " " 
				+ "家庭地址："+ address;
		return information;
	}
	//通过实现compareTo这个方法，来实现排序。
	public int compareTo(Object o) {
		Student st = (Student) o;                      //创建对象st
		return (age - st.age);
	}


}
