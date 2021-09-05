package ch12code;

public class Student implements Runnable, school{
	String schoolname;                			//关于学校名称的属性
	String grade;                       			//关于所在年级的属性
	String studentname;                 			//关于学生姓名的属性
	String studentcode;                  			//关于学生学号的属性
	String studentsexy;                			//关于学生性别的属性
	String studentcourse;                			//关于学生课程的属性
	String studentavg;                 			//关于学生课程平均分属性
	//构造函数
	public Student(String studentname, String studentcode, String studentsexy,String studentcourse) {
		//实现成员变量初始化
		this.studentname = studentname;
		this.studentcode = studentcode;
		this.studentsexy = studentsexy;
		this.studentcourse = studentcourse;
		this.tostring();
	}
	//设置属性schoolname和grade的值
	public void set(String schoolname, String grade) {
		this.schoolname = schoolname;
		this.grade = grade;
	}
	//关于属性schoolname和grade的访问器
	public String getschool() {
		return schoolname;
	}
	public String getgrade() {
		return grade;
	}
	public void run() {                     			//实现run()方法
		int i = 1;
		int avg = 85;
		for (; i < 13; i++) {
			System.out.println("这个学生的平均成绩是：" + i + "月" + (avg + i * 2));
		}
	}
	public String tostring() {                 		//重写tostring()方法
		String information = "学校名称：" + schoolname + ";" + "  " + "所读年级："
				+ grade + ";" + "  " + "学生姓名：" + studentname + ";" + "  "
				+ "学生学号：" + studentcode + ";" + "  " + "学生性别：" + studentsexy
				+ ";" + "  " + "所读专业：" + studentcourse + ";" + "  " + "学生平均分"
				+ studentavg;
		return information;               			//返回字符串对象information
	}


}
