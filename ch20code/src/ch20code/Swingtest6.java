package ch20code;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class Swingtest6 {
	//创建成员变量
	static final int WIDTH = 300;             		//关于框架的宽度
	static final int HEIGHT = 200;                  //关于框架的高度
	public static void main(String[] args) {     	//主方法
		JFrame jf = new JFrame();          			//创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);        			//设置窗口的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");     				     //设置窗口的标题
		Toolkit kit = Toolkit.getDefaultToolkit();	     //获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize();	     //获取屏幕对象screenSize
		//获取屏幕的宽度和高度
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);                 		           //设置窗口居中显示
		//创建3个ToggleButton按钮
		JToggleButton jt1 = new JToggleButton("忽略");
		JToggleButton jt2 = new JToggleButton("继续");
		JToggleButton jt3 = new JToggleButton("跳过");
		Panel p = new Panel();                		          //创建面板对象p
		//添加三个按钮对象到面板对象p
		p.add(jt1);
		p.add(jt2);
		p.add(jt3);
		jf.add(p, BorderLayout.SOUTH);     			          //添加面板对象到窗口
		jf.show();                                 		      //显示窗口
	}


}
