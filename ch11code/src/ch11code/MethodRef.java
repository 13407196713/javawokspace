package ch11code;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class MethodRef {
	public static void main(String[] args) throws SecurityException,
					NoSuchMethodException, IllegalArgumentException,
					IllegalAccessException, InvocationTargetException { //主方法
	    String s1 = "abcdef";                                                   //定义一个字符串
		//获取类String中关于参数为int的方法charAt()
		Method methodCharAt = String.class.getMethod("charAt", int.class);
		//对象s1调用方法charAt()
		System.out.println("对象s1中第二个字母为"+ methodCharAt.invoke(s1, 1));
		//对象s1调用方法charAt()
		System.out.println("对象s1中第四个字母为"+ methodCharAt.invoke(s1, new Object[] { 3 }));
	}

}
