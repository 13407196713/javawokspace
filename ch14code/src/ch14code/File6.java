package ch14code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class File6 {
	public static void main(String[] args) throws Exception {  //主方法
		//创建文件类对象f和f1
		File f = new File("d:\\filetest\\file.txt");
		File f1 = new File("d:\\filetest\\file2.txt");
		//创建文件输入流对象fis和文件输出流对象fos
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f1);
		//创建字节数组对象b
		byte[] b = new byte[(int) f.length()];
		fis.read(b);                     			//使用字节数组将f中的数据读出
		//使用循环语句将字节数组中的数据往f中写
		for (int i = 0; i < f.length(); i++) {
			fos.write(b[i]);
		}
		//关闭输入和输出流
		fis.close();
	    fos.close();
	}


}
