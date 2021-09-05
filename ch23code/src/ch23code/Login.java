package ch23code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JPanel{

	static final int WIDTH = 300;     			
	static final int HEIGHT = 150;
	JFrame loginframe;

	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

	Login() {
		loginframe = new JFrame("信息管理系统");
		loginframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);

		loginframe.add(this, BorderLayout.WEST);
		loginframe.setSize(WIDTH, HEIGHT);

		// 居中显示
		Toolkit kit = Toolkit.getDefaultToolkit(); // 获取Toolkit类型对象kit
		Dimension screenSize = kit.getScreenSize(); // 获取屏幕对象screenSize
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		loginframe.setLocation(x, y);

		JButton ok = new JButton("登录");
		JButton cancel = new JButton("放弃");
		JLabel title = new JLabel("信 息 系 统 登 录 窗 口");
		JLabel name = new JLabel("用户名");
		JLabel password = new JLabel("密 码");

		final JTextField nameinput = new JTextField(15);
		final JPasswordField passwordinput = new JPasswordField(15);
		passwordinput.setEchoChar('*');

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE; // 填充方式 : 横纵填充
		constraints.anchor = GridBagConstraints.EAST; // 当组件小于其显示区域时使用此字段
		constraints.weightx = 3; // 分配额外的水平空间
		constraints.weighty = 4; // 组件小于其显示区域时使用

		add(title, constraints, 0, 0, 4, 1);
		add(name, constraints, 0, 1, 1, 1);
		add(nameinput, constraints, 2, 1, 1, 1);
		add(password, constraints, 0, 2, 1, 1);
		add(passwordinput, constraints, 2, 2, 1, 1);
		add(ok, constraints, 0, 3, 1, 1);
		add(cancel, constraints, 2, 3, 1, 1);

		loginframe.setResizable(false);
		loginframe.setVisible(true);

		ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent Event) {
			String nametext = nameinput.getText();
			String passwordtext = passwordinput.getText();
			String str = new String(passwordtext);
			boolean x = (nametext.equals(""));
			boolean y = (str.equals(""));
			boolean z = (x && y);
			if (z == true) {
				JOptionPane.showMessageDialog(null, "登录成功！");
				loginframe.dispose();
				Mainframe main = new Mainframe();
			} else if (z == false) {
				JOptionPane.showMessageDialog(null, "用户名或密码不正确，请重新登录！");
				nameinput.setText("");
				passwordinput.setText("");
			}
		}
		});

		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				loginframe.dispose();
			}
		});
	}
}

