package ch15code;

import java.util.Random;

public class File4 {
	public static void main(String[] args) {      	//主方法
		Random rnd = new Random();           		          //创建一个随机类的对象rnd
		//通过随机类对象的方法随机的给数据赋值
		int a = rnd.nextInt(10);
		int b = rnd.nextInt(10) + 5;
		int c = 3 * rnd.nextInt(10);
		//输出3个值
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}


}
