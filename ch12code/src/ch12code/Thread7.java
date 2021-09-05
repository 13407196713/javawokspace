package ch12code;

public class Thread7 {
	public static void main(String[] args) {      //主方法
	//创建两个线程对象t和t1
	Compute10 t = new Compute10();
	Compute11 t1 = new Compute11();
	//启动两个线程
		t.start();
		t1.start();
	}
}
//创建通过循环语句输出数字的类
class Compute10 extends Thread {   			           //创建继承线程的类compute
	int i = 0;                        			       //创建成员变量
	public void run() {          			           //实现run()方法
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
//			yield();             			           //让线程暂停
		}
	}
}
//创建通过循环语句输出数字的类
class Compute11 extends Thread { 			           //创建继承线程的类compute1
	public void run() {            			           //实现run()方法
		for (int i = 0; i < 10; i++) {
			System.out.println("这个数字是:" + i);
		}
	}

}
