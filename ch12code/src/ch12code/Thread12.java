package ch12code;

public class Thread12 {
	public static void main(String[] args) {                           //主方法
		Compute16 t = new Compute16();			          //创建对象t
		//启动3个线程对象
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}
//创建通过循环语句输出数字的类
class Compute16 extends Thread {     			        //创建继承线程的类compute
	int i = 10;                     			       //创建成员变量i
	static Object obj = new Object();		           //创建静态对象obj
	synchronized void print() {     		           //创建输出方法
		//输出相应信息
		System.out.println(Thread.currentThread().getName() + ":" + i);
		i--;                     				   //自减
	}
	public void run() {            			      //重写方法run()
		while (i > 0) {
			print();           				      //调用方法print()
			try {
				sleep(1000);    			      //休眠1秒
						} catch (Exception e) {
						}
					}
				}
    }
