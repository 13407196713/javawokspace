package ch20code;
import javax.swing.JFrame;

public class Swingtest {
	//创建成员变量
	static final int WIDTH = 300;          			//关于窗口的宽度
	static final int HEIGHT = 200;            		//关于窗口的高度
	public static void main(String[] args) {   		//主方法
		JFrame jf = new JFrame();             		//创建框架对象jf
		jf.setSize(WIDTH, HEIGHT);         			//设置对象jf的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);                  				//显示窗口


	}
}
