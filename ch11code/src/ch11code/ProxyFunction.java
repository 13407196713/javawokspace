package ch11code;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.Collection;
public class ProxyFunction {
	public static void main(String[] args) throws SecurityException,
	NoSuchMethodException, IllegalArgumentException,
	InstantiationException, IllegalAccessException,
	InvocationTargetException {                                   //主方法
			//获取代理类的字节码
			@SuppressWarnings("deprecation")
			Class proxy1 = Proxy.getProxyClass(Collection.class.getClassLoader(),Collection.class);
			System.out.println(proxy1.getName());  				//输出字节码的名字
			System.out.println("构造函数的列表---------------------");
			//获取构造函数集
			Constructor[] constructors = proxy1.getConstructors();
			for (Constructor constructor : constructors) { 		//遍历构造函数
				String name = constructor.getName();  			//获取构造函数的名字
				//创建关于name变量的字符串
				StringBuilder sBuilder = new StringBuilder(name);
			sBuilder.append('(');                				//字符串后添加“(”
				//获取构造函数参数的类型
				Class[] params = constructor.getParameterTypes();
				for (Class param : params) {           			//遍历参数的类型
					sBuilder.append(param.getName()).append(',');
				}
				if (params != null && params.length != 0) {
					sBuilder.deleteCharAt(sBuilder.length() - 1);
				}
				sBuilder.append(')');
				System.out.println(sBuilder.toString());   		//输出字符串
			}
			System.out.println("方法的列表---------------------");
			java.lang.reflect.Method[] methods = proxy1.getMethods();       		//获取方法集
			for (java.lang.reflect.Method method : methods) {           			           //遍历方法
				String name = method.getName();
				StringBuilder sBuilder = new StringBuilder(name);
				sBuilder.append('(');
				Class[] params = ((Executable) method).getParameterTypes();
				for (Class param : params) {             			//遍历方法的类型
					sBuilder.append(param.getName()).append(',');
				}
				if (params != null && params.length != 0) {
					sBuilder.deleteCharAt(sBuilder.length() - 1);
				}
				sBuilder.append(')');
				System.out.println(sBuilder.toString());  		//输出方法
			}
	}
}
