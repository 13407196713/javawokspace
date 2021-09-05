package ch20code;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class BorderManagerTest extends JFrame{
	//创建类的构造函数
	public BorderManagerTest( ){
	//创建四个按钮分别用于布局管理器管理的组件
	JButton b1 = new JButton("东");
	JButton b2 = new JButton("西");
	JButton b3 = new JButton("南");
	JButton b4 = new JButton("北");
	JButton b5 = new JButton("中 ");

	//创建边界布局管理器
	BorderLayout bl = new  BorderLayout();
	Container cp = getContentPane();

	//设置容器的布局管理器为边界管理器。
	cp.setLayout(bl);
	//向容器中添加按钮组件
	cp.add(b1,BorderLayout.EAST);
	cp.add(b2,BorderLayout.WEST);
	cp.add(b3,BorderLayout.SOUTH);
	cp.add(b4,BorderLayout.NORTH); 
	cp.add(b5,BorderLayout.CENTER);
	}

	public static void main(String[] args){      //主方法
		//创建和设置对象gmt
		BorderManagerTest gmt = new BorderManagerTest();
		gmt.setTitle("边界布局管理器示例");
		gmt.setSize(400,300);
		gmt.setVisible(true);
	}
}
