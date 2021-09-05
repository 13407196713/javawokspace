package ch14code;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File19 {
	public static void main(String[] args) throws Exception {
		//创建一个多字节输入流对象isr
		InputStreamReader isr = new InputStreamReader(System.in);
		//创建一个带缓冲的输入流对象br
		BufferedReader br = new BufferedReader(isr);
		//创建对象pw
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("请输出字符：");
		String s;                     			//创建字符串对象s
		while (!(s = br.readLine()).equals(""))	                //通过循环进行输出
		pw.println(s);
		//关闭对象br和pw
		br.close();
		pw.close();
	}


}
