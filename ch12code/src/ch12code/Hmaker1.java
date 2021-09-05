//package ch12code;
//
//public class Hmaker1 extends Thread{
//	//make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
//	public void make() {
//		synchronized (Ham1.box) {     		//创建同步块
//			(Ham1.production)++;
//			//输出相应的信息
//			System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共" + (Ham1.production - Ham1.sales1 - Ham1.sales2) + "个)");
//			try {
//				Ham1.box.notify();
//			} catch (Exception e) {
//			}
//		}
//	}
//	public void run() {            			     //重写run()方法
//		//使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
//		while (Ham1.production < Ham1.totalmaterial) {
//			make();       				        //调用make()方法
//			try {
//				sleep(3000);       			    //线程休眠3秒
//			} catch (Exception e) {
//			}
////			make();               				//调用make()方法
//		}
//	}
//
//}
