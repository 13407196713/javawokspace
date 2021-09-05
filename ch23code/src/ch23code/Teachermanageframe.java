package ch23code;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Teachermanageframe extends JPanel {
	static final int WIDTH = 400;
	static final int HEIGHT = 200;
	JFrame teacherframe;

	public Teachermanageframe() {
		teacherframe = new JFrame();
		teacherframe.setTitle("教师信息管理系统");
		teacherframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		teacherframe.setSize(WIDTH, HEIGHT);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		teacherframe.setLocation(x, y);
		teacherframe.setVisible(true);

		teacherframe.add(this, BorderLayout.CENTER);
		JButton computerteacher = new JButton("计算机系教师信息系统");
		JButton bioteacher = new JButton("生物系教师信息系统");
		JButton mechteacher = new JButton("机械系教师信息系统");
		JButton jButton = new JButton("返回");

		JLabel title = new JLabel("教师信息系统主界面");
		JLabel banket1 = new JLabel();
		JLabel banket2 = new JLabel();

		GridBagLayout lay = new GridBagLayout(); // 布局管理器
		setLayout(lay);
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.anchor = GridBagConstraints.EAST;
		constraints.weightx = 1;
		constraints.weighty = 4;

		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(1, 3));
		jp.add(banket1);
		jp.add(title);
		jp.add(banket2);
		teacherframe.add(jp, BorderLayout.NORTH);

		add(computerteacher, constraints, 0, 1, 1, 1);
		add(mechteacher, constraints, 1, 1, 1, 1);
		add(bioteacher, constraints, 0, 4, 1, 1);
		add(jButton, constraints, 1, 4, 1, 1);

		computerteacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from teacherinfo where duty='教师' and major='计算机系' ";
				Teacherinfo teacherinformation = new Teacherinfo("计算机系教师信息系统",sql);
			}
		});
		bioteacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from teacherinfo where duty='教师' and major='生物系'";
				Teacherinfo teacherinformation = new Teacherinfo("生物系教师信息系统",sql);
			}
		});
		mechteacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String sql = "select * from teacherinfo where duty='教师' and major='机械系'";
				Teacherinfo teacherinformation = new Teacherinfo("机械系教师信息系统",sql);
			}
		});
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				teacherframe.dispose();
			}
		});
	}

	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}
}
