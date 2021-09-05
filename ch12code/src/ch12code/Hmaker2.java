package ch12code;

public class Hmaker2 extends Thread{
	//make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
	public void make() {
		synchronized (Ham2.box1) { 			//创建同步块
			(Ham2.production1)++;
			//输出相应的信息
			System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共" + (Ham2.production1 - Ham2.sales11 - Ham2.sales12) + "个A类汉堡包)");
			try {
				Ham2.box1.notify();
			} catch (Exception e) {
			}
		}
	}

	public void run() {           			          //重写run()方法
		//使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
		while (Ham2.production1 < Ham2.totalmaterial1) {
			make();					            //调用make()方法
			try {
				sleep(3000);				     //线程休眠3秒
			} catch (Exception e) {
			}
		if (Ham2.production1 == Ham2.totalmaterial1) {
			System.out.println("所有的材料用完了！");
		}		}
	}
}


