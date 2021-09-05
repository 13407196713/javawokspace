package ch20code;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Swingtest1 {
	//创建成员变量
	static final int WIDTH = 500;          			//关于框架的宽度
	static final int HEIGHT = 400;          		     //关于框架的高度
	public static void main(String[] args) { 		//主方法
		JFrame jf = new JFrame();        				     //创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);        			     //设置窗口的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jf.setTitle("学生管理系统");     					//设置窗口的标题

		// 居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();		//获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize();		//获取屏幕对象screenSize
		//获取屏幕的宽度和高度
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);         					//设置窗口居中显示

		jf.setResizable(true);    // 可调整大小

		jf.setVisible(true);                  		//显示窗口
	}
}
