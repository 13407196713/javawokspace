package ch23code;
import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Vector;
import java.sql.*;

public class Teacherinfo extends JPanel {
	private static final long serialVersionUID = 1L;
	static final int WIDTH = 700;               		//关于宽度变量
	static final int HEIGHT = 400;            		//关于高度变量
	//创建各种组件对象
	final JComboBox<String> nameinput;
	final JTextField codeinput;
	final JTextField sexyinput;
	final JTextField birthdayinput;
	final JTextField ageinput;
	final JTextField addressinput;
	final JTextField salaryinput;
	final JTextField majorinput;
	final JTextField dutyinput;
	JFrame teacherinfoframe;

	Storesystem1 store = new Storesystem1();
	Connection con = store.getConnection();

	//关于添加方法add()
	public void add(Component c, GridBagConstraints constraints, int x, int y,int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

	public Teacherinfo(String str, String sql) {  	//关于构造函数
		teacherinfoframe = new JFrame();         	//初始化对象teacherinfoframe
		teacherinfoframe.setTitle(str);         		//设置标题
		//设置关闭方法
		teacherinfoframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		//设置窗口框架对象窗口的大小
		teacherinfoframe.setSize(WIDTH, HEIGHT);
		//创建和设置对象kit，并使组件居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		//设置窗口框架对象窗口的位置
		teacherinfoframe.setLocation(x, y);
		teacherinfoframe.setVisible(true);          		//设置窗口可显示

		//添加当前对象到窗口框架中
		teacherinfoframe.add(this, BorderLayout.CENTER);
		GridBagLayout lay = new GridBagLayout();    		//创建布局管理器对象
		setLayout(lay);                             			//设置布局管理器
		//创建9个文本域控件来显示不同系的教师信息
		JLabel name = new JLabel("姓名");
		JLabel code = new JLabel("工号");
		JLabel sexy = new JLabel("性别");
		JLabel age = new JLabel("年龄");
		JLabel birthday = new JLabel("出生年月");
		JLabel address = new JLabel("家庭地址");
		JLabel salary = new JLabel("薪水");
		JLabel major = new JLabel("专业");
		JLabel duty = new JLabel("职务");
		JLabel title = new JLabel(str);

		//获取9个文本域控件的信息
		nameinput = new JComboBox<String>();
		codeinput = new JTextField(10);
		sexyinput = new JTextField(10);
		ageinput = new JTextField(10);
		birthdayinput = new JTextField(10);
		addressinput = new JTextField(10);
		salaryinput = new JTextField(10);
		majorinput = new JTextField(10);
		dutyinput = new JTextField(10);

		Vector<?> vec = store.getteacher(con, sql);
		for (int i = 0; i < vec.size(); i++) {
			Teacher one = (Teacher) vec.get(i);
			String nameselect = one.getname();
			nameinput.addItem(nameselect);
		}
		String namestring = (String) nameinput.getSelectedItem();
		Teacher p = store.getobject(con, namestring);
		if(p!=null){
			String inputcode = p.getcode();
			String inputsexy = p.getsexy();
			String inputage = p.getage();
			String inputbirthday = p.getbirthday();
			String inputaddress = p.getaddress();
			String inputsalary = p.getsalary();
			String inputmajor = p.getmajor();
			String inputduty = p.getduty();
			codeinput.setText(inputcode);
			sexyinput.setText(inputsexy);
			ageinput.setText(inputage);
			birthdayinput.setText(inputbirthday);
			addressinput.setText(inputaddress);
			salaryinput.setText(inputsalary);
			majorinput.setText(inputmajor);
			dutyinput.setText(inputduty);
		}

		JButton addition = new JButton("添加");
		JButton delete = new JButton("删除");
		JButton update = new JButton("更新");
		JButton bereturn = new JButton("返回");

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx = 4;
		constraints.weighty = 7;

		//添加各种控件到网格组布局
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
		add(salary, constraints, 2, 3, 1, 1);
		add(major, constraints, 2, 4, 1, 1);
		add(duty, constraints, 0, 5, 1, 1);
		add(birthdayinput, constraints, 3, 1, 1, 1);
		add(addressinput, constraints, 3, 2, 1, 1);
		add(salaryinput, constraints, 3, 3, 1, 1);
		add(dutyinput, constraints, 1, 5, 1, 1);
		add(majorinput, constraints, 3, 4, 1, 1);
		add(addition, constraints, 0, 6, 1, 1);
		add(delete, constraints, 1, 6, 1, 1);
		add(update, constraints, 2, 6, 1, 1);
		add(bereturn, constraints, 3, 6, 1, 1);

		//通过单击每一个列表框中的名字，会相应地显示出此名字的所有信息
		nameinput.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String namestring = (String) nameinput.getSelectedItem();
				Teacher p = store.getobject(con, namestring);
				if(p!=null){
					String inputcode = p.getcode();
					String inputsexy = p.getsexy();
					String inputage = p.getage();
					String inputbirthday = p.getbirthday();
					String inputaddress = p.getaddress();
					String inputsalary = p.getsalary();
					String inputmajor = p.getmajor();
					String inputduty = p.getduty();
					codeinput.setText(inputcode);
					sexyinput.setText(inputsexy);
					ageinput.setText(inputage);
					birthdayinput.setText(inputbirthday);
					addressinput.setText(inputaddress);
					salaryinput.setText(inputsalary);
					majorinput.setText(inputmajor);
					dutyinput.setText(inputduty);
				}
			}
		});

		//返回主菜单
		bereturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				teacherinfoframe.dispose();
			}
		});

		//进入添加主界面
		addition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				Addframe1 addfr = new Addframe1();
				addfr.setVisible(true);
			}
		});

		//更新按钮，使得从数据库表中将数据提取显示到界面中
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
//				String name1 = Addframe2.ss.getname();
//				String code1 = Addframe2.ss.getcode();
//				String age1 = Addframe2.ss.getage();
//				String sexy1 = Addframe2.ss.getsexy();
//				String birthday1 = Addframe2.ss.getbirthday();
//				String address1 = Addframe2.ss.getaddress();
//				String salary1 = Addframe2.ss.getsalary();
//				String major1 = Addframe2.ss.getmajor();
//				String duty1 = Addframe2.ss.getduty();
//				nameinput.addItem(name1);
//				nameinput.setSelectedItem(name1);
//				codeinput.setText(code1);
//				ageinput.setText(age1);
//				sexyinput.setText(sexy1);
//				addressinput.setText(address1);
//				birthdayinput.setText(birthday1);
//				salaryinput.setText(salary1);
//				majorinput.setText(major1);
//				dutyinput.setText(duty1);
				teacherinfoframe.dispose();
				new Teacherinfo(str,sql);
			}
		});

		//删除数据，且更新到数据库中
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				String codestring = (String) codeinput.getText();
				Storesystem1 store = new Storesystem1();
				try {
				Connection con = store.getConnection();
					Statement st = con.createStatement();
					String sql = "delete from teacherinfo where stcode='" + codestring + "'";
					st.executeUpdate(sql);
				} catch (Exception e) {
				}
				teacherinfoframe.dispose();
				new Teacherinfo(str,sql);
			}
		});
	}

}
