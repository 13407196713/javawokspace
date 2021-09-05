package ch20code;
import java.awt.*;
import javax.swing.*;

public class Swingtest4 {
	//创建成员变量
	static final int WIDTH = 300;          			//关于框架的宽度
	static final int HEIGHT = 200;              		//关于框架的高度
	public static void main(String[] args) { 		//主方法
		JFrame jf = new JFrame();           			     //创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);       			          //设置窗口的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");          			//设置窗口的标题
		Toolkit kit = Toolkit.getDefaultToolkit();	                //获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize();	//获取屏幕对象screenSize
		//获取屏幕的宽度和高度
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);                   		         //设置窗口居中显示
		//创建三个单选按钮对象
		JRadioButton jr1 = new JRadioButton("忽略");
		JRadioButton jr2 = new JRadioButton("继续");
		JRadioButton jr3 = new JRadioButton("跳过");
		//创建单选按钮组对象bg
		ButtonGroup bg = new ButtonGroup();
		Panel p = new Panel();             			//创建面板对象p
		//添加单选按钮到单选按钮组对象bg
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		//添加单选按钮到面板对象p
		p.add(jr1);
		p.add(jr2);
		p.add(jr3);
		jf.add(p, BorderLayout.SOUTH);         		//添加面板对象p到窗口jf
		jf.show();                               		//显示窗口
	}

}
