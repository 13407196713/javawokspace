package ch14code;

import java.io.*;

public class File7 {
	public static void main(String[] args) throws Exception {	//主方法
		//创建一个文件类对象f
		File f = new File("d:\\1.txt");
		//创建一个文件输入流对象fis，并且以f作为参数
		FileInputStream fis = new FileInputStream(f);
		//创建一个过滤输入流对象filter，并且以fis作为参数
		FilterInputStream filter = new BufferedInputStream(fis);
		//通过循环语句将f中的数据读出并输出
		for (int i = 0; i < f.length(); i++) {
			System.out.print((char)filter.read());
		}
		fis.close();                           				//关闭输入流对象
	}
}
