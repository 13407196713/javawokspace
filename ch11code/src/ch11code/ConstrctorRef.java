package ch11code;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
public class ConstrctorRef {
	public static void main(String[] args) throws SecurityException,
					NoSuchMethodException, IllegalArgumentException,
					InstantiationException, IllegalAccessException,
					InvocationTargetException {
				//创建字符串的常用方法
				String s1 = new String(new StringBuffer("cjgong"));
				//获取关于String类的构造函数对象
				Constructor<String> cs1 = String.class.getConstructor(StringBuffer.class);
				//通过Constructor类对象的方法创建字符串
				String s11 = (String) cs1.newInstance(new StringBuffer("cjgong"));
				// String s12=(String)cs1.newInstance("cjgong");
				System.out.println("--------------------");
				//输出字符串的一些信息
				System.out.println("s1对象的第5个元素为" + s1.charAt(4));
				System.out.println("s11对象的第5个元素为" + s11.charAt(4));
				System.out.println("--------------------");
			}

}
