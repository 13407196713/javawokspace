package ch20code;
import java.awt.*;
import javax.swing.*;

public class Swingtest12 {
	//创建成员变量
			static final int WIDTH = 300;            		//关于框架的宽度
			static final int HEIGHT = 200;              	//关于框架的高度
			public static void main(String[] args) {   	    //主方法
				JFrame jf = new JFrame();        			//创建窗口对象jf
				jf.setSize(WIDTH, HEIGHT);        			//设置窗口的大小
				//关于窗口的退出处理
				jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				jf.setTitle("学生管理系统");        			     //设置窗口的标题
				Toolkit kit = Toolkit.getDefaultToolkit();	     //获取Toolkit类型对象kit
				Dimension screenSize = kit.getScreenSize();	     //获取屏幕对象screenSize
				//获取屏幕的宽度和高度
				int width = screenSize.width;
				int height = screenSize.height;
				int x = (width - WIDTH) / 2;
				int y = (height - HEIGHT) / 2;
				jf.setLocation(x, y);                			     //设置窗口居中显示

				//创建菜单栏条对象menubar1
				JMenuBar menubar1 = new JMenuBar();
				jf.setJMenuBar(menubar1);        			         //设置窗口对象jf的菜单栏
				//创建4个菜单对象
				JMenu menu1 = new JMenu("文件");
				JMenu menu2 = new JMenu("编辑");
				JMenu menu3 = new JMenu("视图");
				JMenu menu4 = new JMenu("帮助");
				//添加菜单到工具栏对象menubar1
				menubar1.add(menu1);
				menubar1.add(menu2);
				menubar1.add(menu3);
				menubar1.add(menu4);
				//创建4个菜单项对象
				JMenuItem item1 = new JMenuItem("打开");
				JMenuItem item2 = new JMenuItem("保存");
				JMenuItem item3 = new JMenuItem("打印");
				JMenuItem item4 = new JMenuItem("退出");
				//添加菜单项到菜单对象menu1
				menu1.add(item1);
			    menu1.add(item2);
				menu1.addSeparator();    					  //添加间隔条到菜单
				menu1.add(item3);
				menu1.addSeparator();          				  //添加间隔条到菜单
				menu1.add(item4);
				jf.show();                        			  //显示窗口
			}
}
