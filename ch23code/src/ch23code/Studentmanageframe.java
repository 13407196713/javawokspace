package ch23code;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Vector;
import javax.swing.*;

public class Studentmanageframe extends JPanel {
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 400;                //关于宽度变量
	static final int HEIGHT = 200;             	//关于高度变量
	JFrame studentframe;                        	//创建顶层窗口框架对象

	public Studentmanageframe() {              		//构造函数
		studentframe = new JFrame();           		//为对象studentframe赋值
		studentframe.setTitle("学生信息管理系统"); 	//设置标题
		//设置关闭方法
		studentframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		studentframe.setSize(WIDTH, HEIGHT);    		//设置顶层窗口框架对象大小

		//创建对象kit，实现窗口居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentframe.setLocation(x, y);           	//设置顶层窗口框架对象位置
		studentframe.setVisible(true);         		//设置顶层窗口框架对象显示

		studentframe.add(this, BorderLayout.CENTER);

		//创建各种按钮对象
		JButton computerone = new JButton("计算机系一班学生信息系统");
		JButton computertwo = new JButton("计算机系二班学生信息系统");
		JButton computerthree = new JButton("计算机系三班学生信息系统");
		JButton bioone = new JButton("生物系一班学生信息系统");
		JButton mechone = new JButton("机械系一班学生信息系统");
		JButton mechtwo = new JButton("机械系二班学生信息系统");
		JButton mechthree = new JButton("机械系三班学生信息系统");
		JButton back = new JButton("返回");

		//创建各种标签对象
		JLabel title = new JLabel("学生信息系统主界面");

		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();  		//创建布局管理器对象lay
		setLayout(lay);              //设置布局管理器

		//创建并设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 2;
		constraints.weighty = 5;

		JPanel jp = new JPanel();              			//创建标签对象jp
		jp.setLayout(new GridLayout(1, 3));        		//设置对象jp的布局管理器
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		studentframe.add(jp, BorderLayout.NORTH);

		//通过调用方法add()实现利用网格组布局添加控件
		add(computerone, constraints, 0, 1, 1, 1);
		add(computertwo, constraints, 0, 2, 1, 1);
		add(computerthree, constraints, 0, 3, 1, 1);
		add(bioone, constraints, 0, 4, 1, 1);
		add(mechone, constraints, 1, 1, 1, 1);
		add(mechtwo, constraints, 1, 2, 1, 1);
		add(mechthree, constraints, 1, 3, 1, 1);
		add(back, constraints, 1,4,1,1);

		//单击这个按钮，进入到计算机系一班学生信息系统
		computerone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='一班'   and major='计算机系'";
				Studentinfo info = new Studentinfo("计算机系一班学生信息系统", sql);
			}
		});

		//单击这个按钮，进入到计算机系二班学生信息系统
		computertwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='二班' and major='计算机系'";
				Studentinfo studentinformation = new Studentinfo("计算机系二班学生信息系统", sql);
			}
		});

		//单击这个按钮，进入到计算机系三班学生信息系统
		computerthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='三班' and major='计算机系'";
				Studentinfo studentinformation = new Studentinfo("计算机系三班学生信息系统", sql);
			}
		});

		//单击这个按钮，进入到生物系一班学生信息系统
		bioone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='一班' and major='生物系'";
				Studentinfo studentinformation = new Studentinfo("生物系一班学生信息系统",sql);
			}
		});

		//单击这个按钮，进入到机械系一班学生信息系统
		mechone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='一班' and major='机械系'";
				Studentinfo studentinformation = new Studentinfo("机械系一班学生信息系统",sql);
		}
		});

		//单击这个按钮，进入到机械系二班学生信息系统
		mechtwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='二班' and major='机械系'";
				Studentinfo studentinformation = new Studentinfo("机械系二班学生信息系统",sql);
			}
		});

		//单击这个按钮，进入到机械系三班学生信息系统
		mechthree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from studentinfo where class='三班' and major='机械系'";
				Studentinfo studentinformation = new Studentinfo("机械系三班学生信息系统",sql);
			}
		});

		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				studentframe.dispose();
			}
		});
	}

	//关于添加的方法
	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}
}
