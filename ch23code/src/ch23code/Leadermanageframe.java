package ch23code;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Leadermanageframe extends JPanel{
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 400;              		
	static final int HEIGHT = 200;
	JFrame leaderframe;

	public Leadermanageframe() {
		leaderframe = new JFrame();
		leaderframe.setTitle("领导信息管理系统");
		//设置关闭方法
		leaderframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		leaderframe.setSize(WIDTH, HEIGHT);

		//创建和设置对象kit，并使其居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		leaderframe.setLocation(x, y);
		leaderframe.setVisible(true);
		leaderframe.add(this, BorderLayout.CENTER);

		//创建各种按钮
		JButton computerleader = new JButton("计算机系领导信息系统");
		JButton bioleader = new JButton("生物系领导信息系统");
		JButton mechleader = new JButton("机械系领导信息系统");
		JButton schoolleader = new JButton("学校领导信息系统");
		JLabel title = new JLabel("领导信息系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 2;
		constraints.weighty = 2;

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1, 3));
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		leaderframe.add(jp, BorderLayout.NORTH);
		add(computerleader, constraints, 0, 0, 1, 1);
		add(bioleader, constraints, 0, 1, 1, 1);
		add(mechleader, constraints, 1, 0, 1, 1);
		add(schoolleader, constraints, 1, 1, 1, 1);

		computerleader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from leaderinfo where duty='主任' and major='计算机系'";
				Leaderinfo leaderinformation = new Leaderinfo("计算机系领导信息系统", sql);
			}
		});
		//单击这个按钮，进入到生物系领导信息系统
		bioleader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from leaderinfo where duty='主任' and major='生物系'";
				Leaderinfo leaderinformation = new Leaderinfo("生物系领导信息系统", sql);
			}
		});
		// /单击这个按钮，进入到机械系领导信息系统
		mechleader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from leaderinfo where duty='主任' and major='机械系'";
				Leaderinfo leaderinformation = new Leaderinfo("机械系领导信息系统",sql);
			}
		});
		// /单击这个按钮，进入到学校领导信息系统
		schoolleader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from teacherinfo where duty<>'教师' and major='学校'";
				Leaderinfo leaderinformation = new Leaderinfo("学校领导信息系统", sql);
			}
		});
	}

	//创建添加方法
	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

}
