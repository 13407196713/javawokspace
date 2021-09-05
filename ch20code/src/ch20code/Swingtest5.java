package ch20code;
import java.awt.*;
import javax.swing.*;
public class Swingtest5 {
	//创建成员变量
	static final int WIDTH = 300;          			//关于框架的宽度
	static final int HEIGHT = 200;             		//关于框架的高度
	public static void main(String[] args) { 		//主方法
		JFrame jf = new JFrame();             		//创建窗口对象jf
		jf.setSize(WIDTH, HEIGHT);          	    //设置窗口的大小
		//关于窗口的退出处理
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("学生管理系统");           		      //设置窗口的标题
		Toolkit kit = Toolkit.getDefaultToolkit();	  //获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize();	  //获取屏幕对象screenSize
		//获取屏幕的宽度和高度
		int width = screenSize.width;
		int height = screenSize.height;
	    int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		jf.setLocation(x, y);                    		    //设置窗口居中显示
		//创建三个选择按钮对象
		JCheckBox jc1 = new JCheckBox("忽略");
		JCheckBox jc2 = new JCheckBox("继续");
		JCheckBox jc3 = new JCheckBox("跳过");
		jc1.setSelected(true);                   		     //设置对象jc1为选中状态
		//创建面板对象p
		Panel p = new Panel ();
		//添加三个选择按钮对象到面板对象p
		p.add(jc1);
		p.add(jc2);
		p.add(jc3);
		jf.add(p, BorderLayout.SOUTH);        		      //添加对象p到窗口jf
		jf.show();                            		      //显示窗口
	}


}
