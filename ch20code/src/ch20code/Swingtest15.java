package ch20code;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class Swingtest15{

	public static void main(String[] args) {
		//创建对象frame1
		Gridbaglayoutframe frame1=new Gridbaglayoutframe();
		//设置窗口关闭方法
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);                        		//显示窗口
    }
}

//设计类 Gridbaglayoutframe
class Gridbaglayoutframe extends JFrame {
	private static final long serialVersionUID = 1L;

	//创建成员变量
	private static final int WIDTH=300;
	private static final int HEIGHT=200;

	//创建构造函数
	public Gridbaglayoutframe() {
		setTitle("学生管理系统");           			//设置标题
		setSize(WIDTH,HEIGHT);           			//设置窗口大小

		//获取对象con
		Container con=getContentPane();

		//添加对象到con
		con.add(new StudentJPanel(),BorderLayout.CENTER);
		con.add(new Buttonpanel(),BorderLayout.SOUTH);
	}
}

//创建一个学生标签和文本域及文本区所在的容器类
class StudentJPanel extends JPanel {

	//创建构造函数
	public StudentJPanel() {
		//创建布局管理器对象layout
		GridBagLayout layout=new GridBagLayout();
		//设置窗口的布局管理器
		setLayout(layout);

		//创建关于姓名的标签和文本输入框
		JLabel namelabel=new JLabel("姓名：");
		JTextField nameTextField=new JTextField(10);
		//创建关于学号的标签和文本输入框
		JLabel codelabel=new JLabel("学号：");
		JTextField codeTextField=new JTextField(10);
		//创建关于性别的标签和文本输入框
		JLabel sexlabel=new JLabel("性别：");
		JTextField sexTextField=new JTextField(10); 
		//创建关于籍贯的标签和选择组件
	    JLabel  addresslabel=new JLabel("籍贯：");
		JComboBox<?> addressCombo=new JComboBox(new String[] {"江西","四川","山西","湖北","湖南","海南"});  

		//创建关于简单介绍的标签和文本输入域
		JLabel commentLabel=new JLabel("简单介绍:");
		JTextArea sample=new JTextArea();
		sample.setLineWrap(true);  // 自动换行

 		//创建和设置constraints对象
		GridBagConstraints  constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 5;
		constraints.weighty = 5;

		//添加对象到constraints对象
		add(namelabel,constraints,0,0,1,1);
		add(codelabel,constraints,0,1,1,1);
		add(sexlabel,constraints,0,2,1,1);
		add(addresslabel,constraints,0,3,1,1); 
		add(commentLabel,constraints,2,0,1,1);

		//创建和设置对象constraints
		constraints.fill=GridBagConstraints.HORIZONTAL;
		constraints.weightx=100;  
		add(nameTextField,constraints,1,0,1,1);
		add(codeTextField,constraints,1,1,1,1);
		add(sexTextField,constraints,1,2,1,1);
		add(addressCombo,constraints,1,3,1,1);

		//创建和设置对象constraints
		constraints.fill=GridBagConstraints.NONE;
		constraints.anchor=GridBagConstraints.CENTER;
		add(sample,constraints,2,0,1,1);   
		constraints.fill=GridBagConstraints.BOTH;
		add(sample,constraints,2,1,1,1);    
	}

	//用来添加组件到容器中的函数
		public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
		{
			constraints.gridx=x;            	    //关于控件位于哪一列
			constraints.gridy=y;           			//关于控件位于哪一行
			constraints.gridwidth=w;       			//关于控件占据多少列
			constraints.gridheight=h;       		//关于控件占据多少行
			add(c,constraints); 
		}
}
class Buttonpanel extends JPanel    			               //设置放置按钮控件的容器类
{
	public Buttonpanel()              			               //构造函数
	{
		setLayout(new BoxLayout(this,BoxLayout.X_AXIS));
		//创建“确定”和“取消”按钮
		JButton okbutton=new JButton("确定");
	    JButton cancelbutton=new JButton("取消");
		//创建和设置对象hBox
	    Box hBox=Box.createHorizontalBox();
		hBox.add(Box.createHorizontalStrut(40));
		hBox.add(okbutton);
		hBox.add(Box.createHorizontalGlue());
		hBox.add(cancelbutton);
		hBox.add(Box.createHorizontalStrut(40));    
		add(hBox);                  			    //添加对象hBox到当前对象
	}
}
