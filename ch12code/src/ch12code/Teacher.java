package ch12code;

public class Teacher implements Runnable, school{
	String schoolname;             			     //关于学校名称的属性
	String grade;                      		    //关于老师所在年级的属性
	String teachername;                  		//关于老师姓名的属性
	String teachercode;                 		//关于老师工号的属性
	String teachersexy;                  		//关于老师性别的属性
	String teachercourse;               		//关于老师所教的课程的属性
	String teachersalary;                		//关于老师薪水的属性
	//构造函数
	public Teacher(String teachername, String teachercode, String teachersexy,
			String teachercourse) {
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teachercourse = teachercourse;
		this.tostring();
	}
	//关于属性schoolname和grade的访问器和设置器
	public void set(String schoolname, String grade) {
		this.schoolname = schoolname;
		this.grade = grade;
	}
	public String getschool() {
		return schoolname;
	}
	public String getgrade() {
		return grade;
	}
	public void run() {                  			//实现方法run()
		int i = 1;
		int teachersalary = 2000;
		for (; i < 13; i++) {
			System.out.println("这个老师的薪水是：" + i + "月"
					+ (teachersalary + i * 300));
		}
	}
	public String tostring() {       			//重写tostring()方法
		String information = "学校名称：" + schoolname + ";" + "  " + "所教年级："
				+ grade + ";" + "  " + "教师姓名：" + teachername + ";" + "  "
				+ "教师工号：" + teachercode + ";" + "  " + "教师性别：" + teachersexy
				+ ";" + "  " + "所教课程：" + teachercourse + ";" + "  " + "教师薪水"
				+ teachersalary;
		return information;           			//返回字符串对象information
	}

}
