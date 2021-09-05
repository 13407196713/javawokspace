package ch20code;
import java.awt.*;
import javax.swing.*;
public class Swingtest7 {
	//创建成员变量
	static final int WIDTH = 300;               	    //关于框架的宽度
	static final int HEIGHT = 200;             	        //关于框架的高度
	public static void main(String[] args) {            //主方法
		JFrame jf = new JFrame();               		//创建窗口对象jf
	    jf.setSize(WIDTH, HEIGHT);                 	    //设置窗口的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");                  	           //设置窗口的标题
	    Toolkit kit = Toolkit.getDefaultToolkit(); 	           //获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize();	           //获取屏幕对象screenSize
		//获取屏幕的宽度和高度
	    int width = screenSize.width;
		int height = screenSize.height;
	    int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);                   		           //设置窗口居中显示

		JTextField jTextField = new JTextField(10);
		//创建密码输入域对象jp
		JPasswordField jp = new JPasswordField(10);
	    Panel p = new Panel();                 		               //创建面板对象p
		p.add(jTextField);
	    p.add(jp);                           			           //添加对象jp到面板对象p
		jf.add(p, BorderLayout.CENTER);
		jf.show();                        			               //显示窗口
	}

}
