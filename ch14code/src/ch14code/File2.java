package ch14code;

import java.io.File;
public class File2 {
	public static void main(String[] args) {            //主方法
	    //创建8个文件类对象，并且每一个对象产生一个新文本文件
		File f1 = new File("d:\\filetest", "1.txt");
		File f2 = new File("d:\\filetest", "2.txt");
		File f3 = new File("d:\\filetest", "3.txt");
		File f4 = new File("d:\\filetest", "4.txt");
		File f5 = new File("d:\\filetest", "5.txt");
		File f6 = new File("d:\\filetest", "6.txt");
		File f7 = new File("d:\\filetest", "7.txt");
		File f8 = new File("d:\\filetest");
		try {                         					//创建相应文件
			f1.createNewFile();
			f2.createNewFile();
			f3.createNewFile();
			f4.createNewFile();
			f5.createNewFile();
			f6.createNewFile();
			f7.createNewFile();
		} catch (Exception e) {
		}
		File[] ff = f8.listFiles();     			//获取目录里的文件
		//通过循环语句将这8个文本文件名称和路径输出
		for (int i = 0; i < ff.length; i++) {
			System.out.println("文件名称为：" + ff[i]);
		}
	}


}
