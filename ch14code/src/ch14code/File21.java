package ch14code;

import java.io.File;
import java.io.RandomAccessFile;

public class File21 {
	//主方法
	public static void main(String[] args) throws Exception {
		File f = new File("d://raf.txt"); 	 //创建一个文件类对象f
		//创建一个随机访问类对象raf
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		//利用raf读取不同的数据类型的数据
		System.out.println(raf.readInt());
		System.out.println(raf.readChar());
		System.out.println(raf.readLong());
		System.out.println(raf.readFloat());
		System.out.println(raf.readDouble());
		System.out.println(raf.readUTF());
		raf.close();                         		//关闭对象raf
		System.out.println("这就是文件的内容!");  	   //输出相应内容
	}


}
