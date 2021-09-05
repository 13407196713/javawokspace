package ch23code;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;

public class Addframe extends JPanel{
	private static final long serialVersionUID = 1L;
	String codetext;
	String agetext;
	String sexytext;
	String birthdaytext;
	String addresstext;
	String gradetext;
	String majortext;

	public final JTextField nameinput = new JTextField(10);
	static final int WIDTH = 700;
	static final int HEIGHT = 400;
	static Student ss;
	JFrame studentaddframe;

	public void add(Component c, GridBagConstraints constraints, int x, int y,int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

	public Addframe() {
		studentaddframe = new JFrame();
		studentaddframe.setTitle("学生添加系统");
		studentaddframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		studentaddframe.setSize(WIDTH, HEIGHT);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentaddframe.setLocation(x, y);
		studentaddframe.setVisible(true);

		studentaddframe.add(this, BorderLayout.CENTER);
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		JLabel name = new JLabel("姓名");
		JLabel code = new JLabel("学号");
		JLabel sexy = new JLabel("性别");
		JLabel age = new JLabel("年龄");
		JLabel birthday = new JLabel("出生年月");
		JLabel address = new JLabel("家庭地址");
		JLabel grade = new JLabel("班级");
		JLabel major = new JLabel("专业");

		final JTextField nameinput = new JTextField(10);
		final JTextField codeinput = new JTextField(10);
		final JTextField sexyinput = new JTextField(10);
		final JTextField ageinput = new JTextField(10);
		final JTextField birthdayinput = new JTextField(10);
		final JTextField addressinput = new JTextField(10);
		final JTextField gradeinput = new JTextField(10);
		final JTextField majorinput = new JTextField(10);

		JLabel title = new JLabel("学生被添加的基本信息");
		JButton additionbutton = new JButton("添加");
		JButton additionbutton1 = new JButton("返回");


		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx = 4;
		constraints.weighty = 6;

		add(title, constraints, 0, 0, 4, 1);
		add(name, constraints, 0, 1, 1, 1);
		add(code, constraints, 0, 2, 1, 1);
		add(sexy, constraints, 0, 3, 1, 1);
		add(age, constraints, 0, 4, 1, 1);
		add(nameinput, constraints, 1, 1, 1, 1);
		add(codeinput, constraints, 1, 2, 1, 1);
		add(sexyinput, constraints, 1, 3, 1, 1);
		add(ageinput, constraints, 1, 4, 1, 1);
		add(birthday, constraints, 2, 1, 1, 1);
		add(address, constraints, 2, 2, 1, 1);
		add(grade, constraints, 2, 3, 1, 1);
		add(major, constraints, 2, 4, 1, 1);
		add(birthdayinput, constraints, 3, 1, 1, 1);
		add(addressinput, constraints, 3, 2, 1, 1);
		add(gradeinput, constraints, 3, 3, 1, 1);
		add(majorinput, constraints, 3, 4, 1, 1);
		add(additionbutton, constraints, 0, 5, 3, 1);
		add(additionbutton1, constraints, 3, 5, 4, 1);

		additionbutton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent Event) {
			try {
				String nametext = nameinput.getText();
				codetext = codeinput.getText();
				agetext = ageinput.getText();
				sexytext = sexyinput.getText();
				birthdaytext = birthdayinput.getText();
				addresstext = addressinput.getText();
				gradetext = gradeinput.getText();
				majortext = majorinput.getText();

				Storesystem store = new Storesystem();
				Connection con = store.getConnection();
				Statement st = con.createStatement();
				String sql = "insert into studentinfo values('" + nametext
					+ "','" + codetext + "','" + sexytext + "','"
						+ agetext + "','" + addresstext + "','"
						+ birthdaytext + "','" + gradetext + "','"
						+ majortext + "')";
				st.executeUpdate(sql);

				ss = new Student(nametext, codetext);
				ss.setage(agetext);
				ss.setsexy(sexytext);
				ss.setaddress(addresstext);
				ss.setbirthday(birthdaytext);
				ss.setgrade(gradetext);
				ss.setmajor(majortext);
			    Vector<Student> vec = new Vector<Student>();
				vec.add(ss);
		    } catch (Exception e) {
			}
			studentaddframe.dispose();
			}
		});

		additionbutton1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				studentaddframe.dispose();
			}
		});
	}
}
