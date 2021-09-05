package ch12code.a;

//汉堡
class ham{
    static Object box = new Object();      //创建对象box
    static int totalmaterial = 10;         //制作汉堡包的材料属性
    static int sales = 0;                  //销售多少个汉堡包属性
    static int production = 5;             //一共多少汉堡
}

//厨师
class hmaker extends Thread {

    //make方法使用了一个同步块，在这个函数里会不断地生产汉堡包
    public void make() {
        synchronized (ham.box) {     			//创建同步块
            (ham.production)++;
            try {
                ham.box.notify();
            } catch (Exception e) {
            }
        }
    }

    public void run() {
        //使用循环语句来保证在汉堡包材料用完之前，不断地生产汉堡包
        while (ham.production < ham.totalmaterial) {
            //使用判断语句判断只要有汉堡包，厨师就通知营业员可以卖了
            if (ham.production > 0) {
                System.out.println("厨师" + getName() + "：" + "汉堡包来了(总共"
                        + (ham.production - ham.sales) + "个)");
            }
            try {
                sleep(3000);           			//线程休眠3秒
            } catch (Exception e) {
            }
            make();                   			//调用make()方法
        }
    }
}

// 营业员
class hassistant extends Thread{

    public void sell() {                      		        //创建营业员卖汉堡包的方法
        if (ham.production == 0) {           	//当没有汉堡时
            System.out.println("营业员：顾客朋友们，请稍微等一下，汉堡包没了!!");
        }
        try {
            ham.box.wait();              		//使线程暂停
        } catch (Exception e) {
        }
        ham.sales++;
        System.out.println("营业员：顾客好，汉堡包上来了，（总共卖了" + ham.sales + "个）");
    }

    public void run() {                        		//重写run()方法
        //当箱子里面有汉堡包的情况下不断的卖
        while (ham.sales < ham.production) {
            try {
                sleep(1000);              		    //线程休眠1秒
            } catch (Exception e) {
            }
            sell();                       			//调用sell()方法
        }
    }
}

public class t {
    public static void main(String[] args) {
        hmaker maker = new hmaker();           	//创建对象maker
        hassistant assistant = new hassistant();//创建对象assistant
        //对对象maker进行设置
        maker.setName("甲");
        //启动线程
        maker.start();
        assistant.start();
    }
}