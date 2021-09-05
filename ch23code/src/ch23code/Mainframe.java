package ch23code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mainframe {
	static final int WIDTH=400;
	static final int HEIGHT=200;
	JFrame buttonframe;

	public Mainframe(){
		buttonframe = new JFrame();
		buttonframe.setTitle("学校信息管理系统");
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.setSize(WIDTH, HEIGHT);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		buttonframe.setLocation(x, y);
		buttonframe.setVisible(true);

		JButton student = new JButton("学生信息系统模块");
		JButton teacher = new JButton("教师信息系统模块");
		JButton leader = new JButton("学校领导信息系统模块");
		buttonframe.add(student);
		buttonframe.add(teacher);
		buttonframe.add(leader);

		buttonframe.setLayout(new GridLayout(3, 1));
		student.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				Studentmanageframe studentframe=new Studentmanageframe();
			}
		});
		teacher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				Teachermanageframe teacherframe = new Teachermanageframe();
			}
		});
		leader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				Leadermanageframe leaderframe = new Leadermanageframe();
			}
		});		
	}
}
