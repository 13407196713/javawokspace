package ch14code;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class File14 {
	public static void main(String[] args) throws Exception {  //主方法
		File f = new File("d:\\", "2.txt");	//创建一个文件类对象f
		//创建一个输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个字符输出流对象osw，并且以fos作为参数
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write('美');                        		//利用osw对象写数据
		osw.close();                       			//关闭输出流
	}
}
