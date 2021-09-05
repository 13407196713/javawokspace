package ch14code;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class File18 {
	public static void main(String[] args) throws Exception {
		//创建一个多字节输入流对象isr
	    InputStreamReader isr = new InputStreamReader(System.in);
		//创建一个带缓冲的输入流对象br
		BufferedReader br = new BufferedReader(isr);
		//通过br对象的方法readLine()读取内容并输出
		System.out.println(br.readLine());
		br.close();                           //关闭对象br
	}


}
