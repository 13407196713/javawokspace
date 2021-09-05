package ch22code;
import java.net.*; 
public class Tcptest {
	public static void main(String[] args) { 	//主方法
		//创建一个InetAddress类对象ip
		InetAddress ip = null;
		try {
			//初始化对象ip
			ip = InetAddress.getByName("hchlcomputer");
			//输出主机名
			System.out.println("主机名：" + ip.getHostName());
			//输出主机IP地址
			System.out.println("主机IP地址：" + ip.getHostAddress());
			//输出本机IP地址
			System.out.println("本机IP地址："+ InetAddress.getLocalHost().getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
