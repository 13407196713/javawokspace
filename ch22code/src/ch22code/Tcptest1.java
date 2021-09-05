package ch22code;
import java.net.*; 
public class Tcptest1 {
	public static void main(String[]args) {		//主方法
		try {
			//创建一个服务器套接字对象server
			ServerSocket server = new ServerSocket(3002);
			//输出相应信息
			System.out.println("服务器的套接字已经创建成功!!!");
			System.out.println("正在等待客户机连接..............!!!");
			//通过循环遍历
			for (int i = 0; i < 10; i++) {
				//创建套接字对象s连接到服务器套接字上
				Socket s = new Socket("127.0.0.1", 3002);
				System.out.println("已经与第" + i + "客户机连接!!!");
			}
		} catch (Exception e) {
		}
	}

}
