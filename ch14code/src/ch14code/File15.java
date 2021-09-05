package ch14code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class File15 {
	public static void main(String[] args) throws Exception { 	//主方法
		File f = new File("d:\\", "2.txt"); 	//创建一个文件类对象f
		//创建一个输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个字符输出流对象osw，并且以fos作为参数
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//创建一个带缓冲的输出流对象bw，利用此对象写入数据
		BufferedWriter bw = new BufferedWriter(osw);
		//输出相应内容和空格
		bw.write("小王是一个好学生。");
		bw.newLine();
		bw.write("他也是一个好学生。");
		bw.newLine();
		bw.write("小明也是一个好学生。");
		bw.close();                           				//关闭输出流对象
	}
}
