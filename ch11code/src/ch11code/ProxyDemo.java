package ch11code;

public class ProxyDemo {
	public static void main(String[] args) throws SecurityException,
					NoSuchMethodException {    //主方法
		//创建动态代理类对象
		ProxyHand ProxyHandler = new ProxyHand(new AdviceImp());
		//实例化动态代理类对象
		IHello hello = (IHello) ProxyHandler.bind(new HelloImp());
		hello.toHello("callan");                             //调用目标对象的相应方法
	}

}
