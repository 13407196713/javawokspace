package ch14code;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class File10 {
	public static void main(String[] args) throws Exception {   //主方法
		File f = new File("d:\\1.dat");    //创建一个文件类对象f
		//创建一个文件输入流对象fis，并且以f作为参数
		FileInputStream fis = new FileInputStream(f);
		//创建一个多字节输入流对象dis，并且以fis作为参数
		DataInputStream dis = new DataInputStream(fis);
		try {
			//使用dis对象从f中读取数据
			System.out.println(dis.readUTF());
		} catch (Exception e) {
		}
		dis.close();                            //关闭输入流
	}
}
