package ch14code;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class File16 {
	//在read1方法中，以带缓冲的输入流对象为参数，它主要是让这个输入流对象读取数据
	public void read1(BufferedReader br) {                 //实现文件的读方法read1
		try {
			System.out.println(br.readLine());	//以行方式读取
		} catch (Exception e) {
		}
	}
	//在write1方法中，以带缓冲的输出流对象为参数，它主要是让这个输出流对象
	//写入数据到f对象
	public void write1(String str, BufferedWriter bw) {      //实现文件的写方法write1
		if (str.length() > 5) {
			try {
				bw.write(str);
				bw.newLine();
				bw.flush();
			} catch (Exception e) {
			}
		} else if ((str.length()) < 5) {
			try {
				bw.write("输入有误!");
				bw.newLine();
				bw.flush();
			} catch (Exception e) {
			}
		}
	}
	public static void main(String[] args) throws Exception {	           //主方法
		File16 f2 = new File16();                  	//创建类file16对象f2
		File f = new File("d:\\", "2.txt");	//创建一个文件类对象f
		//创建一个文件输出流对象fos
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个文件输入流对象fis
		FileInputStream fis = new FileInputStream(f);
		//创建一个多字节的输出流对象osw
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		//创建一个多字节输入流对象isr
		InputStreamReader isr = new InputStreamReader(fis);
		//创建一个带有缓冲的输出流对象bw
		BufferedWriter bw = new BufferedWriter(osw);
		//创建一个带缓冲的输入流对象br
		BufferedReader br = new BufferedReader(isr);
		//通过bw将数据写入到f2中
		f2.write1("祖国是个大花园", bw);
		f2.write1("小明说是吗", bw);
		f2.write1("小张觉得小明说的没有错", bw);
		f2.write1("谢谢了", bw);
		//通过br从f2中将数据读出来
		f2.read1(br);
		f2.read1(br);
		f2.read1(br);
		f2.read1(br);
		//关闭对象br和bw
		br.close();
		bw.close();
	}

}
