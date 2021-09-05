package ch12code;

public class Thread10 {
	public static void main(String[] args) {  //主方法
		//创建两个线程对象t、t1和t2
		Compute14 t = new Compute14('a');
		Compute14 t1 = new Compute14('b');
		Compute14 t2 = new Compute14('c');
		//启动3个线程
		t.start();
		t1.start();
		t2.start();
	}
			}
//创建通过循环语句输出数字的类
class Compute14 extends Thread {    			       //创建继承线程的类compute
	char ch;                        			       //创建成员变量ch
	static Object obj = new Object();		           //创建静态对象obj
	Compute14(char ch) {             			       //构造函数
		this.ch = ch;
	}
	public void print(char ch) {  			           //创建print()方法
		for (int i = 0; i < 10; i++) { 	               //通过循环输出数字
			System.out.print(ch);
		}
	}
	public void run() {               		          //实现方法run()
		synchronized (obj) {         		          //创建静态块
		for (int i = 1; i < 10; i++) {	              //实现循环
			print(ch);           		             //调用方法print()
						System.out.println();
					}
			}	}

}
