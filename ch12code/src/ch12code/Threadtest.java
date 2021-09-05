package ch12code;

public class Threadtest {

	public static void main(String[] args) {         //主方法
		//创建对象c和c1   
		Compute c = new Compute();
		Compute1 c1 = new Compute1();
		//创建线程对象t和t1
		Thread t = new Thread(c);
		Thread t1 = new Thread(c1);
		t.start();                    			      //启动线程对象t
		t1.start();                 				  //启动线程对象t1
		}

}

class Compute1 implements  Runnable{
	public void run() {                  			//实现方法run()
		for (int i = 0; i < 10; i++) {
			System.out.println("这个数字是:" + i);
		}
	}

}

class Compute implements  Runnable{
	int i = 0;                             			     //创建成员变量i
	public void run() {                  			     //实现方法run()
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
