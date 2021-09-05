package ch23code;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.sql.*;

public class Studentinfo extends JPanel {
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 700;
	static final int HEIGHT = 400;

	final JComboBox<String> nameinput; // 选择组件
	final JTextField codeinput;
	final JTextField sexyinput;
	final JTextField birthdayinput;
	final JTextField ageinput;
	final JTextField addressinput;
	final JTextField gradeinput;
	final JTextField majorinput;

	JFrame studentinfoframe;
	Storesystem store = new Storesystem();
	Connection con = store.getConnection();

	public void add(Component c, GridBagConstraints constraints, int x, int y,int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

	public Studentinfo(String str, String sql) {
		studentinfoframe = new JFrame();
		studentinfoframe.setTitle(str);
		studentinfoframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		studentinfoframe.setSize(WIDTH, HEIGHT);

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		studentinfoframe.setLocation(x, y);
		studentinfoframe.setVisible(true);

		studentinfoframe.add(this, BorderLayout.CENTER);
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
		JLabel title = new JLabel(str);

		nameinput = new JComboBox<String>();
		codeinput = new JTextField(10);
		sexyinput = new JTextField(10);
		ageinput = new JTextField(10);
		birthdayinput = new JTextField(10);
		addressinput = new JTextField(10);
		gradeinput = new JTextField(10);
		majorinput = new JTextField(10);

		Vector<Student> vec = store.getstudent(con, sql);
		for (int i = 0; i < vec.size(); i++) {
			Student one = (Student) vec.get(i);
			String nameselect = one.getname();
			nameinput.addItem(nameselect);
		}

		String namestring = (String) nameinput.getSelectedItem();
		Student p = store.getobject(con, namestring);

		if(p!=null){
			String inputcode = p.getcode();
			String inputsexy = p.getsexy();
			String inputage = p.getage();
			String inputbirthday = p.getbirthday();
			String inputaddress = p.getaddress();
			String inputgrade = p.getgrade();
			String inputmajor = p.getmajor();

			codeinput.setText(inputcode);
			sexyinput.setText(inputsexy);
			ageinput.setText(inputage);
			birthdayinput.setText(inputbirthday);
			addressinput.setText(inputaddress);
			gradeinput.setText(inputgrade);
			majorinput.setText(inputmajor);
		}

		JButton addition = new JButton("添加");
		JButton delete = new JButton("删除");
		JButton update = new JButton("更新");
		JButton bereturn = new JButton("返回");

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

		add(addition, constraints, 0, 5, 1, 1);
		add(delete, constraints, 1, 5, 1, 1);
		add(update, constraints, 2, 5, 1, 1);
		add(bereturn, constraints, 3, 5, 1, 1);

		// 单击列表框名字 显示名字的所有信息
		nameinput.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String namestring = (String) nameinput.getSelectedItem();
				Student p = store.getobject(con, namestring);
				if(p!=null){
					String inputcode = p.getcode();
					String inputsexy = p.getsexy();
					String inputage = p.getage();
					String inputbirthday = p.getbirthday();
					String inputaddress = p.getaddress();
					String inputgrade = p.getgrade();
					String inputmajor = p.getmajor();
					codeinput.setText(inputcode);
					sexyinput.setText(inputsexy);
					ageinput.setText(inputage);
					birthdayinput.setText(inputbirthday);
					addressinput.setText(inputaddress);
					gradeinput.setText(inputgrade);
					majorinput.setText(inputmajor);
				}
			}
		});

		// 返回主菜单
		bereturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				studentinfoframe.dispose();
			}
		});

		// 进入 添加主页面
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				Addframe addfr = new Addframe();
				addfr.setVisible(true);
			}
		});

		// 更新
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				studentinfoframe.dispose();
				new Studentinfo(str,sql);
			}
		});

		// 删除
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String codestring = codeinput.getText();
				Storesystem store = new Storesystem();
				try {
					Connection con = store.getConnection();
					Statement st = con.createStatement();
					String sql = "delete from studentinfo where stcode='" + codestring + "'";
					st.executeUpdate(sql);
				} catch (Exception e) {
				}
				studentinfoframe.dispose();
				new Studentinfo(str,sql);
			}
		});
	}
}
