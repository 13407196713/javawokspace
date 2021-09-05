package ch12code;

public class Hassistant1  extends Thread{
	public void sell1() {          				//创建营业员卖汉堡包的方法sell1
		//当没有汉堡包的时候
		if (Ham1.production == (Ham1.sales1 + Ham1.sales2)) {
			System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下，汉堡包没了!!");
			Ham1.sales1 = 0;
			Ham1.production = 0;
			try {
				Ham1.box.wait();
			} catch (Exception e) {
			}
		}
		(Ham1.sales1)++;
		//输出相应信息
		System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总共卖了" + Ham1.sales1+ "个）");
	}
	public void sell2() {      					//创建营业员卖汉堡包的方法sell2
		//当没有汉堡包的时候
		if (Ham1.production == (Ham1.sales1 + Ham1.sales2)) {
			System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下，汉堡包没了!!");
			Ham1.sales2 = 0;
			Ham1.production = 0;
			try {
				Ham1.box.wait();
			} catch (Exception e) {
			}
		}
		(Ham1.sales2)++;
		//输出相应信息
		System.out.println("营业员" + getName() + "：顾客好，汉 堡包上来了，（总共卖了" + Ham1.sales2+ "个）");
	}
	public void run() {         				//重写run()方法
		//当箱子里面有汉堡包里有汉堡包的情况下不断的卖
		while ((Ham1.sales1 + Ham1.sales2) < Ham1.production) {
			sell1();       					//调用sell1()方法
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
		while ((Ham1.sales1 + Ham1.sales2) < Ham1.production) {
			try {
				sleep(1000);
			} catch (Exception e) {
			}
			sell2();             			//调用方法sell2()
		}
	}


}
