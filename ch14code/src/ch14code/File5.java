package ch14code;

import java.io.*;
public class File5 {
	public static void main(String[] args) throws Exception {	//主方法
		File f = new File("d:\\filetest\\file.txt");	//创建一个文件类对象f
		FileOutputStream fos = new FileOutputStream(f);	                //创建一个文件输出流对象fos
		for (int i = 'a'; i <= 'z'; i++) {   			                     //通过循环语句往f中写入数据
			fos.write(i);
		}
		fos.close();                       				//关闭输出流
	}

}
