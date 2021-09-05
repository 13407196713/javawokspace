package ch20code;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Swingtest2 {
	static final int WIDTH = 300;             	           //关于框架的宽度
	static final int HEIGHT = 200;            	           //关于框架的高度
		public static void main(String[] args) {    	    //主方法
			JFrame jf = new JFrame();             			//创建窗口对象jf
			jf.setSize(WIDTH, HEIGHT);          			//设置窗口的大小
			//关于窗口的退出处理
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setTitle("学生管理系统");         		                   //设置窗口的标题
			Toolkit kit = Toolkit.getDefaultToolkit(); 		           //获取Toolkit类型对象kit
			Dimension screenSize = kit.getScreenSize();	               //获取屏幕对象screenSize
			//获取屏幕的宽度和高度
			int width = screenSize.width;
			int height = screenSize.height;
			int x = (width - WIDTH) / 2;
			int y = (height - HEIGHT) / 2;
			jf.setLocation(x, y);                     //设置窗口居中显示
			//创建两个按钮对象b1和b2
			JButton b1 = new JButton("确定");
			JButton b2 = new JButton("取消");
			Panel p = new Panel();             		   //创建面板对象p
			//添加两个按钮对象b1和b2到面板p
			p.add(b1);
			p.add(b2);
			jf.add(p);                            	    //添加面板p到窗口
			jf.show();                          		//显示窗口
		}


}
