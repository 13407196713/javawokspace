package ch11code;

public class HelloImp implements IHello{
	public void toHello(String name) {           //实现toHello()方法
		System.out.println("hello:" + name);
	}
}
