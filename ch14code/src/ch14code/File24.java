package ch14code;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class File24 {
	public static void main(String[] args) throws Exception {	//主方法
		File f = new File("d://raf.txt");      			//创建一个文件对象f
		//创建一个输入流对象fis，并且以f作为参数
		FileInputStream fis = new FileInputStream(f);
		//创建一个对象序列化处理类的对象ois，并且以fis作为参数
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st = new Student();         				    //创建一个学生类对象st
		//利用ois对象方法将st的属性值读出
		st = (Student) ois.readObject();                     
		ois.close();                             			//关闭对象ois
		//输出相应信息
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.code);
		System.out.println(st.school);
		System.out.println(st.grade);
		System.out.println(st.address);
	}


}
