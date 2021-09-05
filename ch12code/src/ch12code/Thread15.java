package ch12code;

public class Thread15 {
	public static void main(String[] args) {		//主方法
		//创建对象maker1和maker2
		Hmaker2 maker1 = new Hmaker2();
		Hmaker3 maker2 = new Hmaker3();
		//创建对象assistant1和assistant2
		Hassistant2 assistant1 = new Hassistant2();
		Hassistant2 assistant2 = new Hassistant2();
		//设置相关属性
		maker1.setName("甲");
		maker2.setName("乙");
		assistant1.setName("甲");
		assistant2.setName("乙");
		//启动线程
		maker1.start();
		maker2.start();
		assistant1.start();
		assistant2.start();
	}

}
