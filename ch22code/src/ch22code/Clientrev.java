package ch22code;
import javax.swing.*;
import java.awt.*;                                //导入包
import java.awt.event.*;
import java.net.*;
import java.io.PrintWriter;

public class Clientrev extends JFrame{
	//创建成员变量
	private PrintWriter writer1;
	Socket socket1;
	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	public Clientrev(String title) {      		//带参构造函数
		super(title);
		ta.setEditable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(ta, "North");
		add(tf, "South");

		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				writer1.println(tf.getText());
				ta.append(tf.getText() + "\n");
				tf.setText("");
			}
		});
		pack(); //依据你放置的组件设定窗口的大小 使之正好能容纳你放置的所有组件
	}

	private void connect() {              			//创建与服务器连接的方法
		try {
			ta.append("尝试与服务器连接\n");
			socket1 = new Socket("127.0.0.1", 6000);
			writer1 = new PrintWriter(socket1.getOutputStream(), true);
			ta.append("完成连接，清除待传字符串\n");
		} catch (Exception e) {
			System.out.println("连接失败");
		}
	}

	public static void main(String[] args) { 		       //主方法
		//创建clientrev类对象client1
		Clientrev client1 = new Clientrev("向服务器发送数据。");
		client1.setVisible(true);  				           //设置客户端窗口可显示
		client1.connect();            				       //与客户端相连接
	}
}
