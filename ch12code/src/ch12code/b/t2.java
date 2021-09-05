package ch12code.b;

//汉堡
class ham1{
    static Object box = new Object();      //创建对象box
    static int totalmaterial = 10;         //制作汉堡包的材料属性
    static int sales1 = 0;                  //销售多少个汉堡包属性
    static int sales2=0;
    static int production = 5;             //一共多少汉堡
}

//厨师
class hmaker1 extends Thread {

    //make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
    public void make() {
        synchronized (ham1.box) {     			//创建同步块
            (ham1.production)++;

            System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共" + (ham1.production - ham1.sales1 - ham1.sales2) + "个)");
            try {
                ham1.box.notify();
            } catch (Exception e) {
            }
        }
    }

    public void run() {
        //使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
        while (ham1.production < ham1.totalmaterial) {
            make();
            try {
                sleep(3000);           			//线程休眠3秒
            } catch (Exception e) {
            }
            make();                   			//调用make()方法
        }
    }
}

// 营业员
class hassistant1 extends Thread{

    public void sell1() {          				//创建营业员卖汉堡包的方法sell1
        //当没有汉堡包的时候
        if (ham1.production == (ham1.sales1 + ham1.sales2)) {
            System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下，汉堡包没了!!");
            ham1.sales1 = 0;
            ham1.production = 0;
            try {
                ham1.box.wait();
            } catch (Exception e) {
            }
        }
        (ham1.sales1)++;
        //输出相应信息
        System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总共卖了" + ham1.sales1+ "个）");
    }

    public void sell2() {      					//创建营业员卖汉堡包的方法sell2
        //当没有汉堡包的时候
        if (ham1.production == (ham1.sales1 + ham1.sales2)) {
            System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下，汉堡包没了!!");
            ham1.sales2 = 0;
            ham1.production = 0;
            try {
                ham1.box.wait();
            } catch (Exception e) {
            }
        }
        (ham1.sales2)++;
        //输出相应信息
        System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总共卖了" + ham1.sales2+ "个）");
    }

    public void run() {         				//重写run()方法
        //当箱子里面有汉堡包里有汉堡包的情况下不断的卖
        while ((ham1.sales1 + ham1.sales2) < ham1.production) {
            sell1();       					//调用sell1()方法
            try {
                sleep(1000);
            } catch (Exception e) {
            }
        }
        while ((ham1.sales1 + ham1.sales2) < ham1.production) {
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            sell2();             			//调用方法sell2()
        }
    }
}

public class t2 {
    public static void main(String[] args) {
        hmaker1 maker = new hmaker1();           	//创建对象maker
        hassistant1 assistant1 = new hassistant1();//创建对象assistant
        hassistant1 assistant2 = new hassistant1();//创建对象assistant
        //对对象maker进行设置
        maker.setName("甲");
        //启动线程

        assistant1.setName("甲");
        assistant2.setName("乙");

        maker.start();
        assistant1.start();
        assistant2.start();
    }
}