package ch14code;
import java.io.*;
public class File0 {

	public static void main(String[] args) { 		          //主方法
		File f = new File("d:\\", "file.txt");		          //创建File对象f
		//输出文件的名字、文件的父目录和路径
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
	}


}
