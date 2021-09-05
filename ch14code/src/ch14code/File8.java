package ch14code;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class File8 {
	public static void main(String[] args) throws Exception {	//主方法
		//创建一个文件类对象f
		File f = new File("d:\\1.txt");
		//创建一个文件输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个过滤输出流对象filter，并且以fos作为参数
		FilterOutputStream filter = new FilterOutputStream(fos);
		//通过循环语句往f中写入数据
		for (int i = 'a'; i < 'z'; i++) {
			filter.write(i);
		}
		fos.close();                           					//关闭输出流
	}
}
