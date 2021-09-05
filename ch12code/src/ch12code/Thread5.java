package ch12code;

public class Thread5 {
	public static void main(String[] args) {        //主方法
		Compute8 t = new Compute8();     			    //创建线程对象t
		t.start();                     			    //启动线程t
	}
}
//创建一个线程类，在这个类中，通过休眠来输出不同结果
class Compute8 extends Thread {
	int i = 0;                        				 //创建成员变量i
	public void run() {           				     //实现run()方法
		//输出相应信息
		System.out.println("在工作中，不要打扰");
		try {
			sleep(1000000);           			     //休眠1000秒
		} catch (Exception e) {
			System.out.println("哦，电话来了");	         //输出相应信息
		}
	}

}
