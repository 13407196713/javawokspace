package ch11code;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;
public class ProxyInstan {
	public static void main(String[] args) throws IllegalArgumentException,
	InstantiationException, IllegalAccessException,
InvocationTargetException, SecurityException, NoSuchMethodException {
Class proxy1 =  Proxy.getProxyClass(Collection.class.getClassLoader(),Collection.class);               				//获取动态类字节码
Constructor constructor = proxy1.getConstructor(InvocationHandler.class);	//获取相关参数构造函数
//关于InvocationHandler类型的类
	class MyInvocationHander1 implements InvocationHandler {
		@Override
		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {
			return null;
		}
	}
	Collection collection = (Collection) constructor
	.newInstance(new MyInvocationHander1());	//利用构造函数实例化动态类
	
	//利用匿名类的方式实例化动态类
	Collection collection1 = (Collection) constructor.newInstance(new InvocationHandler() {
				@Override
				public Object invoke(Object proxy, Method method,
						Object[] args) throws Throwable {
					return null;
				}
			});
	//输出动态类实例对象
	System.out.println(collection);
	System.out.println(collection1);
}
}
