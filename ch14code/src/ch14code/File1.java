package ch14code;

import java.io.File;

public class File1 {
	public void print(File f) {             			             //实现判断文件类对象性质的方法
		if (f.isDirectory()) {                 		     //当为目录时
			System.out.println("这是一个目录！");
		} else {
			System.out.println("这不是一个目录！");
		}
		if (f.exists()) {                  			      //当文件存在时
			System.out.println("这个文件存在的！");
		} else {
			System.out.println("抱歉，这个文件不存在的！");
			try {
				f.createNewFile();        		          //创建文件
			} catch (Exception e) { 
			}
		}
	}
		public void print1(File f) {         			          //实现获取文件对象信息的方法print1
			System.out.println(f.getName());
			System.out.println(f.getParent());
			System.out.println(f.getPath());
		}
		public void print2(File f) {            			     //实现获取文件对象信息的方法print2
			if (f.isFile()) {
				System.out.println(f.lastModified());
				System.out.println(f.length());
			}
		}
	public static void main(String[] args) {  		           //主方法
		File1 f1 = new File1();              		           //创建对象f1
		File f = new File("d:\\filetest", "file.txt");	       //创建对象f
		f1.print(f);                       			           //调用print()方法
		f1.print1(f);                  				           //调用print1()方法
		f1.print2(f);                     				       //调用print2()方法
	}
}