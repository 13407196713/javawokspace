package ch19code;
import javax.swing.*;
import java.awt.*;
public class Login extends JPanel{
	//创建成员变量
	static final int WIDTH = 300;
	static final int HEIGHT = 150;
	//创建添加方法
	public void add(Component c, GridBagConstraints constraints, int x, int y,
			int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);    					//调用方法add()
	}
	public static void main(String[] args) {		//主方法
		//创建窗口对象loginframe
		JFrame loginframe = new JFrame("信息管理系统");
		//设置窗口对象的关闭处理方法
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login l = new Login();          				//创建login对象
		GridBagLayout lay = new GridBagLayout();	    //设置布局管理器对象
		l.setLayout(lay);
		//设置loginframe对象
		loginframe.add(l, BorderLayout.WEST);
		loginframe.setSize(WIDTH, HEIGHT);
		//创建kit对象使其居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		loginframe.setLocation(x, y);				//使窗口居中显示
		//创建按钮对象
		JButton ok = new JButton("登录");
		JButton cancel = new JButton("放弃");
		//创建标签对象
		JLabel title = new JLabel("信 息 系 统 登 录 窗 口");
		JLabel name = new JLabel("用户名");
		JLabel password = new JLabel("密 码");
		//创建文本输入框和密码框对象
		JTextField nameinput = new JTextField(15);
		JPasswordField passwordinput = new JPasswordField(15);
		//创建和设置对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 3;
		constraints.weighty = 4;
		//添加各种对象到对象l中
		l.add(title, constraints, 0, 0, 4, 1);
		l.add(name, constraints, 0, 1, 1, 1);
		l.add(password, constraints, 0, 2, 1, 1);
		l.add(nameinput, constraints, 2, 1, 1, 1);
		l.add(passwordinput, constraints, 2, 2, 1, 1);
		l.add(ok, constraints, 0, 3, 1, 1);
		l.add(cancel, constraints, 2, 3, 1, 1);
		//设置窗口不可变
		loginframe.setResizable(false);
		loginframe.show(); 						//使窗口可显示
	}


}
