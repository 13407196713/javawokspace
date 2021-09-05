package ch15code;

import java.util.Random;

public class File5 {
	public static void main(String[] args) {     	      //主方法
		try {
			Random rnd = new Random();  			     //创建一个随机类对象rnd
			//创建一个字符串类型的数组card
			String[] card = { "方块1", "方块2", "方块3", "方块4", "方块5", "方块6", "方块7","方块8", "方块9" };
			//创建关于循环的各种变量
			String str;
			int x, y;
			//通过循环语句，不断从数组中取出两个对象，对其进行比较和排序
			for (int i = 0; i < 100; i++) {
				x = rnd.nextInt(9);
				y = rnd.nextInt(9);
				str = card[x];
				card[x] = card[y];
				card[y] = str;
			}
			//通过循环语句，不断地输出信息
			for (int i = 0; i < 9; i++) {
				System.out.println(card[i]);
			}
		} catch (Exception e) {
	 }
  }
}
