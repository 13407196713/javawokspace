package ch22code;
import java.io.*;                                       //导入包
import java.net.*;

public class Serverrev {
	//创建成员变量
	private BufferedReader reader1;
	private ServerSocket server;
	private Socket socket1;

	//创建服务器套接字server,并且其端口为6000
	void startserver() {                                //创建startserver方法
		try {
			server = new ServerSocket(6000);		    //为对象server赋值
			System.out.println("服务器套接字创建完成了!");
			//若客户机提出请求，则与其套接字连接
			while (true) {
				System.out.println("等待客户机的连接。。。。。");
				socket1 = server.accept();
				System.out.println("完成与客户机的连接。");
				reader1 = new BufferedReader(new InputStreamReader(socket1.getInputStream()));
				getMessage();
			}
		} catch (Exception e) {
		}
	}

	//读取来自套接字的输入输出流，从而将其输出到屏幕上
	void getMessage() {                                 //创建getMessage方法
		try {
			while (true) {                      		//通过循环遍历
				System.out.println("客户机：" + reader1.readLine());
			}
		} catch (Exception e) {
		} finally {
			System.out.println("客户机中断连接");
		}
		try {
			if (reader1 != null)
				reader1.close();
			if (socket1 != null)
				socket1.close();
		} catch (Exception e) {
		}
	}
public static void main(String[] args) {		       //主方法
	Serverrev server = new Serverrev();	               //创建对象 server
	server.startserver();            		          //调用方法startserver()启动服务
	}
}
