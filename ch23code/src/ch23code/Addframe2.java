package ch23code;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.util.Vector;

public class Addframe2 extends JPanel{
	String codetext;
	String agetext;
	String sexytext;
	String birthdaytext;
	String addresstext;
	String salarytext;
	String majortext;
	String dutytext;

	public final JTextField nameinput = new JTextField(10);	//创建文本输入框对象nameinput
	static final int WIDTH = 700;            				//关于宽度变量
	static final int HEIGHT = 400;                       	//关于高度变量
	static Leader ss;                                  		//关于教师对象变量

	JFrame leaderraddframe;                          		//关于领导对象变量
	//创建添加方法
	public void add(Component c, GridBagConstraints constraints, int x, int y, int w, int h) {
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		add(c, constraints);
	}

	public Addframe2() {                                		//构造函数
		leaderraddframe = new JFrame();
		leaderraddframe.setTitle("领导添加系统");    		//设置标题
		//设置关闭方法
		leaderraddframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		leaderraddframe.setSize(WIDTH, HEIGHT);     		//设置大小
		//创建对象kit，并设置各个组件居中显示
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		int x = (width - WIDTH) / 2;
		int y = (height - HEIGHT) / 2;
		leaderraddframe.setLocation(x, y);         		//设置位置

		leaderraddframe.setVisible(true);       			//设置可显示
		leaderraddframe.add(this, BorderLayout.CENTER);
		//创建和设置布局管理器
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);      //设置布局管理器

		//创建9个文本域
		JLabel name = new JLabel("姓名");
		JLabel code = new JLabel("工号");
		JLabel sexy = new JLabel("性别");
		JLabel age = new JLabel("年龄");
		JLabel birthday = new JLabel("出生年月");
		JLabel address = new JLabel("家庭地址");
		JLabel salary = new JLabel("薪水");
		JLabel major = new JLabel("专业");
		JLabel duty = new JLabel("职务");

		//获取领导的不同信息
		final JTextField codeinput = new JTextField(10);
		final JTextField sexyinput = new JTextField(10);
		final JTextField ageinput = new JTextField(10);
		final JTextField birthdayinput = new JTextField(10);
		final JTextField addressinput = new JTextField(10);
		final JTextField salaryinput = new JTextField(10);
		final JTextField majorinput = new JTextField(10);
		final JTextField dutyinput = new JTextField(10);
		JLabel title = new JLabel("领导被添加的基本信息"); 		//设置标题
		JButton additionbutton = new JButton("添加");    		//创建按钮对象

		//创建和设置GridBagConstraints类型的布局管理器对象constraints
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.NONE;
		constraints.weightx = 4;
		constraints.weighty = 7;

		//添加各种控件到网络组件布局
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
		add(additionbutton, constraints, 0, 6, 4, 1);

		additionbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Event) {
				try {
					//将每个文本域中的信息赋值给变量
					String nametext = nameinput.getText();
					codetext = codeinput.getText();
					agetext = ageinput.getText();
					sexytext = sexyinput.getText();
					birthdaytext = birthdayinput.getText();
					addresstext = addressinput.getText();
					salarytext = salaryinput.getText();
					dutytext = dutyinput.getText();
					majortext = majorinput.getText();

					//创建storesystem2类型变量store
					Storesystem2 store = new Storesystem2();
					Connection con = store.getConnection(); 	//获取数据库连接
					Statement st = con.createStatement();  		//创建会话对象
					//创建实现插入功能的SQL语句
					String sql = "insert into leaderinfo values('" + nametext
						+ "','" + codetext + "','" + sexytext + "','"
							+ agetext + "','" + addresstext + "','"
							+ birthdaytext + "','" + salarytext + "','"
							+ majortext + "','" + dutytext + "')";
					st.executeUpdate(sql);      			//实现执行SQL语句功能
					ss = new Leader(nametext, codetext);
					ss.setage(agetext);
					ss.setsexy(sexytext);
					ss.setaddress(addresstext);
					ss.setbirthday(birthdaytext);
					ss.setsalary(salarytext);
					ss.setmajor(majortext);
					ss.setduty(dutytext);
					Vector<Leader> vec = new Vector<Leader>();       		//创建集合对象vec
					vec.add(ss);                        		//添加对象到集合vec
				} catch (Exception e) {
				}
				leaderraddframe.dispose();
			}
		});
	}

}
