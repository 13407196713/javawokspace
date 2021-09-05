package ch11code;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class StaticMainRef {
	public static void main(String[] args) throws SecurityException,
		IllegalArgumentException, NoSuchMethodException,
		ClassNotFoundException, IllegalAccessException,
		InvocationTargetException {          //主方法
	//调用类的静态方式
	StaticMain.main(new String[] { "111", "222", "333", "444" });
	//通过反射调用类的静态方法
	startClass("ch11code.StaticMain");
}
//通过反射调用类的静态方法的方法
public static void startClass(String className) throws SecurityException,
		NoSuchMethodException, ClassNotFoundException,
		IllegalArgumentException, IllegalAccessException,
		InvocationTargetException {
	//获取相应类的main方法
	Method mainMethod = Class.forName(className).getMethod("main", String[].class);
	//执行main方法
	mainMethod.invoke(null, new Object[] { new String[] { "111", "222","333", "444" } });
	//执行main方法
	mainMethod.invoke(null, (Object) new String[] { "111", "222", "333","444" });
}

}
