package ch14code;

import java.io.*;

public class File3 {
	public static void main(String[] args) throws Exception {      //主方法
		File f = new File("d:\\filetest\\file.txt");	           //创建文件对象f
		FileInputStream fis = new FileInputStream(f);	           //获取文件对象f的输入流对象fis
		char ch;                                                   //定义字符变量ch
		for (int i = 0; i < f.length(); i++) {			           //通过循环实现文件的读取
			ch = (char) fis.read();
			System.out.print(ch);
		}
		fis.close();                                               //关闭输入流
	}
}
