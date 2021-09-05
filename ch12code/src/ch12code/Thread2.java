package ch12code;

public class Thread2 {
	public static void main(String[] args) {     //主方法
		//创建两个线程对象t和t1
		cCompute t = new cCompute();
		cCompute1 t1 = new cCompute1();
		//设置线程对象t和t1的优先级
		t.setPriority(10);
		t1.setPriority(1);
		//启动两个线程
		t.start();
		t1.start();
		try {
			Thread.sleep(5000);   			//等待5秒钟
			} catch (InterruptedException e) {
			}
		}
}
//创建通过循环语句输出数字的类
class cCompute extends Thread {         		           //创建继承线程的类compute
	int i = 0;                          		//创建成员变量
	public void run() {         		                //实现run()方法
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
//创建通过循环语句输出数字的类
class cCompute1 extends Thread {  		//创建继承线程的类compute1
	public void run() {           		//实现run()方法
		for (int i = 0; i < 10; i++) {
			System.out.println("这个数字是:" + i);
		}
	}

}
