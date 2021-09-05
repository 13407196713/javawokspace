package ch11code;
import  java.applet.Applet;
import  java.awt .*;
@SuppressWarnings("deprecation")
public class JavaApplet extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g){
		g.drawString("This is my first Java Applet!",20,10);
		}


}
