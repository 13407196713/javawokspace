package ch12code;

public class Hmaker extends Thread {
	//make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
	public void make() {
		synchronized (Ham.box) {     			//创建同步块
			(Ham.production)++;
			try {
				Ham.box.notify();
			} catch (Exception e) {
			}
		}
	}
	public void run() {                 			//重写run()方法
		//使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
		while (Ham.production < Ham.totalmaterial) {
			//使用判断语句判断只要有汉堡包，厨师就通知营业员可以卖了
			if (Ham.production > 0) {
				System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共"
						+ (Ham.production - Ham.sales) + "个)");
			}
			try {
				sleep(3000);           			//线程休眠3秒
			} catch (Exception e) {
			}
			make();                   			//调用make()方法
		}
	}
}
