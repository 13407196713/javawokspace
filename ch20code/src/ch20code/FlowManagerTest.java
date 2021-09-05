package ch20code;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

public class FlowManagerTest extends JFrame{

	public FlowManagerTest(){                   //创建类的构造函数FlowManagerTest
		//创建4个按钮对象
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		JButton b3= new JButton("Button 3");
		JButton b4 = new JButton("Button 4");
		//创建流布局管理器，采用默认设置
		FlowLayout fl = new FlowLayout();

		Container cp = getContentPane();
		cp.setLayout(fl);
		//依次向容器添加组件，这些组件将按照从左到又，从上到下的顺序排列
		cp.add(b1);
		cp.add(b2);
		cp.add(b3);
		cp.add(b4);
        }

	public static void main(String[] args){            //主方法
       //创建和设置对象tmt
		FlowManagerTest tmt = new FlowManagerTest();
		tmt.setTitle("流布局管理器示例");
		tmt.setSize(400,300);
		tmt.setVisible(true);
    }
}
