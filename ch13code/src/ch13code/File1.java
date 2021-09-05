package ch13code;
import java.io.*;   
public class File1 {
	 public static void main(String[] args) 
	{
	    File f=new File("d://raf.txt");   			           //创建File类对象f
	    RandomAccessFile raf=new RandomAccessFile(f,"rw");
	    String s="这个就是我们学校最好的学生";
	    System.out.println("现在要添加数据了!");
	    long l=raf.length();       					          //读取的长度
	    raf.seek(l);                                          //跳过1个字节
	    raf.writeUTF(s);         						      //利用UTF-8编码写入字符
	    System.out.println("刚刚加到后面的字符串是：");
	    raf.seek(l);               					          //跳过1个字节 
	    System.out.println(raf.readUTF());
	    raf.seek(0);
	    System.out.println(raf.readUTF());
	    raf.close();                					      //关闭对象raf
	 }

}
