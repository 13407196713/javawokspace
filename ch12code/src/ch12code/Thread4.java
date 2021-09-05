package ch12code;

public class Thread4 {
	public static void main(String[] args) {    //主方法
	//创建两个线程对象t和t1
	Compute6 t = new Compute6();
	Compute7 t1 = new Compute7();
	//启动两个线程
		t.start();
		t1.start();
	}
}
//创建通过循环语句输出数字的类
class Compute6 extends Thread {     			//创建继承线程的类cCompute
	int i = 0;                     			    //创建成员变量
	public void run() {        				    //实现run()方法
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				sleep(1000);  			        //线程休眠1秒
			} catch (Exception e) {
			}
		}
	}
}
//创建通过循环语句输出数字的类
class Compute7 extends Thread { 			     //创建继承线程的类cCompute1
	public void run() {       				     //实现run()方法
		for (int i = 0; i <=4; i++) {
			System.out.println("这个数字是:" +(2*i+1));
			try {
				sleep(2000);  				     //线程休眠2秒
			} catch (Exception e) {
			}
		}
	}

}
