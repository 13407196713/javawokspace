package ch20code;
import java.awt.Frame;
import javax.swing.JOptionPane;
public class Swingtest13 extends Frame {
	public static void main(String[] args) {       //主方法
		//创建弹出对话框对象JOptionPane
		JOptionPane.showConfirmDialog(null, "这是错误信息1！", "这是错误信息2！", JOptionPane.OK_CANCEL_OPTION);
		}


}
