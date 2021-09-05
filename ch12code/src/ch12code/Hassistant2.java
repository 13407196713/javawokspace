package ch12code;

public class Hassistant2 extends  Thread{
	public void sell1() {      				//创建营业员卖汉堡包的方法sell1
		//当没有汉堡包的时候
		if (Ham2.production1 == (Ham2.sales11 + Ham2.sales12)) {
			System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下,A汉堡包没了!!");
			Ham2.sales11 = 0;
			Ham2.sales12 = 0;
			Ham2.production1 = 0;
			try {
				Ham2.box1.wait();
			} catch (Exception e) {
			}
		} else {
			if (Ham2.production1 > (Ham2.sales11 + Ham2.sales12)) {
			Ham2.sales11++;
				Ham2.sales21++;
				//输出相应信息
				System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总 共卖了 A类汉堡包"
						+ Ham2.sales11 + "个），总共卖了B类汉堡包" + Ham2.sales21 +"个）");
			}
		}
	}
	public void sell2() {               			//创建营业员卖汉堡包的方法sell2
		//当没有汉堡包的时候
		if (Ham2.production2 == (Ham2.sales21 + Ham2.sales22)) {
			System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下，B型汉堡包没了!");
			Ham2.sales21 = 0;
			Ham2.sales22 = 0;
			Ham2.production2 = 0;
			try {
				Ham2.box2.wait();
			} catch (Exception e) {
			}
		}else {
			if (Ham2.production2 > (Ham2.sales21 + Ham2.sales22)) {
				Ham2.sales12++;
				Ham2.sales22++;
				//输出相应信息
				System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总共卖了A类汉堡包"
						+ Ham2.sales12 + "个，总共卖了B类汉堡包" + Ham2.sales22 + "个");
			}
		}
	}
	public void run() {                			//重写run()方法
		//当盒子里面有汉堡包里有汉堡包的情况下不断的卖
		while ((Ham2.sales12 + Ham2.sales11) < Ham2.production1) {
			try {
				sleep(1000);        			//线程休眠1秒
			} catch (Exception e) {
			}
			sell1();                 			//调用方法sell1()
		}
		while ((Ham2.sales12 + Ham2.sales22) < Ham2.production2) {
			try {
				sleep(2000);      				//线程休眠2秒
			} catch (Exception e) {
			}
			sell2();             				//调用方法sell2()
		}
		//输出相应信息
		System.out.println("还剩下A类汉堡包："
				+ (Ham2.production1 - Ham2.sales11 - Ham2.sales12) + "个");
		System.out.println("还剩下B类汉堡包："
				+ (Ham2.production2 - Ham2.sales21 - Ham2.sales22) + "个");
	}


}
