package ch12code;

public class Hassistant extends Thread{
	public void sell() {                      		        //创建营业员卖汉堡包的方法
		if (Ham.production == 0) {           	//当没有汉堡时
			System.out.println("营业员：顾客朋友们，请稍微等一下，汉堡包没了!!");
		}
		try {
			Ham.box.wait();              		//使线程暂停
		} catch (Exception e) {
		}
		Ham.sales++;
		System.out.println("营业员：顾客好，汉堡包上来了，（总共卖了" + Ham.sales + "个）");
	}
	public void run() {                        		//重写run()方法
		//当箱子里面有汉堡包的情况下不断的卖
		while (Ham.sales < Ham.production) {
			try {
				sleep(1000);              		    //线程休眠1秒
			} catch (Exception e) {
			}
			sell();                       			//调用sell()方法
		}
	}
}

