package ch12code;

public class Thread9 {
	public static void main(String[] args) {      //主方法
		//创建两个线程对象t和t1
		Compute13 t = new Compute13('a');
		Compute13 t1 = new Compute13('b');
		//启动两个线程
			t.start();
			t1.start();
		}
	}
//创建通过循环语句输出数字的类
class Compute13 extends Thread {     			     //创建继承线程的类cCompute
	char ch;                      			         //创建成员变量ch
	Compute13(char ch) {            			     //构造函数
		this.ch = ch;
	}
	public void print(char ch) {       		        //创建print()方法
		for (int i = 0; i < 10; i++) {		        //通过循环输出数字
			System.out.print(ch);
		}
	}
	public void run() {            			        //实现方法run()
		print(ch);                 			        //调用print()方法
		System.out.println();    			        //输出回车
				}

}
