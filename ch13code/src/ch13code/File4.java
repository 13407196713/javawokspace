package ch13code;

import java.io.*;
public class File4 {
	public static void main(String[] args) throws Exception {
		File f = new File("d://raf.txt");			                //创建文件对象f
		//创建对象raf
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		String s = "这个就是这所学校最好的学生";		                        //创建字符串对象s
		System.out.println("现在要添加数据了!");		                    //输出相应信息
		try {                          				                //捕获异常
			long l = raf.length();
			raf.seek(l);
			raf.writeUTF(s);
			System.out.println("刚刚加到后面的字符串是：");
			raf.seek(l);
			System.out.println(raf.readUTF());
			raf.seek(0);
			System.out.println(raf.readUTF());
			raf.close();
		} catch (Exception e) {                                   //处理异常
		}
	}


}
