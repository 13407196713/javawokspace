package ch12code;

public class Thread1 {
	public static void main(String[] args) {    	//主方法
		//创建对象t
		Teacher t = new Teacher("董洁", "22334", "女", "英语");
		t.set("上海师范学院", "三年级");
		Thread th = new Thread(t);       		//创建线程对象th
		//创建对象s
		Student s = new Student("张俊", "978003", "男", "计算机");
		s.set("北京大学", "大四");
		Thread th1 = new Thread(s);          		//创建线程对象th1
		//启动线程th和th1
		th.start();
		th1.start();
	}

}
