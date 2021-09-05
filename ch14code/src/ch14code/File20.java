package ch14code;

import java.io.File;
import java.io.RandomAccessFile;

public class File20 {
	//主方法
	public static void main(String[] args) throws Exception {  
		File f = new File("d://raf.txt");   		//创建一个文件类对象f
		//创建一个随机访问类对象raf
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		//创建各种变量
		int x = 4;
		char c = 'a';
		long l = 123;
		float fl = 3.4F;
		double d = 4.222D;
		String str = "这些都是基本数据类型的数据";
		//利用raf写入不同数据类型的数据到f中
		raf.writeInt(x);
		raf.writeChar(c);
		raf.writeLong(l);
		raf.writeFloat(fl);
		raf.writeDouble(d);
		raf.writeUTF(str);
		raf.close();                          			//关闭对象raf
		System.out.println("文件已经创建完毕!");		//输出相应信息
}


}
