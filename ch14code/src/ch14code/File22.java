package ch14code;

import java.io.File;
import java.io.RandomAccessFile;

public class File22 {
	//主方法
	public static void main(String[] args) throws Exception {
		File f = new File("d://raf.txt");		            //创建一个文件类对象f
		//创建一个随机访问类对象raf
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		String s = "这个就是学校最好的学生";	 //创建字符串对象s
		//输出相应信息
		System.out.println("现在要添加数据了!");
		//让raf的指针指向内部数据的末端
		try {
			long l = raf.length();
			raf.seek(l);
			raf.writeUTF(s);
			System.out.println("刚刚加到后面的字符串是：");
			raf.seek(l);
			System.out.println(raf.readUTF());
			raf.seek(0);
			System.out.println(raf.readUTF());
			raf.close();
		} catch (Exception e) {
		}
	}
	

}
