package ch12code;

public class Thread13 {
	public static void main(String[] args) {	//主方法
		Hmaker maker = new Hmaker();           	//创建对象maker
		Hassistant assistant = new Hassistant();//创建对象assistant
		//对对象maker进行设置
		maker.setName("甲");  
		//启动线程
		maker.start();
		assistant.start();
	}
}
