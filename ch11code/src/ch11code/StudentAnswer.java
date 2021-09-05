package ch11code;

public class StudentAnswer extends Thread{
	private String name;           			//关于学生姓名属性
			private String age;              		//关于学生年龄属性
			private String school;       			//关于学生所在学校属性
			private String grade;          			//关于学生所在年级属性
			private String year;        			//关于学生年属性
			private String month;           			//关于学生月属性
			private String days;         			//关于学生日子属性
			private int x;
			//关于属性的设置器方法
			public void set(String name, String age, String school, String grade,
					String year, String month, String days) {
				this.name = name;
				this.age = age;
				this.school = school;
				this.grade = grade;
				this.year = year;
				this.month = month;
				this.days = days;
			}
			//关于属性的访问器方法
			public void setint(int x) {
				this.x = x;
			}
			public String getname() {
				return name;
			}
			public String getage() {
				return age;
			}
			public String getschool() {
				return school;
			}
			public String getgrade() {
				return grade;
			}
			public String getyear() {
				return year;
			}
			public String getmonth() {
				return month;
			}
			public String getdays() {
				return days;
			}
			public int getint() {
				return x;
			}
			private void said() {       		      //关于学生回答内容的方法
				switch (x) {             		//通过一个分支语句来控制回答的步骤
				case 0:                     		//当为0时
					System.out.println(name + "说：我名字叫" + name + "。");
					break;
				case 1:                     		//当为1时
					System.out.println(name + "说：我在" + school + "读书。");
					break;
				case 2:                     		//当为2时
					System.out.println(name + "说：我现在在读" + grade + "。");
					break;
				case 3:                     		//当为3时
					System.out.println(name + "说：我今年" + age + "岁。");
					break;
				case 4:                     		//当为4时
					System.out.println(name + "说：我学习计算机软件开发" + year + "年。");
					break;
				case 5:                     		//当为5时
					System.out.println(name + "说：今年" + month + "月放假。");
					break;
				case 6:                     		//当为6时
					System.out.println(name + "说：一般放假的天数是" + days + "天。");
					break;
				case 7:                     		//当为7时
					System.out.println(name + "说：不客气。");
					break;
				}
			}
			public void run() {          		//重写方法run()
				said();
				try {
					sleep(2000);           		//线程休眠2秒
				} catch (Exception e) {
				}
			}


}
