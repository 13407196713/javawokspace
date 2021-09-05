package ch22code;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
public class Clientrev1 extends Frame{
	// Frame 是 JFrame的父类

	private static final long serialVersionUID = 8698945695612996265L;
	//创建成员变量
	Socket socket1;                  					//关于数据套接字变量
	private DataInputStream reader1;           		    //关于数据输入流变量
	private DataOutputStream writer1;          		    //关于数据输出流变量
	private TextArea ta = new TextArea();       		//关于文本区域变量
	private TextField tf = new TextField();   		    //关于输入文本框变量

	public Clientrev1(String title) {         		    //构造函数
		super(title);
		ta.setEditable(false);
		add(ta, "North");
		add(tf, "South");

		//通过按钮的动作，开始将输出流输送到屏幕中
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					writer1.writeUTF(tf.getText());
					writer1.flush();
					String fileinfo = reader1.readUTF();
					ta.setText("<" + tf.getText() + "的内容>\n\n");
					ta.append(fileinfo);
				} catch (Exception e) {
				}
			}
		});
		pack();

		// 关闭
		this.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});

		}
	private void connect() {                 			//关于连接方法
		try {
			ta.append("尝试与服务器连接\n");
			socket1 = new Socket("127.0.0.1", 6000);
			ta.append("连接完毕。。。。请输入文件名\n");
			writer1 = new DataOutputStream(socket1.getOutputStream());
			reader1 = new DataInputStream(socket1.getInputStream());
		} catch (Exception e) {
			System.out.println("连接失败");
		}
	}
	public static void main(String[] args) { 		    //主方法
		//创建对象client1
		Clientrev1 client1 = new Clientrev1("查看服务器系统文件。");
		client1.setVisible(true);            		    //设置窗口可显示
		client1.connect();                       		//客户端连接
	}
}
