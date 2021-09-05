package ch12code.c;

//汉堡
class ham2{
    static Object box1 = new Object();      //创建对象box
    static Object box2 = new Object();      //创建对象box
    static int totalmaterial1 = 10;         //制作汉堡包的材料属性
    static int totalmaterial2 = 10;         //制作汉堡包的材料属性
    static int sales11 = 0;                  //销售多少个汉堡包属性
    static int sales12 =0;
    static int sales21 =0;
    static int sales22 =0;
    static int production1 = 5;             //一共多少汉堡
    static int production2 = 5;             //一共多少汉堡
}

//厨师
class hmaker2 extends Thread {

    //make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
    public void make() {
        synchronized (ham2.box1) { 			//创建同步块
            (ham2.production1)++;
            //输出相应的信息
            System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共" + (ham2.production1 - ham2.sales11 - ham2.sales12) + "个A类汉堡包)");
            try {
                ham2.box1.notify();
            } catch (Exception e) {
            }
        }
    }

    public void run() {           			          //重写run()方法
        //使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
        while (ham2.production1 < ham2.totalmaterial1) {
            make();					            //调用make()方法
            try {
                sleep(3000);				     //线程休眠3秒
            } catch (Exception e) {
            }
            if (ham2.production1 == ham2.totalmaterial1) {
                System.out.println("所有的材料用完了！");
            }
        }
    }
}

class hmaker3 extends Thread {

    //make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
    public void make() {
        synchronized (ham2.box2) { 			//创建同步块
            (ham2.production2)++;
            //输出相应的信息
            System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共" + (ham2.production2 - ham2.sales21 - ham2.sales22) + "个B类汉堡包)");
            try {
                ham2.box2.notify();
            } catch (Exception e) {
            }
        }
    }

    public void run() {           			          //重写run()方法
        //使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
        while (ham2.production2 < ham2.totalmaterial2) {
            make();					            //调用make()方法
            try {
                sleep(3000);				     //线程休眠3秒
            } catch (Exception e) {
            }
            if (ham2.production2 == ham2.totalmaterial2) {
                System.out.println("所有的材料用完了！");
            }
        }
    }
}

// 营业员
class hassistant2 extends Thread{

    public void sell1() {          				//创建营业员卖汉堡包的方法sell1
        //当没有汉堡包的时候
        if (ham2.production1 == (ham2.sales11 + ham2.sales12)) {
            System.out.println("营业员" + getName() + "asd：顾客朋友们，请稍微等一下，A汉堡包没了!!");
            ham2.sales11 = ham2.sales12 = 0;
            ham2.production1 = 0;
            try {
                ham2.box1.wait();
            } catch (Exception e) {
            }
        }else {
            if (ham2.production1 > (ham2.sales11 + ham2.sales12)) {
                ham2.sales11++;
                ham2.sales21++;
                //输出相应信息
                System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总共卖了" + ham2.sales11 + "个A汉堡 " + ham2.sales21 + "个B汉堡）");
            }
        }
    }

    public void sell2() {      					//创建营业员卖汉堡包的方法sell2
        //当没有汉堡包的时候
        if (ham2.production2 == (ham2.sales21 + ham2.sales22)) {
            System.out.println("营业员" + getName() + "：顾客朋友们，请稍微等一下，B汉堡包没了!!");
            ham2.sales21 = ham2.sales22 = 0;
            ham2.production2 = 0;
            try {
                ham2.box2.wait();
            } catch (Exception e) {
            }
        }else {
            if (ham2.production2 > (ham2.sales21 + ham2.sales22)) {
                ham2.sales12++;
                ham2.sales22++;
                //输出相应信息
                System.out.println("营业员" + getName() + "：顾客好，汉堡包上来了，（总共卖了" + ham2.sales12 + "个A汉堡 " + ham2.sales22 + "个B汉堡）");
            }
        }
    }

    public void run() {         				//重写run()方法
        //当箱子里面有汉堡包里有汉堡包的情况下不断的卖
        while ((ham2.sales11 + ham2.sales12) < ham2.production1) {
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            sell1();       					//调用sell1()方法
        }
        while ((ham2.sales21 + ham2.sales22) < ham2.production2) {
            try {
                sleep(1000);
            } catch (Exception e) {
            }
            sell2();             			//调用方法sell2()
        }
    }
}


public class t4 {

    public static void main(String[] args) {
        hmaker2 maker1 = new hmaker2();             //创建对象maker
        hmaker3 maker2 = new hmaker3();            //创建对象maker

        hassistant2 assistant1 = new hassistant2();//创建对象assistant
        hassistant2 assistant2 = new hassistant2();//创建对象assistant

        //对对象maker进行设置
        maker1.setName("甲");
        maker2.setName("乙");
        assistant1.setName("甲");
        assistant2.setName("乙");

        //启动线程
        maker1.start();
        maker2.start();
        assistant1.start();
        assistant2.start();

    }
}

