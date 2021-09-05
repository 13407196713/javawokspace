package ch11code;

public class Thread46 {
	public static void main(String[] args) throws Exception {        //主方法
					//创建几个学生回答结果的对象
		StudentAnswer sa1 = new StudentAnswer();
		StudentAnswer sa2 = new StudentAnswer();
		StudentAnswer sa3 = new StudentAnswer();
		StudentAnswer sa4 = new StudentAnswer();
		StudentAnswer sa5 = new StudentAnswer();
		StudentAnswer sa6 = new StudentAnswer();
		StudentAnswer sa7 = new StudentAnswer();
		StudentAnswer sa8 = new StudentAnswer();
		//创建几个教师提问内容的对象
		TeacherAsk ta1 = new TeacherAsk();
		TeacherAsk ta2 = new TeacherAsk();
		TeacherAsk ta3 = new TeacherAsk();
		TeacherAsk ta4 = new TeacherAsk();
		TeacherAsk ta5 = new TeacherAsk();
		TeacherAsk ta6 = new TeacherAsk();
		TeacherAsk ta7 = new TeacherAsk();
		TeacherAsk ta8 = new TeacherAsk();
		//创建关于学生回答结果数组
		StudentAnswer[] stt = new StudentAnswer[] { sa1, sa2, sa3, sa4, sa5,sa6, sa7, sa8 };
		//创建关于教师提问内容数组
		TeacherAsk[] stt1 = new TeacherAsk[] { ta1, ta2, ta3, ta4, ta5, ta6,
				ta7, ta8 };
		try {
			//通过一个循环语句将对象集合中元素输出。并且是按线程运行方式交叉运行
			for (int x = 0; x < 8; x++) {      		//通过循环实现遍历
				//通过设置器来设置属性
				stt[x].set("TOM", "22", "重庆大学", "自动化系二年级", "3", "7", "54");
				stt1[x].set("John老师");
				stt1[x].setint(x);
				stt[x].setint(x);
				//启动线程
				stt1[x].start();
				stt[x].start();
			}
		} catch (Exception e) {
		}
	}


}
