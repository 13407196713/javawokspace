package ch14code;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class File23 {
	public static void main(String[] args) throws Exception {
		File f = new File("d://raf.txt");			//创建一个文件对象f
		//创建一个输出流对象fos，并且以f作为参数
		FileOutputStream fos = new FileOutputStream(f);
		//创建一个对象序列化处理类的对象oos，并且以fos作为参数
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student st = new Student();        			//创建一个学生类st
		//设置学生信息
		st.name = "王鹏";
		st.code = "96765";
		st.age = "28";
		st.sexy = "男";
		st.school = " 重庆大学";
		st.grade = "计算机三年级二班";
		st.address = "重庆市沙坪坝";
		oos.writeObject(st);          				//写相应内容到文件中
		oos.close();                 			//关闭对象oos
		System.out.println("文件创建完了!");
	}
}
class Student implements Serializable {    			     //创建一个学生类对象sStudent
	//设置name,age,sexy,school, grade,address和code属性
	String name;
	String age;
	String sexy;
	String school;
	String grade;
	String address;
	String code;


}
