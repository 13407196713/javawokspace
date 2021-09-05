package ch17code;

public class Student {
	//创建成员变量
			String name;                 		//关于学生姓名属性
			int age;                     		//关于学生年龄属性
			String sexy;                 		//关于学生性别属性
			String code;                  	//关于学生学号属性
			String school;                	//关于学生所在学校属性
			String grade;                 	//关于学生所在年级属性
			String major;                  	//关于学生所学专业属性
			String address;               	//关于学生地址属性
			//创建两个student类型属性
			Student x;
			Student y;
			Student(String name) {       	   //无参构造函数
				this.name = name;        //将参数值赋值给成员变量
			}
			//带参构造函数
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
			//创建各种属性的访问器
			public String getname() {
				return name;
			}
			public String getcode() {
				return name;
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
			//重写toString()方法是让对象以字符串的形式输出的方法
			public String toString() {
				String information = "学生姓名：" + name + " " + "学号：" + code + " " + "性别"
						+ sexy + " " + "年龄：" + age + " " + "所在学校：" + school + " "
						+ "所学专业：" + major + " " + "所在年级：" + grade + " " + "家庭地址："
						+ address;
				return information;
			}

}
