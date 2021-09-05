package ch11code;

public class People1 {
	@Deprecated            					//标注为过时方法
	public void sayHello() {
		System.out.println("已经过时的方法");    //创建方法sayHello
	}
	public void sayHello1() {//创建方法
		System.out.println("现在的方法");
	}

}
