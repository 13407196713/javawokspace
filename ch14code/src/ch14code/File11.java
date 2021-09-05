package ch14code;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File11 {
	public void read(DataInputStream dis) {          //实现文件的读方法read
		//在类中创建age,maths,name,chinese和physical参数
		String name = "";
		int age = 0;
		float maths = 0;
		float english = 0;
		float chinese = 0;
		float physical = 0;
		try {
			//在read方法中，以多字节输入流对象作为参数，并且利用此对象读取数据
			name = dis.readUTF();
			age = dis.readInt();
			maths = dis.readFloat();
			english = dis.readFloat();
			chinese = dis.readFloat();
			physical = dis.readFloat();
		} catch (Exception e) {
		}
		//输出相应的值
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("数学成绩：" + maths);
		System.out.println("英语成绩：" + english);
		System.out.println("语文成绩：" + chinese);
		System.out.println("物理成绩：" + physical);
	}
	//在write方法中，以多字节输出流对象作为参数，并且利用此对象写入数据
	public void write(String name, int age, float maths, float english,
			float chinese, float physical, DataOutputStream dos) {
		try {
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeFloat(maths);
			dos.writeFloat(english);
			dos.writeFloat(chinese);
			dos.writeFloat(physical);
		} catch (Exception e) {
		}
	}
	public static void main(String[] args) throws Exception {   //主方法
		//创建文件类对象f2和f
		File11 f2 = new File11();
		File f = new File("d:\\1.dat");
		//创建文件输入流对象fis
		FileInputStream fis = new FileInputStream(f);
		//创建数据输入流对象dis
		DataInputStream dis = new DataInputStream(fis);
		//创建文件输出流对象fos
		FileOutputStream fos = new FileOutputStream(f);
		//创建数据输出流对象dos
		DataOutputStream dos = new DataOutputStream(fos);
		//在文件类对象中写入内容并将其内容读出来
		f2.write("王鹏", 30, 87, 88, 93, 100, dos);
		f2.read(dis);
		f2.write("张浩", 29, 90, 89, 93, 100, dos);
		f2.read(dis);
		f2.write("宋江", 33, 77, 80, 90, 80, dos);
		f2.read(dis);
		f2.write("李宇", 32, 92, 81, 83, 90, dos);
		f2.read(dis);
		f2.write("宋丹", 31, 81, 98, 100, 99, dos);
		f2.read(dis);
		//关闭输入和输出流
		dos.close();
		dis.close();
	}


}
