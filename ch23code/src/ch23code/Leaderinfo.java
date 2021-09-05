package ch23code;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.*;

public class Leaderinfo extends JPanel {
	private static final long serialVersionUID = 1L;
		static final int WIDTH = 700;
		static final int HEIGHT = 400;

		//创建各种成员变量
		final JComboBox<String> nameinput;
		final JTextField codeinput;
		final JTextField sexyinput;
		final JTextField birthdayinput;
		final JTextField ageinput;
		final JTextField addressinput;
		final JTextField salaryinput;
		final JTextField majorinput;
		final JTextField dutyinput;

		JFrame leaderinfoframe;
		Storesystem2 store = new Storesystem2();
		Connection con = store.getConnection();

		public void add(Component c, GridBagConstraints constraints, int x, int y,
				int w, int h) {
			constraints.gridx = x;
			constraints.gridy = y;
			constraints.gridwidth = w;
			constraints.gridheight = h;
			add(c, constraints);
		}

		public Leaderinfo(String str, String sql) {
			leaderinfoframe = new JFrame();
			leaderinfoframe.setTitle(str);
			//设置关闭方法
			leaderinfoframe.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			leaderinfoframe.setSize(WIDTH, HEIGHT);
			//创建和设置对象kit，使各组件居中显示
			Toolkit kit = Toolkit.getDefaultToolkit();
			Dimension screenSize = kit.getScreenSize();
			int width = screenSize.width;
			int height = screenSize.height;
			int x = (width - WIDTH) / 2;
			int y = (height - HEIGHT) / 2;
			leaderinfoframe.setLocation(x, y);

			leaderinfoframe.setVisible(true);
			leaderinfoframe.add(this, BorderLayout.CENTER);

			GridBagLayout lay = new GridBagLayout();
			setLayout(lay);
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
				Leader one = (Leader) vec.get(i);
				String nameselect = one.getname();
				nameinput.addItem(nameselect);
			}

			//最后使用组合列表框的添加功能将这些名字添加到列表中
			String namestring = (String) nameinput.getSelectedItem();
			Leader p = store.getobject(con, namestring);
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

			//创建4个按钮对象
			JButton addition = new JButton("添加");
			JButton delete = new JButton("删除");
			JButton update = new JButton("更新");
			JButton bereturn = new JButton("返回");
			//创建和设置布局管理器对象constraints
			GridBagConstraints constraints = new GridBagConstraints();
			constraints.fill = GridBagConstraints.NONE;
			constraints.weightx = 4;
			constraints.weighty = 7;

			//添加各个控件到网格组布局
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
					Leader p = store.getobject(con, namestring);
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
					leaderinfoframe.dispose();
				}
			});

			//进入添加主界面
			addition.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent Event) {
					Addframe2 addfr = new Addframe2();
					addfr.setVisible(true);
				}
			});

			//更新按钮，使得从数据库表中获取相关数据并修改界面上的相应内容
			update.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent Event) {
//					String name1 =Addframe3.ss.getname();
//					String code1 = Addframe3.ss.getcode();
//					String age1 =Addframe3.ss.getage();
//					String sexy1 = Addframe3.ss.getsexy();
//					String birthday1 = Addframe3.ss.getbirthday();
//					String address1 = Addframe3.ss.getaddress();
//					String salary1 =Addframe3.ss.getsalary();
//					String major1 = Addframe3.ss.getmajor();
//					String duty1 = Addframe3.ss.getduty();
//					nameinput.addItem(name1);
//					nameinput.setSelectedItem(name1);
//					codeinput.setText(code1);
//					ageinput.setText(age1);
//					sexyinput.setText(sexy1);
//					addressinput.setText(address1);
//					birthdayinput.setText(birthday1);
//					salaryinput.setText(salary1);
//					majorinput.setText(major1);
//					dutyinput.setText(duty1);
					leaderinfoframe.dispose();
					new Leaderinfo(str,sql);
				}
			});

			//删除数据，且更新到数据库中
		    delete.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent Event) {
					String codestring = (String) codeinput.getText();
					Storesystem2 store = new Storesystem2();
					try {
						Connection con = store.getConnection();
						Statement st = con.createStatement();
						String sql = "delete * from leaderinfo where stcode='" + codestring + "'";
						st.executeUpdate(sql);
					} catch (Exception e) {
					}
					nameinput.removeItem(namestring);
				}
			});
		}

}
