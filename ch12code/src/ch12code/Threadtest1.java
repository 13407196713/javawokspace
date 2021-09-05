package ch12code;

public class Threadtest1 {
	public static void main(String[] args) {	          //主方法
		//创建对象t和t1
		Compute2 t = new Compute2();
		Compute3 t1 = new Compute3();
		//启动对象t和t1
		t.start();
		t1.start();
	}
}

class Compute2 extends Thread {       			      //创建继承线程的类cCompute
	int i = 0;                              		  //创建成员变量i
	public void run() {                     		  //实现方法run()
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class Compute3 extends Thread {           		            //创建继承线程的类cCompute1
	public void run() {                     		    //实现方法run()
		for (int i = 0; i < 10; i++) {
			System.out.println("这个数字是:" + i);
		}
	}

}

