package ch14code;

import java.io.*;
public class File4 {
	public static void main(String[] args) throws Exception {  //主方法
		File f = new File("d:\\filetest\\file.txt");	                      //创建文件对象f
		FileInputStream fis = new FileInputStream(f);//获取文件对象f的输入流对象fis
		byte[] b = new byte[(int) f.length()]; 		 //定义了一个字节数组对象b
		//将所有的字节都保存到一个字节数组b中
		fis.read(b);                      				      //读取文件
		for (int i = 0; i < f.length(); i++) {		                //通过循环语句将b中的字符读出
			System.out.print((char) b[i]);
		}
		fis.close();                     				//关闭读取流
}


}
