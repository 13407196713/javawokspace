package ch20code;
import java.awt.*;
import javax.swing.*;
public class Swingtest11 {
	//创建成员变量
	static final int WIDTH = 300;              	        //关于框架的宽度
	static final int HEIGHT = 200;               	    //关于框架的高度
	public static void main(String[] args) {            //主方法
		JFrame jf = new JFrame();                  		//创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);                 		//设置窗口的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");                   		//设置窗口的标题
		Toolkit kit = Toolkit.getDefaultToolkit();      //获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize();     //获取屏幕对象screenSize
		//获取屏幕的宽度和高度
	    int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);                         	//设置窗口居中显示
		//创建字符串数组对象a并设置其元素
		String[] a = new String[5];
		a[0] = "王浩";
		a[1] = "张敏";
		a[2] = "李浩";
		a[3] = "孙军";
		a[4] = "周平";
		JComboBox<Object> jc = new JComboBox<Object>(a);      //创建选择组件对象jc
		Panel p = new Panel();                                //创建面板对象p
		p.add(jc);                                 			  //添加对象jc到面板对象p
		jf.add(p, BorderLayout.CENTER);
		jf.show();                                 			   //显示

	}
}
