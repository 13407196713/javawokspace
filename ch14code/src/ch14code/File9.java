package ch14code;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class File9 {
	public static void main(String[] args) throws Exception {	//主方法
		String st;                              			    //关于定义字符串对象st
		File f = new File("d:\\1.dat");       			        //创建一个文件类对象f
		//创建一个文件输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个多字节输出流对象dos，并且以fos作为参数
		DataOutputStream dos = new DataOutputStream(fos);
		//使用dos对象将数据写入到f中
		try {
			dos.writeUTF("明天要下雨了。");
			dos.writeUTF("明天要下雨了。");
			dos.writeUTF("明天要下雨了。");
			dos.writeUTF("明天要下雨了。");
		} catch (Exception e) {
		}
		dos.close();                          				//关闭输出流
	}
}
